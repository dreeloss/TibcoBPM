/*
* ENVIRONMENT:    Java Generic
*
* COPYRIGHT:      (C) 2011 TIBCO Software Inc
*/
package com.example.expensebom02.bdsutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * Interface to add additional functionality to the standard FeatureMap
 *
 */
public class BDSFeatureMapImpl implements BDSFeatureMap
{
    // Wrapper of the FeatureMap.Internal so that behaviour can be over-ridden
    public class Internal implements FeatureMap.Internal
    {
        private FeatureMap.Internal internalFeatureMap;
        
        // Store the featureMap
        public Internal( FeatureMap.Internal featureMap ) {
            internalFeatureMap = featureMap;
        }

        // Change the list method to return custom lists that
        // perform the correct type casting
        public <T> EList<T> list(EStructuralFeature feature)
        {
            if( FeatureMapUtil.isFeatureMap(feature) ) {
                return internalFeatureMap.list(feature);
            }
            
            // Get the name of the type of the feature
            String typeName = feature.getEType().getInstanceClassName();
            
            if( typeName != null ) {
                // Check which feature type this is
                if( typeName.equals("java.lang.Integer") ) {
                    return new BDSIntegerLists.BDSIntegerFeatureEList<T>(feature, internalFeatureMap);
                }
                if( typeName.equals("java.lang.String")) {
                    return new BDSStringLists.BDSStringFeatureEList<T>(feature, internalFeatureMap);
                }
                if( typeName.equals("java.lang.Double")) {
                    return new BDSDoubleLists.BDSDoubleFeatureEList<T>(feature, internalFeatureMap);
                }
                if( typeName.equals("java.math.BigInteger")) {
                    return new BDSBigIntegerLists.BDSBigIntegerFeatureEList<T>(feature, internalFeatureMap);
                }
                if( typeName.equals("java.math.BigDecimal")) {
                    return new BDSBigDecimalLists.BDSBigDecimalFeatureEList<T>(feature, internalFeatureMap);
                }
                if( typeName.equals("org.eclipse.emf.ecore.EObject")) {
                    return new BDSEObjectLists.BDSEObjectFeatureEList<T>(feature, internalFeatureMap);
                }
            }

            return new BDSLists.BDSFeatureEList<T>(feature, internalFeatureMap);
        }
        
