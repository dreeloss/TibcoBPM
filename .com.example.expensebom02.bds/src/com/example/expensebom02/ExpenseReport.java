package com.example.expensebom02;

import com.example.expensebom02.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expense Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.expensebom02.ExpenseReport#getReportDate <em>Report Date</em>}</li>
 *   <li>{@link com.example.expensebom02.ExpenseReport#getCurrency <em>Currency</em>}</li>
 *   <li>{@link com.example.expensebom02.ExpenseReport#getExpenseitems <em>Expenseitems</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.expensebom02.Expensebom02Package#getExpenseReport()
 * @model extendedMetaData="name='ExpenseReport' kind='elementOnly'"
 *        annotation="bds label='Expense Report'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface ExpenseReport extends EObject
{
  /**
   * Returns the value of the '<em><b>Report Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Report Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Report Date</em>' attribute.
   * @see #setReportDate(XMLGregorianCalendar)
   * @see com.example.expensebom02.Expensebom02Package#getExpenseReport_ReportDate()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
   *        extendedMetaData="kind='element' name='reportDate'"
   * @generated
   */
  XMLGregorianCalendar getReportDate();

  /**
   * Sets the value of the '{@link com.example.expensebom02.ExpenseReport#getReportDate <em>Report Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report Date</em>' attribute.
   * @see #getReportDate()
   * @generated
   */
  void setReportDate(XMLGregorianCalendar value);

  /**
   * Returns the value of the '<em><b>Currency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Currency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Currency</em>' attribute.
   * @see #setCurrency(Currency)
   * @see com.example.expensebom02.Expensebom02Package#getExpenseReport_Currency()
   * @model dataType="com.example.expensebom02.CurrencyObject"
   *        extendedMetaData="kind='element' name='currency'"
   * @generated
   */
  Currency getCurrency();

  /**
   * Sets the value of the '{@link com.example.expensebom02.ExpenseReport#getCurrency <em>Currency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Currency</em>' attribute.
   * @see #getCurrency()
   * @generated
   */
  void setCurrency(Currency value);

  /**
   * Returns the value of the '<em><b>Expenseitems</b></em>' containment reference list.
   * The list contents are of type {@link com.example.expensebom02.ExpenseItems}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expenseitems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expenseitems</em>' containment reference list.
   * @see com.example.expensebom02.Expensebom02Package#getExpenseReport_Expenseitems()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='expenseitems'"
   * @generated
   */
  EList<ExpenseItems> getExpenseitems();

} // ExpenseReport
