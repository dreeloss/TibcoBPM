
package com.example.expensebom02;

import com.example.expensebom02.bdsutil.BDSValidationUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BOMORIGIN::/ExpenseBOM02/Business Objects/ExpenseBOM02.bom
 * <!-- end-model-doc -->
 * @see com.example.expensebom02.Expensebom02Factory
 * @model kind="package"
 *        annotation="bds BomFileName='L/ExpenseBOM02/Business Objects/ExpenseBOM02.bom' majorVersion='1' ecoreFormat='1' label='com.example.expensebom02'"
 *        annotation="teneo.jpa value='@GenericGenerator(name=\"bdsIdGenerator\", strategy=\"native\")'"
 * @generated
 */
public interface Expensebom02Package extends EPackage
{
  /**
  * Static Member variable that points to the BDS Validation Class
  * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
  * @generated
  */
  BDSValidationUtils bdsValidationUtils = BDSValidationUtils.init();

  /** 
    * Exposes bundle version number, or null if not instantiated via OSGi
    * @generated
    */
  public String getBundleVersion();
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "expensebom02";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://example.com/expensebom02";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "expensebom02";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Expensebom02Package eINSTANCE = com.example.expensebom02.impl.Expensebom02PackageImpl.init();

  /**
   * The meta object id for the '{@link com.example.expensebom02.impl.DepartmentImpl <em>Department</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.impl.DepartmentImpl
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDepartment()
   * @generated
   */
  int DEPARTMENT = 0;

  /**
   * The feature id for the '<em><b>Dept Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__DEPT_CODE = 0;

  /**
   * The feature id for the '<em><b>Dept Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__DEPT_NAME = 1;

  /**
   * The feature id for the '<em><b>Manager Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__MANAGER_ID = 2;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT__LOCATION = 3;

  /**
   * The number of structural features of the '<em>Department</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.example.expensebom02.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.impl.DocumentRootImpl
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 1;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Currency Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CURRENCY_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Department Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DEPARTMENT_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Employee Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EMPLOYEE_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Expense Codes Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Expense Items Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Expense Report Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Manager Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MANAGER_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Office Locations Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Department BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT = 11;

  /**
   * The feature id for the '<em><b>Employee BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Expense Items BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Expense Report BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Manager BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT = 15;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link com.example.expensebom02.impl.EmployeeImpl <em>Employee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.impl.EmployeeImpl
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getEmployee()
   * @generated
   */
  int EMPLOYEE = 2;

  /**
   * The feature id for the '<em><b>Employee Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__EMPLOYEE_ID = 0;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__FIRST_NAME = 1;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__LAST_NAME = 2;

  /**
   * The number of structural features of the '<em>Employee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.example.expensebom02.impl.ExpenseItemsImpl <em>Expense Items</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.impl.ExpenseItemsImpl
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseItems()
   * @generated
   */
  int EXPENSE_ITEMS = 3;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_ITEMS__DATE = 0;

  /**
   * The feature id for the '<em><b>Expense Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_ITEMS__EXPENSE_CODE = 1;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_ITEMS__AMOUNT = 2;

  /**
   * The number of structural features of the '<em>Expense Items</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_ITEMS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.example.expensebom02.impl.ExpenseReportImpl <em>Expense Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.impl.ExpenseReportImpl
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseReport()
   * @generated
   */
  int EXPENSE_REPORT = 4;

  /**
   * The feature id for the '<em><b>Report Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_REPORT__REPORT_DATE = 0;

  /**
   * The feature id for the '<em><b>Currency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_REPORT__CURRENCY = 1;

  /**
   * The feature id for the '<em><b>Expenseitems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_REPORT__EXPENSEITEMS = 2;

  /**
   * The number of structural features of the '<em>Expense Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_REPORT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.example.expensebom02.impl.ManagerImpl <em>Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.impl.ManagerImpl
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getManager()
   * @generated
   */
  int MANAGER = 5;

