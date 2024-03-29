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

import org.xtext.spring.fluent.springFluentDSL.AppName;
import org.xtext.spring.fluent.springFluentDSL.Dependencies;
import org.xtext.spring.fluent.springFluentDSL.Entities;
import org.xtext.spring.fluent.springFluentDSL.Model;
import org.xtext.spring.fluent.springFluentDSL.Prefix;
import org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.ModelImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.ModelImpl#getAppName <em>App Name</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.ModelImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.ModelImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected Prefix prefix;

  /**
   * The cached value of the '{@link #getAppName() <em>App Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected AppName appName;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected Dependencies dependencies;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected Entities entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return SpringFluentDSLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Prefix getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefix(Prefix newPrefix, NotificationChain msgs)
  {
    Prefix oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__PREFIX, oldPrefix, newPrefix);
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
  public void setPrefix(Prefix newPrefix)
  {
    if (newPrefix != prefix)
    {
      NotificationChain msgs = null;
      if (prefix != null)
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__PREFIX, newPrefix, newPrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AppName getAppName()
  {
    return appName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAppName(AppName newAppName, NotificationChain msgs)
  {
    AppName oldAppName = appName;
    appName = newAppName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__APP_NAME, oldAppName, newAppName);
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
  public void setAppName(AppName newAppName)
  {
    if (newAppName != appName)
    {
      NotificationChain msgs = null;
      if (appName != null)
        msgs = ((InternalEObject)appName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__APP_NAME, null, msgs);
      if (newAppName != null)
        msgs = ((InternalEObject)newAppName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__APP_NAME, null, msgs);
      msgs = basicSetAppName(newAppName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__APP_NAME, newAppName, newAppName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dependencies getDependencies()
  {
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependencies(Dependencies newDependencies, NotificationChain msgs)
  {
    Dependencies oldDependencies = dependencies;
    dependencies = newDependencies;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__DEPENDENCIES, oldDependencies, newDependencies);
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
  public void setDependencies(Dependencies newDependencies)
  {
    if (newDependencies != dependencies)
    {
      NotificationChain msgs = null;
      if (dependencies != null)
        msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__DEPENDENCIES, null, msgs);
      if (newDependencies != null)
        msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__DEPENDENCIES, null, msgs);
      msgs = basicSetDependencies(newDependencies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__DEPENDENCIES, newDependencies, newDependencies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entities getEntities()
  {
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntities(Entities newEntities, NotificationChain msgs)
  {
    Entities oldEntities = entities;
    entities = newEntities;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__ENTITIES, oldEntities, newEntities);
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
  public void setEntities(Entities newEntities)
  {
    if (newEntities != entities)
    {
      NotificationChain msgs = null;
      if (entities != null)
        msgs = ((InternalEObject)entities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__ENTITIES, null, msgs);
      if (newEntities != null)
        msgs = ((InternalEObject)newEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringFluentDSLPackage.MODEL__ENTITIES, null, msgs);
      msgs = basicSetEntities(newEntities, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.MODEL__ENTITIES, newEntities, newEntities));
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
      case SpringFluentDSLPackage.MODEL__PREFIX:
        return basicSetPrefix(null, msgs);
      case SpringFluentDSLPackage.MODEL__APP_NAME:
        return basicSetAppName(null, msgs);
      case SpringFluentDSLPackage.MODEL__DEPENDENCIES:
        return basicSetDependencies(null, msgs);
      case SpringFluentDSLPackage.MODEL__ENTITIES:
        return basicSetEntities(null, msgs);
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
      case SpringFluentDSLPackage.MODEL__PREFIX:
        return getPrefix();
      case SpringFluentDSLPackage.MODEL__APP_NAME:
        return getAppName();
      case SpringFluentDSLPackage.MODEL__DEPENDENCIES:
        return getDependencies();
      case SpringFluentDSLPackage.MODEL__ENTITIES:
        return getEntities();
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
      case SpringFluentDSLPackage.MODEL__PREFIX:
        setPrefix((Prefix)newValue);
        return;
      case SpringFluentDSLPackage.MODEL__APP_NAME:
        setAppName((AppName)newValue);
        return;
      case SpringFluentDSLPackage.MODEL__DEPENDENCIES:
        setDependencies((Dependencies)newValue);
        return;
      case SpringFluentDSLPackage.MODEL__ENTITIES:
        setEntities((Entities)newValue);
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
      case SpringFluentDSLPackage.MODEL__PREFIX:
        setPrefix((Prefix)null);
        return;
      case SpringFluentDSLPackage.MODEL__APP_NAME:
        setAppName((AppName)null);
        return;
      case SpringFluentDSLPackage.MODEL__DEPENDENCIES:
        setDependencies((Dependencies)null);
        return;
      case SpringFluentDSLPackage.MODEL__ENTITIES:
        setEntities((Entities)null);
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
      case SpringFluentDSLPackage.MODEL__PREFIX:
        return prefix != null;
      case SpringFluentDSLPackage.MODEL__APP_NAME:
        return appName != null;
      case SpringFluentDSLPackage.MODEL__DEPENDENCIES:
        return dependencies != null;
      case SpringFluentDSLPackage.MODEL__ENTITIES:
        return entities != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
