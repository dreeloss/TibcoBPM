
package com.example.expensebom02.impl;

import com.example.expensebom02.Employee;
import com.example.expensebom02.Expensebom02Package;

import com.example.expensebom02.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.expensebom02.impl.EmployeeImpl#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.EmployeeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.EmployeeImpl#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class EmployeeImpl extends EObjectImpl implements Employee
{
  /**
   * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmployeeId()
   * @generated
   * @ordered
   */
  protected static final String EMPLOYEE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmployeeId()
   * @generated
   * @ordered
   */
  protected String employeeId = EMPLOYEE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmployeeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Expensebom02Package.Literals.EMPLOYEE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmployeeId()
  {
    return employeeId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmployeeId(String newEmployeeId)
  {
    String oldEmployeeId = employeeId;
    employeeId = newEmployeeId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EMPLOYEE__EMPLOYEE_ID, oldEmployeeId, employeeId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EMPLOYEE__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EMPLOYEE__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Expensebom02Package.EMPLOYEE__EMPLOYEE_ID:
        return getEmployeeId();
      case Expensebom02Package.EMPLOYEE__FIRST_NAME:
        return getFirstName();
      case Expensebom02Package.EMPLOYEE__LAST_NAME:
        return getLastName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Expensebom02Package.EMPLOYEE__EMPLOYEE_ID:
        setEmployeeId((String)newValue);
        return;
      case Expensebom02Package.EMPLOYEE__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case Expensebom02Package.EMPLOYEE__LAST_NAME:
        setLastName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Expensebom02Package.EMPLOYEE__EMPLOYEE_ID:
        setEmployeeId(EMPLOYEE_ID_EDEFAULT);
        return;
      case Expensebom02Package.EMPLOYEE__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case Expensebom02Package.EMPLOYEE__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Expensebom02Package.EMPLOYEE__EMPLOYEE_ID:
        return EMPLOYEE_ID_EDEFAULT == null ? employeeId != null : !EMPLOYEE_ID_EDEFAULT.equals(employeeId);
      case Expensebom02Package.EMPLOYEE__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case Expensebom02Package.EMPLOYEE__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (employeeId: ");
    result.append(employeeId);
    result.append(", firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setEmployeeId(Object value)
  {
    // Call the default set, passing in the converted value
    setEmployeeId(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setFirstName(Object value)
  {
    // Call the default set, passing in the converted value
    setFirstName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setLastName(Object value)
  {
    // Call the default set, passing in the converted value
    setLastName(BDSTypeConversions.convertToString(value));
  }
} //EmployeeImpl