  /**
   * The feature id for the '<em><b>Employee Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__EMPLOYEE_ID = EMPLOYEE__EMPLOYEE_ID;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__FIRST_NAME = EMPLOYEE__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__LAST_NAME = EMPLOYEE__LAST_NAME;

  /**
   * The feature id for the '<em><b>Approval Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__APPROVAL_LIMIT = EMPLOYEE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.example.expensebom02.Currency <em>Currency</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.Currency
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getCurrency()
   * @generated
   */
  int CURRENCY = 6;

  /**
   * The meta object id for the '{@link com.example.expensebom02.ExpenseCodes <em>Expense Codes</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.ExpenseCodes
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseCodes()
   * @generated
   */
  int EXPENSE_CODES = 7;

  /**
   * The meta object id for the '{@link com.example.expensebom02.OfficeLocations <em>Office Locations</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.OfficeLocations
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getOfficeLocations()
   * @generated
   */
  int OFFICE_LOCATIONS = 8;

  /**
   * The meta object id for the '<em>currency Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.Currency
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getcurrencyElementType()
   * @generated
   */
  int CURRENCY_ELEMENT_TYPE = 9;

  /**
   * The meta object id for the '<em>Currency Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.Currency
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getCurrencyObject()
   * @generated
   */
  int CURRENCY_OBJECT = 10;

  /**
   * The meta object id for the '<em>dept Code Department Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getdeptCode_DepartmentType()
   * @generated
   */
  int DEPT_CODE_DEPARTMENT_TYPE = 11;

  /**
   * The meta object id for the '<em>dept Name Department Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getdeptName_DepartmentType()
   * @generated
   */
  int DEPT_NAME_DEPARTMENT_TYPE = 12;

  /**
   * The meta object id for the '<em>Double Studio Generated Template</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDoubleStudioGeneratedTemplate()
   * @generated
   */
  int DOUBLE_STUDIO_GENERATED_TEMPLATE = 13;

  /**
   * The meta object id for the '<em>Double Studio Generated Template Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Double
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDoubleStudioGeneratedTemplateObject()
   * @generated
   */
  int DOUBLE_STUDIO_GENERATED_TEMPLATE_OBJECT = 14;

  /**
   * The meta object id for the '<em>employee Id Employee Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getemployeeId_EmployeeType()
   * @generated
   */
  int EMPLOYEE_ID_EMPLOYEE_TYPE = 15;

  /**
   * The meta object id for the '<em>expense Codes Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.ExpenseCodes
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getexpenseCodesElementType()
   * @generated
   */
  int EXPENSE_CODES_ELEMENT_TYPE = 16;

  /**
   * The meta object id for the '<em>Expense Codes Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.ExpenseCodes
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseCodesObject()
   * @generated
   */
  int EXPENSE_CODES_OBJECT = 17;

  /**
   * The meta object id for the '<em>first Name Employee Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getfirstName_EmployeeType()
   * @generated
   */
  int FIRST_NAME_EMPLOYEE_TYPE = 18;

  /**
   * The meta object id for the '<em>last Name Employee Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getlastName_EmployeeType()
   * @generated
   */
  int LAST_NAME_EMPLOYEE_TYPE = 19;

  /**
   * The meta object id for the '<em>manager Id Department Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getmanagerId_DepartmentType()
   * @generated
   */
  int MANAGER_ID_DEPARTMENT_TYPE = 20;

  /**
   * The meta object id for the '<em>office Locations Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.OfficeLocations
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getofficeLocationsElementType()
   * @generated
   */
  int OFFICE_LOCATIONS_ELEMENT_TYPE = 21;

  /**
   * The meta object id for the '<em>Office Locations Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.expensebom02.OfficeLocations
   * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getOfficeLocationsObject()
   * @generated
   */
  int OFFICE_LOCATIONS_OBJECT = 22;


