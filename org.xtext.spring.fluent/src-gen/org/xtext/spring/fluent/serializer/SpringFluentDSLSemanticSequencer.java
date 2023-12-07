/*
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.spring.fluent.services.SpringFluentDSLGrammarAccess;
import org.xtext.spring.fluent.springFluentDSL.AppName;
import org.xtext.spring.fluent.springFluentDSL.Attribute;
import org.xtext.spring.fluent.springFluentDSL.Dependencies;
import org.xtext.spring.fluent.springFluentDSL.Dependency;
import org.xtext.spring.fluent.springFluentDSL.Entities;
import org.xtext.spring.fluent.springFluentDSL.Entity;
import org.xtext.spring.fluent.springFluentDSL.Feature;
import org.xtext.spring.fluent.springFluentDSL.IDENTITY;
import org.xtext.spring.fluent.springFluentDSL.Model;
import org.xtext.spring.fluent.springFluentDSL.Operation;
import org.xtext.spring.fluent.springFluentDSL.Prefix;
import org.xtext.spring.fluent.springFluentDSL.Relation;
import org.xtext.spring.fluent.springFluentDSL.SpringFluentDSLPackage;
import org.xtext.spring.fluent.springFluentDSL.Strategy;

@SuppressWarnings("all")
public class SpringFluentDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpringFluentDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SpringFluentDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SpringFluentDSLPackage.APP_NAME:
				sequence_AppName(context, (AppName) semanticObject); 
				return; 
			case SpringFluentDSLPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SpringFluentDSLPackage.DEPENDENCIES:
				sequence_Dependencies(context, (Dependencies) semanticObject); 
				return; 
			case SpringFluentDSLPackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case SpringFluentDSLPackage.ENTITIES:
				sequence_Entities(context, (Entities) semanticObject); 
				return; 
			case SpringFluentDSLPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case SpringFluentDSLPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case SpringFluentDSLPackage.IDENTITY:
				sequence_IDENTITY(context, (IDENTITY) semanticObject); 
				return; 
			case SpringFluentDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SpringFluentDSLPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case SpringFluentDSLPackage.PREFIX:
				sequence_Prefix(context, (Prefix) semanticObject); 
				return; 
			case SpringFluentDSLPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			case SpringFluentDSLPackage.STRATEGY:
				sequence_Strategy(context, (Strategy) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AppName returns AppName
	 *
	 * Constraint:
	 *     appName=STRING
	 * </pre>
	 */
	protected void sequence_AppName(ISerializationContext context, AppName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.APP_NAME__APP_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.APP_NAME__APP_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppNameAccess().getAppNameSTRINGTerminalRuleCall_2_0(), semanticObject.getAppName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Dependencies returns Dependencies
	 *
	 * Constraint:
	 *     (dependencies+=Dependency dependencies+=Dependency*)
	 * </pre>
	 */
	protected void sequence_Dependencies(ISerializationContext context, Dependencies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     dependency=DependencyType
	 * </pre>
	 */
	protected void sequence_Dependency(ISerializationContext context, Dependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.DEPENDENCY__DEPENDENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.DEPENDENCY__DEPENDENCY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDependencyAccess().getDependencyDependencyTypeEnumRuleCall_1_0(), semanticObject.getDependency());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entities returns Entities
	 *
	 * Constraint:
	 *     entities+=Entity*
	 * </pre>
	 */
	protected void sequence_Entities(ISerializationContext context, Entities semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID (strategy=Strategy superType=[Entity|ID])? feature=Feature)
	 * </pre>
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (operation=Operation id=IDENTITY attributes+=Attribute* relations+=Relation*)
	 * </pre>
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IDENTITY returns IDENTITY
	 *
	 * Constraint:
	 *     type=Type
	 * </pre>
	 */
	protected void sequence_IDENTITY(ISerializationContext context, IDENTITY semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.IDENTITY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.IDENTITY__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIDENTITYAccess().getTypeTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (prefix=Prefix appName=AppName dependencies=Dependencies entities=Entities)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.MODEL__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.MODEL__PREFIX));
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.MODEL__APP_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.MODEL__APP_NAME));
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.MODEL__DEPENDENCIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.MODEL__DEPENDENCIES));
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.MODEL__ENTITIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.MODEL__ENTITIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_0_0(), semanticObject.getPrefix());
		feeder.accept(grammarAccess.getModelAccess().getAppNameAppNameParserRuleCall_1_0(), semanticObject.getAppName());
		feeder.accept(grammarAccess.getModelAccess().getDependenciesDependenciesParserRuleCall_2_0(), semanticObject.getDependencies());
		feeder.accept(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_3_0(), semanticObject.getEntities());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     operation=STRING
	 * </pre>
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.OPERATION__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationAccess().getOperationSTRINGTerminalRuleCall_2_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Prefix returns Prefix
	 *
	 * Constraint:
	 *     prefix=STRING
	 * </pre>
	 */
	protected void sequence_Prefix(ISerializationContext context, Prefix semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringFluentDSLPackage.Literals.PREFIX__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringFluentDSLPackage.Literals.PREFIX__PREFIX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrefixAccess().getPrefixSTRINGTerminalRuleCall_2_0(), semanticObject.getPrefix());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     (name=ID target=[Entity|ID] (type='mto' | type='otm' | type='oto' | type='mtm'))
	 * </pre>
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Strategy returns Strategy
	 *
	 * Constraint:
	 *     (strategy='SingleTable' | strategy='JoinedTable' | strategy='TablePerClass')
	 * </pre>
	 */
	protected void sequence_Strategy(ISerializationContext context, Strategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
