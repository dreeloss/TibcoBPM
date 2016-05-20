
package com.example.expensebom02.impl;

import com.example.expensebom02.ExpenseCodes;
import com.example.expensebom02.ExpenseItems;
import com.example.expensebom02.Expensebom02Package;

import com.example.expensebom02.bdsutil.BDSCopyUtil;
import com.example.expensebom02.bdsutil.BDSNotifyingCalendar;
import com.example.expensebom02.bdsutil.BDSTypeConversions;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expense Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.expensebom02.impl.ExpenseItemsImpl#getDate <em>Date</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.ExpenseItemsImpl#getExpenseCode <em>Expense Code</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.ExpenseItemsImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ExpenseItemsImpl extends EObjectImpl implements ExpenseItems
{
  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getExpenseCode() <em>Expense Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpenseCode()
   * @generated
   * @ordered
   */
  protected static final ExpenseCodes EXPENSE_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpenseCode() <em>Expense Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpenseCode()
   * @generated
   * @ordered
   */
  protected ExpenseCodes expenseCode = EXPENSE_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final Double AMOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected Double amount = AMOUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpenseItemsImpl()
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
    return Expensebom02Package.Literals.EXPENSE_ITEMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(XMLGregorianCalendar newDate)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newDate != date)
    { 
      if (date instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)date).cancelNotification();
      }
      if (newDate != null)
      {
        newDate = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newDate), this, Expensebom02Package.EXPENSE_ITEMS__DATE);
      }
    }
    XMLGregorianCalendar oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EXPENSE_ITEMS__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseCodes getExpenseCode()
  {
    return expenseCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpenseCode(ExpenseCodes newExpenseCode)
  {
    ExpenseCodes oldExpenseCode = expenseCode;
    expenseCode = newExpenseCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EXPENSE_ITEMS__EXPENSE_CODE, oldExpenseCode, expenseCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(Double newAmount)
  {
    Double oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Expensebom02Package.EXPENSE_ITEMS__AMOUNT, oldAmount, amount));
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
      case Expensebom02Package.EXPENSE_ITEMS__DATE:
        return getDate();
      case Expensebom02Package.EXPENSE_ITEMS__EXPENSE_CODE:
        return getExpenseCode();
      case Expensebom02Package.EXPENSE_ITEMS__AMOUNT:
        return getAmount();
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
      case Expensebom02Package.EXPENSE_ITEMS__DATE:
        setDate((XMLGregorianCalendar)newValue);
        return;
      case Expensebom02Package.EXPENSE_ITEMS__EXPENSE_CODE:
        setExpenseCode((ExpenseCodes)newValue);
        return;
      case Expensebom02Package.EXPENSE_ITEMS__AMOUNT:
        setAmount((Double)newValue);
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
      case Expensebom02Package.EXPENSE_ITEMS__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case Expensebom02Package.EXPENSE_ITEMS__EXPENSE_CODE:
        setExpenseCode(EXPENSE_CODE_EDEFAULT);
        return;
      case Expensebom02Package.EXPENSE_ITEMS__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
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
      case Expensebom02Package.EXPENSE_ITEMS__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case Expensebom02Package.EXPENSE_ITEMS__EXPENSE_CODE:
        return EXPENSE_CODE_EDEFAULT == null ? expenseCode != null : !EXPENSE_CODE_EDEFAULT.equals(expenseCode);
      case Expensebom02Package.EXPENSE_ITEMS__AMOUNT:
        return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
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
    result.append(" (date: ");
    result.append(date);
    result.append(", expenseCode: ");
    result.append(expenseCode);
    result.append(", amount: ");
    result.append(amount);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setAmount(Object value)
  {
    // Call the default set, passing in the converted value
    setAmount(BDSTypeConversions.convertToDouble(value));
  }
} //ExpenseItemsImpl