  /**
   * Returns the meta object for class '{@link com.example.expensebom02.Department <em>Department</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Department</em>'.
   * @see com.example.expensebom02.Department
   * @generated
   */
  EClass getDepartment();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Department#getDeptCode <em>Dept Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dept Code</em>'.
   * @see com.example.expensebom02.Department#getDeptCode()
   * @see #getDepartment()
   * @generated
   */
  EAttribute getDepartment_DeptCode();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Department#getDeptName <em>Dept Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dept Name</em>'.
   * @see com.example.expensebom02.Department#getDeptName()
   * @see #getDepartment()
   * @generated
   */
  EAttribute getDepartment_DeptName();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Department#getManagerId <em>Manager Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manager Id</em>'.
   * @see com.example.expensebom02.Department#getManagerId()
   * @see #getDepartment()
   * @generated
   */
  EAttribute getDepartment_ManagerId();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Department#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see com.example.expensebom02.Department#getLocation()
   * @see #getDepartment()
   * @generated
   */
  EAttribute getDepartment_Location();

  /**
   * Returns the meta object for class '{@link com.example.expensebom02.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.example.expensebom02.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.example.expensebom02.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.example.expensebom02.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.example.expensebom02.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.example.expensebom02.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.example.expensebom02.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.example.expensebom02.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.DocumentRoot#getCurrencyElement <em>Currency Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Currency Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getCurrencyElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_CurrencyElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getDepartmentElement <em>Department Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Department Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getDepartmentElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DepartmentElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getEmployeeElement <em>Employee Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Employee Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getEmployeeElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EmployeeElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.DocumentRoot#getExpenseCodesElement <em>Expense Codes Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expense Codes Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getExpenseCodesElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_ExpenseCodesElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getExpenseItemsElement <em>Expense Items Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expense Items Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getExpenseItemsElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ExpenseItemsElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getExpenseReportElement <em>Expense Report Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expense Report Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getExpenseReportElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ExpenseReportElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getManagerElement <em>Manager Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Manager Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getManagerElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ManagerElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.DocumentRoot#getOfficeLocationsElement <em>Office Locations Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Office Locations Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getOfficeLocationsElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_OfficeLocationsElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getDepartmentBDSInternalSerializationElement <em>Department BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Department BDS Internal Serialization Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getDepartmentBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DepartmentBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getEmployeeBDSInternalSerializationElement <em>Employee BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Employee BDS Internal Serialization Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getEmployeeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EmployeeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getExpenseItemsBDSInternalSerializationElement <em>Expense Items BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expense Items BDS Internal Serialization Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getExpenseItemsBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ExpenseItemsBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getExpenseReportBDSInternalSerializationElement <em>Expense Report BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expense Report BDS Internal Serialization Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getExpenseReportBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ExpenseReportBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.expensebom02.DocumentRoot#getManagerBDSInternalSerializationElement <em>Manager BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Manager BDS Internal Serialization Element</em>'.
   * @see com.example.expensebom02.DocumentRoot#getManagerBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ManagerBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.example.expensebom02.Employee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Employee</em>'.
   * @see com.example.expensebom02.Employee
   * @generated
   */
  EClass getEmployee();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Employee#getEmployeeId <em>Employee Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Employee Id</em>'.
   * @see com.example.expensebom02.Employee#getEmployeeId()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_EmployeeId();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Employee#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see com.example.expensebom02.Employee#getFirstName()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_FirstName();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Employee#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see com.example.expensebom02.Employee#getLastName()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_LastName();

