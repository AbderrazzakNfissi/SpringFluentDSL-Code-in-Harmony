/*
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.spring.fluent.SpringFluentDSLRuntimeModule;
import org.xtext.spring.fluent.SpringFluentDSLStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SpringFluentDSLIdeSetup extends SpringFluentDSLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SpringFluentDSLRuntimeModule(), new SpringFluentDSLIdeModule()));
	}
	
}
