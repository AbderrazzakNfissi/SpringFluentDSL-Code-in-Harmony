/*
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SpringFluentDSLStandaloneSetup extends SpringFluentDSLStandaloneSetupGenerated {

	public static void doSetup() {
		new SpringFluentDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