  /**
   * Returns the meta object for class '{@link com.example.expensebom02.ExpenseItems <em>Expense Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expense Items</em>'.
   * @see com.example.expensebom02.ExpenseItems
   * @generated
   */
  EClass getExpenseItems();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.ExpenseItems#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see com.example.expensebom02.ExpenseItems#getDate()
   * @see #getExpenseItems()
   * @generated
   */
  EAttribute getExpenseItems_Date();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.ExpenseItems#getExpenseCode <em>Expense Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expense Code</em>'.
   * @see com.example.expensebom02.ExpenseItems#getExpenseCode()
   * @see #getExpenseItems()
   * @generated
   */
  EAttribute getExpenseItems_ExpenseCode();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.ExpenseItems#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see com.example.expensebom02.ExpenseItems#getAmount()
   * @see #getExpenseItems()
   * @generated
   */
  EAttribute getExpenseItems_Amount();

  /**
   * Returns the meta object for class '{@link com.example.expensebom02.ExpenseReport <em>Expense Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expense Report</em>'.
   * @see com.example.expensebom02.ExpenseReport
   * @generated
   */
  EClass getExpenseReport();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.ExpenseReport#getReportDate <em>Report Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Report Date</em>'.
   * @see com.example.expensebom02.ExpenseReport#getReportDate()
   * @see #getExpenseReport()
   * @generated
   */
  EAttribute getExpenseReport_ReportDate();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.ExpenseReport#getCurrency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Currency</em>'.
   * @see com.example.expensebom02.ExpenseReport#getCurrency()
   * @see #getExpenseReport()
   * @generated
   */
  EAttribute getExpenseReport_Currency();

  /**
   * Returns the meta object for the containment reference list '{@link com.example.expensebom02.ExpenseReport#getExpenseitems <em>Expenseitems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expenseitems</em>'.
   * @see com.example.expensebom02.ExpenseReport#getExpenseitems()
   * @see #getExpenseReport()
   * @generated
   */
  EReference getExpenseReport_Expenseitems();

  /**
   * Returns the meta object for class '{@link com.example.expensebom02.Manager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manager</em>'.
   * @see com.example.expensebom02.Manager
   * @generated
   */
  EClass getManager();

  /**
   * Returns the meta object for the attribute '{@link com.example.expensebom02.Manager#getApprovalLimit <em>Approval Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Approval Limit</em>'.
   * @see com.example.expensebom02.Manager#getApprovalLimit()
   * @see #getManager()
   * @generated
   */
  EAttribute getManager_ApprovalLimit();

  /**
   * Returns the meta object for enum '{@link com.example.expensebom02.Currency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Currency</em>'.
   * @see com.example.expensebom02.Currency
   * @generated
   */
  EEnum getCurrency();

  /**
   * Returns the meta object for enum '{@link com.example.expensebom02.ExpenseCodes <em>Expense Codes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Expense Codes</em>'.
   * @see com.example.expensebom02.ExpenseCodes
   * @generated
   */
  EEnum getExpenseCodes();

  /**
   * Returns the meta object for enum '{@link com.example.expensebom02.OfficeLocations <em>Office Locations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Office Locations</em>'.
   * @see com.example.expensebom02.OfficeLocations
   * @generated
   */
  EEnum getOfficeLocations();

  /**
   * Returns the meta object for data type '{@link com.example.expensebom02.Currency <em>currency Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>currency Element Type</em>'.
   * @see com.example.expensebom02.Currency
   * @model instanceClass="com.example.expensebom02.Currency"
   *        extendedMetaData="name='currencyElement_._type' baseType='Currency'"
   * @generated
   */
  EDataType getcurrencyElementType();

  /**
   * Returns the meta object for data type '{@link com.example.expensebom02.Currency <em>Currency Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Currency Object</em>'.
   * @see com.example.expensebom02.Currency
   * @model instanceClass="com.example.expensebom02.Currency"
   *        extendedMetaData="name='Currency:Object' baseType='Currency'"
   * @generated
   */
  EDataType getCurrencyObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>dept Code Department Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>dept Code Department Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='deptCode_Department_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getdeptCode_DepartmentType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>dept Name Department Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>dept Name Department Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='deptName_Department_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getdeptName_DepartmentType();

