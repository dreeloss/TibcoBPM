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
 * A representation of the literals of the enumeration '<em><b>Currency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.example.expensebom02.Expensebom02Package#getCurrency()
 * @model extendedMetaData="name='Currency'"
 * @generated
 */
public enum Currency implements Enumerator
{
  /**
   * The '<em><b>USD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USD_VALUE
   * @generated
   * @ordered
   */
  USD(0, "USD", "USD"),

  /**
   * The '<em><b>GBP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GBP_VALUE
   * @generated
   * @ordered
   */
  GBP(1, "GBP", "GBP"),

  /**
   * The '<em><b>AUD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUD_VALUE
   * @generated
   * @ordered
   */
  AUD(2, "AUD", "AUD"),

  /**
   * The '<em><b>EUR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EUR_VALUE
   * @generated
   * @ordered
   */
  EUR(3, "EUR", "EUR");

  /**
   * The '<em><b>USD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>USD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USD
   * @model
   * @generated
   * @ordered
   */
  public static final int USD_VALUE = 0;

  /**
   * The '<em><b>GBP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GBP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GBP
   * @model
   * @generated
   * @ordered
   */
  public static final int GBP_VALUE = 1;

  /**
   * The '<em><b>AUD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AUD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUD
   * @model
   * @generated
   * @ordered
   */
  public static final int AUD_VALUE = 2;

  /**
   * The '<em><b>EUR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EUR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EUR
   * @model
   * @generated
   * @ordered
   */
  public static final int EUR_VALUE = 3;

  /**
   * An array of all the '<em><b>Currency</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Currency[] VALUES_ARRAY =
    new Currency[]
    {
      USD,
      GBP,
      AUD,
      EUR,
    };

  /**
   * A public read-only list of all the '<em><b>Currency</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Currency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Currency</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Currency get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Currency result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    throw new IllegalArgumentException("Not a valid enumeration literal: " + literal);
  }

  /**
   * Returns the '<em><b>Currency</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Currency getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Currency result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Currency</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Currency get(int value)
  {
    switch (value)
    {
      case USD_VALUE: return USD;
      case GBP_VALUE: return GBP;
      case AUD_VALUE: return AUD;
      case EUR_VALUE: return EUR;
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
  private Currency(int value, String name, String literal)
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
  
} //Currency
