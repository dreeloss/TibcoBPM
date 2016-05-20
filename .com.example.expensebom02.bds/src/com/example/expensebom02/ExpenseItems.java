package com.example.expensebom02;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expense Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.expensebom02.ExpenseItems#getDate <em>Date</em>}</li>
 *   <li>{@link com.example.expensebom02.ExpenseItems#getExpenseCode <em>Expense Code</em>}</li>
 *   <li>{@link com.example.expensebom02.ExpenseItems#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.expensebom02.Expensebom02Package#getExpenseItems()
 * @model extendedMetaData="name='ExpenseItems' kind='elementOnly'"
 *        annotation="bds label='Expense Items'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface ExpenseItems extends EObject
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(XMLGregorianCalendar)
   * @see com.example.expensebom02.Expensebom02Package#getExpenseItems_Date()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
   *        extendedMetaData="kind='element' name='date'"
   * @generated
   */
  XMLGregorianCalendar getDate();

  /**
   * Sets the value of the '{@link com.example.expensebom02.ExpenseItems#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(XMLGregorianCalendar value);

  /**
   * Returns the value of the '<em><b>Expense Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expense Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expense Code</em>' attribute.
   * @see #setExpenseCode(ExpenseCodes)
   * @see com.example.expensebom02.Expensebom02Package#getExpenseItems_ExpenseCode()
   * @model dataType="com.example.expensebom02.ExpenseCodesObject"
   *        extendedMetaData="kind='element' name='expenseCode'"
   * @generated
   */
  ExpenseCodes getExpenseCode();

  /**
   * Sets the value of the '{@link com.example.expensebom02.ExpenseItems#getExpenseCode <em>Expense Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expense Code</em>' attribute.
   * @see #getExpenseCode()
   * @generated
   */
  void setExpenseCode(ExpenseCodes value);

  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(Double)
   * @see com.example.expensebom02.Expensebom02Package#getExpenseItems_Amount()
   * @model dataType="com.example.expensebom02.DoubleStudioGeneratedTemplateObject"
   *        extendedMetaData="kind='element' name='amount'"
   * @generated
   */
  Double getAmount();

  /**
   * Sets the value of the '{@link com.example.expensebom02.ExpenseItems#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(Double value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAmount()
   * @generated
   */
  void setAmount(Object value);

} // ExpenseItems