  /**
   * Returns the meta object for data type '<em>Double Studio Generated Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Double Studio Generated Template</em>'.
   * @model instanceClass="double"
   *        extendedMetaData="name='double_StudioGeneratedTemplate' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-179.76931348623157E+306' maxInclusive='179.76931348623157E+306'"
   * @generated
   */
  EDataType getDoubleStudioGeneratedTemplate();

  /**
   * Returns the meta object for data type '{@link java.lang.Double <em>Double Studio Generated Template Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Double Studio Generated Template Object</em>'.
   * @see java.lang.Double
   * @model instanceClass="java.lang.Double"
   *        extendedMetaData="name='double_StudioGeneratedTemplate:Object' baseType='double_StudioGeneratedTemplate'"
   * @generated
   */
  EDataType getDoubleStudioGeneratedTemplateObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>employee Id Employee Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>employee Id Employee Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='employeeId_Employee_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getemployeeId_EmployeeType();

  /**
   * Returns the meta object for data type '{@link com.example.expensebom02.ExpenseCodes <em>expense Codes Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>expense Codes Element Type</em>'.
   * @see com.example.expensebom02.ExpenseCodes
   * @model instanceClass="com.example.expensebom02.ExpenseCodes"
   *        extendedMetaData="name='expenseCodesElement_._type' baseType='ExpenseCodes'"
   * @generated
   */
  EDataType getexpenseCodesElementType();

  /**
   * Returns the meta object for data type '{@link com.example.expensebom02.ExpenseCodes <em>Expense Codes Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Expense Codes Object</em>'.
   * @see com.example.expensebom02.ExpenseCodes
   * @model instanceClass="com.example.expensebom02.ExpenseCodes"
   *        extendedMetaData="name='ExpenseCodes:Object' baseType='ExpenseCodes'"
   * @generated
   */
  EDataType getExpenseCodesObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>first Name Employee Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>first Name Employee Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='firstName_Employee_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getfirstName_EmployeeType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>last Name Employee Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>last Name Employee Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='lastName_Employee_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getlastName_EmployeeType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>manager Id Department Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>manager Id Department Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='managerId_Department_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getmanagerId_DepartmentType();

  /**
   * Returns the meta object for data type '{@link com.example.expensebom02.OfficeLocations <em>office Locations Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>office Locations Element Type</em>'.
   * @see com.example.expensebom02.OfficeLocations
   * @model instanceClass="com.example.expensebom02.OfficeLocations"
   *        extendedMetaData="name='officeLocationsElement_._type' baseType='OfficeLocations'"
   * @generated
   */
  EDataType getofficeLocationsElementType();

  /**
   * Returns the meta object for data type '{@link com.example.expensebom02.OfficeLocations <em>Office Locations Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Office Locations Object</em>'.
   * @see com.example.expensebom02.OfficeLocations
   * @model instanceClass="com.example.expensebom02.OfficeLocations"
   *        extendedMetaData="name='OfficeLocations:Object' baseType='OfficeLocations'"
   * @generated
   */
  EDataType getOfficeLocationsObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Expensebom02Factory getExpensebom02Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.example.expensebom02.impl.DepartmentImpl <em>Department</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.impl.DepartmentImpl
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDepartment()
     * @generated
     */
    EClass DEPARTMENT = eINSTANCE.getDepartment();

    /**
     * The meta object literal for the '<em><b>Dept Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPARTMENT__DEPT_CODE = eINSTANCE.getDepartment_DeptCode();

    /**
     * The meta object literal for the '<em><b>Dept Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPARTMENT__DEPT_NAME = eINSTANCE.getDepartment_DeptName();

    /**
     * The meta object literal for the '<em><b>Manager Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPARTMENT__MANAGER_ID = eINSTANCE.getDepartment_ManagerId();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPARTMENT__LOCATION = eINSTANCE.getDepartment_Location();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.impl.DocumentRootImpl
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDocumentRoot()
     * @generated
     */
    EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Currency Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__CURRENCY_ELEMENT = eINSTANCE.getDocumentRoot_CurrencyElement();

