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

/**
 * This class is a container for all of the BDS custom lists that
 * alter behaviour for doubles.  This is mainly concerned with
 * mappings between different types
 */
public class BDSDoubleLists<E> {

    // Utility method that goes through the collection converting the
    // values to a Double if required
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
                collectionCopy.add((E)BDSTypeConversions.convertToDouble(item));
            }
        }
        return collectionCopy;
    }

	/**
	 * A specialised EDataTypeEList that effectively implements 
	 * double list semantics.  There is a special case of converting
	 * integers to doubles that is required, and a few other 
	 * automatic conversions
	 */
	public static class BDSDoubleEDataTypeEList<E> extends BDSLists.BDSEDataTypeEList<E> {

	    private static final long serialVersionUID = 8635167941307253377L;

		public BDSDoubleEDataTypeEList(Class<?> dataClass, InternalEObject owner,
	            int featureID) {
	        super(dataClass, owner, featureID);
	    }

		// Interfaces to handle things that are not Double
	    @SuppressWarnings("unchecked")
	    public boolean add(Object value) {
            return super.add((E)BDSTypeConversions.convertToDouble(value));
        }
        @SuppressWarnings("unchecked")
	    public void add(int index, Object value) {
	    	super.add(index, (E)BDSTypeConversions.convertToDouble(value));
	    }
        @SuppressWarnings("unchecked")
	    public E set(int index, Object value) {
	        return super.set(index, (E)BDSTypeConversions.convertToDouble(value));
	    }

	    public boolean addAll(Collection<? extends E> collection) {
	        return super.addAll(new BDSDoubleLists<E>().processCollection(collection));
	    }
	}

	/**
	 * A specialised FeatureEList that effectively implements 
	 * double list semantics.  There is a special case of converting
	 * integers to doubles that is required, and a few other 
	 * automatic conversions
	 */
	public static class BDSDoubleFeatureEList<E> extends BDSLists.BDSFeatureEList<E> {

	    public BDSDoubleFeatureEList(EStructuralFeature feature, FeatureMap.Internal featureMap) {
	        super(feature, featureMap);
	    }

        // Interfaces to handle things that are not Double
        @SuppressWarnings("unchecked")
	    public boolean add(Object value) {
	        return super.add((E)BDSTypeConversions.convertToDouble(value));
	    }
        @SuppressWarnings("unchecked")
	    public void add(int index, Object value) {
	    	super.add(index, (E)BDSTypeConversions.convertToDouble(value));
	    }
        @SuppressWarnings("unchecked")
	    public E set(int index, Object value) {
	        return super.set(index, (E)BDSTypeConversions.convertToDouble(value));
	    }

	    public boolean addAll(Collection<? extends E> collection) {
	        return super.addAll(new BDSDoubleLists<E>().processCollection(collection));
	    }
	}
}
