/*
 * generated by Xtext 2.32.0
 */
grammar InternalSpringFluentDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.spring.fluent.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.spring.fluent.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.spring.fluent.services.SpringFluentDSLGrammarAccess;

}

@parser::members {

 	private SpringFluentDSLGrammarAccess grammarAccess;

    public InternalSpringFluentDSLParser(TokenStream input, SpringFluentDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SpringFluentDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_0_0());
				}
				lv_prefix_0_0=rulePrefix
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"prefix",
						lv_prefix_0_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Prefix");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getAppNameAppNameParserRuleCall_1_0());
				}
				lv_appName_1_0=ruleAppName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"appName",
						lv_appName_1_0,
						"org.xtext.spring.fluent.SpringFluentDSL.AppName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getDependenciesDependenciesParserRuleCall_2_0());
				}
				lv_dependencies_2_0=ruleDependencies
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"dependencies",
						lv_dependencies_2_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Dependencies");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_3_0());
				}
				lv_entities_3_0=ruleEntities
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"entities",
						lv_entities_3_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Entities");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePrefix
entryRulePrefix returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrefixRule()); }
	iv_rulePrefix=rulePrefix
	{ $current=$iv_rulePrefix.current; }
	EOF;

// Rule Prefix
rulePrefix returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPrefixAccess().getPrefixAction_0(),
					$current);
			}
		)
		otherlv_1='prefix:'
		{
			newLeafNode(otherlv_1, grammarAccess.getPrefixAccess().getPrefixKeyword_1());
		}
		(
			(
				lv_prefix_2_0=RULE_STRING
				{
					newLeafNode(lv_prefix_2_0, grammarAccess.getPrefixAccess().getPrefixSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrefixRule());
					}
					setWithLastConsumed(
						$current,
						"prefix",
						lv_prefix_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleAppName
entryRuleAppName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppNameRule()); }
	iv_ruleAppName=ruleAppName
	{ $current=$iv_ruleAppName.current; }
	EOF;

// Rule AppName
ruleAppName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAppNameAccess().getAppNameAction_0(),
					$current);
			}
		)
		otherlv_1='app_name:'
		{
			newLeafNode(otherlv_1, grammarAccess.getAppNameAccess().getApp_nameKeyword_1());
		}
		(
			(
				lv_appName_2_0=RULE_STRING
				{
					newLeafNode(lv_appName_2_0, grammarAccess.getAppNameAccess().getAppNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAppNameRule());
					}
					setWithLastConsumed(
						$current,
						"appName",
						lv_appName_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleDependencies
entryRuleDependencies returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDependenciesRule()); }
	iv_ruleDependencies=ruleDependencies
	{ $current=$iv_ruleDependencies.current; }
	EOF;

// Rule Dependencies
ruleDependencies returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
					$current);
			}
		)
		otherlv_1='dependencies'
		{
			newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_3_0());
				}
				lv_dependencies_3_0=ruleDependency
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDependenciesRule());
					}
					add(
						$current,
						"dependencies",
						lv_dependencies_3_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Dependency");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getDependenciesAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_4_1_0());
					}
					lv_dependencies_5_0=ruleDependency
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDependenciesRule());
						}
						add(
							$current,
							"dependencies",
							lv_dependencies_5_0,
							"org.xtext.spring.fluent.SpringFluentDSL.Dependency");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleDependency
entryRuleDependency returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDependencyRule()); }
	iv_ruleDependency=ruleDependency
	{ $current=$iv_ruleDependency.current; }
	EOF;

// Rule Dependency
ruleDependency returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDependencyAccess().getDependencyAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDependencyAccess().getDependencyDependencyTypeEnumRuleCall_1_0());
				}
				lv_dependency_1_0=ruleDependencyType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDependencyRule());
					}
					set(
						$current,
						"dependency",
						lv_dependency_1_0,
						"org.xtext.spring.fluent.SpringFluentDSL.DependencyType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEntities
entryRuleEntities returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntitiesRule()); }
	iv_ruleEntities=ruleEntities
	{ $current=$iv_ruleEntities.current; }
	EOF;