    /**
     * The meta object literal for the '<em><b>Department Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__DEPARTMENT_ELEMENT = eINSTANCE.getDocumentRoot_DepartmentElement();

    /**
     * The meta object literal for the '<em><b>Employee Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EMPLOYEE_ELEMENT = eINSTANCE.getDocumentRoot_EmployeeElement();

    /**
     * The meta object literal for the '<em><b>Expense Codes Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT = eINSTANCE.getDocumentRoot_ExpenseCodesElement();

    /**
     * The meta object literal for the '<em><b>Expense Items Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT = eINSTANCE.getDocumentRoot_ExpenseItemsElement();

    /**
     * The meta object literal for the '<em><b>Expense Report Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT = eINSTANCE.getDocumentRoot_ExpenseReportElement();

    /**
     * The meta object literal for the '<em><b>Manager Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__MANAGER_ELEMENT = eINSTANCE.getDocumentRoot_ManagerElement();

    /**
     * The meta object literal for the '<em><b>Office Locations Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT = eINSTANCE.getDocumentRoot_OfficeLocationsElement();

    /**
     * The meta object literal for the '<em><b>Department BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_DepartmentBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Employee BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_EmployeeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Expense Items BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ExpenseItemsBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Expense Report BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ExpenseReportBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Manager BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ManagerBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.impl.EmployeeImpl <em>Employee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.impl.EmployeeImpl
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getEmployee()
     * @generated
     */
    EClass EMPLOYEE = eINSTANCE.getEmployee();

    /**
     * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__EMPLOYEE_ID = eINSTANCE.getEmployee_EmployeeId();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__FIRST_NAME = eINSTANCE.getEmployee_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__LAST_NAME = eINSTANCE.getEmployee_LastName();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.impl.ExpenseItemsImpl <em>Expense Items</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.impl.ExpenseItemsImpl
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseItems()
     * @generated
     */
    EClass EXPENSE_ITEMS = eINSTANCE.getExpenseItems();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPENSE_ITEMS__DATE = eINSTANCE.getExpenseItems_Date();

    /**
     * The meta object literal for the '<em><b>Expense Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPENSE_ITEMS__EXPENSE_CODE = eINSTANCE.getExpenseItems_ExpenseCode();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPENSE_ITEMS__AMOUNT = eINSTANCE.getExpenseItems_Amount();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.impl.ExpenseReportImpl <em>Expense Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.impl.ExpenseReportImpl
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseReport()
     * @generated
     */
    EClass EXPENSE_REPORT = eINSTANCE.getExpenseReport();

    /**
     * The meta object literal for the '<em><b>Report Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPENSE_REPORT__REPORT_DATE = eINSTANCE.getExpenseReport_ReportDate();

    /**
     * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPENSE_REPORT__CURRENCY = eINSTANCE.getExpenseReport_Currency();

    /**
     * The meta object literal for the '<em><b>Expenseitems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPENSE_REPORT__EXPENSEITEMS = eINSTANCE.getExpenseReport_Expenseitems();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.impl.ManagerImpl <em>Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.impl.ManagerImpl
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getManager()
     * @generated
     */
    EClass MANAGER = eINSTANCE.getManager();

    /**
     * The meta object literal for the '<em><b>Approval Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGER__APPROVAL_LIMIT = eINSTANCE.getManager_ApprovalLimit();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.Currency <em>Currency</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.Currency
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getCurrency()
     * @generated
     */
    EEnum CURRENCY = eINSTANCE.getCurrency();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.ExpenseCodes <em>Expense Codes</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.ExpenseCodes
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseCodes()
     * @generated
     */
    EEnum EXPENSE_CODES = eINSTANCE.getExpenseCodes();

