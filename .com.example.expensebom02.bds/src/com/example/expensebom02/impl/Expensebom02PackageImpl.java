package com.example.expensebom02.impl;

import com.example.expensebom02.Currency;
import com.example.expensebom02.Department;
import com.example.expensebom02.DocumentRoot;
import com.example.expensebom02.Employee;
import com.example.expensebom02.ExpenseCodes;
import com.example.expensebom02.ExpenseItems;
import com.example.expensebom02.ExpenseReport;
import com.example.expensebom02.Expensebom02Factory;
import com.example.expensebom02.Expensebom02Package;
import com.example.expensebom02.Manager;
import com.example.expensebom02.OfficeLocations;

import com.example.expensebom02.bdsutil.BDSActivator;

import com.example.expensebom02.util.Expensebom02Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Expensebom02PackageImpl extends EPackageImpl implements Expensebom02Package
{

  /** 
    * Exposes bundle version number, or null if not instantiated via OSGi
    * @generated
    */
  public String getBundleVersion()
  {
    String result = BDSActivator.getBundleVersion();
    return result;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass departmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass employeeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expenseItemsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expenseReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass managerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum currencyEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum expenseCodesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum officeLocationsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType currencyElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType currencyObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType deptCode_DepartmentTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType deptName_DepartmentTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType doubleStudioGeneratedTemplateEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType doubleStudioGeneratedTemplateObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType employeeId_EmployeeTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType expenseCodesElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType expenseCodesObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType firstName_EmployeeTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType lastName_EmployeeTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType managerId_DepartmentTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType officeLocationsElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType officeLocationsObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.example.expensebom02.Expensebom02Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Expensebom02PackageImpl()
  {
    super(eNS_URI, Expensebom02Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Expensebom02Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Expensebom02Package init()
  {
    if (isInited) return (Expensebom02Package)EPackage.Registry.INSTANCE.getEPackage(Expensebom02Package.eNS_URI);

    // Obtain or create and register package
    Expensebom02PackageImpl theExpensebom02Package = (Expensebom02PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Expensebom02PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Expensebom02PackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theExpensebom02Package.createPackageContents();

    // Initialize created meta-data
    theExpensebom02Package.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theExpensebom02Package, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return Expensebom02Validator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theExpensebom02Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Expensebom02Package.eNS_URI, theExpensebom02Package);
    return theExpensebom02Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDepartment()
  {
    return departmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDepartment_DeptCode()
  {
    return (EAttribute)departmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDepartment_DeptName()
  {
    return (EAttribute)departmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDepartment_ManagerId()
  {
    return (EAttribute)departmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDepartment_Location()
  {
    return (EAttribute)departmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_CurrencyElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_DepartmentElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_EmployeeElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_ExpenseCodesElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ExpenseItemsElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ExpenseReportElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ManagerElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_OfficeLocationsElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_DepartmentBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_EmployeeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ExpenseItemsBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ExpenseReportBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ManagerBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmployee()
  {
    return employeeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_EmployeeId()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_FirstName()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_LastName()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpenseItems()
  {
    return expenseItemsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpenseItems_Date()
  {
    return (EAttribute)expenseItemsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpenseItems_ExpenseCode()
  {
    return (EAttribute)expenseItemsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpenseItems_Amount()
  {
    return (EAttribute)expenseItemsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpenseReport()
  {
    return expenseReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpenseReport_ReportDate()
  {
    return (EAttribute)expenseReportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpenseReport_Currency()
  {
    return (EAttribute)expenseReportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpenseReport_Expenseitems()
  {
    return (EReference)expenseReportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManager()
  {
    return managerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManager_ApprovalLimit()
  {
    return (EAttribute)managerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCurrency()
  {
    return currencyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getExpenseCodes()
  {
    return expenseCodesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOfficeLocations()
  {
    return officeLocationsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcurrencyElementType()
  {
    return currencyElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCurrencyObject()
  {
    return currencyObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getdeptCode_DepartmentType()
  {
    return deptCode_DepartmentTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getdeptName_DepartmentType()
  {
    return deptName_DepartmentTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDoubleStudioGeneratedTemplate()
  {
    return doubleStudioGeneratedTemplateEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDoubleStudioGeneratedTemplateObject()
  {
    return doubleStudioGeneratedTemplateObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getemployeeId_EmployeeType()
  {
    return employeeId_EmployeeTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getexpenseCodesElementType()
  {
    return expenseCodesElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getExpenseCodesObject()
  {
    return expenseCodesObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getfirstName_EmployeeType()
  {
    return firstName_EmployeeTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getlastName_EmployeeType()
  {
    return lastName_EmployeeTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getmanagerId_DepartmentType()
  {
    return managerId_DepartmentTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getofficeLocationsElementType()
  {
    return officeLocationsElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOfficeLocationsObject()
  {
    return officeLocationsObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expensebom02Factory getExpensebom02Factory()
  {
    return (Expensebom02Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    departmentEClass = createEClass(DEPARTMENT);
    createEAttribute(departmentEClass, DEPARTMENT__DEPT_CODE);
    createEAttribute(departmentEClass, DEPARTMENT__DEPT_NAME);
    createEAttribute(departmentEClass, DEPARTMENT__MANAGER_ID);
    createEAttribute(departmentEClass, DEPARTMENT__LOCATION);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__CURRENCY_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DEPARTMENT_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EMPLOYEE_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MANAGER_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    employeeEClass = createEClass(EMPLOYEE);
    createEAttribute(employeeEClass, EMPLOYEE__EMPLOYEE_ID);
    createEAttribute(employeeEClass, EMPLOYEE__FIRST_NAME);
    createEAttribute(employeeEClass, EMPLOYEE__LAST_NAME);

    expenseItemsEClass = createEClass(EXPENSE_ITEMS);
    createEAttribute(expenseItemsEClass, EXPENSE_ITEMS__DATE);
    createEAttribute(expenseItemsEClass, EXPENSE_ITEMS__EXPENSE_CODE);
    createEAttribute(expenseItemsEClass, EXPENSE_ITEMS__AMOUNT);

    expenseReportEClass = createEClass(EXPENSE_REPORT);
    createEAttribute(expenseReportEClass, EXPENSE_REPORT__REPORT_DATE);
    createEAttribute(expenseReportEClass, EXPENSE_REPORT__CURRENCY);
    createEReference(expenseReportEClass, EXPENSE_REPORT__EXPENSEITEMS);

    managerEClass = createEClass(MANAGER);
    createEAttribute(managerEClass, MANAGER__APPROVAL_LIMIT);

    // Create enums
    currencyEEnum = createEEnum(CURRENCY);
    expenseCodesEEnum = createEEnum(EXPENSE_CODES);
    officeLocationsEEnum = createEEnum(OFFICE_LOCATIONS);

    // Create data types
    currencyElementTypeEDataType = createEDataType(CURRENCY_ELEMENT_TYPE);
    currencyObjectEDataType = createEDataType(CURRENCY_OBJECT);
    deptCode_DepartmentTypeEDataType = createEDataType(DEPT_CODE_DEPARTMENT_TYPE);
    deptName_DepartmentTypeEDataType = createEDataType(DEPT_NAME_DEPARTMENT_TYPE);
    doubleStudioGeneratedTemplateEDataType = createEDataType(DOUBLE_STUDIO_GENERATED_TEMPLATE);
    doubleStudioGeneratedTemplateObjectEDataType = createEDataType(DOUBLE_STUDIO_GENERATED_TEMPLATE_OBJECT);
    employeeId_EmployeeTypeEDataType = createEDataType(EMPLOYEE_ID_EMPLOYEE_TYPE);
    expenseCodesElementTypeEDataType = createEDataType(EXPENSE_CODES_ELEMENT_TYPE);
    expenseCodesObjectEDataType = createEDataType(EXPENSE_CODES_OBJECT);
    firstName_EmployeeTypeEDataType = createEDataType(FIRST_NAME_EMPLOYEE_TYPE);
    lastName_EmployeeTypeEDataType = createEDataType(LAST_NAME_EMPLOYEE_TYPE);
    managerId_DepartmentTypeEDataType = createEDataType(MANAGER_ID_DEPARTMENT_TYPE);
    officeLocationsElementTypeEDataType = createEDataType(OFFICE_LOCATIONS_ELEMENT_TYPE);
    officeLocationsObjectEDataType = createEDataType(OFFICE_LOCATIONS_OBJECT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    managerEClass.getESuperTypes().add(this.getEmployee());

    // Initialize classes and features; add operations and parameters
    initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDepartment_DeptCode(), this.getdeptCode_DepartmentType(), "deptCode", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDepartment_DeptName(), this.getdeptName_DepartmentType(), "deptName", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDepartment_ManagerId(), this.getmanagerId_DepartmentType(), "managerId", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDepartment_Location(), this.getOfficeLocationsObject(), "location", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_CurrencyElement(), this.getcurrencyElementType(), "currencyElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DepartmentElement(), this.getDepartment(), null, "departmentElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_EmployeeElement(), this.getEmployee(), null, "employeeElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_ExpenseCodesElement(), this.getexpenseCodesElementType(), "expenseCodesElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ExpenseItemsElement(), this.getExpenseItems(), null, "expenseItemsElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ExpenseReportElement(), this.getExpenseReport(), null, "expenseReportElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ManagerElement(), this.getManager(), null, "managerElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_OfficeLocationsElement(), this.getofficeLocationsElementType(), "officeLocationsElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DepartmentBDSInternalSerializationElement(), this.getDepartment(), null, "departmentBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_EmployeeBDSInternalSerializationElement(), this.getEmployee(), null, "employeeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ExpenseItemsBDSInternalSerializationElement(), this.getExpenseItems(), null, "expenseItemsBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ExpenseReportBDSInternalSerializationElement(), this.getExpenseReport(), null, "expenseReportBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ManagerBDSInternalSerializationElement(), this.getManager(), null, "managerBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmployee_EmployeeId(), this.getemployeeId_EmployeeType(), "employeeId", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmployee_FirstName(), this.getfirstName_EmployeeType(), "firstName", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmployee_LastName(), this.getlastName_EmployeeType(), "lastName", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expenseItemsEClass, ExpenseItems.class, "ExpenseItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpenseItems_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, ExpenseItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpenseItems_ExpenseCode(), this.getExpenseCodesObject(), "expenseCode", null, 0, 1, ExpenseItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpenseItems_Amount(), this.getDoubleStudioGeneratedTemplateObject(), "amount", null, 0, 1, ExpenseItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expenseReportEClass, ExpenseReport.class, "ExpenseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpenseReport_ReportDate(), theXMLTypePackage.getDate(), "reportDate", null, 0, 1, ExpenseReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpenseReport_Currency(), this.getCurrencyObject(), "currency", null, 0, 1, ExpenseReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpenseReport_Expenseitems(), this.getExpenseItems(), null, "expenseitems", null, 1, -1, ExpenseReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManager_ApprovalLimit(), theXMLTypePackage.getIntObject(), "approvalLimit", null, 0, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(currencyEEnum, Currency.class, "Currency");
    addEEnumLiteral(currencyEEnum, Currency.USD);
    addEEnumLiteral(currencyEEnum, Currency.GBP);
    addEEnumLiteral(currencyEEnum, Currency.AUD);
    addEEnumLiteral(currencyEEnum, Currency.EUR);

    initEEnum(expenseCodesEEnum, ExpenseCodes.class, "ExpenseCodes");
    addEEnumLiteral(expenseCodesEEnum, ExpenseCodes.ENT01);
    addEEnumLiteral(expenseCodesEEnum, ExpenseCodes.ACC02);
    addEEnumLiteral(expenseCodesEEnum, ExpenseCodes.MEA03);
    addEEnumLiteral(expenseCodesEEnum, ExpenseCodes.TAX04);
    addEEnumLiteral(expenseCodesEEnum, ExpenseCodes.FLI05);
    addEEnumLiteral(expenseCodesEEnum, ExpenseCodes.MIS06);

    initEEnum(officeLocationsEEnum, OfficeLocations.class, "OfficeLocations");
    addEEnumLiteral(officeLocationsEEnum, OfficeLocations.PALOALTO);
    addEEnumLiteral(officeLocationsEEnum, OfficeLocations.SWINDON);
    addEEnumLiteral(officeLocationsEEnum, OfficeLocations.SYDNEY);
    addEEnumLiteral(officeLocationsEEnum, OfficeLocations.PARIS);

    // Initialize data types
    initEDataType(currencyElementTypeEDataType, Currency.class, "currencyElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(currencyObjectEDataType, Currency.class, "CurrencyObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(deptCode_DepartmentTypeEDataType, String.class, "deptCode_DepartmentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(deptName_DepartmentTypeEDataType, String.class, "deptName_DepartmentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(doubleStudioGeneratedTemplateEDataType, double.class, "DoubleStudioGeneratedTemplate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(doubleStudioGeneratedTemplateObjectEDataType, Double.class, "DoubleStudioGeneratedTemplateObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(employeeId_EmployeeTypeEDataType, String.class, "employeeId_EmployeeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(expenseCodesElementTypeEDataType, ExpenseCodes.class, "expenseCodesElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(expenseCodesObjectEDataType, ExpenseCodes.class, "ExpenseCodesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(firstName_EmployeeTypeEDataType, String.class, "firstName_EmployeeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(lastName_EmployeeTypeEDataType, String.class, "lastName_EmployeeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(managerId_DepartmentTypeEDataType, String.class, "managerId_DepartmentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(officeLocationsElementTypeEDataType, OfficeLocations.class, "officeLocationsElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(officeLocationsObjectEDataType, OfficeLocations.class, "OfficeLocationsObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // bds
    createBdsAnnotations();
    // teneo.jpa
    createTeneoAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>bds</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createBdsAnnotations()
  {
    String source = "bds";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "BomFileName", "L/ExpenseBOM02/Business Objects/ExpenseBOM02.bom",
       "majorVersion", "1",
       "ecoreFormat", "1",
       "label", "com.example.expensebom02"
       });							
    addAnnotation
      (departmentEClass, 
       source, 
       new String[] 
       {
       "label", "Department"
       });																													
    addAnnotation
      (employeeEClass, 
       source, 
       new String[] 
       {
       "label", "Employee"
       });											
    addAnnotation
      (expenseItemsEClass, 
       source, 
       new String[] 
       {
       "label", "Expense Items"
       });							
    addAnnotation
      (expenseReportEClass, 
       source, 
       new String[] 
       {
       "label", "Expense Report"
       });									
    addAnnotation
      (managerEClass, 
       source, 
       new String[] 
       {
       "label", "Manager"
       });						
  }

  /**
   * Initializes the annotations for <b>teneo.jpa</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createTeneoAnnotations()
  {
    String source = "teneo.jpa";				
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "value", "@GenericGenerator(name=\"bdsIdGenerator\", strategy=\"native\")"
       });							
    addAnnotation
      (departmentEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });																													
    addAnnotation
      (employeeEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });											
    addAnnotation
      (expenseItemsEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });							
    addAnnotation
      (expenseReportEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });									
    addAnnotation
      (managerEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });					
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";					
    addAnnotation
      (currencyEEnum, 
       source, 
       new String[] 
       {
       "name", "Currency"
       });		
    addAnnotation
      (currencyElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "currencyElement_._type",
       "baseType", "Currency"
       });		
    addAnnotation
      (currencyObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "Currency:Object",
       "baseType", "Currency"
       });		
    addAnnotation
      (departmentEClass, 
       source, 
       new String[] 
       {
       "name", "Department",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getDepartment_DeptCode(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "deptCode"
       });		
    addAnnotation
      (getDepartment_DeptName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "deptName"
       });		
    addAnnotation
      (getDepartment_ManagerId(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "managerId"
       });		
    addAnnotation
      (getDepartment_Location(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "location"
       });		
    addAnnotation
      (deptCode_DepartmentTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "deptCode_Department_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (deptName_DepartmentTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "deptName_Department_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });		
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });		
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });		
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });		
    addAnnotation
      (getDocumentRoot_CurrencyElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CurrencyElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_DepartmentElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DepartmentElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_EmployeeElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EmployeeElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ExpenseCodesElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ExpenseCodesElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ExpenseItemsElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ExpenseItemsElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ExpenseReportElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ExpenseReportElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ManagerElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ManagerElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_OfficeLocationsElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "OfficeLocationsElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_DepartmentBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Department",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_EmployeeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Employee",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ExpenseItemsBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ExpenseItems",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ExpenseReportBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ExpenseReport",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ManagerBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Manager",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (doubleStudioGeneratedTemplateEDataType, 
       source, 
       new String[] 
       {
       "name", "double_StudioGeneratedTemplate",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
       "minInclusive", "-179.76931348623157E+306",
       "maxInclusive", "179.76931348623157E+306"
       });		
    addAnnotation
      (doubleStudioGeneratedTemplateObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "double_StudioGeneratedTemplate:Object",
       "baseType", "double_StudioGeneratedTemplate"
       });		
    addAnnotation
      (employeeEClass, 
       source, 
       new String[] 
       {
       "name", "Employee",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getEmployee_EmployeeId(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "employeeId"
       });		
    addAnnotation
      (getEmployee_FirstName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "firstName"
       });		
    addAnnotation
      (getEmployee_LastName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "lastName"
       });		
    addAnnotation
      (employeeId_EmployeeTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "employeeId_Employee_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (expenseCodesEEnum, 
       source, 
       new String[] 
       {
       "name", "ExpenseCodes"
       });		
    addAnnotation
      (expenseCodesElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "expenseCodesElement_._type",
       "baseType", "ExpenseCodes"
       });		
    addAnnotation
      (expenseCodesObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ExpenseCodes:Object",
       "baseType", "ExpenseCodes"
       });		
    addAnnotation
      (expenseItemsEClass, 
       source, 
       new String[] 
       {
       "name", "ExpenseItems",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getExpenseItems_Date(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "date"
       });		
    addAnnotation
      (getExpenseItems_ExpenseCode(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "expenseCode"
       });		
    addAnnotation
      (getExpenseItems_Amount(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "amount"
       });		
    addAnnotation
      (expenseReportEClass, 
       source, 
       new String[] 
       {
       "name", "ExpenseReport",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getExpenseReport_ReportDate(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "reportDate"
       });		
    addAnnotation
      (getExpenseReport_Currency(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "currency"
       });		
    addAnnotation
      (getExpenseReport_Expenseitems(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "expenseitems"
       });		
    addAnnotation
      (firstName_EmployeeTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "firstName_Employee_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (lastName_EmployeeTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "lastName_Employee_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (managerEClass, 
       source, 
       new String[] 
       {
       "name", "Manager",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getManager_ApprovalLimit(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "approvalLimit"
       });		
    addAnnotation
      (managerId_DepartmentTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "managerId_Department_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (officeLocationsEEnum, 
       source, 
       new String[] 
       {
       "name", "OfficeLocations"
       });		
    addAnnotation
      (officeLocationsElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "officeLocationsElement_._type",
       "baseType", "OfficeLocations"
       });		
    addAnnotation
      (officeLocationsObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "OfficeLocations:Object",
       "baseType", "OfficeLocations"
       });
  }

} //Expensebom02PackageImpl