        ///////////////////////////////////////
        // Pass Through Methods
        ///////////////////////////////////////
        public void add(EStructuralFeature feature, int index, Object object) {
            internalFeatureMap.add(feature, index, object);
        }
        public boolean addAll(EStructuralFeature feature, int index,
                Collection<?> collection) {
            return internalFeatureMap.addAll(feature, index, collection);
        }
        public boolean addAllUnique(Collection<? extends Entry> collection) {
            return internalFeatureMap.addAllUnique(collection);
        }
        public boolean addAllUnique(
                org.eclipse.emf.ecore.util.FeatureMap.Entry.Internal[] entries,
                int start, int end) {
            return internalFeatureMap.addAllUnique(entries, start, end);
        }
        public boolean addAllUnique(int index,
                org.eclipse.emf.ecore.util.FeatureMap.Entry.Internal[] entries,
                int start, int end) {
            return internalFeatureMap.addAllUnique(index, entries, start, end);
        }
        public void addUnique(
                org.eclipse.emf.ecore.util.FeatureMap.Entry.Internal entry) {
            internalFeatureMap.addUnique(entry);
        }
        public void addUnique(EStructuralFeature feature, Object object) {
            internalFeatureMap.addUnique(feature, object);
        }
        public void addUnique(EStructuralFeature feature, int index, Object object) {
            internalFeatureMap.addUnique(feature, index, object);
        }
        public NotificationChain basicAdd(EStructuralFeature feature,
                Object object, NotificationChain notifications) {
            return internalFeatureMap.basicAdd(feature, object, notifications);
        }
        public boolean basicContains(EStructuralFeature feature, Object object) {
            return internalFeatureMap.basicContains(feature, object);
        }
        public boolean basicContainsAll(EStructuralFeature feature,
                Collection<?> collection) {
            return internalFeatureMap.basicContainsAll(feature, collection);
        }
        public int basicIndexOf(EStructuralFeature feature, Object object) {
            return internalFeatureMap.basicIndexOf(feature, object);
        }
        public Iterator<Object> basicIterator(EStructuralFeature feature) {
            return internalFeatureMap.basicIterator(feature);
        }
        public int basicLastIndexOf(EStructuralFeature feature, Object object) {
            return internalFeatureMap.basicLastIndexOf(feature, object);
        }
        public List<Object> basicList(EStructuralFeature feature) {
            return internalFeatureMap.basicList(feature);
        }
        public ListIterator<Object> basicListIterator(EStructuralFeature feature) {
            return internalFeatureMap.basicListIterator(feature);
        }
        public ListIterator<Object> basicListIterator(EStructuralFeature feature,
                int index) {
            return internalFeatureMap.basicListIterator(feature, index);
        }
        public NotificationChain basicRemove(EStructuralFeature feature,
                Object object, NotificationChain notifications) {
            return internalFeatureMap.basicRemove(feature, object, notifications);
        }
        public Object[] basicToArray(EStructuralFeature feature) {
            return internalFeatureMap.basicToArray(feature);
        }
        public <T> T[] basicToArray(EStructuralFeature feature, T[] array) {
            return internalFeatureMap.basicToArray(feature, array);
        }
        public void clear(EStructuralFeature feature) {
            internalFeatureMap.clear(feature);
        }
        public boolean contains(EStructuralFeature feature, Object object) {
            return internalFeatureMap.contains(feature, object);
        }
        public boolean containsAll(EStructuralFeature feature,
                Collection<?> collection) {
            return internalFeatureMap.containsAll(feature, collection);
        }
        public Object get(EStructuralFeature feature, int index, boolean resolve) {
            return internalFeatureMap.get(feature, index, resolve);
        }
        public EObject getEObject() {
            return internalFeatureMap.getEObject();
        }
        public int getModCount() {
            return internalFeatureMap.getModCount();
        }
        public Wrapper getWrapper() {
            return internalFeatureMap.getWrapper();
        }
        public int indexOf(EStructuralFeature feature, Object object) {
            return internalFeatureMap.indexOf(feature, object);
        }
        public boolean isEmpty(EStructuralFeature feature) {
            return internalFeatureMap.isEmpty(feature);
        }
        public Iterator<Object> iterator(EStructuralFeature feature) {
            return internalFeatureMap.iterator(feature);
        }
        public int lastIndexOf(EStructuralFeature feature, Object object) {
            return internalFeatureMap.lastIndexOf(feature, object);
        }
        public ListIterator<Object> listIterator(EStructuralFeature feature) {
            return internalFeatureMap.listIterator(feature);
        }
        public ListIterator<Object> listIterator(EStructuralFeature feature,
                int index) {
            return internalFeatureMap.listIterator(feature, index);
        }
        public void move(EStructuralFeature feature, int index, Object object) {
            internalFeatureMap.move(feature, index, object);
        }
        public Object move(EStructuralFeature feature, int targetIndex,
                int sourceIndex) {
            return internalFeatureMap.move(feature, targetIndex, sourceIndex);
        }
        public boolean remove(EStructuralFeature feature, Object object) {
            return internalFeatureMap.remove(feature, object);
        }
        public Object remove(EStructuralFeature feature, int index) {
            return internalFeatureMap.remove(feature, index);
        }
        public boolean removeAll(EStructuralFeature feature,
                Collection<?> collection) {
            return internalFeatureMap.removeAll(feature, collection);
        }
        public Object resolveProxy(EStructuralFeature feature, int entryIndex,
                int index, Object object) {
            return internalFeatureMap.resolveProxy(feature, entryIndex, index, object);
        }
        public boolean retainAll(EStructuralFeature feature,
                Collection<?> collection) {
            return internalFeatureMap.retainAll(feature, collection);
        }
        public Object set(EStructuralFeature feature, int index, Object object) {
            return internalFeatureMap.set(feature, index, object);
        }
        public Object setUnique(EStructuralFeature feature, int index, Object object) {
            return internalFeatureMap.setUnique(feature, index, object);
        }
        public void setWrapper(Wrapper wrapper) {
            internalFeatureMap.setWrapper(wrapper);
        }
        public Setting setting(EStructuralFeature feature) {
            return internalFeatureMap.setting(feature);
        }
        public int size(EStructuralFeature feature) {
            return internalFeatureMap.size(feature);
        }
        public Object[] toArray(EStructuralFeature feature) {
            return internalFeatureMap.toArray(feature);
        }
        public <T> T[] toArray(EStructuralFeature feature, T[] array) {
            return internalFeatureMap.toArray(feature, array);
        }
        public boolean addAllUnique(int index,
                Collection<? extends Entry> collection) {
            return internalFeatureMap.addAllUnique(index, collection);
        }
        public void addUnique(Entry object) {
            internalFeatureMap.addUnique(object);
        }
        public void addUnique(int index, Entry object) {
            internalFeatureMap.addUnique(index, object);
        }
        public NotificationChain basicAdd(Entry object,
                NotificationChain notifications) {
            return internalFeatureMap.basicAdd(object, notifications);
        }
        public boolean basicContains(Object object) {
            return internalFeatureMap.basicContains(object);
        }
        public boolean basicContainsAll(Collection<?> collection) {
            return internalFeatureMap.basicContainsAll(collection);
        }
        public Entry basicGet(int index) {
            return internalFeatureMap.basicGet(index);
        }
        public int basicIndexOf(Object object) {
            return internalFeatureMap.basicIndexOf(object);
        }
        public Iterator<Entry> basicIterator() {
            return internalFeatureMap.basicIterator();
        }
        public int basicLastIndexOf(Object object) {
            return internalFeatureMap.basicIndexOf(object);
        }
        public List<Entry> basicList() {
            return internalFeatureMap.basicList();
        }
        public ListIterator<Entry> basicListIterator() {
            return internalFeatureMap.basicListIterator();
        }
        public ListIterator<Entry> basicListIterator(int index) {
            return internalFeatureMap.basicListIterator(index);
        }
        public NotificationChain basicRemove(Object object,
                NotificationChain notifications) {
            return internalFeatureMap.basicRemove(object, notifications);
        }
        public Object[] basicToArray() {
            return internalFeatureMap.basicToArray();
        }
        public <T> T[] basicToArray(T[] array) {
            return internalFeatureMap.basicToArray(array);
        }
        public Entry setUnique(int index, Entry object) {
            return internalFeatureMap.setUnique(index, object);
        }
        public Object get(boolean resolve) {
            return internalFeatureMap.get(resolve);
        }
        public EStructuralFeature getEStructuralFeature() {
            return internalFeatureMap.getEStructuralFeature();
        }
        public boolean isSet() {
            return internalFeatureMap.isSet();
        }
        public void set(Object newValue) {
            internalFeatureMap.set(newValue);
        }
        public void unset() {
            internalFeatureMap.unset();
        }
        public boolean add(EStructuralFeature feature, Object value) {
        	boolean retVal = internalFeatureMap.add(feature, value);
            // Check if we need to correct the order of this FeatureMap
        	// But only if it wasn't being unset
        	if( value != null )
        	{
            	enforceOrdering(feature);
        	}
            return retVal;
        }
        public void add(int index, EStructuralFeature feature, Object value) {
            internalFeatureMap.add(index, feature, value);
        }
        public boolean addAll(EStructuralFeature feature, Collection<?> values) {
        	boolean retVal = true;
        	for (Object object : values) {
    			if( add( feature, object ) != true )
    			{
    				retVal = false;
    			}
    		}
            return retVal;
        }
        public boolean addAll(int index, EStructuralFeature feature,
                Collection<?> values) {
            return internalFeatureMap.addAll(index, feature, values);
        }
        public Object get(EStructuralFeature feature, boolean resolve) {
            return internalFeatureMap.get(feature, resolve);
        }
        public EStructuralFeature getEStructuralFeature(int index) {
            return internalFeatureMap.getEStructuralFeature(index);
        }
        public Object getValue(int index) {
            return internalFeatureMap.getValue(index);
        }
        public boolean isSet(EStructuralFeature feature) {
            return internalFeatureMap.isSet(feature);
        }
        public void set(EStructuralFeature feature, Object object) {
            internalFeatureMap.set(feature, object);
            // Check if we need to correct the order of this FeatureMap
        	// But only if it wasn't being unset
        	if( object != null )
        	{
        		enforceOrdering(feature);
        	}
        }
        public Object setValue(int index, Object value) {
            return internalFeatureMap.setValue(index, value);
        }
        public void unset(EStructuralFeature feature) {
            internalFeatureMap.unset(feature);
        }
        public ValueListIterator<Object> valueListIterator() {
            return internalFeatureMap.valueListIterator();
        }
        public ValueListIterator<Object> valueListIterator(int index) {
            return internalFeatureMap.valueListIterator(index);
        }
        public void move(int newPosition, Entry object) {
            internalFeatureMap.move(newPosition, object);
        }
        public Entry move(int newPosition, int oldPosition) {
            return internalFeatureMap.move(newPosition, oldPosition);
        }
        public boolean add(Entry e) {
            boolean retVal = internalFeatureMap.add(e);
            // Check if we need to correct the order of this FeatureMap
        	enforceOrdering(e);
            return retVal;
        }
        public void add(int index, Entry element) {
            internalFeatureMap.add(index, element);
        }
        public boolean addAll(Collection<? extends Entry> c) {
        	boolean retVal = true;
        	for (Entry entry : c) {
    			if( add(entry) != true )
    			{
    				retVal = false;
    			}
    		}
            return retVal;
        }
        public boolean addAll(int index, Collection<? extends Entry> c) {
            return internalFeatureMap.addAll(index, c);
        }
        public void clear() {
            internalFeatureMap.clear();
        }
        public boolean contains(Object o) {
            return internalFeatureMap.contains(o);
        }
        public boolean containsAll(Collection<?> c) {
            return internalFeatureMap.containsAll(c);
        }
        public Entry get(int index) {
            return internalFeatureMap.get(index);
        }
        public int indexOf(Object o) {
            return internalFeatureMap.indexOf(o);
        }
        public boolean isEmpty() {
            return internalFeatureMap.isEmpty();
        }
        public Iterator<Entry> iterator() {
            return internalFeatureMap.iterator();
        }
        public int lastIndexOf(Object o) {
            return internalFeatureMap.lastIndexOf(o);
        }
        public ListIterator<Entry> listIterator() {
            return internalFeatureMap.listIterator();
        }
        public ListIterator<Entry> listIterator(int index) {
            return internalFeatureMap.listIterator(index);
        }
        public boolean remove(Object o) {
            return internalFeatureMap.remove(o);
        }
        public Entry remove(int index) {
            return internalFeatureMap.remove(index);
        }
        public boolean removeAll(Collection<?> c) {
            return internalFeatureMap.removeAll(c);
        }
        public boolean retainAll(Collection<?> c) {
            return internalFeatureMap.retainAll(c);
        }
        public Entry set(int index, Entry element) {
            return internalFeatureMap.set(index, element);
        }
        public int size() {
            return internalFeatureMap.size();
        }
        public List<Entry> subList(int fromIndex, int toIndex) {
            return internalFeatureMap.subList(fromIndex, toIndex);
        }
        public Object[] toArray() {
            return internalFeatureMap.toArray();
        }
        public <T> T[] toArray(T[] a) {
            return internalFeatureMap.toArray(a);
        }
    }
    
    
    private BDSFeatureMapImpl.Internal bdsFeatureMapInternal;
    
