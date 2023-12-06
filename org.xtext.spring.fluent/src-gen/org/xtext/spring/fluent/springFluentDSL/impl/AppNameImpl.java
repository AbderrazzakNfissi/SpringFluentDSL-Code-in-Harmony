/**
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.springFluentDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.fluent.springFluentDSL.AppName;
import org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.fluent.springFluentDSL.impl.AppNameImpl#getAppName <em>App Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppNameImpl extends MinimalEObjectImpl.Container implements AppName
{
  /**
   * The default value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected static final String APP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected String appName = APP_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AppNameImpl()
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
    return SpringFluentDSLPackage.Literals.APP_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAppName()
  {
    return appName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAppName(String newAppName)
  {
    String oldAppName = appName;
    appName = newAppName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringFluentDSLPackage.APP_NAME__APP_NAME, oldAppName, appName));
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
      case SpringFluentDSLPackage.APP_NAME__APP_NAME:
        return getAppName();
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
      case SpringFluentDSLPackage.APP_NAME__APP_NAME:
        setAppName((String)newValue);
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
      case SpringFluentDSLPackage.APP_NAME__APP_NAME:
        setAppName(APP_NAME_EDEFAULT);
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
      case SpringFluentDSLPackage.APP_NAME__APP_NAME:
        return APP_NAME_EDEFAULT == null ? appName != null : !APP_NAME_EDEFAULT.equals(appName);
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
    result.append(" (appName: ");
    result.append(appName);
    result.append(')');
    return result.toString();
  }

} //AppNameImpl