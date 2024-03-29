/**
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.springFluentDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.fluent.springFluentDSL.Dependency;
import org.xtext.spring.fluent.springFluentDSL.DependencyType;
import org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.DependencyImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The default value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependency()
   * @generated
   * @ordered
   */
  protected static final DependencyType DEPENDENCY_EDEFAULT = DependencyType.SPRING_DATA_JPA;

  /**
   * The cached value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependency()
   * @generated
   * @ordered
   */
  protected DependencyType dependency = DEPENDENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return SpringFluentDSLPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DependencyType getDependency()
  {
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDependency(DependencyType newDependency)
  {
    DependencyType oldDependency = dependency;
    dependency = newDependency == null ? DEPENDENCY_EDEFAULT : newDependency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.DEPENDENCY__DEPENDENCY, oldDependency, dependency));
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
      case SpringFluentDSLPackage.DEPENDENCY__DEPENDENCY:
        return getDependency();
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
      case SpringFluentDSLPackage.DEPENDENCY__DEPENDENCY:
        setDependency((DependencyType)newValue);
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
      case SpringFluentDSLPackage.DEPENDENCY__DEPENDENCY:
        setDependency(DEPENDENCY_EDEFAULT);
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
      case SpringFluentDSLPackage.DEPENDENCY__DEPENDENCY:
        return dependency != DEPENDENCY_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (dependency: ");
    result.append(dependency);
    result.append(')');
    return result.toString();
  }

} //DependencyImpl
