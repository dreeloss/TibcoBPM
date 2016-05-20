package com.example.expensebom02;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.expensebom02.Employee#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link com.example.expensebom02.Employee#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.example.expensebom02.Employee#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.expensebom02.Expensebom02Package#getEmployee()
 * @model extendedMetaData="name='Employee' kind='elementOnly'"
 *        annotation="bds label='Employee'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface Employee extends EObject
{
  /**
   * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employee Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employee Id</em>' attribute.
   * @see #setEmployeeId(String)
   * @see com.example.expensebom02.Expensebom02Package#getEmployee_EmployeeId()
   * @model dataType="com.example.expensebom02.employeeId_EmployeeType" required="true"
   *        extendedMetaData="kind='element' name='employeeId'"
   * @generated
   */
  String getEmployeeId();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Employee#getEmployeeId <em>Employee Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Employee Id</em>' attribute.
   * @see #getEmployeeId()
   * @generated
   */
  void setEmployeeId(String value);

  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see com.example.expensebom02.Expensebom02Package#getEmployee_FirstName()
   * @model dataType="com.example.expensebom02.firstName_EmployeeType" required="true"
   *        extendedMetaData="kind='element' name='firstName'"
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Employee#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Name</em>' attribute.
   * @see #setLastName(String)
   * @see com.example.expensebom02.Expensebom02Package#getEmployee_LastName()
   * @model dataType="com.example.expensebom02.lastName_EmployeeType" required="true"
   *        extendedMetaData="kind='element' name='lastName'"
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Employee#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getEmployeeId()
   * @generated
   */
  void setEmployeeId(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getLastName()
   * @generated
   */
  void setLastName(Object value);

} // Employee
