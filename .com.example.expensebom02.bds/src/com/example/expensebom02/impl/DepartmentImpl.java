
package com.example.expensebom02.impl;

import com.example.expensebom02.Department;
import com.example.expensebom02.Expensebom02Package;
import com.example.expensebom02.OfficeLocations;

import com.example.expensebom02.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.expensebom02.impl.DepartmentImpl#getDeptCode <em>Dept Code</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DepartmentImpl#getDeptName <em>Dept Name</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DepartmentImpl#getManagerId <em>Manager Id</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DepartmentImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DepartmentImpl extends EObjectImpl implements Department
{
  /**
   * The default value of the '{@link #getDeptCode() <em>Dept Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeptCode()
   * @generated
   * @ordered
   */
  protected static final String DEPT_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeptCode() <em>Dept Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeptCode()
   * @generated
   * @ordered
   */
  protected String deptCode = DEPT_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getDeptName() <em>Dept Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeptName()
   * @generated
   * @ordered
   */
  protected static final String DEPT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeptName() <em>Dept Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeptName()
   * @generated
   * @ordered
   */
  protected String deptName = DEPT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getManagerId() <em>Manager Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManagerId()
   * @generated
   * @ordered
   */
  protected static final String MANAGER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getManagerId() <em>Manager Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManagerId()
   * @generated
   * @ordered
   */
  protected String managerId = MANAGER_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final OfficeLocations LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected OfficeLocations location = LOCATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepartmentImpl()
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
    return Expensebom02Package.Literals.DEPARTMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeptCode()
  {
    return deptCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeptCode(String newDeptCode)
  {
    String oldDeptCode = deptCode;
    deptCode = newDeptCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.DEPARTMENT__DEPT_CODE, oldDeptCode, deptCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeptName()
  {
    return deptName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeptName(String newDeptName)
  {
    String oldDeptName = deptName;
    deptName = newDeptName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.DEPARTMENT__DEPT_NAME, oldDeptName, deptName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getManagerId()
  {
    return managerId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManagerId(String newManagerId)
  {
    String oldManagerId = managerId;
    managerId = newManagerId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.DEPARTMENT__MANAGER_ID, oldManagerId, managerId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeLocations getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(OfficeLocations newLocation)
  {
    OfficeLocations oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.DEPARTMENT__LOCATION, oldLocation, location));
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
      case Expensebom02Package.DEPARTMENT__DEPT_CODE:
        return getDeptCode();
      case Expensebom02Package.DEPARTMENT__DEPT_NAME:
        return getDeptName();
      case Expensebom02Package.DEPARTMENT__MANAGER_ID:
        return getManagerId();
      case Expensebom02Package.DEPARTMENT__LOCATION:
        return getLocation();
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
      case Expensebom02Package.DEPARTMENT__DEPT_CODE:
        setDeptCode((String)newValue);
        return;
      case Expensebom02Package.DEPARTMENT__DEPT_NAME:
        setDeptName((String)newValue);
        return;
      case Expensebom02Package.DEPARTMENT__MANAGER_ID:
        setManagerId((String)newValue);
        return;
      case Expensebom02Package.DEPARTMENT__LOCATION:
        setLocation((OfficeLocations)newValue);
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
      case Expensebom02Package.DEPARTMENT__DEPT_CODE:
        setDeptCode(DEPT_CODE_EDEFAULT);
        return;
      case Expensebom02Package.DEPARTMENT__DEPT_NAME:
        setDeptName(DEPT_NAME_EDEFAULT);
        return;
      case Expensebom02Package.DEPARTMENT__MANAGER_ID:
        setManagerId(MANAGER_ID_EDEFAULT);
        return;
      case Expensebom02Package.DEPARTMENT__LOCATION:
        setLocation(LOCATION_EDEFAULT);
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
      case Expensebom02Package.DEPARTMENT__DEPT_CODE:
        return DEPT_CODE_EDEFAULT == null ? deptCode != null : !DEPT_CODE_EDEFAULT.equals(deptCode);
      case Expensebom02Package.DEPARTMENT__DEPT_NAME:
        return DEPT_NAME_EDEFAULT == null ? deptName != null : !DEPT_NAME_EDEFAULT.equals(deptName);
      case Expensebom02Package.DEPARTMENT__MANAGER_ID:
        return MANAGER_ID_EDEFAULT == null ? managerId != null : !MANAGER_ID_EDEFAULT.equals(managerId);
      case Expensebom02Package.DEPARTMENT__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
    result.append(" (deptCode: ");
    result.append(deptCode);
    result.append(", deptName: ");
    result.append(deptName);
    result.append(", managerId: ");
    result.append(managerId);
    result.append(", location: ");
    result.append(location);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setDeptCode(Object value)
  {
    // Call the default set, passing in the converted value
    setDeptCode(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setDeptName(Object value)
  {
    // Call the default set, passing in the converted value
    setDeptName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setManagerId(Object value)
  {
    // Call the default set, passing in the converted value
    setManagerId(BDSTypeConversions.convertToString(value));
  }
} //DepartmentImpl