// Rule Entities
ruleEntities returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntitiesAccess().getEntitiesAction_0(),
					$current);
			}
		)
		otherlv_1='entities'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntitiesAccess().getEntitiesKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntitiesAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntitiesAccess().getEntitiesEntityParserRuleCall_3_0());
				}
				lv_entities_3_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntitiesRule());
					}
					add(
						$current,
						"entities",
						lv_entities_3_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntitiesAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
			}
			otherlv_3='['
			{
				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_1());
			}
			otherlv_4='strategy'
			{
				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getStrategyKeyword_2_2());
			}
			otherlv_5='='
			{
				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEqualsSignKeyword_2_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityAccess().getStrategyStrategyParserRuleCall_2_4_0());
					}
					lv_strategy_6_0=ruleStrategy
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						set(
							$current,
							"strategy",
							lv_strategy_6_0,
							"org.xtext.spring.fluent.SpringFluentDSL.Strategy");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=']'
			{
				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_5());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_6_0());
					}
				)
			)
		)?
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getFeatureFeatureParserRuleCall_4_0());
				}
				lv_feature_10_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"feature",
						lv_feature_10_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFeatureAccess().getFeatureAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getOperationOperationParserRuleCall_1_0());
				}
				lv_operation_1_0=ruleOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"operation",
						lv_operation_1_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Operation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getIdIDENTITYParserRuleCall_2_0());
				}
				lv_id_2_0=ruleIDENTITY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"id",
						lv_id_2_0,
						"org.xtext.spring.fluent.SpringFluentDSL.IDENTITY");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getAttributesAttributeParserRuleCall_3_0());
				}
				lv_attributes_3_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_3_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getRelationsRelationParserRuleCall_4_0());
				}
				lv_relations_4_0=ruleRelation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"relations",
						lv_relations_4_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Relation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleStrategy
entryRuleStrategy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStrategyRule()); }
	iv_ruleStrategy=ruleStrategy
	{ $current=$iv_ruleStrategy.current; }
	EOF;

// Rule Strategy
ruleStrategy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStrategyAccess().getStrategyAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_strategy_1_1='SingleTable'
					{
						newLeafNode(lv_strategy_1_1, grammarAccess.getStrategyAccess().getStrategySingleTableKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStrategyRule());
						}
						setWithLastConsumed($current, "strategy", lv_strategy_1_1, null);
					}
					    |
					lv_strategy_1_2='JoinedTable'
					{
						newLeafNode(lv_strategy_1_2, grammarAccess.getStrategyAccess().getStrategyJoinedTableKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStrategyRule());
						}
						setWithLastConsumed($current, "strategy", lv_strategy_1_2, null);
					}
					    |
					lv_strategy_1_3='TablePerClass'
					{
						newLeafNode(lv_strategy_1_3, grammarAccess.getStrategyAccess().getStrategyTablePerClassKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStrategyRule());
						}
						setWithLastConsumed($current, "strategy", lv_strategy_1_3, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleIDENTITY
entryRuleIDENTITY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIDENTITYRule()); }
	iv_ruleIDENTITY=ruleIDENTITY
	{ $current=$iv_ruleIDENTITY.current; }
	EOF;

// Rule IDENTITY
ruleIDENTITY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='id'
		{
			newLeafNode(otherlv_0, grammarAccess.getIDENTITYAccess().getIdKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getIDENTITYAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIDENTITYAccess().getTypeTypeEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIDENTITYRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='pk'
		{
			newLeafNode(otherlv_3, grammarAccess.getIDENTITYAccess().getPkKeyword_3());
		}
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ops'
		{
			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpsKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getColonKeyword_1());
		}
		(
			(
				lv_operation_2_0=RULE_STRING
				{
					newLeafNode(lv_operation_2_0, grammarAccess.getOperationAccess().getOperationSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationRule());
					}
					setWithLastConsumed(
						$current,
						"operation",
						lv_operation_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.xtext.spring.fluent.SpringFluentDSL.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getTargetEntityCrossReference_2_0());
				}
			)
		)
		(
			(
				(
					lv_type_3_1='mto'
					{
						newLeafNode(lv_type_3_1, grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_1, null);
					}
					    |
					lv_type_3_2='otm'
					{
						newLeafNode(lv_type_3_2, grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_2, null);
					}
					    |
					lv_type_3_3='oto'
					{
						newLeafNode(lv_type_3_3, grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_3, null);
					}
					    |
					lv_type_3_4='mtm'
					{
						newLeafNode(lv_type_3_4, grammarAccess.getRelationAccess().getTypeMtmKeyword_3_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_4, null);
					}
				)
			)
		)
	)
;

