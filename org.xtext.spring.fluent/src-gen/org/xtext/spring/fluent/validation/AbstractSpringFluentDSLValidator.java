/*
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSpringFluentDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage.eINSTANCE);
		return result;
	}
}
