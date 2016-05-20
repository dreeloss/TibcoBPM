/*
* ENVIRONMENT:    Java Generic
*
* COPYRIGHT:      (C) 2011 TIBCO Software Inc
*/
package com.example.expensebom02.bdsutil;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * Interface to add additional functionality to the standard FeatureMap
 *
 */
public interface BDSFeatureMap extends FeatureMap.Internal.Wrapper, FeatureMap
{
	/**
	 * This method is required if you wish to use the FeatureMap
	 * as a wrapper
	 * 
	 * @return	FeatureMap
	 */
	public FeatureMap featureMap();
	
	/**
	 * Method to add an existing FeatureMap to the end of
	 * the existing FeatureMap
	 * 
	 * @param value		FeatureMap to add data from
	 * @return			True if added, otherwise False
	 */
	public boolean add( FeatureMap value );
	
	/**
	 * Method to add an EObject to the end of the
	 * existing FeatureMap
	 * 
	 * @param value		EObject to add to the FeatureMap
	 * @return			True if added, otherwise False
	 */
	public boolean add( EObject value );

    /**
     * Method to add an EObject to a specific place in the
     * existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     EObject to add to the FeatureMap
     */
    public void add( int index, EObject value );

    /**
     * Method to add an existing FeatureMap to a specific
     * place in the existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     FeatureMap to add data from
     */
    public void add( int index, FeatureMap value );

    /**
     * Method to add a list of EObjects to the end of the
     * existing FeatureMap
     * 
     * @param values    EObjects to add to the FeatureMap
     * @return          True if added, otherwise false
     */
    public boolean addAll( List<? extends EObject> values );

    /**
     * Method to set a FeatureMap to a specific
     * place in the existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     FeatureMap to set data from
     * @return          The FeatureMap being set
     */
    public FeatureMap set( int index, FeatureMap value );
    
    /**
     * Method to set an EObject to a specific
     * place in the existing FeatureMap
     * 
     * @param index     Index of the location to add into
     * @param value     EObject to set data from
     * @return          The EObject being set
     */
    public EObject set( int index, EObject value );

}
