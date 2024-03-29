/**
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.springFluentDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.fluent.springFluentDSL.Entity;
import org.xtext.spring.fluent.springFluentDSL.Feature;
import org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage;
import org.xtext.spring.fluent.springFluentDSL.Strategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.EntityImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.EntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.EntityImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected Strategy strategy;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Entity superType;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected Feature feature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return SpringFluentDSLPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Strategy getStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrategy(Strategy newStrategy, NotificationChain msgs)
  {
    Strategy oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.ENTITY__STRATEGY, oldStrategy, newStrategy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrategy(Strategy newStrategy)
  {
    if (newStrategy != strategy)
    {
      NotificationChain msgs = null;
      if (strategy != null)
        msgs = ((InternalEObject)strategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.ENTITY__STRATEGY, null, msgs);
      if (newStrategy != null)
        msgs = ((InternalEObject)newStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.ENTITY__STRATEGY, null, msgs);
      msgs = basicSetStrategy(newStrategy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.ENTITY__STRATEGY, newStrategy, newStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Entity)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringFluentDSLPackage.ENTITY__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(Entity newSuperType)
  {
    Entity oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.ENTITY__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Feature getFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs)
  {
    Feature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.ENTITY__FEATURE, oldFeature, newFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFeature(Feature newFeature)
  {
    if (newFeature != feature)
    {
      NotificationChain msgs = null;
      if (feature != null)
        msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.ENTITY__FEATURE, null, msgs);
      if (newFeature != null)
        msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.ENTITY__FEATURE, null, msgs);
      msgs = basicSetFeature(newFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.ENTITY__FEATURE, newFeature, newFeature));
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
      case SpringFluentDSLPackage.ENTITY__STRATEGY:
        return basicSetStrategy(null, msgs);
      case SpringFluentDSLPackage.ENTITY__FEATURE:
        return basicSetFeature(null, msgs);
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
      case SpringFluentDSLPackage.ENTITY__NAME:
        return getName();
      case SpringFluentDSLPackage.ENTITY__STRATEGY:
        return getStrategy();
      case SpringFluentDSLPackage.ENTITY__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case SpringFluentDSLPackage.ENTITY__FEATURE:
        return getFeature();
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
      case SpringFluentDSLPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case SpringFluentDSLPackage.ENTITY__STRATEGY:
        setStrategy((Strategy)newValue);
        return;
      case SpringFluentDSLPackage.ENTITY__SUPER_TYPE:
        setSuperType((Entity)newValue);
        return;
      case SpringFluentDSLPackage.ENTITY__FEATURE:
        setFeature((Feature)newValue);
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
      case SpringFluentDSLPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringFluentDSLPackage.ENTITY__STRATEGY:
        setStrategy((Strategy)null);
        return;
      case SpringFluentDSLPackage.ENTITY__SUPER_TYPE:
        setSuperType((Entity)null);
        return;
      case SpringFluentDSLPackage.ENTITY__FEATURE:
        setFeature((Feature)null);
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
      case SpringFluentDSLPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringFluentDSLPackage.ENTITY__STRATEGY:
        return strategy != null;
      case SpringFluentDSLPackage.ENTITY__SUPER_TYPE:
        return superType != null;
      case SpringFluentDSLPackage.ENTITY__FEATURE:
        return feature != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