    /**
     * Constructor that sets the FeatureMap to use.
     * 
     * @param aFeatureMap   FeatureMap to use
     */
    public BDSFeatureMapImpl( FeatureMap.Internal aFeatureMap )
    {
        bdsFeatureMapInternal = new Internal(aFeatureMap);
    }
    
    /**
     * This method is required if you wish to use the FeatureMap
     * as a wrapper
     * 
     * @return  FeatureMap
     */
    public FeatureMap featureMap()
    {
        return bdsFeatureMapInternal;
    }
    
    public boolean add(EStructuralFeature feature, Object value)
    {
        return bdsFeatureMapInternal.add(feature, getCopyIfEObject(value));
    }

    public void add(int index, EStructuralFeature feature, Object value)
    {
        bdsFeatureMapInternal.add(index, feature, getCopyIfEObject(value));
    }

    public boolean addAll(EStructuralFeature feature, Collection< ? > values)
    {
        return bdsFeatureMapInternal.addAll(feature, getCopyIfEObjects(values));
    }

    public boolean addAll(int index, EStructuralFeature feature, Collection< ? > values)
    {
        return bdsFeatureMapInternal.addAll(index, feature, getCopyIfEObjects(values));
    }

    public Object get(EStructuralFeature feature, boolean resolve)
    {
        return bdsFeatureMapInternal.get(feature, resolve);
    }

