
package com.example.expensebom02.impl;

import com.example.expensebom02.Currency;
import com.example.expensebom02.ExpenseItems;
import com.example.expensebom02.ExpenseReport;
import com.example.expensebom02.Expensebom02Package;

import com.example.expensebom02.bdsutil.BDSCopyUtil;

import com.example.expensebom02.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import com.example.expensebom02.bdsutil.BDSNotifyingCalendar;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expense Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.expensebom02.impl.ExpenseReportImpl#getReportDate <em>Report Date</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.ExpenseReportImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.ExpenseReportImpl#getExpenseitems <em>Expenseitems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ExpenseReportImpl extends EObjectImpl implements ExpenseReport
{
  /**
   * The default value of the '{@link #getReportDate() <em>Report Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReportDate()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar REPORT_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReportDate() <em>Report Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReportDate()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar reportDate = REPORT_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrency()
   * @generated
   * @ordered
   */
  protected static final Currency CURRENCY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrency()
   * @generated
   * @ordered
   */
  protected Currency currency = CURRENCY_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpenseitems() <em>Expenseitems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpenseitems()
   * @generated
   * @ordered
   */
  protected EList<ExpenseItems> expenseitems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpenseReportImpl()
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
    return Expensebom02Package.Literals.EXPENSE_REPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getReportDate()
  {
    return reportDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReportDate(XMLGregorianCalendar newReportDate)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newReportDate != reportDate)
    { 
      if (reportDate instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)reportDate).cancelNotification();
      }
      if (newReportDate != null)
      {
        newReportDate = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newReportDate), this, Expensebom02Package.EXPENSE_REPORT__REPORT_DATE);
      }
    }
    XMLGregorianCalendar oldReportDate = reportDate;
    reportDate = newReportDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EXPENSE_REPORT__REPORT_DATE, oldReportDate, reportDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Currency getCurrency()
  {
    return currency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrency(Currency newCurrency)
  {
    Currency oldCurrency = currency;
    currency = newCurrency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EXPENSE_REPORT__CURRENCY, oldCurrency, currency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpenseItems> getExpenseitems()
  {
    if (expenseitems == null)
    {
      expenseitems = new BDSEObjectContainmentEList<ExpenseItems>(ExpenseItems.class, this, Expensebom02Package.EXPENSE_REPORT__EXPENSEITEMS);
    }
    return expenseitems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Expensebom02Package.EXPENSE_REPORT__EXPENSEITEMS:
        return ((InternalEList<?>)getExpenseitems()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Expensebom02Package.EXPENSE_REPORT__REPORT_DATE:
        return getReportDate();
      case Expensebom02Package.EXPENSE_REPORT__CURRENCY:
        return getCurrency();
      case Expensebom02Package.EXPENSE_REPORT__EXPENSEITEMS:
        return getExpenseitems();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Expensebom02Package.EXPENSE_REPORT__REPORT_DATE:
        setReportDate((XMLGregorianCalendar)newValue);
        return;
      case Expensebom02Package.EXPENSE_REPORT__CURRENCY:
        setCurrency((Currency)newValue);
        return;
      case Expensebom02Package.EXPENSE_REPORT__EXPENSEITEMS:
        getExpenseitems().clear();
        getExpenseitems().addAll((Collection<? extends ExpenseItems>)newValue);
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
      case Expensebom02Package.EXPENSE_REPORT__REPORT_DATE:
        setReportDate(REPORT_DATE_EDEFAULT);
        return;
      case Expensebom02Package.EXPENSE_REPORT__CURRENCY:
        setCurrency(CURRENCY_EDEFAULT);
        return;
      case Expensebom02Package.EXPENSE_REPORT__EXPENSEITEMS:
        getExpenseitems().clear();
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
      case Expensebom02Package.EXPENSE_REPORT__REPORT_DATE:
        return REPORT_DATE_EDEFAULT == null ? reportDate != null : !REPORT_DATE_EDEFAULT.equals(reportDate);
      case Expensebom02Package.EXPENSE_REPORT__CURRENCY:
        return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
      case Expensebom02Package.EXPENSE_REPORT__EXPENSEITEMS:
        return expenseitems != null && !expenseitems.isEmpty();
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
    result.append(" (reportDate: ");
    result.append(reportDate);
    result.append(", currency: ");
    result.append(currency);
    result.append(')');
    return result.toString();
  }

} //ExpenseReportImpl
