/**
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.springFluentDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.Entity#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.Entity#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.spring.fluent.springFluentDSL.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' containment reference.
   * @see #setStrategy(Strategy)
   * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getEntity_Strategy()
   * @model containment="true"
   * @generated
   */
  Strategy getStrategy();

  /**
   * Sets the value of the '{@link org.xtext.spring.fluent.springFluentDSL.Entity#getStrategy <em>Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' containment reference.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(Strategy value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link org.xtext.spring.fluent.springFluentDSL.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(Feature)
   * @see org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage#getEntity_Feature()
   * @model containment="true"
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.xtext.spring.fluent.springFluentDSL.Entity#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // Entity
