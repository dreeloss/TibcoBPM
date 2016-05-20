package com.example.expensebom02;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.expensebom02.Department#getDeptCode <em>Dept Code</em>}</li>
 *   <li>{@link com.example.expensebom02.Department#getDeptName <em>Dept Name</em>}</li>
 *   <li>{@link com.example.expensebom02.Department#getManagerId <em>Manager Id</em>}</li>
 *   <li>{@link com.example.expensebom02.Department#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.expensebom02.Expensebom02Package#getDepartment()
 * @model extendedMetaData="name='Department' kind='elementOnly'"
 *        annotation="bds label='Department'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface Department extends EObject
{
  /**
   * Returns the value of the '<em><b>Dept Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dept Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dept Code</em>' attribute.
   * @see #setDeptCode(String)
   * @see com.example.expensebom02.Expensebom02Package#getDepartment_DeptCode()
   * @model dataType="com.example.expensebom02.deptCode_DepartmentType" required="true"
   *        extendedMetaData="kind='element' name='deptCode'"
   * @generated
   */
  String getDeptCode();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Department#getDeptCode <em>Dept Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dept Code</em>' attribute.
   * @see #getDeptCode()
   * @generated
   */
  void setDeptCode(String value);

  /**
   * Returns the value of the '<em><b>Dept Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dept Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dept Name</em>' attribute.
   * @see #setDeptName(String)
   * @see com.example.expensebom02.Expensebom02Package#getDepartment_DeptName()
   * @model dataType="com.example.expensebom02.deptName_DepartmentType" required="true"
   *        extendedMetaData="kind='element' name='deptName'"
   * @generated
   */
  String getDeptName();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Department#getDeptName <em>Dept Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dept Name</em>' attribute.
   * @see #getDeptName()
   * @generated
   */
  void setDeptName(String value);

  /**
   * Returns the value of the '<em><b>Manager Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manager Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manager Id</em>' attribute.
   * @see #setManagerId(String)
   * @see com.example.expensebom02.Expensebom02Package#getDepartment_ManagerId()
   * @model dataType="com.example.expensebom02.managerId_DepartmentType" required="true"
   *        extendedMetaData="kind='element' name='managerId'"
   * @generated
   */
  String getManagerId();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Department#getManagerId <em>Manager Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manager Id</em>' attribute.
   * @see #getManagerId()
   * @generated
   */
  void setManagerId(String value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(OfficeLocations)
   * @see com.example.expensebom02.Expensebom02Package#getDepartment_Location()
   * @model dataType="com.example.expensebom02.OfficeLocationsObject" required="true"
   *        extendedMetaData="kind='element' name='location'"
   * @generated
   */
  OfficeLocations getLocation();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Department#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(OfficeLocations value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getDeptCode()
   * @generated
   */
  void setDeptCode(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getDeptName()
   * @generated
   */
  void setDeptName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getManagerId()
   * @generated
   */
  void setManagerId(Object value);

} // Department
