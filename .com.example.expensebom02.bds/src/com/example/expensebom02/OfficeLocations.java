/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.expensebom02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Office Locations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.example.expensebom02.Expensebom02Package#getOfficeLocations()
 * @model extendedMetaData="name='OfficeLocations'"
 * @generated
 */
public enum OfficeLocations implements Enumerator
{
  /**
   * The '<em><b>PALOALTO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PALOALTO_VALUE
   * @generated
   * @ordered
   */
  PALOALTO(0, "PALOALTO", "PALOALTO"),

  /**
   * The '<em><b>SWINDON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SWINDON_VALUE
   * @generated
   * @ordered
   */
  SWINDON(1, "SWINDON", "SWINDON"),

  /**
   * The '<em><b>SYDNEY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYDNEY_VALUE
   * @generated
   * @ordered
   */
  SYDNEY(2, "SYDNEY", "SYDNEY"),

  /**
   * The '<em><b>PARIS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARIS_VALUE
   * @generated
   * @ordered
   */
  PARIS(3, "PARIS", "PARIS");

  /**
   * The '<em><b>PALOALTO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PALOALTO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PALOALTO
   * @model
   * @generated
   * @ordered
   */
  public static final int PALOALTO_VALUE = 0;

  /**
   * The '<em><b>SWINDON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SWINDON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SWINDON
   * @model
   * @generated
   * @ordered
   */
  public static final int SWINDON_VALUE = 1;

  /**
   * The '<em><b>SYDNEY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYDNEY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYDNEY
   * @model
   * @generated
   * @ordered
   */
  public static final int SYDNEY_VALUE = 2;

  /**
   * The '<em><b>PARIS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PARIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARIS
   * @model
   * @generated
   * @ordered
   */
  public static final int PARIS_VALUE = 3;

  /**
   * An array of all the '<em><b>Office Locations</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OfficeLocations[] VALUES_ARRAY =
    new OfficeLocations[]
    {
      PALOALTO,
      SWINDON,
      SYDNEY,
      PARIS,
    };

  /**
   * A public read-only list of all the '<em><b>Office Locations</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OfficeLocations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Office Locations</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OfficeLocations get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OfficeLocations result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    throw new IllegalArgumentException("Not a valid enumeration literal: " + literal);
  }

  /**
   * Returns the '<em><b>Office Locations</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OfficeLocations getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OfficeLocations result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Office Locations</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OfficeLocations get(int value)
  {
    switch (value)
    {
      case PALOALTO_VALUE: return PALOALTO;
      case SWINDON_VALUE: return SWINDON;
      case SYDNEY_VALUE: return SYDNEY;
      case PARIS_VALUE: return PARIS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OfficeLocations(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OfficeLocations
