

package com.example.expensebom02.impl;

import com.example.expensebom02.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Expensebom02FactoryImpl extends EFactoryImpl implements Expensebom02Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Expensebom02Factory init()
  {
    try
    {
      Expensebom02Factory theExpensebom02Factory = (Expensebom02Factory)EPackage.Registry.INSTANCE.getEFactory("http://example.com/expensebom02"); 
      if (theExpensebom02Factory != null)
      {
        return theExpensebom02Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Expensebom02FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expensebom02FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Expensebom02Package.DEPARTMENT: return createDepartment();
      case Expensebom02Package.DOCUMENT_ROOT: return createDocumentRoot();
      case Expensebom02Package.EMPLOYEE: return createEmployee();
      case Expensebom02Package.EXPENSE_ITEMS: return createExpenseItems();
      case Expensebom02Package.EXPENSE_REPORT: return createExpenseReport();
      case Expensebom02Package.MANAGER: return createManager();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Expensebom02Package.CURRENCY:
        return createCurrencyFromString(eDataType, initialValue);
      case Expensebom02Package.EXPENSE_CODES:
        return createExpenseCodesFromString(eDataType, initialValue);
      case Expensebom02Package.OFFICE_LOCATIONS:
        return createOfficeLocationsFromString(eDataType, initialValue);
      case Expensebom02Package.CURRENCY_ELEMENT_TYPE:
        return createcurrencyElementTypeFromString(eDataType, initialValue);
      case Expensebom02Package.CURRENCY_OBJECT:
        return createCurrencyObjectFromString(eDataType, initialValue);
      case Expensebom02Package.DEPT_CODE_DEPARTMENT_TYPE:
        return createdeptCode_DepartmentTypeFromString(eDataType, initialValue);
      case Expensebom02Package.DEPT_NAME_DEPARTMENT_TYPE:
        return createdeptName_DepartmentTypeFromString(eDataType, initialValue);
      case Expensebom02Package.DOUBLE_STUDIO_GENERATED_TEMPLATE:
        return createDoubleStudioGeneratedTemplateFromString(eDataType, initialValue);
      case Expensebom02Package.DOUBLE_STUDIO_GENERATED_TEMPLATE_OBJECT:
        return createDoubleStudioGeneratedTemplateObjectFromString(eDataType, initialValue);
      case Expensebom02Package.EMPLOYEE_ID_EMPLOYEE_TYPE:
        return createemployeeId_EmployeeTypeFromString(eDataType, initialValue);
      case Expensebom02Package.EXPENSE_CODES_ELEMENT_TYPE:
        return createexpenseCodesElementTypeFromString(eDataType, initialValue);
      case Expensebom02Package.EXPENSE_CODES_OBJECT:
        return createExpenseCodesObjectFromString(eDataType, initialValue);
      case Expensebom02Package.FIRST_NAME_EMPLOYEE_TYPE:
        return createfirstName_EmployeeTypeFromString(eDataType, initialValue);
      case Expensebom02Package.LAST_NAME_EMPLOYEE_TYPE:
        return createlastName_EmployeeTypeFromString(eDataType, initialValue);
      case Expensebom02Package.MANAGER_ID_DEPARTMENT_TYPE:
        return createmanagerId_DepartmentTypeFromString(eDataType, initialValue);
      case Expensebom02Package.OFFICE_LOCATIONS_ELEMENT_TYPE:
        return createofficeLocationsElementTypeFromString(eDataType, initialValue);
      case Expensebom02Package.OFFICE_LOCATIONS_OBJECT:
        return createOfficeLocationsObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Expensebom02Package.CURRENCY:
        return convertCurrencyToString(eDataType, instanceValue);
      case Expensebom02Package.EXPENSE_CODES:
        return convertExpenseCodesToString(eDataType, instanceValue);
      case Expensebom02Package.OFFICE_LOCATIONS:
        return convertOfficeLocationsToString(eDataType, instanceValue);
      case Expensebom02Package.CURRENCY_ELEMENT_TYPE:
        return convertcurrencyElementTypeToString(eDataType, instanceValue);
      case Expensebom02Package.CURRENCY_OBJECT:
        return convertCurrencyObjectToString(eDataType, instanceValue);
      case Expensebom02Package.DEPT_CODE_DEPARTMENT_TYPE:
        return convertdeptCode_DepartmentTypeToString(eDataType, instanceValue);
      case Expensebom02Package.DEPT_NAME_DEPARTMENT_TYPE:
        return convertdeptName_DepartmentTypeToString(eDataType, instanceValue);
      case Expensebom02Package.DOUBLE_STUDIO_GENERATED_TEMPLATE:
        return convertDoubleStudioGeneratedTemplateToString(eDataType, instanceValue);
      case Expensebom02Package.DOUBLE_STUDIO_GENERATED_TEMPLATE_OBJECT:
        return convertDoubleStudioGeneratedTemplateObjectToString(eDataType, instanceValue);
      case Expensebom02Package.EMPLOYEE_ID_EMPLOYEE_TYPE:
        return convertemployeeId_EmployeeTypeToString(eDataType, instanceValue);
      case Expensebom02Package.EXPENSE_CODES_ELEMENT_TYPE:
        return convertexpenseCodesElementTypeToString(eDataType, instanceValue);
      case Expensebom02Package.EXPENSE_CODES_OBJECT:
        return convertExpenseCodesObjectToString(eDataType, instanceValue);
      case Expensebom02Package.FIRST_NAME_EMPLOYEE_TYPE:
        return convertfirstName_EmployeeTypeToString(eDataType, instanceValue);
      case Expensebom02Package.LAST_NAME_EMPLOYEE_TYPE:
        return convertlastName_EmployeeTypeToString(eDataType, instanceValue);
      case Expensebom02Package.MANAGER_ID_DEPARTMENT_TYPE:
        return convertmanagerId_DepartmentTypeToString(eDataType, instanceValue);
      case Expensebom02Package.OFFICE_LOCATIONS_ELEMENT_TYPE:
        return convertofficeLocationsElementTypeToString(eDataType, instanceValue);
      case Expensebom02Package.OFFICE_LOCATIONS_OBJECT:
        return convertOfficeLocationsObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Department createDepartment()
  {
    DepartmentImpl department = new DepartmentImpl();
    return department;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Employee createEmployee()
  {
    EmployeeImpl employee = new EmployeeImpl();
    return employee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseItems createExpenseItems()
  {
    ExpenseItemsImpl expenseItems = new ExpenseItemsImpl();
    return expenseItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseReport createExpenseReport()
  {
    ExpenseReportImpl expenseReport = new ExpenseReportImpl();
    return expenseReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Manager createManager()
  {
    ManagerImpl manager = new ManagerImpl();
    return manager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Currency createCurrencyFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    Currency result = Currency.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCurrencyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseCodes createExpenseCodesFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    ExpenseCodes result = ExpenseCodes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertExpenseCodesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeLocations createOfficeLocationsFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    OfficeLocations result = OfficeLocations.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOfficeLocationsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Currency createcurrencyElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createCurrencyFromString(Expensebom02Package.Literals.CURRENCY, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcurrencyElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertCurrencyToString(Expensebom02Package.Literals.CURRENCY, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Currency createCurrencyObjectFromString(EDataType eDataType, String initialValue)
  {
    return createCurrencyFromString(Expensebom02Package.Literals.CURRENCY, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCurrencyObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertCurrencyToString(Expensebom02Package.Literals.CURRENCY, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createdeptCode_DepartmentTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertdeptCode_DepartmentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createdeptName_DepartmentTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertdeptName_DepartmentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double createDoubleStudioGeneratedTemplateFromString(EDataType eDataType, String initialValue)
  {
    return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDoubleStudioGeneratedTemplateToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double createDoubleStudioGeneratedTemplateObjectFromString(EDataType eDataType, String initialValue)
  {
    return createDoubleStudioGeneratedTemplateFromString(Expensebom02Package.Literals.DOUBLE_STUDIO_GENERATED_TEMPLATE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDoubleStudioGeneratedTemplateObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertDoubleStudioGeneratedTemplateToString(Expensebom02Package.Literals.DOUBLE_STUDIO_GENERATED_TEMPLATE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createemployeeId_EmployeeTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertemployeeId_EmployeeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseCodes createexpenseCodesElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createExpenseCodesFromString(Expensebom02Package.Literals.EXPENSE_CODES, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertexpenseCodesElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertExpenseCodesToString(Expensebom02Package.Literals.EXPENSE_CODES, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseCodes createExpenseCodesObjectFromString(EDataType eDataType, String initialValue)
  {
    return createExpenseCodesFromString(Expensebom02Package.Literals.EXPENSE_CODES, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertExpenseCodesObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertExpenseCodesToString(Expensebom02Package.Literals.EXPENSE_CODES, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createfirstName_EmployeeTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertfirstName_EmployeeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createlastName_EmployeeTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertlastName_EmployeeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createmanagerId_DepartmentTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertmanagerId_DepartmentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeLocations createofficeLocationsElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createOfficeLocationsFromString(Expensebom02Package.Literals.OFFICE_LOCATIONS, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertofficeLocationsElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertOfficeLocationsToString(Expensebom02Package.Literals.OFFICE_LOCATIONS, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeLocations createOfficeLocationsObjectFromString(EDataType eDataType, String initialValue)
  {
    return createOfficeLocationsFromString(Expensebom02Package.Literals.OFFICE_LOCATIONS, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOfficeLocationsObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertOfficeLocationsToString(Expensebom02Package.Literals.OFFICE_LOCATIONS, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expensebom02Package getExpensebom02Package()
  {
    return (Expensebom02Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Expensebom02Package getPackage()
  {
    return Expensebom02Package.eINSTANCE;
  }

} //Expensebom02FactoryImpl