    public EStructuralFeature getEStructuralFeature(int index)
    {
        return bdsFeatureMapInternal.getEStructuralFeature(index);
    }

    public Object getValue(int index)
    {
        return bdsFeatureMapInternal.getValue(index);
    }

    public boolean isSet(EStructuralFeature feature)
    {
        return bdsFeatureMapInternal.isSet(feature);
    }

    public <T> EList<T> list(EStructuralFeature feature)
    {
        return bdsFeatureMapInternal.list(feature);
    }

    public void set(EStructuralFeature feature, Object object)
    {
        bdsFeatureMapInternal.set(feature, getCopyIfEObject(object));
    }

    public Object setValue(int index, Object value)
    {
        return bdsFeatureMapInternal.setValue(index, getCopyIfEObject(value));
    }

    public void unset(EStructuralFeature feature)
    {
        bdsFeatureMapInternal.unset(feature);
    }

    public ValueListIterator<Object> valueListIterator()
    {
        return bdsFeatureMapInternal.valueListIterator();
    }

    public ValueListIterator<Object> valueListIterator(int index)
    {
        return bdsFeatureMapInternal.valueListIterator(index);
    }

    public void move(int newPosition, Entry object)
    {
        bdsFeatureMapInternal.move(newPosition, object);
    }

    public Entry move(int newPosition, int oldPosition)
    {
        return bdsFeatureMapInternal.move(newPosition, oldPosition);
    }

