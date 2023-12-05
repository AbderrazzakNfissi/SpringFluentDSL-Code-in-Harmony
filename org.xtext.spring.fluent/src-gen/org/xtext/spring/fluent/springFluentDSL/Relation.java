/**
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.springFluentDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.Relation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.Relation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.spring.fluent.springFluentDSL.Relation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Entity)
   * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getRelation_Target()
   * @model
   * @generated
   */
  Entity getTarget();

  /**
   * Sets the value of the '{@link org.xtext.spring.fluent.springFluentDSL.Relation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Entity value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getRelation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.spring.fluent.springFluentDSL.Relation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Relation
