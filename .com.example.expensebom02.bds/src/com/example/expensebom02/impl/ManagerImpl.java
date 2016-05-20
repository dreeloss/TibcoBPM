
package com.example.expensebom02.impl;

import com.example.expensebom02.Expensebom02Package;
import com.example.expensebom02.Manager;

import com.example.expensebom02.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.expensebom02.impl.ManagerImpl#getApprovalLimit <em>Approval Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ManagerImpl extends EmployeeImpl implements Manager
{
  /**
   * The default value of the '{@link #getApprovalLimit() <em>Approval Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApprovalLimit()
   * @generated
   * @ordered
   */
  protected static final Integer APPROVAL_LIMIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getApprovalLimit() <em>Approval Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApprovalLimit()
   * @generated
   * @ordered
   */
  protected Integer approvalLimit = APPROVAL_LIMIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManagerImpl()
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
    return Expensebom02Package.Literals.MANAGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getApprovalLimit()
  {
    return approvalLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApprovalLimit(Integer newApprovalLimit)
  {
    Integer oldApprovalLimit = approvalLimit;
    approvalLimit = newApprovalLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.MANAGER__APPROVAL_LIMIT, oldApprovalLimit, approvalLimit));
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
      case Expensebom02Package.MANAGER__APPROVAL_LIMIT:
        return getApprovalLimit();
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
      case Expensebom02Package.MANAGER__APPROVAL_LIMIT:
        setApprovalLimit((Integer)newValue);
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
      case Expensebom02Package.MANAGER__APPROVAL_LIMIT:
        setApprovalLimit(APPROVAL_LIMIT_EDEFAULT);
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
      case Expensebom02Package.MANAGER__APPROVAL_LIMIT:
        return APPROVAL_LIMIT_EDEFAULT == null ? approvalLimit != null : !APPROVAL_LIMIT_EDEFAULT.equals(approvalLimit);
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
    result.append(" (approvalLimit: ");
    result.append(approvalLimit);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setApprovalLimit(Object value)
  {
    // Call the default set, passing in the converted value
    setApprovalLimit(BDSTypeConversions.convertToInteger(value));
  }
} //ManagerImpl
