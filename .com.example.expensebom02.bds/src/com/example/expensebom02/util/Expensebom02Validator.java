

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.expensebom02.util;

import com.example.expensebom02.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.example.expensebom02.Expensebom02Package
 * @generated
 */
public class Expensebom02Validator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final Expensebom02Validator INSTANCE = new Expensebom02Validator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "com.example.expensebom02";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expensebom02Validator()
  {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return Expensebom02Package.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case Expensebom02Package.DEPARTMENT:
        return validateDepartment((Department)value, diagnostics, context);
      case Expensebom02Package.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case Expensebom02Package.EMPLOYEE:
        return validateEmployee((Employee)value, diagnostics, context);
      case Expensebom02Package.EXPENSE_ITEMS:
        return validateExpenseItems((ExpenseItems)value, diagnostics, context);
      case Expensebom02Package.EXPENSE_REPORT:
        return validateExpenseReport((ExpenseReport)value, diagnostics, context);
      case Expensebom02Package.MANAGER:
        return validateManager((Manager)value, diagnostics, context);
      case Expensebom02Package.CURRENCY:
        return validateCurrency((Currency)value, diagnostics, context);
      case Expensebom02Package.EXPENSE_CODES:
        return validateExpenseCodes((ExpenseCodes)value, diagnostics, context);
      case Expensebom02Package.OFFICE_LOCATIONS:
        return validateOfficeLocations((OfficeLocations)value, diagnostics, context);
      case Expensebom02Package.CURRENCY_ELEMENT_TYPE:
        return validatecurrencyElementType((Currency)value, diagnostics, context);
      case Expensebom02Package.CURRENCY_OBJECT:
        return validateCurrencyObject((Currency)value, diagnostics, context);
      case Expensebom02Package.DEPT_CODE_DEPARTMENT_TYPE:
        return validatedeptCode_DepartmentType((String)value, diagnostics, context);
      case Expensebom02Package.DEPT_NAME_DEPARTMENT_TYPE:
        return validatedeptName_DepartmentType((String)value, diagnostics, context);
      case Expensebom02Package.DOUBLE_STUDIO_GENERATED_TEMPLATE:
        return validateDoubleStudioGeneratedTemplate((Double)value, diagnostics, context);
      case Expensebom02Package.DOUBLE_STUDIO_GENERATED_TEMPLATE_OBJECT:
        return validateDoubleStudioGeneratedTemplateObject((Double)value, diagnostics, context);
      case Expensebom02Package.EMPLOYEE_ID_EMPLOYEE_TYPE:
        return validateemployeeId_EmployeeType((String)value, diagnostics, context);
      case Expensebom02Package.EXPENSE_CODES_ELEMENT_TYPE:
        return validateexpenseCodesElementType((ExpenseCodes)value, diagnostics, context);
      case Expensebom02Package.EXPENSE_CODES_OBJECT:
        return validateExpenseCodesObject((ExpenseCodes)value, diagnostics, context);
      case Expensebom02Package.FIRST_NAME_EMPLOYEE_TYPE:
        return validatefirstName_EmployeeType((String)value, diagnostics, context);
      case Expensebom02Package.LAST_NAME_EMPLOYEE_TYPE:
        return validatelastName_EmployeeType((String)value, diagnostics, context);
      case Expensebom02Package.MANAGER_ID_DEPARTMENT_TYPE:
        return validatemanagerId_DepartmentType((String)value, diagnostics, context);
      case Expensebom02Package.OFFICE_LOCATIONS_ELEMENT_TYPE:
        return validateofficeLocationsElementType((OfficeLocations)value, diagnostics, context);
      case Expensebom02Package.OFFICE_LOCATIONS_OBJECT:
        return validateOfficeLocationsObject((OfficeLocations)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(department, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(employee, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExpenseItems(ExpenseItems expenseItems, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(expenseItems, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExpenseReport(ExpenseReport expenseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(expenseReport, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateManager(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(manager, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExpenseCodes(ExpenseCodes expenseCodes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOfficeLocations(OfficeLocations officeLocations, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecurrencyElementType(Currency currencyElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCurrencyObject(Currency currencyObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedeptCode_DepartmentType(String deptCode_DepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatedeptCode_DepartmentType_MaxLength(deptCode_DepartmentType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>dept Code Department Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedeptCode_DepartmentType_MaxLength(String deptCode_DepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = deptCode_DepartmentType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Expensebom02Package.Literals.DEPT_CODE_DEPARTMENT_TYPE, deptCode_DepartmentType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedeptName_DepartmentType(String deptName_DepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatedeptName_DepartmentType_MaxLength(deptName_DepartmentType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>dept Name Department Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedeptName_DepartmentType_MaxLength(String deptName_DepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = deptName_DepartmentType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Expensebom02Package.Literals.DEPT_NAME_DEPARTMENT_TYPE, deptName_DepartmentType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDoubleStudioGeneratedTemplate(double doubleStudioGeneratedTemplate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateDoubleStudioGeneratedTemplate_Min(doubleStudioGeneratedTemplate, diagnostics, context);
    if (result || diagnostics != null) result &= validateDoubleStudioGeneratedTemplate_Max(doubleStudioGeneratedTemplate, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateDoubleStudioGeneratedTemplate_Min
   */
  public static final double DOUBLE_STUDIO_GENERATED_TEMPLATE__MIN__VALUE = -1.7976931348623157E308;

  /**
   * Validates the Min constraint of '<em>Double Studio Generated Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDoubleStudioGeneratedTemplate_Min(double doubleStudioGeneratedTemplate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = doubleStudioGeneratedTemplate >= DOUBLE_STUDIO_GENERATED_TEMPLATE__MIN__VALUE;
    if (!result && diagnostics != null)
      reportMinViolation(Expensebom02Package.Literals.DOUBLE_STUDIO_GENERATED_TEMPLATE, doubleStudioGeneratedTemplate, DOUBLE_STUDIO_GENERATED_TEMPLATE__MIN__VALUE, true, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateDoubleStudioGeneratedTemplate_Max
   */
  public static final double DOUBLE_STUDIO_GENERATED_TEMPLATE__MAX__VALUE = 1.7976931348623157E308;

  /**
   * Validates the Max constraint of '<em>Double Studio Generated Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDoubleStudioGeneratedTemplate_Max(double doubleStudioGeneratedTemplate, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = doubleStudioGeneratedTemplate <= DOUBLE_STUDIO_GENERATED_TEMPLATE__MAX__VALUE;
    if (!result && diagnostics != null)
      reportMaxViolation(Expensebom02Package.Literals.DOUBLE_STUDIO_GENERATED_TEMPLATE, doubleStudioGeneratedTemplate, DOUBLE_STUDIO_GENERATED_TEMPLATE__MAX__VALUE, true, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDoubleStudioGeneratedTemplateObject(Double doubleStudioGeneratedTemplateObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateDoubleStudioGeneratedTemplate_Min(doubleStudioGeneratedTemplateObject, diagnostics, context);
    if (result || diagnostics != null) result &= validateDoubleStudioGeneratedTemplate_Max(doubleStudioGeneratedTemplateObject, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemployeeId_EmployeeType(String employeeId_EmployeeType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateemployeeId_EmployeeType_MaxLength(employeeId_EmployeeType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>employee Id Employee Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemployeeId_EmployeeType_MaxLength(String employeeId_EmployeeType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = employeeId_EmployeeType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Expensebom02Package.Literals.EMPLOYEE_ID_EMPLOYEE_TYPE, employeeId_EmployeeType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateexpenseCodesElementType(ExpenseCodes expenseCodesElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExpenseCodesObject(ExpenseCodes expenseCodesObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefirstName_EmployeeType(String firstName_EmployeeType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatefirstName_EmployeeType_MaxLength(firstName_EmployeeType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>first Name Employee Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefirstName_EmployeeType_MaxLength(String firstName_EmployeeType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = firstName_EmployeeType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Expensebom02Package.Literals.FIRST_NAME_EMPLOYEE_TYPE, firstName_EmployeeType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatelastName_EmployeeType(String lastName_EmployeeType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatelastName_EmployeeType_MaxLength(lastName_EmployeeType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>last Name Employee Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatelastName_EmployeeType_MaxLength(String lastName_EmployeeType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = lastName_EmployeeType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Expensebom02Package.Literals.LAST_NAME_EMPLOYEE_TYPE, lastName_EmployeeType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemanagerId_DepartmentType(String managerId_DepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatemanagerId_DepartmentType_MaxLength(managerId_DepartmentType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>manager Id Department Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemanagerId_DepartmentType_MaxLength(String managerId_DepartmentType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = managerId_DepartmentType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Expensebom02Package.Literals.MANAGER_ID_DEPARTMENT_TYPE, managerId_DepartmentType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateofficeLocationsElementType(OfficeLocations officeLocationsElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOfficeLocationsObject(OfficeLocations officeLocationsObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //Expensebom02Validator
