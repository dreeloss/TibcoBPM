

package com.example.expensebom02;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.expensebom02.Expensebom02Package
 * @generated
 */
public interface Expensebom02Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Expensebom02Factory eINSTANCE = com.example.expensebom02.impl.Expensebom02FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Department</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Department</em>'.
   * @generated
   */
  Department createDepartment();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Employee</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Employee</em>'.
   * @generated
   */
  Employee createEmployee();

  /**
   * Returns a new object of class '<em>Expense Items</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expense Items</em>'.
   * @generated
   */
  ExpenseItems createExpenseItems();

  /**
   * Returns a new object of class '<em>Expense Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expense Report</em>'.
   * @generated
   */
  ExpenseReport createExpenseReport();

  /**
   * Returns a new object of class '<em>Manager</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manager</em>'.
   * @generated
   */
  Manager createManager();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Expensebom02Package getExpensebom02Package();

} //Expensebom02Factory
