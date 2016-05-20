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
 * A representation of the literals of the enumeration '<em><b>Expense Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.example.expensebom02.Expensebom02Package#getExpenseCodes()
 * @model extendedMetaData="name='ExpenseCodes'"
 * @generated
 */
public enum ExpenseCodes implements Enumerator
{
  /**
   * The '<em><b>ENT01</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENT01_VALUE
   * @generated
   * @ordered
   */
  ENT01(0, "ENT01", "ENT01"),

  /**
   * The '<em><b>ACC02</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACC02_VALUE
   * @generated
   * @ordered
   */
  ACC02(1, "ACC02", "ACC02"),

  /**
   * The '<em><b>MEA03</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEA03_VALUE
   * @generated
   * @ordered
   */
  MEA03(2, "MEA03", "MEA03"),

  /**
   * The '<em><b>TAX04</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TAX04_VALUE
   * @generated
   * @ordered
   */
  TAX04(3, "TAX04", "TAX04"),

  /**
   * The '<em><b>FLI05</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLI05_VALUE
   * @generated
   * @ordered
   */
  FLI05(4, "FLI05", "FLI05"),

  /**
   * The '<em><b>MIS06</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIS06_VALUE
   * @generated
   * @ordered
   */
  MIS06(5, "MIS06", "MIS06");

  /**
   * The '<em><b>ENT01</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ENT01</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENT01
   * @model
   * @generated
   * @ordered
   */
  public static final int ENT01_VALUE = 0;

  /**
   * The '<em><b>ACC02</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ACC02</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACC02
   * @model
   * @generated
   * @ordered
   */
  public static final int ACC02_VALUE = 1;

  /**
   * The '<em><b>MEA03</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEA03</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEA03
   * @model
   * @generated
   * @ordered
   */
  public static final int MEA03_VALUE = 2;

  /**
   * The '<em><b>TAX04</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TAX04</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TAX04
   * @model
   * @generated
   * @ordered
   */
  public static final int TAX04_VALUE = 3;

  /**
   * The '<em><b>FLI05</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FLI05</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLI05
   * @model
   * @generated
   * @ordered
   */
  public static final int FLI05_VALUE = 4;

  /**
   * The '<em><b>MIS06</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MIS06</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIS06
   * @model
   * @generated
   * @ordered
   */
  public static final int MIS06_VALUE = 5;

  /**
   * An array of all the '<em><b>Expense Codes</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ExpenseCodes[] VALUES_ARRAY =
    new ExpenseCodes[]
    {
      ENT01,
      ACC02,
      MEA03,
      TAX04,
      FLI05,
      MIS06,
    };

  /**
   * A public read-only list of all the '<em><b>Expense Codes</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ExpenseCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Expense Codes</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpenseCodes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ExpenseCodes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    throw new IllegalArgumentException("Not a valid enumeration literal: " + literal);
  }

  /**
   * Returns the '<em><b>Expense Codes</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpenseCodes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ExpenseCodes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Expense Codes</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpenseCodes get(int value)
  {
    switch (value)
    {
      case ENT01_VALUE: return ENT01;
      case ACC02_VALUE: return ACC02;
      case MEA03_VALUE: return MEA03;
      case TAX04_VALUE: return TAX04;
      case FLI05_VALUE: return FLI05;
      case MIS06_VALUE: return MIS06;
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
  private ExpenseCodes(int value, String name, String literal)
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
  
} //ExpenseCodes
