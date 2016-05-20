package com.example.expensebom02.bdsutil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

public class BDSEObjectLists<E> {

	/**
	 * Creates an AnyType object from some primitive data
	 * 
	 * @param object	Primitive type data
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public E convertToEObject( Object object ) {
        // Don't attempt to add null values to a list
        if( object == null ) {
            return null;
        }
        
		if( !(object instanceof EObject) ) {
	        // A primitive type needs to be wrapped in an AnyType
	        AnyType anyType_AnyType = XMLTypeFactory.eINSTANCE.createAnyType();
	        FeatureMapUtil.addText(anyType_AnyType.getMixed(),
	                    XMLTypeFactory.eINSTANCE.convertAnySimpleType(object));
			return (E)anyType_AnyType;
		}

		// Already an EObject
		return (E)object;
	}
	
	/**
	 * Custom List that adds an additional add method to support xsd:anyType
	 * 
	 */
	public static class BDSEObjectContainmentEList<E> extends EObjectContainmentEList<E> {

		private static final long serialVersionUID = -5796651510655289201L;

		public BDSEObjectContainmentEList(Class<?> dataClass,
				InternalEObject owner, int featureID) {
			super(dataClass, owner, featureID);
		}

		public boolean add(Object object) {
			// Don't attempt to add null values to a list
			if( object == null ) {
			    return false;
			}
			
			return super.add(new BDSEObjectLists<E>().convertToEObject(object));
		}

		public void add(int index, Object object) {
	        // Don't attempt to add null values to a list
	        if( object == null ) {
	            return;
	        }

			super.add(index, new BDSEObjectLists<E>().convertToEObject(object));
		}
	}

    /**
     * Custom List that adds an additional add method to support xsd:anyType
     * 
     */
    public static class BDSEObjectContainmentWithInverseEList<E> extends EObjectContainmentWithInverseEList<E> {

        private static final long serialVersionUID = -5796651510655289201L;

        public BDSEObjectContainmentWithInverseEList(Class<?> dataClass,
                InternalEObject owner, int featureID, int inverseFeatureId) {
            super(dataClass, owner, featureID, inverseFeatureId);
        }

        public boolean add(Object object) {
            // Don't attempt to add null values to a list
            if( object == null ) {
                return false;
            }
            
            return super.add(new BDSEObjectLists<E>().convertToEObject(object));
        }

        public void add(int index, Object object) {
            // Don't attempt to add null values to a list
            if( object == null ) {
                return;
            }

            super.add(index, new BDSEObjectLists<E>().convertToEObject(object));
        }
    }	
	
	/**
	 * Custom List that adds an additional add method to support xsd:anyType
	 * 
	 */
	public static class BDSEObjectFeatureEList<E> extends BDSLists.BDSFeatureEList<E> {

		public BDSEObjectFeatureEList(EStructuralFeature feature, FeatureMap.Internal featureMap) {
			super(feature, featureMap);
		}
		
		public boolean add(Object object) {		
			return super.add(new BDSEObjectLists<E>().convertToEObject(object));
		}

		public void add(int index, Object object) {
			super.add(index, new BDSEObjectLists<E>().convertToEObject(object));
		}
	}
}
