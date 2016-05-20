/*
* ENVIRONMENT:    Java Generic
*
* COPYRIGHT:      (C) 2011 TIBCO Software Inc
*/
package com.example.expensebom02.bdsutil;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;

public class BDSStringLists<E> {

    // Utility method that goes through the collection converting the
    // values to a String if required
    @SuppressWarnings("unchecked")
    public Collection<E> processCollection(Collection<? extends E> collection) {
        // Don't attempt to add null values to a list
        if( collection == null ) {
            return null;
        }
        Collection<E> collectionCopy = new ArrayList<E>();
        for (E item : collection) {
            // Don't attempt to add null values to a list
            if( item != null ) {
                collectionCopy.add((E)BDSTypeConversions.convertToString(item));
            }
        }
        return collectionCopy;
    }

	/**
	 * A specialised EDataTypeEList that effectively implements 
	 * string list semantics.  There is a special case of converting
	 * numbers to strings that is required, and a few other 
	 * automatic conversions
	 */
	public static class BDSStringEDataTypeEList<E> extends BDSLists.BDSEDataTypeEList<E> {

	    private static final long serialVersionUID = 1602001300706697343L;

		public BDSStringEDataTypeEList(Class<?> dataClass, InternalEObject owner,
	            int featureID) {
	        super(dataClass, owner, featureID);
	    }
		
		// Interfaces to handle things that are not a String
	    @SuppressWarnings("unchecked")
	    public boolean add(Object value) {
	        return super.add((E)BDSTypeConversions.convertToString(value));
	    }
	    @SuppressWarnings("unchecked")
	    public void add(int index, Object value) {
	    	super.add(index, (E)BDSTypeConversions.convertToString(value));
	    }
	    @SuppressWarnings("unchecked")
	    public E set(int index, Object value) {
	        return super.set(index, (E)BDSTypeConversions.convertToString(value));
	    }

	    public boolean addAll(Collection<? extends E> collection) {
	        return super.addAll(new BDSStringLists<E>().processCollection(collection));
	    }
	}

	/**
	 * A specialised FeatureEList that effectively implements 
	 * string list semantics.  There is a special case of converting
	 * numbers to strings that is required, and a few other 
	 * automatic conversions
	 */
	public static class BDSStringFeatureEList<E> extends BDSLists.BDSFeatureEList<E> {

	    public BDSStringFeatureEList(EStructuralFeature feature, FeatureMap.Internal featureMap) {
	        super(feature, featureMap);
	    }

	    // Interfaces to handle things that are not a String
        @SuppressWarnings("unchecked")
	    public boolean add(Object value) {
	        return super.add((E)BDSTypeConversions.convertToString(value));
	    }
        @SuppressWarnings("unchecked")
	    public void add(int index, Object value) {
	    	super.add(index, (E)BDSTypeConversions.convertToString(value));
	    }
        @SuppressWarnings("unchecked")
	    public E set(int index, Object value) {
	        return super.set(index, (E)BDSTypeConversions.convertToString(value));
	    }

	    public boolean addAll(Collection<? extends E> collection) {
	        return super.addAll(new BDSStringLists<E>().processCollection(collection));
	    }
	}
}
