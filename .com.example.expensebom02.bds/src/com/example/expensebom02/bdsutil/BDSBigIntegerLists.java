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

public class BDSBigIntegerLists<E> {

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
                collectionCopy.add((E)BDSTypeConversions.convertToBigInteger(item));
            }
        }
        return collectionCopy;
    }

    /**
     * A specialised EDataTypeEList that effectively implements 
     * BigInteger list semantics.  There is a special case of converting
     * numbers that is required, and a few other 
     * automatic conversions
     */
    public static class BDSBigIntegerEDataTypeEList<E> extends BDSLists.BDSEDataTypeEList<E> {

        private static final long serialVersionUID = 5385537185104621716L;

        public BDSBigIntegerEDataTypeEList(Class<?> dataClass,
                InternalEObject owner, int featureID) {
            super(dataClass, owner, featureID);
        }
        
        // Interfaces to handle things that are not BigInteger
        @SuppressWarnings("unchecked")
        public boolean add(Object value) {
            return super.add((E)BDSTypeConversions.convertToBigInteger(value));
        }
        @SuppressWarnings("unchecked")
        public void add(int index, Object value) {
            super.add(index, (E)BDSTypeConversions.convertToBigInteger(value));
        }
        @SuppressWarnings("unchecked")
        public E set(int index, Object value) {
            return super.set(index, (E)BDSTypeConversions.convertToBigInteger(value));
        }

        public boolean addAll(Collection<? extends E> collection) {
            return super.addAll(new BDSBigIntegerLists<E>().processCollection(collection));
        }
    }
    
    /**
     * A specialised FeatureEList that effectively implements 
     * BigInteger list semantics.  There is a special case of converting
     * numbers that is required, and a few other 
     * automatic conversions
     */
    public static class BDSBigIntegerFeatureEList<E> extends BDSLists.BDSFeatureEList<E> {

        public BDSBigIntegerFeatureEList(EStructuralFeature feature,
                Internal featureMap) {
            super(feature, featureMap);
        }

        // Interfaces to handle things that are not BigInteger
        @SuppressWarnings("unchecked")
        public boolean add(Object value) {
            return super.add((E)BDSTypeConversions.convertToBigInteger(value));
        }
        @SuppressWarnings("unchecked")
        public void add(int index, Object value) {
            super.add(index, (E)BDSTypeConversions.convertToBigInteger(value));
        }
        @SuppressWarnings("unchecked")
        public E set(int index, Object value) {
            return super.set(index, (E)BDSTypeConversions.convertToBigInteger(value));
        }

        public boolean addAll(Collection<? extends E> collection) {
            return super.addAll(new BDSBigIntegerLists<E>().processCollection(collection));
        }
    }

}
