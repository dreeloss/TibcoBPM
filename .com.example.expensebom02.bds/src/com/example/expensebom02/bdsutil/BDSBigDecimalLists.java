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
import org.eclipse.emf.ecore.util.FeatureMap.Internal;

public class BDSBigDecimalLists<E> {

    // Utility method that goes through the collection converting the
    // values to a BigInteger if required
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
                collectionCopy.add((E)BDSTypeConversions.convertToBigDecimal(item));
            }
        }
        return collectionCopy;
    }

    /**
     * A specialised EDataTypeEList that effectively implements 
     * BigDecimal list semantics.  There is a special case of converting
     * numbers that is required, and a few other 
     * automatic conversions
     */
    public static class BDSBigDecimalEDataTypeEList<E> extends BDSLists.BDSEDataTypeEList<E> {

		private static final long serialVersionUID = 3358179833939022715L;

		public BDSBigDecimalEDataTypeEList(Class<?> dataClass,
				InternalEObject owner, int featureID) {
			super(dataClass, owner, featureID);
		}

		// Interfaces to handle things that are not BigDecimal
        @SuppressWarnings("unchecked")
        public boolean add(Object value) {
            return super.add((E)BDSTypeConversions.convertToBigDecimal(value));
        }
        @SuppressWarnings("unchecked")
        public void add(int index, Object value) {
            super.add(index, (E)BDSTypeConversions.convertToBigDecimal(value));
        }
        @SuppressWarnings("unchecked")
        public E set(int index, Object value) {
            return super.set(index, (E)BDSTypeConversions.convertToBigDecimal(value));
        }

        public boolean addAll(Collection<? extends E> collection) {
            return super.addAll(new BDSBigDecimalLists<E>().processCollection(collection));
        }
    }

    /**
     * A specialised FeatureEList that effectively implements 
     * BigDecimal list semantics.  There is a special case of converting
     * numbers that is required, and a few other 
     * automatic conversions
     */
    public static class BDSBigDecimalFeatureEList<E> extends BDSLists.BDSFeatureEList<E> {

		public BDSBigDecimalFeatureEList(EStructuralFeature feature,
				Internal featureMap) {
			super(feature, featureMap);
		}
		
		// Interfaces to handle things that are not Integer
        @SuppressWarnings("unchecked")
        public boolean add(Object value) {
            return super.add((E)BDSTypeConversions.convertToBigDecimal(value));
        }
        @SuppressWarnings("unchecked")
        public void add(int index, Object value) {
            super.add(index, (E)BDSTypeConversions.convertToBigDecimal(value));
        }
        @SuppressWarnings("unchecked")
        public E set(int index, Object value) {
            return super.set(index, (E)BDSTypeConversions.convertToBigDecimal(value));
        }

        public boolean addAll(Collection<? extends E> collection) {
            return super.addAll(new BDSBigDecimalLists<E>().processCollection(collection));
        }
    }
}