    /**
     * The meta object literal for the '{@link com.example.expensebom02.OfficeLocations <em>Office Locations</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.OfficeLocations
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getOfficeLocations()
     * @generated
     */
    EEnum OFFICE_LOCATIONS = eINSTANCE.getOfficeLocations();

    /**
     * The meta object literal for the '<em>currency Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.Currency
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getcurrencyElementType()
     * @generated
     */
    EDataType CURRENCY_ELEMENT_TYPE = eINSTANCE.getcurrencyElementType();

    /**
     * The meta object literal for the '<em>Currency Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.Currency
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getCurrencyObject()
     * @generated
     */
    EDataType CURRENCY_OBJECT = eINSTANCE.getCurrencyObject();

    /**
     * The meta object literal for the '<em>dept Code Department Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getdeptCode_DepartmentType()
     * @generated
     */
    EDataType DEPT_CODE_DEPARTMENT_TYPE = eINSTANCE.getdeptCode_DepartmentType();

    /**
     * The meta object literal for the '<em>dept Name Department Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getdeptName_DepartmentType()
     * @generated
     */
    EDataType DEPT_NAME_DEPARTMENT_TYPE = eINSTANCE.getdeptName_DepartmentType();

    /**
     * The meta object literal for the '<em>Double Studio Generated Template</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDoubleStudioGeneratedTemplate()
     * @generated
     */
    EDataType DOUBLE_STUDIO_GENERATED_TEMPLATE = eINSTANCE.getDoubleStudioGeneratedTemplate();

    /**
     * The meta object literal for the '<em>Double Studio Generated Template Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Double
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getDoubleStudioGeneratedTemplateObject()
     * @generated
     */
    EDataType DOUBLE_STUDIO_GENERATED_TEMPLATE_OBJECT = eINSTANCE.getDoubleStudioGeneratedTemplateObject();

    /**
     * The meta object literal for the '<em>employee Id Employee Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getemployeeId_EmployeeType()
     * @generated
     */
    EDataType EMPLOYEE_ID_EMPLOYEE_TYPE = eINSTANCE.getemployeeId_EmployeeType();

    /**
     * The meta object literal for the '<em>expense Codes Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.ExpenseCodes
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getexpenseCodesElementType()
     * @generated
     */
    EDataType EXPENSE_CODES_ELEMENT_TYPE = eINSTANCE.getexpenseCodesElementType();

    /**
     * The meta object literal for the '<em>Expense Codes Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.ExpenseCodes
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getExpenseCodesObject()
     * @generated
     */
    EDataType EXPENSE_CODES_OBJECT = eINSTANCE.getExpenseCodesObject();

    /**
     * The meta object literal for the '<em>first Name Employee Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getfirstName_EmployeeType()
     * @generated
     */
    EDataType FIRST_NAME_EMPLOYEE_TYPE = eINSTANCE.getfirstName_EmployeeType();

    /**
     * The meta object literal for the '<em>last Name Employee Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getlastName_EmployeeType()
     * @generated
     */
    EDataType LAST_NAME_EMPLOYEE_TYPE = eINSTANCE.getlastName_EmployeeType();

    /**
     * The meta object literal for the '<em>manager Id Department Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getmanagerId_DepartmentType()
     * @generated
     */
    EDataType MANAGER_ID_DEPARTMENT_TYPE = eINSTANCE.getmanagerId_DepartmentType();

    /**
     * The meta object literal for the '<em>office Locations Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.OfficeLocations
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getofficeLocationsElementType()
     * @generated
     */
    EDataType OFFICE_LOCATIONS_ELEMENT_TYPE = eINSTANCE.getofficeLocationsElementType();

    /**
     * The meta object literal for the '<em>Office Locations Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.expensebom02.OfficeLocations
     * @see com.example.expensebom02.impl.Expensebom02PackageImpl#getOfficeLocationsObject()
     * @generated
     */
    EDataType OFFICE_LOCATIONS_OBJECT = eINSTANCE.getOfficeLocationsObject();

  }

} //Expensebom02Package
