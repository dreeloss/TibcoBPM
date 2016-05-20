/*
* ENVIRONMENT:    Java Generic
*
* COPYRIGHT:      (C) 2011 TIBCO Software Inc
*/
package com.example.expensebom02.bdsutil;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil.FeatureEList;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * This class is a container for all of the BDS custom lists that are non type
 * specific. It extends the default lists in order to customise the EMF default
 * behaviour
 */
public class BDSLists<E> {

	// Processes the object making sure that Unions are of the correct format
	@SuppressWarnings("unchecked")
	public E processObject(EStructuralFeature feature, Object srcValue) {
		Object newValue = srcValue;

        EClassifier type = feature.getEType();
		// Make sure not an anySimpleType
		// Should be an EDataType
		if ((feature.eClass() != XMLTypePackage.Literals.ANY_SIMPLE_TYPE)
				&& (type != null) && (type instanceof EDataType)
				&& type.getInstanceClassName().equals("java.lang.Object")) {
			EDataType eDataType = (EDataType) type;

			// First check the direct to string to see if that matches
			String stringVal = newValue.toString();

			Exception exception = null;
			try {
				// Call the conversion to see if a valid value
				newValue = EcoreUtil.createFromString(eDataType, stringVal);
			} catch (Exception e) {
				exception = e;
			}

			// Was not a valid format, it may be a decimal being stored into a
			// non decimal for this reason convert into a BigInteger (removing
			// the decimal part) and then back into a string
			if (exception != null) {
				// Try converting to a string of an integer
				String intString = BDSTypeConversions.convertToBigInteger(
						newValue).toString();

				try {
					// Call the conversion to see if a valid value, if it is
					// valid, it will return the object representation which
					// we overwrite the input value with if it isn't valid it
					// will throw an exception, in this case we just continue
					// with the default behaviour storing exactly what was
					// passed in
					newValue = EcoreUtil.createFromString(eDataType, intString);
				} catch (Exception e) {
					exception = e;
				}
			}
		}

		return (E) BDSCopyUtil.copyIfMutable(newValue);
	}

	public Collection<E> processCollection(EStructuralFeature feature,
			Collection<? extends E> collection) {
		Collection<E> collectionCopy = new ArrayList<E>();
		for (E item : collection) {
			// Don't attempt to add null values to a list
			if (item != null) {
				collectionCopy.add(processObject(feature, item));
			}
		}
		return collectionCopy;
	}

	/**
	 * A specialised EDataTypeEList that effectively implements set-by-value
	 * semantics. In other words, if a mutable object is assigned to the list, a
	 * copy of that object is added instead. It also ensures that nulls are not
	 * added to a list
	 */
	public static class BDSEDataTypeEList<E> extends EDataTypeEList<E> {

		private static final long serialVersionUID = -2621673867804753386L;

		public BDSEDataTypeEList(Class<?> dataClass, InternalEObject owner,
				int featureID) {
			super(dataClass, owner, featureID);
		}

		public boolean add(E object) {
			// Don't attempt to add null values to a list
			if (object == null) {
				return false;
			}
			E objectCopy = processObject(owner, featureID, object);
			return super.add(objectCopy);
		}

		public void add(int index, E object) {
			// Don't attempt to add null values to a list
			if (object != null) {
				E objectCopy = processObject(owner, featureID, object);
				super.add(index, objectCopy);
			}
		}

		public boolean addAll(Collection<? extends E> collection) {
			// Don't attempt to add null values to a list
			if (collection == null) {
				return false;
			}
			Collection<E> collectionCopy = new BDSLists<E>().processCollection(
			        owner.eClass().getEStructuralFeature(featureID), collection);
			return super.addAll(collectionCopy);
		}

		public E set(int index, E object) {
			E objectCopy = processObject(owner, featureID, object);
			return super.set(index, objectCopy);
		}
		
		private E processObject(InternalEObject owner, int featureID, Object srcValue) {
		    return new BDSLists<E>().processObject(owner.eClass().getEStructuralFeature(featureID), srcValue);
		}
	}

	/**
	 * A specialised FeatureEList that effectively implements set-by-value
	 * semantics. In other words, if a mutable object is assigned to the list, a
	 * copy of that object is added instead. It also ensures that nulls are not
	 * added to a list
	 */
	public static class BDSFeatureEList<E> extends FeatureEList<E> {

		public BDSFeatureEList(EStructuralFeature feature,
				FeatureMap.Internal featureMap) {
			super(feature, featureMap);
		}

		public boolean add(Object object) {
			// Don't attempt to add null values to a list
			if (object == null) {
				return false;
			}
			E objectCopy = new BDSLists<E>().processObject(feature, object);
			return super.add(objectCopy);
		}

		public void add(int index, Object object) {
			// Don't attempt to add null values to a list
			if (object != null) {
				E objectCopy = new BDSLists<E>().processObject(feature, object);
				super.add(index, objectCopy);
			}
		}

		public boolean addAll(Collection<? extends E> collection) {
			// Don't attempt to add null values to a list
			if (collection == null) {
				return false;
			}
			Collection<E> collectionCopy = new BDSLists<E>().processCollection(
					feature, collection);
			return super.addAll(collectionCopy);
		}

		public E set(int index, E object) {
			E objectCopy = new BDSLists<E>().processObject(feature, object);
			return super.set(index, objectCopy);
		}
	}
}
