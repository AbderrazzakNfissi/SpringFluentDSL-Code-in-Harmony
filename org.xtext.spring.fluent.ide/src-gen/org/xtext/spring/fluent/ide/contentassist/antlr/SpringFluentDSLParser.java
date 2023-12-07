/*
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.spring.fluent.ide.contentassist.antlr.internal.InternalSpringFluentDSLParser;
import org.xtext.spring.fluent.services.SpringFluentDSLGrammarAccess;

public class SpringFluentDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SpringFluentDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SpringFluentDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStrategyAccess().getStrategyAlternatives_1_0(), "rule__Strategy__StrategyAlternatives_1_0");
			builder.put(grammarAccess.getRelationAccess().getTypeAlternatives_3_0(), "rule__Relation__TypeAlternatives_3_0");
			builder.put(grammarAccess.getDependencyTypeAccess().getAlternatives(), "rule__DependencyType__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getPrefixAccess().getGroup(), "rule__Prefix__Group__0");
			builder.put(grammarAccess.getAppNameAccess().getGroup(), "rule__AppName__Group__0");
			builder.put(grammarAccess.getDependenciesAccess().getGroup(), "rule__Dependencies__Group__0");
			builder.put(grammarAccess.getDependenciesAccess().getGroup_4(), "rule__Dependencies__Group_4__0");
			builder.put(grammarAccess.getDependencyAccess().getGroup(), "rule__Dependency__Group__0");
			builder.put(grammarAccess.getEntitiesAccess().getGroup(), "rule__Entities__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getStrategyAccess().getGroup(), "rule__Strategy__Group__0");
			builder.put(grammarAccess.getIDENTITYAccess().getGroup(), "rule__IDENTITY__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
			builder.put(grammarAccess.getModelAccess().getPrefixAssignment_0(), "rule__Model__PrefixAssignment_0");
			builder.put(grammarAccess.getModelAccess().getAppNameAssignment_1(), "rule__Model__AppNameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getDependenciesAssignment_2(), "rule__Model__DependenciesAssignment_2");
			builder.put(grammarAccess.getModelAccess().getEntitiesAssignment_3(), "rule__Model__EntitiesAssignment_3");
			builder.put(grammarAccess.getPrefixAccess().getPrefixAssignment_2(), "rule__Prefix__PrefixAssignment_2");
			builder.put(grammarAccess.getAppNameAccess().getAppNameAssignment_2(), "rule__AppName__AppNameAssignment_2");
			builder.put(grammarAccess.getDependenciesAccess().getDependenciesAssignment_3(), "rule__Dependencies__DependenciesAssignment_3");
			builder.put(grammarAccess.getDependenciesAccess().getDependenciesAssignment_4_1(), "rule__Dependencies__DependenciesAssignment_4_1");
			builder.put(grammarAccess.getDependencyAccess().getDependencyAssignment_1(), "rule__Dependency__DependencyAssignment_1");
			builder.put(grammarAccess.getEntitiesAccess().getEntitiesAssignment_3(), "rule__Entities__EntitiesAssignment_3");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getStrategyAssignment_2_4(), "rule__Entity__StrategyAssignment_2_4");
			builder.put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_6(), "rule__Entity__SuperTypeAssignment_2_6");
			builder.put(grammarAccess.getEntityAccess().getFeatureAssignment_4(), "rule__Entity__FeatureAssignment_4");
			builder.put(grammarAccess.getFeatureAccess().getOperationAssignment_1(), "rule__Feature__OperationAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getIdAssignment_2(), "rule__Feature__IdAssignment_2");
			builder.put(grammarAccess.getFeatureAccess().getAttributesAssignment_3(), "rule__Feature__AttributesAssignment_3");
			builder.put(grammarAccess.getFeatureAccess().getRelationsAssignment_4(), "rule__Feature__RelationsAssignment_4");
			builder.put(grammarAccess.getStrategyAccess().getStrategyAssignment_1(), "rule__Strategy__StrategyAssignment_1");
			builder.put(grammarAccess.getIDENTITYAccess().getTypeAssignment_2(), "rule__IDENTITY__TypeAssignment_2");
			builder.put(grammarAccess.getOperationAccess().getOperationAssignment_2(), "rule__Operation__OperationAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_2(), "rule__Attribute__TypeAssignment_2");
			builder.put(grammarAccess.getRelationAccess().getNameAssignment_0(), "rule__Relation__NameAssignment_0");
			builder.put(grammarAccess.getRelationAccess().getTargetAssignment_2(), "rule__Relation__TargetAssignment_2");
			builder.put(grammarAccess.getRelationAccess().getTypeAssignment_3(), "rule__Relation__TypeAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SpringFluentDSLGrammarAccess grammarAccess;

	@Override
	protected InternalSpringFluentDSLParser createParser() {
		InternalSpringFluentDSLParser result = new InternalSpringFluentDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SpringFluentDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SpringFluentDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
