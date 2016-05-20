
package com.example.expensebom02.impl;

import com.example.expensebom02.Currency;
import com.example.expensebom02.Department;
import com.example.expensebom02.DocumentRoot;
import com.example.expensebom02.Employee;
import com.example.expensebom02.ExpenseCodes;
import com.example.expensebom02.ExpenseItems;
import com.example.expensebom02.ExpenseReport;
import com.example.expensebom02.Expensebom02Package;
import com.example.expensebom02.Manager;
import com.example.expensebom02.OfficeLocations;

import com.example.expensebom02.bdsutil.BDSFeatureMap;
import com.example.expensebom02.bdsutil.BDSFeatureMapImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getCurrencyElement <em>Currency Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getDepartmentElement <em>Department Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getEmployeeElement <em>Employee Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getExpenseCodesElement <em>Expense Codes Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getExpenseItemsElement <em>Expense Items Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getExpenseReportElement <em>Expense Report Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getManagerElement <em>Manager Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getOfficeLocationsElement <em>Office Locations Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getDepartmentBDSInternalSerializationElement <em>Department BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getEmployeeBDSInternalSerializationElement <em>Employee BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getExpenseItemsBDSInternalSerializationElement <em>Expense Items BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getExpenseReportBDSInternalSerializationElement <em>Expense Report BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.impl.DocumentRootImpl#getManagerBDSInternalSerializationElement <em>Manager BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected BDSFeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * The default value of the '{@link #getCurrencyElement() <em>Currency Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrencyElement()
   * @generated
   * @ordered
   */
  protected static final Currency CURRENCY_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getExpenseCodesElement() <em>Expense Codes Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpenseCodesElement()
   * @generated
   * @ordered
   */
  protected static final ExpenseCodes EXPENSE_CODES_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getOfficeLocationsElement() <em>Office Locations Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfficeLocationsElement()
   * @generated
   * @ordered
   */
  protected static final OfficeLocations OFFICE_LOCATIONS_ELEMENT_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
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
    return Expensebom02Package.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSFeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, Expensebom02Package.DOCUMENT_ROOT__MIXED));
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Expensebom02Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Expensebom02Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Currency getCurrencyElement()
  {
    return (Currency)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__CURRENCY_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrencyElement(Currency newCurrencyElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__CURRENCY_ELEMENT, newCurrencyElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Department getDepartmentElement()
  {
    return (Department)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__DEPARTMENT_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDepartmentElement(Department newDepartmentElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__DEPARTMENT_ELEMENT, newDepartmentElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepartmentElement(Department newDepartmentElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__DEPARTMENT_ELEMENT, newDepartmentElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Employee getEmployeeElement()
  {
    return (Employee)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__EMPLOYEE_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmployeeElement(Employee newEmployeeElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__EMPLOYEE_ELEMENT, newEmployeeElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmployeeElement(Employee newEmployeeElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__EMPLOYEE_ELEMENT, newEmployeeElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseCodes getExpenseCodesElement()
  {
    return (ExpenseCodes)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpenseCodesElement(ExpenseCodes newExpenseCodesElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT, newExpenseCodesElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseItems getExpenseItemsElement()
  {
    return (ExpenseItems)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpenseItemsElement(ExpenseItems newExpenseItemsElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT, newExpenseItemsElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpenseItemsElement(ExpenseItems newExpenseItemsElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT, newExpenseItemsElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseReport getExpenseReportElement()
  {
    return (ExpenseReport)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpenseReportElement(ExpenseReport newExpenseReportElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT, newExpenseReportElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpenseReportElement(ExpenseReport newExpenseReportElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT, newExpenseReportElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Manager getManagerElement()
  {
    return (Manager)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__MANAGER_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManagerElement(Manager newManagerElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__MANAGER_ELEMENT, newManagerElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManagerElement(Manager newManagerElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__MANAGER_ELEMENT, newManagerElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeLocations getOfficeLocationsElement()
  {
    return (OfficeLocations)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOfficeLocationsElement(OfficeLocations newOfficeLocationsElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT, newOfficeLocationsElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Department getDepartmentBDSInternalSerializationElement()
  {
    return (Department)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDepartmentBDSInternalSerializationElement(Department newDepartmentBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT, newDepartmentBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepartmentBDSInternalSerializationElement(Department newDepartmentBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT, newDepartmentBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Employee getEmployeeBDSInternalSerializationElement()
  {
    return (Employee)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmployeeBDSInternalSerializationElement(Employee newEmployeeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newEmployeeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmployeeBDSInternalSerializationElement(Employee newEmployeeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newEmployeeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseItems getExpenseItemsBDSInternalSerializationElement()
  {
    return (ExpenseItems)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpenseItemsBDSInternalSerializationElement(ExpenseItems newExpenseItemsBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newExpenseItemsBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpenseItemsBDSInternalSerializationElement(ExpenseItems newExpenseItemsBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newExpenseItemsBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseReport getExpenseReportBDSInternalSerializationElement()
  {
    return (ExpenseReport)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpenseReportBDSInternalSerializationElement(ExpenseReport newExpenseReportBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT, newExpenseReportBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpenseReportBDSInternalSerializationElement(ExpenseReport newExpenseReportBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT, newExpenseReportBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Manager getManagerBDSInternalSerializationElement()
  {
    return (Manager)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Expensebom02Package.Literals.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManagerBDSInternalSerializationElement(Manager newManagerBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Expensebom02Package.Literals.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT, newManagerBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManagerBDSInternalSerializationElement(Manager newManagerBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Expensebom02Package.Literals.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT, newManagerBDSInternalSerializationElement);
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
      case Expensebom02Package.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_ELEMENT:
        return basicSetDepartmentElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_ELEMENT:
        return basicSetEmployeeElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT:
        return basicSetExpenseItemsElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT:
        return basicSetExpenseReportElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_ELEMENT:
        return basicSetManagerElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetDepartmentBDSInternalSerializationElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetEmployeeBDSInternalSerializationElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetExpenseItemsBDSInternalSerializationElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetExpenseReportBDSInternalSerializationElement(null, msgs);
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetManagerBDSInternalSerializationElement(null, msgs);
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
      case Expensebom02Package.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case Expensebom02Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case Expensebom02Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case Expensebom02Package.DOCUMENT_ROOT__CURRENCY_ELEMENT:
        return getCurrencyElement();
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_ELEMENT:
        return getDepartmentElement();
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_ELEMENT:
        return getEmployeeElement();
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT:
        return getExpenseCodesElement();
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT:
        return getExpenseItemsElement();
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT:
        return getExpenseReportElement();
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_ELEMENT:
        return getManagerElement();
      case Expensebom02Package.DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT:
        return getOfficeLocationsElement();
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getDepartmentBDSInternalSerializationElement();
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getEmployeeBDSInternalSerializationElement();
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getExpenseItemsBDSInternalSerializationElement();
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getExpenseReportBDSInternalSerializationElement();
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getManagerBDSInternalSerializationElement();
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
      case Expensebom02Package.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__CURRENCY_ELEMENT:
        setCurrencyElement((Currency)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_ELEMENT:
        setDepartmentElement((Department)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_ELEMENT:
        setEmployeeElement((Employee)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT:
        setExpenseCodesElement((ExpenseCodes)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT:
        setExpenseItemsElement((ExpenseItems)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT:
        setExpenseReportElement((ExpenseReport)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_ELEMENT:
        setManagerElement((Manager)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT:
        setOfficeLocationsElement((OfficeLocations)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setDepartmentBDSInternalSerializationElement((Department)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setEmployeeBDSInternalSerializationElement((Employee)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setExpenseItemsBDSInternalSerializationElement((ExpenseItems)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setExpenseReportBDSInternalSerializationElement((ExpenseReport)newValue);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setManagerBDSInternalSerializationElement((Manager)newValue);
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
      case Expensebom02Package.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case Expensebom02Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case Expensebom02Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case Expensebom02Package.DOCUMENT_ROOT__CURRENCY_ELEMENT:
        setCurrencyElement(CURRENCY_ELEMENT_EDEFAULT);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_ELEMENT:
        setDepartmentElement((Department)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_ELEMENT:
        setEmployeeElement((Employee)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT:
        setExpenseCodesElement(EXPENSE_CODES_ELEMENT_EDEFAULT);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT:
        setExpenseItemsElement((ExpenseItems)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT:
        setExpenseReportElement((ExpenseReport)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_ELEMENT:
        setManagerElement((Manager)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT:
        setOfficeLocationsElement(OFFICE_LOCATIONS_ELEMENT_EDEFAULT);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setDepartmentBDSInternalSerializationElement((Department)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setEmployeeBDSInternalSerializationElement((Employee)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setExpenseItemsBDSInternalSerializationElement((ExpenseItems)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setExpenseReportBDSInternalSerializationElement((ExpenseReport)null);
        return;
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setManagerBDSInternalSerializationElement((Manager)null);
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
      case Expensebom02Package.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case Expensebom02Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case Expensebom02Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case Expensebom02Package.DOCUMENT_ROOT__CURRENCY_ELEMENT:
        return CURRENCY_ELEMENT_EDEFAULT == null ? getCurrencyElement() != null : !CURRENCY_ELEMENT_EDEFAULT.equals(getCurrencyElement());
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_ELEMENT:
        return getDepartmentElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_ELEMENT:
        return getEmployeeElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_CODES_ELEMENT:
        return EXPENSE_CODES_ELEMENT_EDEFAULT == null ? getExpenseCodesElement() != null : !EXPENSE_CODES_ELEMENT_EDEFAULT.equals(getExpenseCodesElement());
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_ELEMENT:
        return getExpenseItemsElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_ELEMENT:
        return getExpenseReportElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_ELEMENT:
        return getManagerElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__OFFICE_LOCATIONS_ELEMENT:
        return OFFICE_LOCATIONS_ELEMENT_EDEFAULT == null ? getOfficeLocationsElement() != null : !OFFICE_LOCATIONS_ELEMENT_EDEFAULT.equals(getOfficeLocationsElement());
      case Expensebom02Package.DOCUMENT_ROOT__DEPARTMENT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getDepartmentBDSInternalSerializationElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__EMPLOYEE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getEmployeeBDSInternalSerializationElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_ITEMS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getExpenseItemsBDSInternalSerializationElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__EXPENSE_REPORT_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getExpenseReportBDSInternalSerializationElement() != null;
      case Expensebom02Package.DOCUMENT_ROOT__MANAGER_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getManagerBDSInternalSerializationElement() != null;
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
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