    public boolean add(Entry e)
    {
        return bdsFeatureMapInternal.add(getEntryCopyIfEObject(e));
    }

    public void add(int index, Entry element)
    {
        bdsFeatureMapInternal.add(index, getEntryCopyIfEObject(element));
    }

    public boolean addAll(Collection< ? extends Entry> c)
    {
        return bdsFeatureMapInternal.addAll(getEntryCopyIfEObjects(c));
    }

    public boolean addAll(int index, Collection< ? extends Entry> c)
    {
        return bdsFeatureMapInternal.addAll(index, getEntryCopyIfEObjects(c));
    }

    public void clear()
    {
        bdsFeatureMapInternal.clear();
    }

    public boolean contains(Object o)
    {
        return bdsFeatureMapInternal.contains(o);
    }

    public boolean containsAll(Collection< ? > c)
    {
        return bdsFeatureMapInternal.containsAll(c);
    }

    public Entry get(int index)
    {
        return bdsFeatureMapInternal.get(index);
    }

    public int indexOf(Object o)
    {
        return bdsFeatureMapInternal.indexOf(o);
    }

    public boolean isEmpty()
    {
        return bdsFeatureMapInternal.isEmpty();
    }

    public Iterator<Entry> iterator()
    {
        return bdsFeatureMapInternal.iterator();
    }

    public int lastIndexOf(Object o)
    {
        return bdsFeatureMapInternal.lastIndexOf(o);
    }

    public ListIterator<Entry> listIterator()
    {
        return bdsFeatureMapInternal.listIterator();
    }

    public ListIterator<Entry> listIterator(int index)
    {
        return bdsFeatureMapInternal.listIterator(index);
    }

    public boolean remove(Object o)
    {
        return bdsFeatureMapInternal.remove(o);
    }

    public Entry remove(int index)
    {
        return bdsFeatureMapInternal.remove(index);
    }

    public boolean removeAll(Collection< ? > c)
    {
        return bdsFeatureMapInternal.removeAll(c);
    }

    public boolean retainAll(Collection< ? > c)
    {
        return bdsFeatureMapInternal.retainAll(c);
    }

    public Entry set(int index, Entry element)
    {
        return bdsFeatureMapInternal.set(index, getEntryCopyIfEObject(element));
    }

    public int size()
    {
        return bdsFeatureMapInternal.size();
    }

    public List<Entry> subList(int fromIndex, int toIndex)
    {
        return bdsFeatureMapInternal.subList(fromIndex, toIndex);
    }

    public Object[] toArray()
    {
        return bdsFeatureMapInternal.toArray();
    }

    public <T> T[] toArray(T[] a)
    {
        return bdsFeatureMapInternal.toArray(a);
    }

    
    //////////////////////////////////////////////
    // Additions added for scripting support
    //////////////////////////////////////////////

    /**
     * Method to add an existing FeatureMap to the end of
     * the existing FeatureMap
     * 
     * @param value     FeatureMap to add data from
     * @return          True if added, otherwise False
     */
    public boolean add( FeatureMap value )
    {
        if( value == null )
        {
            return false;
        }

        // Copy from one feature map and append to this one
        FeatureMap copyFeatureMap = copyFeatureMap(value);
        
        if( copyFeatureMap == null )
        {
            return false;
        }
        
        return addAll(copyFeatureMap);
    }
    