// Rule DependencyType
ruleDependencyType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='SpringDataJpa'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SpringWeb'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Lombok'
			{
				$current = grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MySQLDriver'
			{
				$current = grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='DevTools'
			{
				$current = grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='SpringKafka'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringKafkaEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getDependencyTypeAccess().getSpringKafkaEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='SpringIntegrationWS'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationWSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getDependencyTypeAccess().getSpringIntegrationWSEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='SpringIntegrationWebFlux'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationWebFluxEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getDependencyTypeAccess().getSpringIntegrationWebFluxEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='SpringIntegrationSecurity'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationSecurityEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getDependencyTypeAccess().getSpringIntegrationSecurityEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='SpringIntegrationRedis'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationRedisEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getDependencyTypeAccess().getSpringIntegrationRedisEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='SpringIntegrationMongoDB'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationMongoDBEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getDependencyTypeAccess().getSpringIntegrationMongoDBEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='SpringIntegrationKafka'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationKafkaEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getDependencyTypeAccess().getSpringIntegrationKafkaEnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='SpringIntegrationJPA'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationJPAEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getDependencyTypeAccess().getSpringIntegrationJPAEnumLiteralDeclaration_12());
			}
		)
		    |
		(
			enumLiteral_13='SpringIntegrationJDBC'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationJDBCEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_13, grammarAccess.getDependencyTypeAccess().getSpringIntegrationJDBCEnumLiteralDeclaration_13());
			}
		)
		    |
		(
			enumLiteral_14='SpringIntegrationHTTP'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationHTTPEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_14, grammarAccess.getDependencyTypeAccess().getSpringIntegrationHTTPEnumLiteralDeclaration_14());
			}
		)
		    |
		(
			enumLiteral_15='SpringIntegrationAMQP'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationAMQPEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_15, grammarAccess.getDependencyTypeAccess().getSpringIntegrationAMQPEnumLiteralDeclaration_15());
			}
		)
		    |
		(
			enumLiteral_16='SpringWebFlux'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringWebFluxEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_16, grammarAccess.getDependencyTypeAccess().getSpringWebFluxEnumLiteralDeclaration_16());
			}
		)
		    |
		(
			enumLiteral_17='SpringWebServices'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringWebServicesEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_17, grammarAccess.getDependencyTypeAccess().getSpringWebServicesEnumLiteralDeclaration_17());
			}
		)
		    |
		(
			enumLiteral_18='SpringValidation'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringValidationEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_18, grammarAccess.getDependencyTypeAccess().getSpringValidationEnumLiteralDeclaration_18());
			}
		)
		    |
		(
			enumLiteral_19='SpringThymeleaf'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringThymeleafEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_19, grammarAccess.getDependencyTypeAccess().getSpringThymeleafEnumLiteralDeclaration_19());
			}
		)
		    |
		(
			enumLiteral_20='SpringOAuth2Client'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringOAuth2ClientEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_20, grammarAccess.getDependencyTypeAccess().getSpringOAuth2ClientEnumLiteralDeclaration_20());
			}
		)
		    |
		(
			enumLiteral_21='SpringJersey'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringJerseyEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_21, grammarAccess.getDependencyTypeAccess().getSpringJerseyEnumLiteralDeclaration_21());
			}
		)
		    |
		(
			enumLiteral_22='SpringJDBC'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringJDBCEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_22, grammarAccess.getDependencyTypeAccess().getSpringJDBCEnumLiteralDeclaration_22());
			}
		)
		    |
		(
			enumLiteral_23='SpringIntegration'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringIntegrationEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_23, grammarAccess.getDependencyTypeAccess().getSpringIntegrationEnumLiteralDeclaration_23());
			}
		)
		    |
		(
			enumLiteral_24='SpringDataRest'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringDataRestEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_24, grammarAccess.getDependencyTypeAccess().getSpringDataRestEnumLiteralDeclaration_24());
			}
		)
		    |
		(
			enumLiteral_25='SpringGraphQL'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringGraphQLEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_25, grammarAccess.getDependencyTypeAccess().getSpringGraphQLEnumLiteralDeclaration_25());
			}
		)
		    |
		(
			enumLiteral_26='SpringDataElasticsearch'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringDataElasticsearchEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_26, grammarAccess.getDependencyTypeAccess().getSpringDataElasticsearchEnumLiteralDeclaration_26());
			}
		)
		    |
		(
			enumLiteral_27='SpringDataJDBC'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringDataJDBCEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_27, grammarAccess.getDependencyTypeAccess().getSpringDataJDBCEnumLiteralDeclaration_27());
			}
		)
		    |
		(
			enumLiteral_28='SpringDataMongoDB'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringDataMongoDBEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_28, grammarAccess.getDependencyTypeAccess().getSpringDataMongoDBEnumLiteralDeclaration_28());
			}
		)
		    |
		(
			enumLiteral_29='Swagger'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_29, grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_29());
			}
		)
		    |
		(
			enumLiteral_30='SpringSecurity'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_30, grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_30());
			}
		)
		    |
		(
			enumLiteral_31='SpringActuator'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringActuatorEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_31, grammarAccess.getDependencyTypeAccess().getSpringActuatorEnumLiteralDeclaration_31());
			}
		)
		    |
		(
			enumLiteral_32='SpringGraphQLTest'
			{
				$current = grammarAccess.getDependencyTypeAccess().getSpringGraphQLTestEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_32, grammarAccess.getDependencyTypeAccess().getSpringGraphQLTestEnumLiteralDeclaration_32());
			}
		)
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Long'
			{
				$current = grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Integer'
			{
				$current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Double'
			{
				$current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='String'
			{
				$current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Date'
			{
				$current = grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='Time'
			{
				$current = grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='Boolean'
			{
				$current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
