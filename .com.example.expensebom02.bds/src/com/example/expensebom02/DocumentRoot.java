package com.example.expensebom02;

import com.example.expensebom02.bdsutil.BDSFeatureMap;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getCurrencyElement <em>Currency Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getDepartmentElement <em>Department Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getEmployeeElement <em>Employee Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getExpenseCodesElement <em>Expense Codes Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getExpenseItemsElement <em>Expense Items Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getExpenseReportElement <em>Expense Report Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getManagerElement <em>Manager Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getOfficeLocationsElement <em>Office Locations Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getDepartmentBDSInternalSerializationElement <em>Department BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getEmployeeBDSInternalSerializationElement <em>Employee BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getExpenseItemsBDSInternalSerializationElement <em>Expense Items BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getExpenseReportBDSInternalSerializationElement <em>Expense Report BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.expensebom02.DocumentRoot#getManagerBDSInternalSerializationElement <em>Manager BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@SuppressWarnings("all")
public interface DocumentRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
  BDSFeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_XMLNSPrefixMap()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
   * @generated
   */
  EMap<String, String> getXMLNSPrefixMap();

  /**
   * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XSI Schema Location</em>' map.
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Currency Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Currency Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Currency Element</em>' attribute.
   * @see #setCurrencyElement(Currency)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_CurrencyElement()
   * @model unique="false" dataType="com.example.expensebom02.currencyElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CurrencyElement' namespace='##targetNamespace'"
   * @generated
   */
  Currency getCurrencyElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getCurrencyElement <em>Currency Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Currency Element</em>' attribute.
   * @see #getCurrencyElement()
   * @generated
   */
  void setCurrencyElement(Currency value);

  /**
   * Returns the value of the '<em><b>Department Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Department Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Department Element</em>' containment reference.
   * @see #setDepartmentElement(Department)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_DepartmentElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='DepartmentElement' namespace='##targetNamespace'"
   * @generated
   */
  Department getDepartmentElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getDepartmentElement <em>Department Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Department Element</em>' containment reference.
   * @see #getDepartmentElement()
   * @generated
   */
  void setDepartmentElement(Department value);

  /**
   * Returns the value of the '<em><b>Employee Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employee Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employee Element</em>' containment reference.
   * @see #setEmployeeElement(Employee)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_EmployeeElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmployeeElement' namespace='##targetNamespace'"
   * @generated
   */
  Employee getEmployeeElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getEmployeeElement <em>Employee Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Employee Element</em>' containment reference.
   * @see #getEmployeeElement()
   * @generated
   */
  void setEmployeeElement(Employee value);

  /**
   * Returns the value of the '<em><b>Expense Codes Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expense Codes Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expense Codes Element</em>' attribute.
   * @see #setExpenseCodesElement(ExpenseCodes)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_ExpenseCodesElement()
   * @model unique="false" dataType="com.example.expensebom02.expenseCodesElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ExpenseCodesElement' namespace='##targetNamespace'"
   * @generated
   */
  ExpenseCodes getExpenseCodesElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getExpenseCodesElement <em>Expense Codes Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expense Codes Element</em>' attribute.
   * @see #getExpenseCodesElement()
   * @generated
   */
  void setExpenseCodesElement(ExpenseCodes value);

  /**
   * Returns the value of the '<em><b>Expense Items Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expense Items Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expense Items Element</em>' containment reference.
   * @see #setExpenseItemsElement(ExpenseItems)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_ExpenseItemsElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ExpenseItemsElement' namespace='##targetNamespace'"
   * @generated
   */
  ExpenseItems getExpenseItemsElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getExpenseItemsElement <em>Expense Items Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expense Items Element</em>' containment reference.
   * @see #getExpenseItemsElement()
   * @generated
   */
  void setExpenseItemsElement(ExpenseItems value);

  /**
   * Returns the value of the '<em><b>Expense Report Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expense Report Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expense Report Element</em>' containment reference.
   * @see #setExpenseReportElement(ExpenseReport)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_ExpenseReportElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ExpenseReportElement' namespace='##targetNamespace'"
   * @generated
   */
  ExpenseReport getExpenseReportElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getExpenseReportElement <em>Expense Report Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expense Report Element</em>' containment reference.
   * @see #getExpenseReportElement()
   * @generated
   */
  void setExpenseReportElement(ExpenseReport value);

  /**
   * Returns the value of the '<em><b>Manager Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manager Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manager Element</em>' containment reference.
   * @see #setManagerElement(Manager)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_ManagerElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ManagerElement' namespace='##targetNamespace'"
   * @generated
   */
  Manager getManagerElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getManagerElement <em>Manager Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manager Element</em>' containment reference.
   * @see #getManagerElement()
   * @generated
   */
  void setManagerElement(Manager value);

  /**
   * Returns the value of the '<em><b>Office Locations Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Office Locations Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Office Locations Element</em>' attribute.
   * @see #setOfficeLocationsElement(OfficeLocations)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_OfficeLocationsElement()
   * @model unique="false" dataType="com.example.expensebom02.officeLocationsElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='OfficeLocationsElement' namespace='##targetNamespace'"
   * @generated
   */
  OfficeLocations getOfficeLocationsElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getOfficeLocationsElement <em>Office Locations Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Office Locations Element</em>' attribute.
   * @see #getOfficeLocationsElement()
   * @generated
   */
  void setOfficeLocationsElement(OfficeLocations value);

  /**
   * Returns the value of the '<em><b>Department BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Department BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Department BDS Internal Serialization Element</em>' containment reference.
   * @see #setDepartmentBDSInternalSerializationElement(Department)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_DepartmentBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Department' namespace='##targetNamespace'"
   * @generated
   */
  Department getDepartmentBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getDepartmentBDSInternalSerializationElement <em>Department BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Department BDS Internal Serialization Element</em>' containment reference.
   * @see #getDepartmentBDSInternalSerializationElement()
   * @generated
   */
  void setDepartmentBDSInternalSerializationElement(Department value);

  /**
   * Returns the value of the '<em><b>Employee BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employee BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employee BDS Internal Serialization Element</em>' containment reference.
   * @see #setEmployeeBDSInternalSerializationElement(Employee)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_EmployeeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Employee' namespace='##targetNamespace'"
   * @generated
   */
  Employee getEmployeeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getEmployeeBDSInternalSerializationElement <em>Employee BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Employee BDS Internal Serialization Element</em>' containment reference.
   * @see #getEmployeeBDSInternalSerializationElement()
   * @generated
   */
  void setEmployeeBDSInternalSerializationElement(Employee value);

  /**
   * Returns the value of the '<em><b>Expense Items BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expense Items BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expense Items BDS Internal Serialization Element</em>' containment reference.
   * @see #setExpenseItemsBDSInternalSerializationElement(ExpenseItems)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_ExpenseItemsBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ExpenseItems' namespace='##targetNamespace'"
   * @generated
   */
  ExpenseItems getExpenseItemsBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getExpenseItemsBDSInternalSerializationElement <em>Expense Items BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expense Items BDS Internal Serialization Element</em>' containment reference.
   * @see #getExpenseItemsBDSInternalSerializationElement()
   * @generated
   */
  void setExpenseItemsBDSInternalSerializationElement(ExpenseItems value);

  /**
   * Returns the value of the '<em><b>Expense Report BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expense Report BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expense Report BDS Internal Serialization Element</em>' containment reference.
   * @see #setExpenseReportBDSInternalSerializationElement(ExpenseReport)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_ExpenseReportBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ExpenseReport' namespace='##targetNamespace'"
   * @generated
   */
  ExpenseReport getExpenseReportBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getExpenseReportBDSInternalSerializationElement <em>Expense Report BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expense Report BDS Internal Serialization Element</em>' containment reference.
   * @see #getExpenseReportBDSInternalSerializationElement()
   * @generated
   */
  void setExpenseReportBDSInternalSerializationElement(ExpenseReport value);

  /**
   * Returns the value of the '<em><b>Manager BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manager BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manager BDS Internal Serialization Element</em>' containment reference.
   * @see #setManagerBDSInternalSerializationElement(Manager)
   * @see com.example.expensebom02.Expensebom02Package#getDocumentRoot_ManagerBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Manager' namespace='##targetNamespace'"
   * @generated
   */
  Manager getManagerBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.expensebom02.DocumentRoot#getManagerBDSInternalSerializationElement <em>Manager BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manager BDS Internal Serialization Element</em>' containment reference.
   * @see #getManagerBDSInternalSerializationElement()
   * @generated
   */
  void setManagerBDSInternalSerializationElement(Manager value);

} // DocumentRoot
