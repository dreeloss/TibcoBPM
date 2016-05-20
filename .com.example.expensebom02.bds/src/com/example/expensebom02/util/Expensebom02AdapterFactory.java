/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.expensebom02.util;

import com.example.expensebom02.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.example.expensebom02.Expensebom02Package
 * @generated
 */
public class Expensebom02AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Expensebom02Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expensebom02AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Expensebom02Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Expensebom02Switch<Adapter> modelSwitch =
    new Expensebom02Switch<Adapter>()
    {
      @Override
      public Adapter caseDepartment(Department object)
      {
        return createDepartmentAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseEmployee(Employee object)
      {
        return createEmployeeAdapter();
      }
      @Override
      public Adapter caseExpenseItems(ExpenseItems object)
      {
        return createExpenseItemsAdapter();
      }
      @Override
      public Adapter caseExpenseReport(ExpenseReport object)
      {
        return createExpenseReportAdapter();
      }
      @Override
      public Adapter caseManager(Manager object)
      {
        return createManagerAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.example.expensebom02.Department <em>Department</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.expensebom02.Department
   * @generated
   */
  public Adapter createDepartmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.expensebom02.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.expensebom02.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.expensebom02.Employee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.expensebom02.Employee
   * @generated
   */
  public Adapter createEmployeeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.expensebom02.ExpenseItems <em>Expense Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.expensebom02.ExpenseItems
   * @generated
   */
  public Adapter createExpenseItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.expensebom02.ExpenseReport <em>Expense Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.expensebom02.ExpenseReport
   * @generated
   */
  public Adapter createExpenseReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.example.expensebom02.Manager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.example.expensebom02.Manager
   * @generated
   */
  public Adapter createManagerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Expensebom02AdapterFactory