    /**
     * Method to add an EObject to the end of the
     * existing FeatureMap
     * 
     * @param value     EObject to add to the FeatureMap
     * @return          True if added, otherwise False
     */
    public boolean add( EObject value )
    {
        if( value == null )
        {
            return false;
        }

        // Get the element for this EObject
        EStructuralFeature elementStruct = getPreferredStructuralFeature( value );

        if( elementStruct == null )
        {
            return false;
        }
        
        // Now add it to the FeatureMap
        return add(elementStruct, getCopyIfEObject(value));
    }

    /**
     * Method to add an EObject to a specific place in the
     * existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     EObject to add to the FeatureMap
     */
    public void add( int index, EObject value )
    {
        if( (value == null) || (index < 0) )
        {
            return;
        }
        
        // Copy this EObject into the featureMap
        EStructuralFeature elementStruct = getPreferredStructuralFeature( value );

        if( elementStruct == null )
        {
            return;
        }
        
        // Now add it to the FeatureMap
        bdsFeatureMapInternal.add(index, elementStruct, getCopyIfEObject(value));
    }

    /**
     * Method to add an existing FeatureMap to a specific
     * place in the existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     FeatureMap to add data from
     */
    public void add( int index, FeatureMap value )
    {
        if( (value == null) || (index < 0) )
        {
            return;
        }

        // Copy from one feature map and append to this one
        FeatureMap copyFeatureMap = copyFeatureMap(value);
        
        if( copyFeatureMap == null )
        {
            return;
        }
        
        bdsFeatureMapInternal.addAll(index, copyFeatureMap);
    }

    /**
     * Method to add a list of EObjects to the end of the
     * existing FeatureMap
     * 
     * @param values    EObjects to add to the FeatureMap
     * @return          True if added, otherwise false
     */
    public boolean addAll(List<? extends EObject> values) {
        boolean returnVal = true;

        // There is a bug in the script engine (BX-1552) that means
        // the incorrect addAll is called, so check the argument
        // and call the correct one
        if( values instanceof FeatureMap )
        {
            returnVal = addAll((FeatureMap)values);
        }
        else
        {
            // Add each EObject to the FeatureMap one after the other
            for (EObject source : values)
            {
                if( add(source) != true ) {
                    returnVal = false;
                }
            }
        }
        
        return returnVal;
    }

    /**
     * Method to set a FeatureMap to a specific
     * place in the existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     FeatureMap to set data from
     * @return          The FeatureMap being set
     */
    public FeatureMap set( int index, FeatureMap value )
    {
        if( (value == null) || (index < 0) )
        {
            return null;
        }

        // Copy from one feature map and set to this one
        FeatureMap copyFeatureMap = copyFeatureMap(value);
        
        if( (copyFeatureMap != null) && (copyFeatureMap.size() > 0) )
        {
            bdsFeatureMapInternal.set(index, copyFeatureMap.get(0));
        }
        
        return copyFeatureMap;
    }

    /**
     * Method to set an EObject to a specific
     * place in the existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     EObject to set data from
     * @return          The EObject being set
     */
    public EObject set( int index, EObject value )
    {
        if( (value == null) || (index < 0) )
        {
            return null;
        }
        
        // Get the element for this EObject
        EStructuralFeature elementStruct = getPreferredStructuralFeature( value );

        if( elementStruct == null )
        {
            return null;
        }
        
        EObject copyValue = EcoreUtil.copy(value);
        
        // Now set it in the FeatureMap
        bdsFeatureMapInternal.set(index, FeatureMapUtil.createEntry(elementStruct, copyValue));

        return copyValue;
    }

    
    //////////////////////////////////////////////
    // Utility methods 
    //////////////////////////////////////////////
    
