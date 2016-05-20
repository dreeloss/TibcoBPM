package com.example.expensebom02;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.expensebom02.Manager#getApprovalLimit <em>Approval Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.expensebom02.Expensebom02Package#getManager()
 * @model extendedMetaData="name='Manager' kind='elementOnly'"
 *        annotation="bds label='Manager'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface Manager extends Employee
{
  /**
   * Returns the value of the '<em><b>Approval Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Approval Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Approval Limit</em>' attribute.
   * @see #setApprovalLimit(Integer)
   * @see com.example.expensebom02.Expensebom02Package#getManager_ApprovalLimit()
   * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
   *        extendedMetaData="kind='element' name='approvalLimit'"
   * @generated
   */
  Integer getApprovalLimit();

  /**
   * Sets the value of the '{@link com.example.expensebom02.Manager#getApprovalLimit <em>Approval Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Approval Limit</em>' attribute.
   * @see #getApprovalLimit()
   * @generated
   */
  void setApprovalLimit(Integer value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getApprovalLimit()
   * @generated
   */
  void setApprovalLimit(Object value);

} // Manager