    /**
     * Method that will copy the contents of one featureMap and return a new featureMap
     * This is a deep copy, so anything referenced will also be duplicated.
     *
     * @param featureMapTarget      The target FeatureMap to copy data to
     */
    private FeatureMap copyFeatureMap( FeatureMap featureMapSource )
    {
        // Start by making a copy of the FeatureMap, there is no supplied method for this
        // so we store it into an EObject and use the EcoreUtil method to copy the EObject
        // this is handle the duplication of all referenced objects so we do not
        // have to
        FeatureMap rawFeatureMap = featureMapSource;

        // The feature map may be either a direct featureMap or a wrapper
        // we need to work out which
        if( featureMapSource instanceof FeatureMap.Internal.Wrapper )
        {
            rawFeatureMap = ((FeatureMap.Internal.Wrapper)featureMapSource).featureMap();
        }
        
        // First create the EObject from the FeatureMap
        EObject eObject = ((EStructuralFeature.Setting)rawFeatureMap).getEObject();

        if( eObject == null )
        {
            // Not a valid featureMap to copy
            return null;
        }
        
        // Make a copy of the object
        EObject copyEObject = EcoreUtil.copy(eObject);
        
        // Now go through the object reading out any FeatureMaps, it should really
        // only contain the single feature map, so we can copy that
        EClass eClass = copyEObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i)
        {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived())
            {   
                if (eStructuralFeature instanceof EAttribute)
                {
                    if (FeatureMapUtil.isFeatureMap(eStructuralFeature))
                    {
                        FeatureMap featureMap = (FeatureMap)copyEObject.eGet(eStructuralFeature);
                        if( featureMap != null )
                        {
                            return featureMap;
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Given an EObject will find the best matching element.
     * The order of preference is:
     *  1. The previous element this EObject represented (if set)
     *  2. Any element with a name ending in "Element"
     *  3. Any element with a name different from the type name
     *  4. An element with a name matching the type name
     * 
     * @param srcObj    Object to find the best match for
     * @return          The EStructuralFeature with the best match
     */
    private EStructuralFeature getPreferredStructuralFeature( EObject srcObj )
    {
        // First check to see if this object type was previously created from an element
        // and the user has not specified the preferred element name to use
        ExtendedMetaData extendedMetaData = ExtendedMetaData.INSTANCE;

        EStructuralFeature bestMatchingFeature = null;
        EStructuralFeature randomMatchingFeature = null;
        EStructuralFeature nameMatchingFeature = null;
        
        // Get the containing object
        EObject container = srcObj.eContainer();

        // Check to see if the parent is a document root
        if( (container != null) && (container.eClass() != null) &&
            extendedMetaData.isDocumentRoot(container.eClass()) )
        {
            // Now retrieve what the document root contains, as that is what we want
            // to get the type of, this way we can support round trip and ensure we
            // convert back to the same element that it started as
            EList<EObject> contents = container.eContents();
            if( (contents != null) && (contents.size() > 0) )
            {
                EStructuralFeature containingFeature = contents.get(0).eContainingFeature();
                if( containingFeature != null )
                {
                    String elementName = extendedMetaData.getName(containingFeature);
                    String typeName = extendedMetaData.getName(containingFeature.getEType());
                    
                    // Check if the name of the element matches the type
                    // This may be OK if we can not find a better match
                    // but is not the preferred option
                    if( (elementName != null) && (typeName != null) && elementName.equals(typeName) )
                    {
                        nameMatchingFeature = containingFeature;
                    }
                    else
                    {
                        bestMatchingFeature = containingFeature;
                    }
                }
            }
        }
        
        // If it was not possible to deduce the original element, then find the best match
        if( bestMatchingFeature == null )
        {
            EClass docRoot = extendedMetaData.getDocumentRoot(srcObj.eClass().getEPackage());
            
            // If there is no document root then no need to continue
            if( docRoot != null )
            {
                for (EStructuralFeature element : extendedMetaData.getElements(docRoot))
                {
                    // Check to see if this element is of the same type and also matched the
                    // requested name
                    if( (element.getEType().getClassifierID() == srcObj.eClass().getClassifierID()) &&
                        (element.isChangeable()) )
                    {
                        // Default to the XSD Schema Name for the element
                        String elementName = extendedMetaData.getName(element);
                        String typeName = extendedMetaData.getName(element.getEType());

                        // Don't store elements whose name match their type - that is the
                        // normal default so there is no need to specify it.
                        if( !elementName.equals(typeName) )
                        {
                            if( randomMatchingFeature == null )
                            {
                                randomMatchingFeature = element;
                            }
                            
                            // If the element ends in Element then default to that one
                            // as this will be what studio calls the auto-generated element
                            // in the case of User Defined BOMs
                            if( elementName.endsWith("Element") )
                            {
                                bestMatchingFeature = element;
                                break;
                            }
                        }
                        else
                        {
                            nameMatchingFeature = element;
                        }
                    }
                }
            }
        }

        // Now check which feature we are going to use
        if( bestMatchingFeature == null )
        {
            if( randomMatchingFeature != null )
            {
                bestMatchingFeature = randomMatchingFeature;
            }
            else
            {
                bestMatchingFeature = nameMatchingFeature;
            }
        }
        
        return bestMatchingFeature;
    }
    
    /**
     * Checks if an object is actually an EObject and if it is takes a copy
     * 
     * @param source    The Object to check
     * @return
     */
    private Object getCopyIfEObject( Object source )
    {
        if( (source != null) && (source instanceof EObject) )
        {
            return EcoreUtil.copy((EObject)source);
        }

        return source;
    }
    
    /**
     * Given a collection of objects will check if any are EObjects and
     * if they are copy them
     * 
     * @param values    The Objects to check
     * @return          Either a copy or the original objects
     */
    private Collection< ? > getCopyIfEObjects( Collection< ? > values )
    {
        ArrayList<Object> newCollection = new ArrayList<Object>();

        for (Object source : values)
        {
            newCollection.add(getCopyIfEObject(source));
        }
                
        return newCollection;
    }
    
    /**
     * Checks the Entry to see if it contains an EObject
     * If it does then a copy of the Entry is returned
     * 
     * @param element       The Entry to check
     * @return              An Entry, copied if needed
     */
    private Entry getEntryCopyIfEObject( Entry element )
    {
        Object source = element.getValue();
        
        // Check if the value is an EObject, if it is we need to make
        // a copy or it will be removed from any original containment
        if( (source != null) && (source instanceof EObject) )
        {
            EObject copyValue = EcoreUtil.copy((EObject)source);
            return FeatureMapUtil.createEntry(element.getEStructuralFeature(), copyValue);
        }

        return element;
    }

    /**
     * Checks all entries in the collection to see if they contain
     * EObjects, if they do then copies are returned
     * 
     * @param entries       The Entry to check
     * @return              An Entry collection, copied if needed
     */
    private Collection< ? extends Entry> getEntryCopyIfEObjects(Collection< ? extends Entry> entries)
    {
        ArrayList<Entry> newCollection = new ArrayList<Entry>();

        for (Entry entry : entries)
        {
            newCollection.add(getEntryCopyIfEObject(entry));
        }
                
        return newCollection;
    }
    
    /**
     * Change the order or the list by making sure the last element is
     * in the correct position
     * 
     * @param source       Object that was added
     */
    private void enforceOrdering( Object source )
    {
    	// Get the position in the sequence that this item should be
    	int orderVal = getSequenceOrder( source );
           
        // Make sure that the index has been located if it exists
        if( orderVal < 0 )
        {
            return; // no reordering required
        }

        // Now search the existing featureMap entries to see where this entry
        // should be added
        for (int i = 0; i < bdsFeatureMapInternal.internalFeatureMap.size(); i++) {
            Object object = bdsFeatureMapInternal.internalFeatureMap.get(i);

            if( orderVal < getSequenceOrder( object ) )
            {
                // Needs to be inserted before this value
            	
            	// The entry was added to the end of the FeatureMap before this call
            	// so need to move that to the correct position
            	int currentPosition = size() - 1;
            	move(i, currentPosition);
                return;
            }
        }
    }
    
    /**
     * Gets the value of the SequenceOrder annotation
     * 
     * @param source       Object to get the value for
     * @return      Order number, of -1 if not set
     */
    private int getSequenceOrder( Object source )
    {
        // First check if this is the first element added, if so safe to return now
        if( bdsFeatureMapInternal.internalFeatureMap.isEmpty() || (source == null) )
        {
            return -1;
        }
        
        int orderVal = -1;
        
        // Extract the feature if it is an entry
        if( source instanceof Entry )
        {
        	// Check if this was an unset - if so, we do not want to change any order
        	if( ((Entry)source).getValue() == null )
        	{
        		return -1;
        	}
        	source = ((Entry)source).getEStructuralFeature();
        }
        
        // get the current index location
        if( source instanceof EModelElement )
        {
            EAnnotation eAnnotation = ((EModelElement)source).getEAnnotation("bds");
            if( eAnnotation != null )
            {
                String annoVal = eAnnotation.getDetails().get("SequenceOrder");
                if( (annoVal != null) && !annoVal.isEmpty() )
                {
                    orderVal = Integer.parseInt(annoVal);
                }
            }
        }
        return orderVal;
    }
}
