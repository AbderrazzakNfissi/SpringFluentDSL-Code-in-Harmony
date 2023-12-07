package org.xtext.spring.fluent.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.spring.fluent.services.SpringFluentDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpringFluentDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SingleTable'", "'JoinedTable'", "'TablePerClass'", "'mto'", "'otm'", "'oto'", "'mtm'", "'SpringDataJpa'", "'SpringWeb'", "'Lombok'", "'MySQLDriver'", "'DevTools'", "'SpringKafka'", "'SpringIntegrationWS'", "'SpringIntegrationWebFlux'", "'SpringIntegrationSecurity'", "'SpringIntegrationRedis'", "'SpringIntegrationMongoDB'", "'SpringIntegrationKafka'", "'SpringIntegrationJPA'", "'SpringIntegrationJDBC'", "'SpringIntegrationHTTP'", "'SpringIntegrationAMQP'", "'SpringWebFlux'", "'SpringWebServices'", "'SpringValidation'", "'SpringThymeleaf'", "'SpringOAuth2Client'", "'SpringJersey'", "'SpringJDBC'", "'SpringIntegration'", "'SpringDataRest'", "'SpringGraphQL'", "'SpringDataElasticsearch'", "'SpringDataJDBC'", "'SpringDataMongoDB'", "'Swagger'", "'SpringSecurity'", "'SpringActuator'", "'SpringGraphQLTest'", "'Long'", "'Integer'", "'Double'", "'String'", "'Date'", "'Time'", "'Boolean'", "'prefix:'", "'app_name:'", "'dependencies'", "'{'", "'}'", "','", "'entities'", "'entity'", "'extends'", "'['", "'strategy'", "'='", "']'", "'id'", "':'", "'pk'", "'ops'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSpringFluentDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpringFluentDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpringFluentDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpringFluentDSL.g"; }


    	private SpringFluentDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SpringFluentDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSpringFluentDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:54:1: ( ruleModel EOF )
            // InternalSpringFluentDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpringFluentDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSpringFluentDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSpringFluentDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSpringFluentDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalSpringFluentDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePrefix"
    // InternalSpringFluentDSL.g:78:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:79:1: ( rulePrefix EOF )
            // InternalSpringFluentDSL.g:80:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalSpringFluentDSL.g:87:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:91:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalSpringFluentDSL.g:92:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:92:2: ( ( rule__Prefix__Group__0 ) )
            // InternalSpringFluentDSL.g:93:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalSpringFluentDSL.g:94:3: ( rule__Prefix__Group__0 )
            // InternalSpringFluentDSL.g:94:4: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleAppName"
    // InternalSpringFluentDSL.g:103:1: entryRuleAppName : ruleAppName EOF ;
    public final void entryRuleAppName() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:104:1: ( ruleAppName EOF )
            // InternalSpringFluentDSL.g:105:1: ruleAppName EOF
            {
             before(grammarAccess.getAppNameRule()); 
            pushFollow(FOLLOW_1);
            ruleAppName();

            state._fsp--;

             after(grammarAccess.getAppNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppName"


    // $ANTLR start "ruleAppName"
    // InternalSpringFluentDSL.g:112:1: ruleAppName : ( ( rule__AppName__Group__0 ) ) ;
    public final void ruleAppName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:116:2: ( ( ( rule__AppName__Group__0 ) ) )
            // InternalSpringFluentDSL.g:117:2: ( ( rule__AppName__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:117:2: ( ( rule__AppName__Group__0 ) )
            // InternalSpringFluentDSL.g:118:3: ( rule__AppName__Group__0 )
            {
             before(grammarAccess.getAppNameAccess().getGroup()); 
            // InternalSpringFluentDSL.g:119:3: ( rule__AppName__Group__0 )
            // InternalSpringFluentDSL.g:119:4: rule__AppName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppName"


    // $ANTLR start "entryRuleDependencies"
    // InternalSpringFluentDSL.g:128:1: entryRuleDependencies : ruleDependencies EOF ;
    public final void entryRuleDependencies() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:129:1: ( ruleDependencies EOF )
            // InternalSpringFluentDSL.g:130:1: ruleDependencies EOF
            {
             before(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_1);
            ruleDependencies();

            state._fsp--;

             after(grammarAccess.getDependenciesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependencies"


    // $ANTLR start "ruleDependencies"
    // InternalSpringFluentDSL.g:137:1: ruleDependencies : ( ( rule__Dependencies__Group__0 ) ) ;
    public final void ruleDependencies() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:141:2: ( ( ( rule__Dependencies__Group__0 ) ) )
            // InternalSpringFluentDSL.g:142:2: ( ( rule__Dependencies__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:142:2: ( ( rule__Dependencies__Group__0 ) )
            // InternalSpringFluentDSL.g:143:3: ( rule__Dependencies__Group__0 )
            {
             before(grammarAccess.getDependenciesAccess().getGroup()); 
            // InternalSpringFluentDSL.g:144:3: ( rule__Dependencies__Group__0 )
            // InternalSpringFluentDSL.g:144:4: rule__Dependencies__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dependencies__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependenciesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependencies"


    // $ANTLR start "entryRuleDependency"
    // InternalSpringFluentDSL.g:153:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:154:1: ( ruleDependency EOF )
            // InternalSpringFluentDSL.g:155:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalSpringFluentDSL.g:162:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:166:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // InternalSpringFluentDSL.g:167:2: ( ( rule__Dependency__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:167:2: ( ( rule__Dependency__Group__0 ) )
            // InternalSpringFluentDSL.g:168:3: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // InternalSpringFluentDSL.g:169:3: ( rule__Dependency__Group__0 )
            // InternalSpringFluentDSL.g:169:4: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleEntities"
    // InternalSpringFluentDSL.g:178:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:179:1: ( ruleEntities EOF )
            // InternalSpringFluentDSL.g:180:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalSpringFluentDSL.g:187:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:191:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalSpringFluentDSL.g:192:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:192:2: ( ( rule__Entities__Group__0 ) )
            // InternalSpringFluentDSL.g:193:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalSpringFluentDSL.g:194:3: ( rule__Entities__Group__0 )
            // InternalSpringFluentDSL.g:194:4: rule__Entities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleEntity"
    // InternalSpringFluentDSL.g:203:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:204:1: ( ruleEntity EOF )
            // InternalSpringFluentDSL.g:205:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSpringFluentDSL.g:212:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:216:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalSpringFluentDSL.g:217:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:217:2: ( ( rule__Entity__Group__0 ) )
            // InternalSpringFluentDSL.g:218:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalSpringFluentDSL.g:219:3: ( rule__Entity__Group__0 )
            // InternalSpringFluentDSL.g:219:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalSpringFluentDSL.g:228:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:229:1: ( ruleFeature EOF )
            // InternalSpringFluentDSL.g:230:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSpringFluentDSL.g:237:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:241:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalSpringFluentDSL.g:242:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:242:2: ( ( rule__Feature__Group__0 ) )
            // InternalSpringFluentDSL.g:243:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalSpringFluentDSL.g:244:3: ( rule__Feature__Group__0 )
            // InternalSpringFluentDSL.g:244:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStrategy"
    // InternalSpringFluentDSL.g:253:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:254:1: ( ruleStrategy EOF )
            // InternalSpringFluentDSL.g:255:1: ruleStrategy EOF
            {
             before(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getStrategyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalSpringFluentDSL.g:262:1: ruleStrategy : ( ( rule__Strategy__Group__0 ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:266:2: ( ( ( rule__Strategy__Group__0 ) ) )
            // InternalSpringFluentDSL.g:267:2: ( ( rule__Strategy__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:267:2: ( ( rule__Strategy__Group__0 ) )
            // InternalSpringFluentDSL.g:268:3: ( rule__Strategy__Group__0 )
            {
             before(grammarAccess.getStrategyAccess().getGroup()); 
            // InternalSpringFluentDSL.g:269:3: ( rule__Strategy__Group__0 )
            // InternalSpringFluentDSL.g:269:4: rule__Strategy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleIDENTITY"
    // InternalSpringFluentDSL.g:278:1: entryRuleIDENTITY : ruleIDENTITY EOF ;
    public final void entryRuleIDENTITY() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:279:1: ( ruleIDENTITY EOF )
            // InternalSpringFluentDSL.g:280:1: ruleIDENTITY EOF
            {
             before(grammarAccess.getIDENTITYRule()); 
            pushFollow(FOLLOW_1);
            ruleIDENTITY();

            state._fsp--;

             after(grammarAccess.getIDENTITYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDENTITY"


    // $ANTLR start "ruleIDENTITY"
    // InternalSpringFluentDSL.g:287:1: ruleIDENTITY : ( ( rule__IDENTITY__Group__0 ) ) ;
    public final void ruleIDENTITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:291:2: ( ( ( rule__IDENTITY__Group__0 ) ) )
            // InternalSpringFluentDSL.g:292:2: ( ( rule__IDENTITY__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:292:2: ( ( rule__IDENTITY__Group__0 ) )
            // InternalSpringFluentDSL.g:293:3: ( rule__IDENTITY__Group__0 )
            {
             before(grammarAccess.getIDENTITYAccess().getGroup()); 
            // InternalSpringFluentDSL.g:294:3: ( rule__IDENTITY__Group__0 )
            // InternalSpringFluentDSL.g:294:4: rule__IDENTITY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IDENTITY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIDENTITYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDENTITY"


    // $ANTLR start "entryRuleOperation"
    // InternalSpringFluentDSL.g:303:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:304:1: ( ruleOperation EOF )
            // InternalSpringFluentDSL.g:305:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSpringFluentDSL.g:312:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:316:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalSpringFluentDSL.g:317:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:317:2: ( ( rule__Operation__Group__0 ) )
            // InternalSpringFluentDSL.g:318:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalSpringFluentDSL.g:319:3: ( rule__Operation__Group__0 )
            // InternalSpringFluentDSL.g:319:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAttribute"
    // InternalSpringFluentDSL.g:328:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:329:1: ( ruleAttribute EOF )
            // InternalSpringFluentDSL.g:330:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSpringFluentDSL.g:337:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:341:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSpringFluentDSL.g:342:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:342:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSpringFluentDSL.g:343:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSpringFluentDSL.g:344:3: ( rule__Attribute__Group__0 )
            // InternalSpringFluentDSL.g:344:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalSpringFluentDSL.g:353:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:354:1: ( ruleRelation EOF )
            // InternalSpringFluentDSL.g:355:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSpringFluentDSL.g:362:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:366:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalSpringFluentDSL.g:367:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:367:2: ( ( rule__Relation__Group__0 ) )
            // InternalSpringFluentDSL.g:368:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalSpringFluentDSL.g:369:3: ( rule__Relation__Group__0 )
            // InternalSpringFluentDSL.g:369:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "ruleDependencyType"
    // InternalSpringFluentDSL.g:378:1: ruleDependencyType : ( ( rule__DependencyType__Alternatives ) ) ;
    public final void ruleDependencyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:382:1: ( ( ( rule__DependencyType__Alternatives ) ) )
            // InternalSpringFluentDSL.g:383:2: ( ( rule__DependencyType__Alternatives ) )
            {
            // InternalSpringFluentDSL.g:383:2: ( ( rule__DependencyType__Alternatives ) )
            // InternalSpringFluentDSL.g:384:3: ( rule__DependencyType__Alternatives )
            {
             before(grammarAccess.getDependencyTypeAccess().getAlternatives()); 
            // InternalSpringFluentDSL.g:385:3: ( rule__DependencyType__Alternatives )
            // InternalSpringFluentDSL.g:385:4: rule__DependencyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DependencyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependencyType"


    // $ANTLR start "ruleType"
    // InternalSpringFluentDSL.g:394:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:398:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSpringFluentDSL.g:399:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSpringFluentDSL.g:399:2: ( ( rule__Type__Alternatives ) )
            // InternalSpringFluentDSL.g:400:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSpringFluentDSL.g:401:3: ( rule__Type__Alternatives )
            // InternalSpringFluentDSL.g:401:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Strategy__StrategyAlternatives_1_0"
    // InternalSpringFluentDSL.g:409:1: rule__Strategy__StrategyAlternatives_1_0 : ( ( 'SingleTable' ) | ( 'JoinedTable' ) | ( 'TablePerClass' ) );
    public final void rule__Strategy__StrategyAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:413:1: ( ( 'SingleTable' ) | ( 'JoinedTable' ) | ( 'TablePerClass' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSpringFluentDSL.g:414:2: ( 'SingleTable' )
                    {
                    // InternalSpringFluentDSL.g:414:2: ( 'SingleTable' )
                    // InternalSpringFluentDSL.g:415:3: 'SingleTable'
                    {
                     before(grammarAccess.getStrategyAccess().getStrategySingleTableKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getStrategySingleTableKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:420:2: ( 'JoinedTable' )
                    {
                    // InternalSpringFluentDSL.g:420:2: ( 'JoinedTable' )
                    // InternalSpringFluentDSL.g:421:3: 'JoinedTable'
                    {
                     before(grammarAccess.getStrategyAccess().getStrategyJoinedTableKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getStrategyJoinedTableKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:426:2: ( 'TablePerClass' )
                    {
                    // InternalSpringFluentDSL.g:426:2: ( 'TablePerClass' )
                    // InternalSpringFluentDSL.g:427:3: 'TablePerClass'
                    {
                     before(grammarAccess.getStrategyAccess().getStrategyTablePerClassKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getStrategyTablePerClassKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__StrategyAlternatives_1_0"


    // $ANTLR start "rule__Relation__TypeAlternatives_3_0"
    // InternalSpringFluentDSL.g:436:1: rule__Relation__TypeAlternatives_3_0 : ( ( 'mto' ) | ( 'otm' ) | ( 'oto' ) | ( 'mtm' ) );
    public final void rule__Relation__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:440:1: ( ( 'mto' ) | ( 'otm' ) | ( 'oto' ) | ( 'mtm' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSpringFluentDSL.g:441:2: ( 'mto' )
                    {
                    // InternalSpringFluentDSL.g:441:2: ( 'mto' )
                    // InternalSpringFluentDSL.g:442:3: 'mto'
                    {
                     before(grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:447:2: ( 'otm' )
                    {
                    // InternalSpringFluentDSL.g:447:2: ( 'otm' )
                    // InternalSpringFluentDSL.g:448:3: 'otm'
                    {
                     before(grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:453:2: ( 'oto' )
                    {
                    // InternalSpringFluentDSL.g:453:2: ( 'oto' )
                    // InternalSpringFluentDSL.g:454:3: 'oto'
                    {
                     before(grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:459:2: ( 'mtm' )
                    {
                    // InternalSpringFluentDSL.g:459:2: ( 'mtm' )
                    // InternalSpringFluentDSL.g:460:3: 'mtm'
                    {
                     before(grammarAccess.getRelationAccess().getTypeMtmKeyword_3_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeMtmKeyword_3_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAlternatives_3_0"


    // $ANTLR start "rule__DependencyType__Alternatives"
    // InternalSpringFluentDSL.g:469:1: rule__DependencyType__Alternatives : ( ( ( 'SpringDataJpa' ) ) | ( ( 'SpringWeb' ) ) | ( ( 'Lombok' ) ) | ( ( 'MySQLDriver' ) ) | ( ( 'DevTools' ) ) | ( ( 'SpringKafka' ) ) | ( ( 'SpringIntegrationWS' ) ) | ( ( 'SpringIntegrationWebFlux' ) ) | ( ( 'SpringIntegrationSecurity' ) ) | ( ( 'SpringIntegrationRedis' ) ) | ( ( 'SpringIntegrationMongoDB' ) ) | ( ( 'SpringIntegrationKafka' ) ) | ( ( 'SpringIntegrationJPA' ) ) | ( ( 'SpringIntegrationJDBC' ) ) | ( ( 'SpringIntegrationHTTP' ) ) | ( ( 'SpringIntegrationAMQP' ) ) | ( ( 'SpringWebFlux' ) ) | ( ( 'SpringWebServices' ) ) | ( ( 'SpringValidation' ) ) | ( ( 'SpringThymeleaf' ) ) | ( ( 'SpringOAuth2Client' ) ) | ( ( 'SpringJersey' ) ) | ( ( 'SpringJDBC' ) ) | ( ( 'SpringIntegration' ) ) | ( ( 'SpringDataRest' ) ) | ( ( 'SpringGraphQL' ) ) | ( ( 'SpringDataElasticsearch' ) ) | ( ( 'SpringDataJDBC' ) ) | ( ( 'SpringDataMongoDB' ) ) | ( ( 'Swagger' ) ) | ( ( 'SpringSecurity' ) ) | ( ( 'SpringActuator' ) ) | ( ( 'SpringGraphQLTest' ) ) );
    public final void rule__DependencyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:473:1: ( ( ( 'SpringDataJpa' ) ) | ( ( 'SpringWeb' ) ) | ( ( 'Lombok' ) ) | ( ( 'MySQLDriver' ) ) | ( ( 'DevTools' ) ) | ( ( 'SpringKafka' ) ) | ( ( 'SpringIntegrationWS' ) ) | ( ( 'SpringIntegrationWebFlux' ) ) | ( ( 'SpringIntegrationSecurity' ) ) | ( ( 'SpringIntegrationRedis' ) ) | ( ( 'SpringIntegrationMongoDB' ) ) | ( ( 'SpringIntegrationKafka' ) ) | ( ( 'SpringIntegrationJPA' ) ) | ( ( 'SpringIntegrationJDBC' ) ) | ( ( 'SpringIntegrationHTTP' ) ) | ( ( 'SpringIntegrationAMQP' ) ) | ( ( 'SpringWebFlux' ) ) | ( ( 'SpringWebServices' ) ) | ( ( 'SpringValidation' ) ) | ( ( 'SpringThymeleaf' ) ) | ( ( 'SpringOAuth2Client' ) ) | ( ( 'SpringJersey' ) ) | ( ( 'SpringJDBC' ) ) | ( ( 'SpringIntegration' ) ) | ( ( 'SpringDataRest' ) ) | ( ( 'SpringGraphQL' ) ) | ( ( 'SpringDataElasticsearch' ) ) | ( ( 'SpringDataJDBC' ) ) | ( ( 'SpringDataMongoDB' ) ) | ( ( 'Swagger' ) ) | ( ( 'SpringSecurity' ) ) | ( ( 'SpringActuator' ) ) | ( ( 'SpringGraphQLTest' ) ) )
            int alt3=33;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            case 24:
                {
                alt3=7;
                }
                break;
            case 25:
                {
                alt3=8;
                }
                break;
            case 26:
                {
                alt3=9;
                }
                break;
            case 27:
                {
                alt3=10;
                }
                break;
            case 28:
                {
                alt3=11;
                }
                break;
            case 29:
                {
                alt3=12;
                }
                break;
            case 30:
                {
                alt3=13;
                }
                break;
            case 31:
                {
                alt3=14;
                }
                break;
            case 32:
                {
                alt3=15;
                }
                break;
            case 33:
                {
                alt3=16;
                }
                break;
            case 34:
                {
                alt3=17;
                }
                break;
            case 35:
                {
                alt3=18;
                }
                break;
            case 36:
                {
                alt3=19;
                }
                break;
            case 37:
                {
                alt3=20;
                }
                break;
            case 38:
                {
                alt3=21;
                }
                break;
            case 39:
                {
                alt3=22;
                }
                break;
            case 40:
                {
                alt3=23;
                }
                break;
            case 41:
                {
                alt3=24;
                }
                break;
            case 42:
                {
                alt3=25;
                }
                break;
            case 43:
                {
                alt3=26;
                }
                break;
            case 44:
                {
                alt3=27;
                }
                break;
            case 45:
                {
                alt3=28;
                }
                break;
            case 46:
                {
                alt3=29;
                }
                break;
            case 47:
                {
                alt3=30;
                }
                break;
            case 48:
                {
                alt3=31;
                }
                break;
            case 49:
                {
                alt3=32;
                }
                break;
            case 50:
                {
                alt3=33;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpringFluentDSL.g:474:2: ( ( 'SpringDataJpa' ) )
                    {
                    // InternalSpringFluentDSL.g:474:2: ( ( 'SpringDataJpa' ) )
                    // InternalSpringFluentDSL.g:475:3: ( 'SpringDataJpa' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0()); 
                    // InternalSpringFluentDSL.g:476:3: ( 'SpringDataJpa' )
                    // InternalSpringFluentDSL.g:476:4: 'SpringDataJpa'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:480:2: ( ( 'SpringWeb' ) )
                    {
                    // InternalSpringFluentDSL.g:480:2: ( ( 'SpringWeb' ) )
                    // InternalSpringFluentDSL.g:481:3: ( 'SpringWeb' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1()); 
                    // InternalSpringFluentDSL.g:482:3: ( 'SpringWeb' )
                    // InternalSpringFluentDSL.g:482:4: 'SpringWeb'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:486:2: ( ( 'Lombok' ) )
                    {
                    // InternalSpringFluentDSL.g:486:2: ( ( 'Lombok' ) )
                    // InternalSpringFluentDSL.g:487:3: ( 'Lombok' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2()); 
                    // InternalSpringFluentDSL.g:488:3: ( 'Lombok' )
                    // InternalSpringFluentDSL.g:488:4: 'Lombok'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:492:2: ( ( 'MySQLDriver' ) )
                    {
                    // InternalSpringFluentDSL.g:492:2: ( ( 'MySQLDriver' ) )
                    // InternalSpringFluentDSL.g:493:3: ( 'MySQLDriver' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3()); 
                    // InternalSpringFluentDSL.g:494:3: ( 'MySQLDriver' )
                    // InternalSpringFluentDSL.g:494:4: 'MySQLDriver'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:498:2: ( ( 'DevTools' ) )
                    {
                    // InternalSpringFluentDSL.g:498:2: ( ( 'DevTools' ) )
                    // InternalSpringFluentDSL.g:499:3: ( 'DevTools' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4()); 
                    // InternalSpringFluentDSL.g:500:3: ( 'DevTools' )
                    // InternalSpringFluentDSL.g:500:4: 'DevTools'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:504:2: ( ( 'SpringKafka' ) )
                    {
                    // InternalSpringFluentDSL.g:504:2: ( ( 'SpringKafka' ) )
                    // InternalSpringFluentDSL.g:505:3: ( 'SpringKafka' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringKafkaEnumLiteralDeclaration_5()); 
                    // InternalSpringFluentDSL.g:506:3: ( 'SpringKafka' )
                    // InternalSpringFluentDSL.g:506:4: 'SpringKafka'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringKafkaEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:510:2: ( ( 'SpringIntegrationWS' ) )
                    {
                    // InternalSpringFluentDSL.g:510:2: ( ( 'SpringIntegrationWS' ) )
                    // InternalSpringFluentDSL.g:511:3: ( 'SpringIntegrationWS' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationWSEnumLiteralDeclaration_6()); 
                    // InternalSpringFluentDSL.g:512:3: ( 'SpringIntegrationWS' )
                    // InternalSpringFluentDSL.g:512:4: 'SpringIntegrationWS'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationWSEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpringFluentDSL.g:516:2: ( ( 'SpringIntegrationWebFlux' ) )
                    {
                    // InternalSpringFluentDSL.g:516:2: ( ( 'SpringIntegrationWebFlux' ) )
                    // InternalSpringFluentDSL.g:517:3: ( 'SpringIntegrationWebFlux' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationWebFluxEnumLiteralDeclaration_7()); 
                    // InternalSpringFluentDSL.g:518:3: ( 'SpringIntegrationWebFlux' )
                    // InternalSpringFluentDSL.g:518:4: 'SpringIntegrationWebFlux'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationWebFluxEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSpringFluentDSL.g:522:2: ( ( 'SpringIntegrationSecurity' ) )
                    {
                    // InternalSpringFluentDSL.g:522:2: ( ( 'SpringIntegrationSecurity' ) )
                    // InternalSpringFluentDSL.g:523:3: ( 'SpringIntegrationSecurity' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationSecurityEnumLiteralDeclaration_8()); 
                    // InternalSpringFluentDSL.g:524:3: ( 'SpringIntegrationSecurity' )
                    // InternalSpringFluentDSL.g:524:4: 'SpringIntegrationSecurity'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationSecurityEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSpringFluentDSL.g:528:2: ( ( 'SpringIntegrationRedis' ) )
                    {
                    // InternalSpringFluentDSL.g:528:2: ( ( 'SpringIntegrationRedis' ) )
                    // InternalSpringFluentDSL.g:529:3: ( 'SpringIntegrationRedis' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationRedisEnumLiteralDeclaration_9()); 
                    // InternalSpringFluentDSL.g:530:3: ( 'SpringIntegrationRedis' )
                    // InternalSpringFluentDSL.g:530:4: 'SpringIntegrationRedis'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationRedisEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSpringFluentDSL.g:534:2: ( ( 'SpringIntegrationMongoDB' ) )
                    {
                    // InternalSpringFluentDSL.g:534:2: ( ( 'SpringIntegrationMongoDB' ) )
                    // InternalSpringFluentDSL.g:535:3: ( 'SpringIntegrationMongoDB' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationMongoDBEnumLiteralDeclaration_10()); 
                    // InternalSpringFluentDSL.g:536:3: ( 'SpringIntegrationMongoDB' )
                    // InternalSpringFluentDSL.g:536:4: 'SpringIntegrationMongoDB'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationMongoDBEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSpringFluentDSL.g:540:2: ( ( 'SpringIntegrationKafka' ) )
                    {
                    // InternalSpringFluentDSL.g:540:2: ( ( 'SpringIntegrationKafka' ) )
                    // InternalSpringFluentDSL.g:541:3: ( 'SpringIntegrationKafka' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationKafkaEnumLiteralDeclaration_11()); 
                    // InternalSpringFluentDSL.g:542:3: ( 'SpringIntegrationKafka' )
                    // InternalSpringFluentDSL.g:542:4: 'SpringIntegrationKafka'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationKafkaEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSpringFluentDSL.g:546:2: ( ( 'SpringIntegrationJPA' ) )
                    {
                    // InternalSpringFluentDSL.g:546:2: ( ( 'SpringIntegrationJPA' ) )
                    // InternalSpringFluentDSL.g:547:3: ( 'SpringIntegrationJPA' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationJPAEnumLiteralDeclaration_12()); 
                    // InternalSpringFluentDSL.g:548:3: ( 'SpringIntegrationJPA' )
                    // InternalSpringFluentDSL.g:548:4: 'SpringIntegrationJPA'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationJPAEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSpringFluentDSL.g:552:2: ( ( 'SpringIntegrationJDBC' ) )
                    {
                    // InternalSpringFluentDSL.g:552:2: ( ( 'SpringIntegrationJDBC' ) )
                    // InternalSpringFluentDSL.g:553:3: ( 'SpringIntegrationJDBC' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationJDBCEnumLiteralDeclaration_13()); 
                    // InternalSpringFluentDSL.g:554:3: ( 'SpringIntegrationJDBC' )
                    // InternalSpringFluentDSL.g:554:4: 'SpringIntegrationJDBC'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationJDBCEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSpringFluentDSL.g:558:2: ( ( 'SpringIntegrationHTTP' ) )
                    {
                    // InternalSpringFluentDSL.g:558:2: ( ( 'SpringIntegrationHTTP' ) )
                    // InternalSpringFluentDSL.g:559:3: ( 'SpringIntegrationHTTP' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationHTTPEnumLiteralDeclaration_14()); 
                    // InternalSpringFluentDSL.g:560:3: ( 'SpringIntegrationHTTP' )
                    // InternalSpringFluentDSL.g:560:4: 'SpringIntegrationHTTP'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationHTTPEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSpringFluentDSL.g:564:2: ( ( 'SpringIntegrationAMQP' ) )
                    {
                    // InternalSpringFluentDSL.g:564:2: ( ( 'SpringIntegrationAMQP' ) )
                    // InternalSpringFluentDSL.g:565:3: ( 'SpringIntegrationAMQP' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationAMQPEnumLiteralDeclaration_15()); 
                    // InternalSpringFluentDSL.g:566:3: ( 'SpringIntegrationAMQP' )
                    // InternalSpringFluentDSL.g:566:4: 'SpringIntegrationAMQP'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationAMQPEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSpringFluentDSL.g:570:2: ( ( 'SpringWebFlux' ) )
                    {
                    // InternalSpringFluentDSL.g:570:2: ( ( 'SpringWebFlux' ) )
                    // InternalSpringFluentDSL.g:571:3: ( 'SpringWebFlux' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringWebFluxEnumLiteralDeclaration_16()); 
                    // InternalSpringFluentDSL.g:572:3: ( 'SpringWebFlux' )
                    // InternalSpringFluentDSL.g:572:4: 'SpringWebFlux'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringWebFluxEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSpringFluentDSL.g:576:2: ( ( 'SpringWebServices' ) )
                    {
                    // InternalSpringFluentDSL.g:576:2: ( ( 'SpringWebServices' ) )
                    // InternalSpringFluentDSL.g:577:3: ( 'SpringWebServices' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringWebServicesEnumLiteralDeclaration_17()); 
                    // InternalSpringFluentDSL.g:578:3: ( 'SpringWebServices' )
                    // InternalSpringFluentDSL.g:578:4: 'SpringWebServices'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringWebServicesEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSpringFluentDSL.g:582:2: ( ( 'SpringValidation' ) )
                    {
                    // InternalSpringFluentDSL.g:582:2: ( ( 'SpringValidation' ) )
                    // InternalSpringFluentDSL.g:583:3: ( 'SpringValidation' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringValidationEnumLiteralDeclaration_18()); 
                    // InternalSpringFluentDSL.g:584:3: ( 'SpringValidation' )
                    // InternalSpringFluentDSL.g:584:4: 'SpringValidation'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringValidationEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSpringFluentDSL.g:588:2: ( ( 'SpringThymeleaf' ) )
                    {
                    // InternalSpringFluentDSL.g:588:2: ( ( 'SpringThymeleaf' ) )
                    // InternalSpringFluentDSL.g:589:3: ( 'SpringThymeleaf' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringThymeleafEnumLiteralDeclaration_19()); 
                    // InternalSpringFluentDSL.g:590:3: ( 'SpringThymeleaf' )
                    // InternalSpringFluentDSL.g:590:4: 'SpringThymeleaf'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringThymeleafEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSpringFluentDSL.g:594:2: ( ( 'SpringOAuth2Client' ) )
                    {
                    // InternalSpringFluentDSL.g:594:2: ( ( 'SpringOAuth2Client' ) )
                    // InternalSpringFluentDSL.g:595:3: ( 'SpringOAuth2Client' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringOAuth2ClientEnumLiteralDeclaration_20()); 
                    // InternalSpringFluentDSL.g:596:3: ( 'SpringOAuth2Client' )
                    // InternalSpringFluentDSL.g:596:4: 'SpringOAuth2Client'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringOAuth2ClientEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalSpringFluentDSL.g:600:2: ( ( 'SpringJersey' ) )
                    {
                    // InternalSpringFluentDSL.g:600:2: ( ( 'SpringJersey' ) )
                    // InternalSpringFluentDSL.g:601:3: ( 'SpringJersey' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringJerseyEnumLiteralDeclaration_21()); 
                    // InternalSpringFluentDSL.g:602:3: ( 'SpringJersey' )
                    // InternalSpringFluentDSL.g:602:4: 'SpringJersey'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringJerseyEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalSpringFluentDSL.g:606:2: ( ( 'SpringJDBC' ) )
                    {
                    // InternalSpringFluentDSL.g:606:2: ( ( 'SpringJDBC' ) )
                    // InternalSpringFluentDSL.g:607:3: ( 'SpringJDBC' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringJDBCEnumLiteralDeclaration_22()); 
                    // InternalSpringFluentDSL.g:608:3: ( 'SpringJDBC' )
                    // InternalSpringFluentDSL.g:608:4: 'SpringJDBC'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringJDBCEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalSpringFluentDSL.g:612:2: ( ( 'SpringIntegration' ) )
                    {
                    // InternalSpringFluentDSL.g:612:2: ( ( 'SpringIntegration' ) )
                    // InternalSpringFluentDSL.g:613:3: ( 'SpringIntegration' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringIntegrationEnumLiteralDeclaration_23()); 
                    // InternalSpringFluentDSL.g:614:3: ( 'SpringIntegration' )
                    // InternalSpringFluentDSL.g:614:4: 'SpringIntegration'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringIntegrationEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalSpringFluentDSL.g:618:2: ( ( 'SpringDataRest' ) )
                    {
                    // InternalSpringFluentDSL.g:618:2: ( ( 'SpringDataRest' ) )
                    // InternalSpringFluentDSL.g:619:3: ( 'SpringDataRest' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringDataRestEnumLiteralDeclaration_24()); 
                    // InternalSpringFluentDSL.g:620:3: ( 'SpringDataRest' )
                    // InternalSpringFluentDSL.g:620:4: 'SpringDataRest'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringDataRestEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalSpringFluentDSL.g:624:2: ( ( 'SpringGraphQL' ) )
                    {
                    // InternalSpringFluentDSL.g:624:2: ( ( 'SpringGraphQL' ) )
                    // InternalSpringFluentDSL.g:625:3: ( 'SpringGraphQL' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringGraphQLEnumLiteralDeclaration_25()); 
                    // InternalSpringFluentDSL.g:626:3: ( 'SpringGraphQL' )
                    // InternalSpringFluentDSL.g:626:4: 'SpringGraphQL'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringGraphQLEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalSpringFluentDSL.g:630:2: ( ( 'SpringDataElasticsearch' ) )
                    {
                    // InternalSpringFluentDSL.g:630:2: ( ( 'SpringDataElasticsearch' ) )
                    // InternalSpringFluentDSL.g:631:3: ( 'SpringDataElasticsearch' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringDataElasticsearchEnumLiteralDeclaration_26()); 
                    // InternalSpringFluentDSL.g:632:3: ( 'SpringDataElasticsearch' )
                    // InternalSpringFluentDSL.g:632:4: 'SpringDataElasticsearch'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringDataElasticsearchEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalSpringFluentDSL.g:636:2: ( ( 'SpringDataJDBC' ) )
                    {
                    // InternalSpringFluentDSL.g:636:2: ( ( 'SpringDataJDBC' ) )
                    // InternalSpringFluentDSL.g:637:3: ( 'SpringDataJDBC' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringDataJDBCEnumLiteralDeclaration_27()); 
                    // InternalSpringFluentDSL.g:638:3: ( 'SpringDataJDBC' )
                    // InternalSpringFluentDSL.g:638:4: 'SpringDataJDBC'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringDataJDBCEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalSpringFluentDSL.g:642:2: ( ( 'SpringDataMongoDB' ) )
                    {
                    // InternalSpringFluentDSL.g:642:2: ( ( 'SpringDataMongoDB' ) )
                    // InternalSpringFluentDSL.g:643:3: ( 'SpringDataMongoDB' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringDataMongoDBEnumLiteralDeclaration_28()); 
                    // InternalSpringFluentDSL.g:644:3: ( 'SpringDataMongoDB' )
                    // InternalSpringFluentDSL.g:644:4: 'SpringDataMongoDB'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringDataMongoDBEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalSpringFluentDSL.g:648:2: ( ( 'Swagger' ) )
                    {
                    // InternalSpringFluentDSL.g:648:2: ( ( 'Swagger' ) )
                    // InternalSpringFluentDSL.g:649:3: ( 'Swagger' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_29()); 
                    // InternalSpringFluentDSL.g:650:3: ( 'Swagger' )
                    // InternalSpringFluentDSL.g:650:4: 'Swagger'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalSpringFluentDSL.g:654:2: ( ( 'SpringSecurity' ) )
                    {
                    // InternalSpringFluentDSL.g:654:2: ( ( 'SpringSecurity' ) )
                    // InternalSpringFluentDSL.g:655:3: ( 'SpringSecurity' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_30()); 
                    // InternalSpringFluentDSL.g:656:3: ( 'SpringSecurity' )
                    // InternalSpringFluentDSL.g:656:4: 'SpringSecurity'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalSpringFluentDSL.g:660:2: ( ( 'SpringActuator' ) )
                    {
                    // InternalSpringFluentDSL.g:660:2: ( ( 'SpringActuator' ) )
                    // InternalSpringFluentDSL.g:661:3: ( 'SpringActuator' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringActuatorEnumLiteralDeclaration_31()); 
                    // InternalSpringFluentDSL.g:662:3: ( 'SpringActuator' )
                    // InternalSpringFluentDSL.g:662:4: 'SpringActuator'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringActuatorEnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalSpringFluentDSL.g:666:2: ( ( 'SpringGraphQLTest' ) )
                    {
                    // InternalSpringFluentDSL.g:666:2: ( ( 'SpringGraphQLTest' ) )
                    // InternalSpringFluentDSL.g:667:3: ( 'SpringGraphQLTest' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringGraphQLTestEnumLiteralDeclaration_32()); 
                    // InternalSpringFluentDSL.g:668:3: ( 'SpringGraphQLTest' )
                    // InternalSpringFluentDSL.g:668:4: 'SpringGraphQLTest'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringGraphQLTestEnumLiteralDeclaration_32()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSpringFluentDSL.g:676:1: rule__Type__Alternatives : ( ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:680:1: ( ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Boolean' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt4=1;
                }
                break;
            case 52:
                {
                alt4=2;
                }
                break;
            case 53:
                {
                alt4=3;
                }
                break;
            case 54:
                {
                alt4=4;
                }
                break;
            case 55:
                {
                alt4=5;
                }
                break;
            case 56:
                {
                alt4=6;
                }
                break;
            case 57:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpringFluentDSL.g:681:2: ( ( 'Long' ) )
                    {
                    // InternalSpringFluentDSL.g:681:2: ( ( 'Long' ) )
                    // InternalSpringFluentDSL.g:682:3: ( 'Long' )
                    {
                     before(grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0()); 
                    // InternalSpringFluentDSL.g:683:3: ( 'Long' )
                    // InternalSpringFluentDSL.g:683:4: 'Long'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:687:2: ( ( 'Integer' ) )
                    {
                    // InternalSpringFluentDSL.g:687:2: ( ( 'Integer' ) )
                    // InternalSpringFluentDSL.g:688:3: ( 'Integer' )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalSpringFluentDSL.g:689:3: ( 'Integer' )
                    // InternalSpringFluentDSL.g:689:4: 'Integer'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:693:2: ( ( 'Double' ) )
                    {
                    // InternalSpringFluentDSL.g:693:2: ( ( 'Double' ) )
                    // InternalSpringFluentDSL.g:694:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // InternalSpringFluentDSL.g:695:3: ( 'Double' )
                    // InternalSpringFluentDSL.g:695:4: 'Double'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:699:2: ( ( 'String' ) )
                    {
                    // InternalSpringFluentDSL.g:699:2: ( ( 'String' ) )
                    // InternalSpringFluentDSL.g:700:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // InternalSpringFluentDSL.g:701:3: ( 'String' )
                    // InternalSpringFluentDSL.g:701:4: 'String'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:705:2: ( ( 'Date' ) )
                    {
                    // InternalSpringFluentDSL.g:705:2: ( ( 'Date' ) )
                    // InternalSpringFluentDSL.g:706:3: ( 'Date' )
                    {
                     before(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalSpringFluentDSL.g:707:3: ( 'Date' )
                    // InternalSpringFluentDSL.g:707:4: 'Date'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:711:2: ( ( 'Time' ) )
                    {
                    // InternalSpringFluentDSL.g:711:2: ( ( 'Time' ) )
                    // InternalSpringFluentDSL.g:712:3: ( 'Time' )
                    {
                     before(grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5()); 
                    // InternalSpringFluentDSL.g:713:3: ( 'Time' )
                    // InternalSpringFluentDSL.g:713:4: 'Time'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:717:2: ( ( 'Boolean' ) )
                    {
                    // InternalSpringFluentDSL.g:717:2: ( ( 'Boolean' ) )
                    // InternalSpringFluentDSL.g:718:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // InternalSpringFluentDSL.g:719:3: ( 'Boolean' )
                    // InternalSpringFluentDSL.g:719:4: 'Boolean'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSpringFluentDSL.g:727:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:731:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSpringFluentDSL.g:732:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSpringFluentDSL.g:739:1: rule__Model__Group__0__Impl : ( ( rule__Model__PrefixAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:743:1: ( ( ( rule__Model__PrefixAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:744:1: ( ( rule__Model__PrefixAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:744:1: ( ( rule__Model__PrefixAssignment_0 ) )
            // InternalSpringFluentDSL.g:745:2: ( rule__Model__PrefixAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_0()); 
            // InternalSpringFluentDSL.g:746:2: ( rule__Model__PrefixAssignment_0 )
            // InternalSpringFluentDSL.g:746:3: rule__Model__PrefixAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__PrefixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrefixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSpringFluentDSL.g:754:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:758:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSpringFluentDSL.g:759:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSpringFluentDSL.g:766:1: rule__Model__Group__1__Impl : ( ( rule__Model__AppNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:770:1: ( ( ( rule__Model__AppNameAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:771:1: ( ( rule__Model__AppNameAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:771:1: ( ( rule__Model__AppNameAssignment_1 ) )
            // InternalSpringFluentDSL.g:772:2: ( rule__Model__AppNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAppNameAssignment_1()); 
            // InternalSpringFluentDSL.g:773:2: ( rule__Model__AppNameAssignment_1 )
            // InternalSpringFluentDSL.g:773:3: rule__Model__AppNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__AppNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAppNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalSpringFluentDSL.g:781:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:785:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSpringFluentDSL.g:786:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalSpringFluentDSL.g:793:1: rule__Model__Group__2__Impl : ( ( rule__Model__DependenciesAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:797:1: ( ( ( rule__Model__DependenciesAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:798:1: ( ( rule__Model__DependenciesAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:798:1: ( ( rule__Model__DependenciesAssignment_2 ) )
            // InternalSpringFluentDSL.g:799:2: ( rule__Model__DependenciesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getDependenciesAssignment_2()); 
            // InternalSpringFluentDSL.g:800:2: ( rule__Model__DependenciesAssignment_2 )
            // InternalSpringFluentDSL.g:800:3: rule__Model__DependenciesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__DependenciesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDependenciesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalSpringFluentDSL.g:808:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:812:1: ( rule__Model__Group__3__Impl )
            // InternalSpringFluentDSL.g:813:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalSpringFluentDSL.g:819:1: rule__Model__Group__3__Impl : ( ( rule__Model__EntitiesAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:823:1: ( ( ( rule__Model__EntitiesAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:824:1: ( ( rule__Model__EntitiesAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:824:1: ( ( rule__Model__EntitiesAssignment_3 ) )
            // InternalSpringFluentDSL.g:825:2: ( rule__Model__EntitiesAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 
            // InternalSpringFluentDSL.g:826:2: ( rule__Model__EntitiesAssignment_3 )
            // InternalSpringFluentDSL.g:826:3: rule__Model__EntitiesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__EntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // InternalSpringFluentDSL.g:835:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:839:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalSpringFluentDSL.g:840:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Prefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0"


    // $ANTLR start "rule__Prefix__Group__0__Impl"
    // InternalSpringFluentDSL.g:847:1: rule__Prefix__Group__0__Impl : ( () ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:851:1: ( ( () ) )
            // InternalSpringFluentDSL.g:852:1: ( () )
            {
            // InternalSpringFluentDSL.g:852:1: ( () )
            // InternalSpringFluentDSL.g:853:2: ()
            {
             before(grammarAccess.getPrefixAccess().getPrefixAction_0()); 
            // InternalSpringFluentDSL.g:854:2: ()
            // InternalSpringFluentDSL.g:854:3: 
            {
            }

             after(grammarAccess.getPrefixAccess().getPrefixAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // InternalSpringFluentDSL.g:862:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:866:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalSpringFluentDSL.g:867:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Prefix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prefix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1"


    // $ANTLR start "rule__Prefix__Group__1__Impl"
    // InternalSpringFluentDSL.g:874:1: rule__Prefix__Group__1__Impl : ( 'prefix:' ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:878:1: ( ( 'prefix:' ) )
            // InternalSpringFluentDSL.g:879:1: ( 'prefix:' )
            {
            // InternalSpringFluentDSL.g:879:1: ( 'prefix:' )
            // InternalSpringFluentDSL.g:880:2: 'prefix:'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getPrefixKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__Prefix__Group__2"
    // InternalSpringFluentDSL.g:889:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:893:1: ( rule__Prefix__Group__2__Impl )
            // InternalSpringFluentDSL.g:894:2: rule__Prefix__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2"


    // $ANTLR start "rule__Prefix__Group__2__Impl"
    // InternalSpringFluentDSL.g:900:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__PrefixAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:904:1: ( ( ( rule__Prefix__PrefixAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:905:1: ( ( rule__Prefix__PrefixAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:905:1: ( ( rule__Prefix__PrefixAssignment_2 ) )
            // InternalSpringFluentDSL.g:906:2: ( rule__Prefix__PrefixAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getPrefixAssignment_2()); 
            // InternalSpringFluentDSL.g:907:2: ( rule__Prefix__PrefixAssignment_2 )
            // InternalSpringFluentDSL.g:907:3: rule__Prefix__PrefixAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__PrefixAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getPrefixAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2__Impl"


    // $ANTLR start "rule__AppName__Group__0"
    // InternalSpringFluentDSL.g:916:1: rule__AppName__Group__0 : rule__AppName__Group__0__Impl rule__AppName__Group__1 ;
    public final void rule__AppName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:920:1: ( rule__AppName__Group__0__Impl rule__AppName__Group__1 )
            // InternalSpringFluentDSL.g:921:2: rule__AppName__Group__0__Impl rule__AppName__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AppName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppName__Group__0"


    // $ANTLR start "rule__AppName__Group__0__Impl"
    // InternalSpringFluentDSL.g:928:1: rule__AppName__Group__0__Impl : ( () ) ;
    public final void rule__AppName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:932:1: ( ( () ) )
            // InternalSpringFluentDSL.g:933:1: ( () )
            {
            // InternalSpringFluentDSL.g:933:1: ( () )
            // InternalSpringFluentDSL.g:934:2: ()
            {
             before(grammarAccess.getAppNameAccess().getAppNameAction_0()); 
            // InternalSpringFluentDSL.g:935:2: ()
            // InternalSpringFluentDSL.g:935:3: 
            {
            }

             after(grammarAccess.getAppNameAccess().getAppNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppName__Group__0__Impl"


    // $ANTLR start "rule__AppName__Group__1"
    // InternalSpringFluentDSL.g:943:1: rule__AppName__Group__1 : rule__AppName__Group__1__Impl rule__AppName__Group__2 ;
    public final void rule__AppName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:947:1: ( rule__AppName__Group__1__Impl rule__AppName__Group__2 )
            // InternalSpringFluentDSL.g:948:2: rule__AppName__Group__1__Impl rule__AppName__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AppName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppName__Group__1"


    // $ANTLR start "rule__AppName__Group__1__Impl"
    // InternalSpringFluentDSL.g:955:1: rule__AppName__Group__1__Impl : ( 'app_name:' ) ;
    public final void rule__AppName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:959:1: ( ( 'app_name:' ) )
            // InternalSpringFluentDSL.g:960:1: ( 'app_name:' )
            {
            // InternalSpringFluentDSL.g:960:1: ( 'app_name:' )
            // InternalSpringFluentDSL.g:961:2: 'app_name:'
            {
             before(grammarAccess.getAppNameAccess().getApp_nameKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAppNameAccess().getApp_nameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppName__Group__1__Impl"


    // $ANTLR start "rule__AppName__Group__2"
    // InternalSpringFluentDSL.g:970:1: rule__AppName__Group__2 : rule__AppName__Group__2__Impl ;
    public final void rule__AppName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:974:1: ( rule__AppName__Group__2__Impl )
            // InternalSpringFluentDSL.g:975:2: rule__AppName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppName__Group__2"


    // $ANTLR start "rule__AppName__Group__2__Impl"
    // InternalSpringFluentDSL.g:981:1: rule__AppName__Group__2__Impl : ( ( rule__AppName__AppNameAssignment_2 ) ) ;
    public final void rule__AppName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:985:1: ( ( ( rule__AppName__AppNameAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:986:1: ( ( rule__AppName__AppNameAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:986:1: ( ( rule__AppName__AppNameAssignment_2 ) )
            // InternalSpringFluentDSL.g:987:2: ( rule__AppName__AppNameAssignment_2 )
            {
             before(grammarAccess.getAppNameAccess().getAppNameAssignment_2()); 
            // InternalSpringFluentDSL.g:988:2: ( rule__AppName__AppNameAssignment_2 )
            // InternalSpringFluentDSL.g:988:3: rule__AppName__AppNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AppName__AppNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAppNameAccess().getAppNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppName__Group__2__Impl"


    // $ANTLR start "rule__Dependencies__Group__0"
    // InternalSpringFluentDSL.g:997:1: rule__Dependencies__Group__0 : rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1 ;
    public final void rule__Dependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1001:1: ( rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1 )
            // InternalSpringFluentDSL.g:1002:2: rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Dependencies__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependencies__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__0"


    // $ANTLR start "rule__Dependencies__Group__0__Impl"
    // InternalSpringFluentDSL.g:1009:1: rule__Dependencies__Group__0__Impl : ( () ) ;
    public final void rule__Dependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1013:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1014:1: ( () )
            {
            // InternalSpringFluentDSL.g:1014:1: ( () )
            // InternalSpringFluentDSL.g:1015:2: ()
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAction_0()); 
            // InternalSpringFluentDSL.g:1016:2: ()
            // InternalSpringFluentDSL.g:1016:3: 
            {
            }

             after(grammarAccess.getDependenciesAccess().getDependenciesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__0__Impl"


    // $ANTLR start "rule__Dependencies__Group__1"
    // InternalSpringFluentDSL.g:1024:1: rule__Dependencies__Group__1 : rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2 ;
    public final void rule__Dependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1028:1: ( rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2 )
            // InternalSpringFluentDSL.g:1029:2: rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Dependencies__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependencies__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__1"


    // $ANTLR start "rule__Dependencies__Group__1__Impl"
    // InternalSpringFluentDSL.g:1036:1: rule__Dependencies__Group__1__Impl : ( 'dependencies' ) ;
    public final void rule__Dependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1040:1: ( ( 'dependencies' ) )
            // InternalSpringFluentDSL.g:1041:1: ( 'dependencies' )
            {
            // InternalSpringFluentDSL.g:1041:1: ( 'dependencies' )
            // InternalSpringFluentDSL.g:1042:2: 'dependencies'
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDependenciesAccess().getDependenciesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__1__Impl"


    // $ANTLR start "rule__Dependencies__Group__2"
    // InternalSpringFluentDSL.g:1051:1: rule__Dependencies__Group__2 : rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3 ;
    public final void rule__Dependencies__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1055:1: ( rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3 )
            // InternalSpringFluentDSL.g:1056:2: rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Dependencies__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependencies__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__2"


    // $ANTLR start "rule__Dependencies__Group__2__Impl"
    // InternalSpringFluentDSL.g:1063:1: rule__Dependencies__Group__2__Impl : ( '{' ) ;
    public final void rule__Dependencies__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1067:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:1068:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:1068:1: ( '{' )
            // InternalSpringFluentDSL.g:1069:2: '{'
            {
             before(grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__2__Impl"


    // $ANTLR start "rule__Dependencies__Group__3"
    // InternalSpringFluentDSL.g:1078:1: rule__Dependencies__Group__3 : rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4 ;
    public final void rule__Dependencies__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1082:1: ( rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4 )
            // InternalSpringFluentDSL.g:1083:2: rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Dependencies__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependencies__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__3"


    // $ANTLR start "rule__Dependencies__Group__3__Impl"
    // InternalSpringFluentDSL.g:1090:1: rule__Dependencies__Group__3__Impl : ( ( rule__Dependencies__DependenciesAssignment_3 ) ) ;
    public final void rule__Dependencies__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1094:1: ( ( ( rule__Dependencies__DependenciesAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:1095:1: ( ( rule__Dependencies__DependenciesAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:1095:1: ( ( rule__Dependencies__DependenciesAssignment_3 ) )
            // InternalSpringFluentDSL.g:1096:2: ( rule__Dependencies__DependenciesAssignment_3 )
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAssignment_3()); 
            // InternalSpringFluentDSL.g:1097:2: ( rule__Dependencies__DependenciesAssignment_3 )
            // InternalSpringFluentDSL.g:1097:3: rule__Dependencies__DependenciesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Dependencies__DependenciesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDependenciesAccess().getDependenciesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__3__Impl"


    // $ANTLR start "rule__Dependencies__Group__4"
    // InternalSpringFluentDSL.g:1105:1: rule__Dependencies__Group__4 : rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5 ;
    public final void rule__Dependencies__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1109:1: ( rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5 )
            // InternalSpringFluentDSL.g:1110:2: rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Dependencies__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependencies__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__4"


    // $ANTLR start "rule__Dependencies__Group__4__Impl"
    // InternalSpringFluentDSL.g:1117:1: rule__Dependencies__Group__4__Impl : ( ( rule__Dependencies__Group_4__0 )* ) ;
    public final void rule__Dependencies__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1121:1: ( ( ( rule__Dependencies__Group_4__0 )* ) )
            // InternalSpringFluentDSL.g:1122:1: ( ( rule__Dependencies__Group_4__0 )* )
            {
            // InternalSpringFluentDSL.g:1122:1: ( ( rule__Dependencies__Group_4__0 )* )
            // InternalSpringFluentDSL.g:1123:2: ( rule__Dependencies__Group_4__0 )*
            {
             before(grammarAccess.getDependenciesAccess().getGroup_4()); 
            // InternalSpringFluentDSL.g:1124:2: ( rule__Dependencies__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==63) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1124:3: rule__Dependencies__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Dependencies__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDependenciesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__4__Impl"


    // $ANTLR start "rule__Dependencies__Group__5"
    // InternalSpringFluentDSL.g:1132:1: rule__Dependencies__Group__5 : rule__Dependencies__Group__5__Impl ;
    public final void rule__Dependencies__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1136:1: ( rule__Dependencies__Group__5__Impl )
            // InternalSpringFluentDSL.g:1137:2: rule__Dependencies__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependencies__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__5"


    // $ANTLR start "rule__Dependencies__Group__5__Impl"
    // InternalSpringFluentDSL.g:1143:1: rule__Dependencies__Group__5__Impl : ( '}' ) ;
    public final void rule__Dependencies__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1147:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1148:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1148:1: ( '}' )
            // InternalSpringFluentDSL.g:1149:2: '}'
            {
             before(grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group__5__Impl"


    // $ANTLR start "rule__Dependencies__Group_4__0"
    // InternalSpringFluentDSL.g:1159:1: rule__Dependencies__Group_4__0 : rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1 ;
    public final void rule__Dependencies__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1163:1: ( rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1 )
            // InternalSpringFluentDSL.g:1164:2: rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Dependencies__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependencies__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group_4__0"


    // $ANTLR start "rule__Dependencies__Group_4__0__Impl"
    // InternalSpringFluentDSL.g:1171:1: rule__Dependencies__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Dependencies__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1175:1: ( ( ',' ) )
            // InternalSpringFluentDSL.g:1176:1: ( ',' )
            {
            // InternalSpringFluentDSL.g:1176:1: ( ',' )
            // InternalSpringFluentDSL.g:1177:2: ','
            {
             before(grammarAccess.getDependenciesAccess().getCommaKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDependenciesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group_4__0__Impl"


    // $ANTLR start "rule__Dependencies__Group_4__1"
    // InternalSpringFluentDSL.g:1186:1: rule__Dependencies__Group_4__1 : rule__Dependencies__Group_4__1__Impl ;
    public final void rule__Dependencies__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1190:1: ( rule__Dependencies__Group_4__1__Impl )
            // InternalSpringFluentDSL.g:1191:2: rule__Dependencies__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependencies__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group_4__1"


    // $ANTLR start "rule__Dependencies__Group_4__1__Impl"
    // InternalSpringFluentDSL.g:1197:1: rule__Dependencies__Group_4__1__Impl : ( ( rule__Dependencies__DependenciesAssignment_4_1 ) ) ;
    public final void rule__Dependencies__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1201:1: ( ( ( rule__Dependencies__DependenciesAssignment_4_1 ) ) )
            // InternalSpringFluentDSL.g:1202:1: ( ( rule__Dependencies__DependenciesAssignment_4_1 ) )
            {
            // InternalSpringFluentDSL.g:1202:1: ( ( rule__Dependencies__DependenciesAssignment_4_1 ) )
            // InternalSpringFluentDSL.g:1203:2: ( rule__Dependencies__DependenciesAssignment_4_1 )
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAssignment_4_1()); 
            // InternalSpringFluentDSL.g:1204:2: ( rule__Dependencies__DependenciesAssignment_4_1 )
            // InternalSpringFluentDSL.g:1204:3: rule__Dependencies__DependenciesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Dependencies__DependenciesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDependenciesAccess().getDependenciesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__Group_4__1__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // InternalSpringFluentDSL.g:1213:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1217:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalSpringFluentDSL.g:1218:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // InternalSpringFluentDSL.g:1225:1: rule__Dependency__Group__0__Impl : ( () ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1229:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1230:1: ( () )
            {
            // InternalSpringFluentDSL.g:1230:1: ( () )
            // InternalSpringFluentDSL.g:1231:2: ()
            {
             before(grammarAccess.getDependencyAccess().getDependencyAction_0()); 
            // InternalSpringFluentDSL.g:1232:2: ()
            // InternalSpringFluentDSL.g:1232:3: 
            {
            }

             after(grammarAccess.getDependencyAccess().getDependencyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // InternalSpringFluentDSL.g:1240:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1244:1: ( rule__Dependency__Group__1__Impl )
            // InternalSpringFluentDSL.g:1245:2: rule__Dependency__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // InternalSpringFluentDSL.g:1251:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__DependencyAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1255:1: ( ( ( rule__Dependency__DependencyAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1256:1: ( ( rule__Dependency__DependencyAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1256:1: ( ( rule__Dependency__DependencyAssignment_1 ) )
            // InternalSpringFluentDSL.g:1257:2: ( rule__Dependency__DependencyAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyAssignment_1()); 
            // InternalSpringFluentDSL.g:1258:2: ( rule__Dependency__DependencyAssignment_1 )
            // InternalSpringFluentDSL.g:1258:3: rule__Dependency__DependencyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__DependencyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Entities__Group__0"
    // InternalSpringFluentDSL.g:1267:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1271:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalSpringFluentDSL.g:1272:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Entities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0"


    // $ANTLR start "rule__Entities__Group__0__Impl"
    // InternalSpringFluentDSL.g:1279:1: rule__Entities__Group__0__Impl : ( () ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1283:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1284:1: ( () )
            {
            // InternalSpringFluentDSL.g:1284:1: ( () )
            // InternalSpringFluentDSL.g:1285:2: ()
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAction_0()); 
            // InternalSpringFluentDSL.g:1286:2: ()
            // InternalSpringFluentDSL.g:1286:3: 
            {
            }

             after(grammarAccess.getEntitiesAccess().getEntitiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // InternalSpringFluentDSL.g:1294:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl rule__Entities__Group__2 ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1298:1: ( rule__Entities__Group__1__Impl rule__Entities__Group__2 )
            // InternalSpringFluentDSL.g:1299:2: rule__Entities__Group__1__Impl rule__Entities__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entities__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1"


    // $ANTLR start "rule__Entities__Group__1__Impl"
    // InternalSpringFluentDSL.g:1306:1: rule__Entities__Group__1__Impl : ( 'entities' ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1310:1: ( ( 'entities' ) )
            // InternalSpringFluentDSL.g:1311:1: ( 'entities' )
            {
            // InternalSpringFluentDSL.g:1311:1: ( 'entities' )
            // InternalSpringFluentDSL.g:1312:2: 'entities'
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getEntitiesAccess().getEntitiesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Entities__Group__2"
    // InternalSpringFluentDSL.g:1321:1: rule__Entities__Group__2 : rule__Entities__Group__2__Impl rule__Entities__Group__3 ;
    public final void rule__Entities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1325:1: ( rule__Entities__Group__2__Impl rule__Entities__Group__3 )
            // InternalSpringFluentDSL.g:1326:2: rule__Entities__Group__2__Impl rule__Entities__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Entities__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__2"


    // $ANTLR start "rule__Entities__Group__2__Impl"
    // InternalSpringFluentDSL.g:1333:1: rule__Entities__Group__2__Impl : ( '{' ) ;
    public final void rule__Entities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1337:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:1338:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:1338:1: ( '{' )
            // InternalSpringFluentDSL.g:1339:2: '{'
            {
             before(grammarAccess.getEntitiesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEntitiesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__2__Impl"


    // $ANTLR start "rule__Entities__Group__3"
    // InternalSpringFluentDSL.g:1348:1: rule__Entities__Group__3 : rule__Entities__Group__3__Impl rule__Entities__Group__4 ;
    public final void rule__Entities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1352:1: ( rule__Entities__Group__3__Impl rule__Entities__Group__4 )
            // InternalSpringFluentDSL.g:1353:2: rule__Entities__Group__3__Impl rule__Entities__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Entities__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__3"


    // $ANTLR start "rule__Entities__Group__3__Impl"
    // InternalSpringFluentDSL.g:1360:1: rule__Entities__Group__3__Impl : ( ( rule__Entities__EntitiesAssignment_3 )* ) ;
    public final void rule__Entities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1364:1: ( ( ( rule__Entities__EntitiesAssignment_3 )* ) )
            // InternalSpringFluentDSL.g:1365:1: ( ( rule__Entities__EntitiesAssignment_3 )* )
            {
            // InternalSpringFluentDSL.g:1365:1: ( ( rule__Entities__EntitiesAssignment_3 )* )
            // InternalSpringFluentDSL.g:1366:2: ( rule__Entities__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAssignment_3()); 
            // InternalSpringFluentDSL.g:1367:2: ( rule__Entities__EntitiesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==65) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1367:3: rule__Entities__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Entities__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__3__Impl"


    // $ANTLR start "rule__Entities__Group__4"
    // InternalSpringFluentDSL.g:1375:1: rule__Entities__Group__4 : rule__Entities__Group__4__Impl ;
    public final void rule__Entities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1379:1: ( rule__Entities__Group__4__Impl )
            // InternalSpringFluentDSL.g:1380:2: rule__Entities__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__4"


    // $ANTLR start "rule__Entities__Group__4__Impl"
    // InternalSpringFluentDSL.g:1386:1: rule__Entities__Group__4__Impl : ( '}' ) ;
    public final void rule__Entities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1390:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1391:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1391:1: ( '}' )
            // InternalSpringFluentDSL.g:1392:2: '}'
            {
             before(grammarAccess.getEntitiesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEntitiesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalSpringFluentDSL.g:1402:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1406:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSpringFluentDSL.g:1407:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalSpringFluentDSL.g:1414:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1418:1: ( ( 'entity' ) )
            // InternalSpringFluentDSL.g:1419:1: ( 'entity' )
            {
            // InternalSpringFluentDSL.g:1419:1: ( 'entity' )
            // InternalSpringFluentDSL.g:1420:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalSpringFluentDSL.g:1429:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1433:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSpringFluentDSL.g:1434:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalSpringFluentDSL.g:1441:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1445:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1446:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1446:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSpringFluentDSL.g:1447:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSpringFluentDSL.g:1448:2: ( rule__Entity__NameAssignment_1 )
            // InternalSpringFluentDSL.g:1448:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalSpringFluentDSL.g:1456:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1460:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSpringFluentDSL.g:1461:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalSpringFluentDSL.g:1468:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1472:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalSpringFluentDSL.g:1473:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalSpringFluentDSL.g:1473:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalSpringFluentDSL.g:1474:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalSpringFluentDSL.g:1475:2: ( rule__Entity__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==66) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpringFluentDSL.g:1475:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalSpringFluentDSL.g:1483:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1487:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSpringFluentDSL.g:1488:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalSpringFluentDSL.g:1495:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1499:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:1500:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:1500:1: ( '{' )
            // InternalSpringFluentDSL.g:1501:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalSpringFluentDSL.g:1510:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1514:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSpringFluentDSL.g:1515:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalSpringFluentDSL.g:1522:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeatureAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1526:1: ( ( ( rule__Entity__FeatureAssignment_4 ) ) )
            // InternalSpringFluentDSL.g:1527:1: ( ( rule__Entity__FeatureAssignment_4 ) )
            {
            // InternalSpringFluentDSL.g:1527:1: ( ( rule__Entity__FeatureAssignment_4 ) )
            // InternalSpringFluentDSL.g:1528:2: ( rule__Entity__FeatureAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getFeatureAssignment_4()); 
            // InternalSpringFluentDSL.g:1529:2: ( rule__Entity__FeatureAssignment_4 )
            // InternalSpringFluentDSL.g:1529:3: rule__Entity__FeatureAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FeatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeatureAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalSpringFluentDSL.g:1537:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1541:1: ( rule__Entity__Group__5__Impl )
            // InternalSpringFluentDSL.g:1542:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalSpringFluentDSL.g:1548:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1552:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1553:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1553:1: ( '}' )
            // InternalSpringFluentDSL.g:1554:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalSpringFluentDSL.g:1564:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1568:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalSpringFluentDSL.g:1569:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalSpringFluentDSL.g:1576:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1580:1: ( ( 'extends' ) )
            // InternalSpringFluentDSL.g:1581:1: ( 'extends' )
            {
            // InternalSpringFluentDSL.g:1581:1: ( 'extends' )
            // InternalSpringFluentDSL.g:1582:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalSpringFluentDSL.g:1591:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1595:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalSpringFluentDSL.g:1596:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalSpringFluentDSL.g:1603:1: rule__Entity__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1607:1: ( ( '[' ) )
            // InternalSpringFluentDSL.g:1608:1: ( '[' )
            {
            // InternalSpringFluentDSL.g:1608:1: ( '[' )
            // InternalSpringFluentDSL.g:1609:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_2__2"
    // InternalSpringFluentDSL.g:1618:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1622:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalSpringFluentDSL.g:1623:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2"


    // $ANTLR start "rule__Entity__Group_2__2__Impl"
    // InternalSpringFluentDSL.g:1630:1: rule__Entity__Group_2__2__Impl : ( 'strategy' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1634:1: ( ( 'strategy' ) )
            // InternalSpringFluentDSL.g:1635:1: ( 'strategy' )
            {
            // InternalSpringFluentDSL.g:1635:1: ( 'strategy' )
            // InternalSpringFluentDSL.g:1636:2: 'strategy'
            {
             before(grammarAccess.getEntityAccess().getStrategyKeyword_2_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getStrategyKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2__Impl"


    // $ANTLR start "rule__Entity__Group_2__3"
    // InternalSpringFluentDSL.g:1645:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1649:1: ( rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 )
            // InternalSpringFluentDSL.g:1650:2: rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4
            {
            pushFollow(FOLLOW_21);
            rule__Entity__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__3"


    // $ANTLR start "rule__Entity__Group_2__3__Impl"
    // InternalSpringFluentDSL.g:1657:1: rule__Entity__Group_2__3__Impl : ( '=' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1661:1: ( ( '=' ) )
            // InternalSpringFluentDSL.g:1662:1: ( '=' )
            {
            // InternalSpringFluentDSL.g:1662:1: ( '=' )
            // InternalSpringFluentDSL.g:1663:2: '='
            {
             before(grammarAccess.getEntityAccess().getEqualsSignKeyword_2_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEqualsSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__3__Impl"


    // $ANTLR start "rule__Entity__Group_2__4"
    // InternalSpringFluentDSL.g:1672:1: rule__Entity__Group_2__4 : rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5 ;
    public final void rule__Entity__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1676:1: ( rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5 )
            // InternalSpringFluentDSL.g:1677:2: rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5
            {
            pushFollow(FOLLOW_22);
            rule__Entity__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__4"


    // $ANTLR start "rule__Entity__Group_2__4__Impl"
    // InternalSpringFluentDSL.g:1684:1: rule__Entity__Group_2__4__Impl : ( ( rule__Entity__StrategyAssignment_2_4 ) ) ;
    public final void rule__Entity__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1688:1: ( ( ( rule__Entity__StrategyAssignment_2_4 ) ) )
            // InternalSpringFluentDSL.g:1689:1: ( ( rule__Entity__StrategyAssignment_2_4 ) )
            {
            // InternalSpringFluentDSL.g:1689:1: ( ( rule__Entity__StrategyAssignment_2_4 ) )
            // InternalSpringFluentDSL.g:1690:2: ( rule__Entity__StrategyAssignment_2_4 )
            {
             before(grammarAccess.getEntityAccess().getStrategyAssignment_2_4()); 
            // InternalSpringFluentDSL.g:1691:2: ( rule__Entity__StrategyAssignment_2_4 )
            // InternalSpringFluentDSL.g:1691:3: rule__Entity__StrategyAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Entity__StrategyAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getStrategyAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__4__Impl"


    // $ANTLR start "rule__Entity__Group_2__5"
    // InternalSpringFluentDSL.g:1699:1: rule__Entity__Group_2__5 : rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6 ;
    public final void rule__Entity__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1703:1: ( rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6 )
            // InternalSpringFluentDSL.g:1704:2: rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__5"


    // $ANTLR start "rule__Entity__Group_2__5__Impl"
    // InternalSpringFluentDSL.g:1711:1: rule__Entity__Group_2__5__Impl : ( ']' ) ;
    public final void rule__Entity__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1715:1: ( ( ']' ) )
            // InternalSpringFluentDSL.g:1716:1: ( ']' )
            {
            // InternalSpringFluentDSL.g:1716:1: ( ']' )
            // InternalSpringFluentDSL.g:1717:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_5()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__6"
    // InternalSpringFluentDSL.g:1726:1: rule__Entity__Group_2__6 : rule__Entity__Group_2__6__Impl ;
    public final void rule__Entity__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1730:1: ( rule__Entity__Group_2__6__Impl )
            // InternalSpringFluentDSL.g:1731:2: rule__Entity__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__6"


    // $ANTLR start "rule__Entity__Group_2__6__Impl"
    // InternalSpringFluentDSL.g:1737:1: rule__Entity__Group_2__6__Impl : ( ( rule__Entity__SuperTypeAssignment_2_6 ) ) ;
    public final void rule__Entity__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1741:1: ( ( ( rule__Entity__SuperTypeAssignment_2_6 ) ) )
            // InternalSpringFluentDSL.g:1742:1: ( ( rule__Entity__SuperTypeAssignment_2_6 ) )
            {
            // InternalSpringFluentDSL.g:1742:1: ( ( rule__Entity__SuperTypeAssignment_2_6 ) )
            // InternalSpringFluentDSL.g:1743:2: ( rule__Entity__SuperTypeAssignment_2_6 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_6()); 
            // InternalSpringFluentDSL.g:1744:2: ( rule__Entity__SuperTypeAssignment_2_6 )
            // InternalSpringFluentDSL.g:1744:3: rule__Entity__SuperTypeAssignment_2_6
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_6();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__6__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalSpringFluentDSL.g:1753:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1757:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSpringFluentDSL.g:1758:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalSpringFluentDSL.g:1765:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1769:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1770:1: ( () )
            {
            // InternalSpringFluentDSL.g:1770:1: ( () )
            // InternalSpringFluentDSL.g:1771:2: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // InternalSpringFluentDSL.g:1772:2: ()
            // InternalSpringFluentDSL.g:1772:3: 
            {
            }

             after(grammarAccess.getFeatureAccess().getFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalSpringFluentDSL.g:1780:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1784:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSpringFluentDSL.g:1785:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalSpringFluentDSL.g:1792:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__OperationAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1796:1: ( ( ( rule__Feature__OperationAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1797:1: ( ( rule__Feature__OperationAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1797:1: ( ( rule__Feature__OperationAssignment_1 ) )
            // InternalSpringFluentDSL.g:1798:2: ( rule__Feature__OperationAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getOperationAssignment_1()); 
            // InternalSpringFluentDSL.g:1799:2: ( rule__Feature__OperationAssignment_1 )
            // InternalSpringFluentDSL.g:1799:3: rule__Feature__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getOperationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalSpringFluentDSL.g:1807:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1811:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSpringFluentDSL.g:1812:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalSpringFluentDSL.g:1819:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IdAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1823:1: ( ( ( rule__Feature__IdAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:1824:1: ( ( rule__Feature__IdAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:1824:1: ( ( rule__Feature__IdAssignment_2 ) )
            // InternalSpringFluentDSL.g:1825:2: ( rule__Feature__IdAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getIdAssignment_2()); 
            // InternalSpringFluentDSL.g:1826:2: ( rule__Feature__IdAssignment_2 )
            // InternalSpringFluentDSL.g:1826:3: rule__Feature__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalSpringFluentDSL.g:1834:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1838:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSpringFluentDSL.g:1839:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalSpringFluentDSL.g:1846:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__AttributesAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1850:1: ( ( ( rule__Feature__AttributesAssignment_3 )* ) )
            // InternalSpringFluentDSL.g:1851:1: ( ( rule__Feature__AttributesAssignment_3 )* )
            {
            // InternalSpringFluentDSL.g:1851:1: ( ( rule__Feature__AttributesAssignment_3 )* )
            // InternalSpringFluentDSL.g:1852:2: ( rule__Feature__AttributesAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getAttributesAssignment_3()); 
            // InternalSpringFluentDSL.g:1853:2: ( rule__Feature__AttributesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==72) ) {
                        int LA8_3 = input.LA(3);

                        if ( ((LA8_3>=51 && LA8_3<=57)) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1853:3: rule__Feature__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Feature__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalSpringFluentDSL.g:1861:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1865:1: ( rule__Feature__Group__4__Impl )
            // InternalSpringFluentDSL.g:1866:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalSpringFluentDSL.g:1872:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__RelationsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1876:1: ( ( ( rule__Feature__RelationsAssignment_4 )* ) )
            // InternalSpringFluentDSL.g:1877:1: ( ( rule__Feature__RelationsAssignment_4 )* )
            {
            // InternalSpringFluentDSL.g:1877:1: ( ( rule__Feature__RelationsAssignment_4 )* )
            // InternalSpringFluentDSL.g:1878:2: ( rule__Feature__RelationsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getRelationsAssignment_4()); 
            // InternalSpringFluentDSL.g:1879:2: ( rule__Feature__RelationsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1879:3: rule__Feature__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Feature__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getRelationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Strategy__Group__0"
    // InternalSpringFluentDSL.g:1888:1: rule__Strategy__Group__0 : rule__Strategy__Group__0__Impl rule__Strategy__Group__1 ;
    public final void rule__Strategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1892:1: ( rule__Strategy__Group__0__Impl rule__Strategy__Group__1 )
            // InternalSpringFluentDSL.g:1893:2: rule__Strategy__Group__0__Impl rule__Strategy__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Strategy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Strategy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__0"


    // $ANTLR start "rule__Strategy__Group__0__Impl"
    // InternalSpringFluentDSL.g:1900:1: rule__Strategy__Group__0__Impl : ( () ) ;
    public final void rule__Strategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1904:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1905:1: ( () )
            {
            // InternalSpringFluentDSL.g:1905:1: ( () )
            // InternalSpringFluentDSL.g:1906:2: ()
            {
             before(grammarAccess.getStrategyAccess().getStrategyAction_0()); 
            // InternalSpringFluentDSL.g:1907:2: ()
            // InternalSpringFluentDSL.g:1907:3: 
            {
            }

             after(grammarAccess.getStrategyAccess().getStrategyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__0__Impl"


    // $ANTLR start "rule__Strategy__Group__1"
    // InternalSpringFluentDSL.g:1915:1: rule__Strategy__Group__1 : rule__Strategy__Group__1__Impl ;
    public final void rule__Strategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1919:1: ( rule__Strategy__Group__1__Impl )
            // InternalSpringFluentDSL.g:1920:2: rule__Strategy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__1"


    // $ANTLR start "rule__Strategy__Group__1__Impl"
    // InternalSpringFluentDSL.g:1926:1: rule__Strategy__Group__1__Impl : ( ( rule__Strategy__StrategyAssignment_1 ) ) ;
    public final void rule__Strategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1930:1: ( ( ( rule__Strategy__StrategyAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1931:1: ( ( rule__Strategy__StrategyAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1931:1: ( ( rule__Strategy__StrategyAssignment_1 ) )
            // InternalSpringFluentDSL.g:1932:2: ( rule__Strategy__StrategyAssignment_1 )
            {
             before(grammarAccess.getStrategyAccess().getStrategyAssignment_1()); 
            // InternalSpringFluentDSL.g:1933:2: ( rule__Strategy__StrategyAssignment_1 )
            // InternalSpringFluentDSL.g:1933:3: rule__Strategy__StrategyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__StrategyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getStrategyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__1__Impl"


    // $ANTLR start "rule__IDENTITY__Group__0"
    // InternalSpringFluentDSL.g:1942:1: rule__IDENTITY__Group__0 : rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1 ;
    public final void rule__IDENTITY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1946:1: ( rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1 )
            // InternalSpringFluentDSL.g:1947:2: rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__IDENTITY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IDENTITY__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__0"


    // $ANTLR start "rule__IDENTITY__Group__0__Impl"
    // InternalSpringFluentDSL.g:1954:1: rule__IDENTITY__Group__0__Impl : ( 'id' ) ;
    public final void rule__IDENTITY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1958:1: ( ( 'id' ) )
            // InternalSpringFluentDSL.g:1959:1: ( 'id' )
            {
            // InternalSpringFluentDSL.g:1959:1: ( 'id' )
            // InternalSpringFluentDSL.g:1960:2: 'id'
            {
             before(grammarAccess.getIDENTITYAccess().getIdKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getIDENTITYAccess().getIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__0__Impl"


    // $ANTLR start "rule__IDENTITY__Group__1"
    // InternalSpringFluentDSL.g:1969:1: rule__IDENTITY__Group__1 : rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2 ;
    public final void rule__IDENTITY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1973:1: ( rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2 )
            // InternalSpringFluentDSL.g:1974:2: rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__IDENTITY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IDENTITY__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__1"


    // $ANTLR start "rule__IDENTITY__Group__1__Impl"
    // InternalSpringFluentDSL.g:1981:1: rule__IDENTITY__Group__1__Impl : ( ':' ) ;
    public final void rule__IDENTITY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1985:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:1986:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:1986:1: ( ':' )
            // InternalSpringFluentDSL.g:1987:2: ':'
            {
             before(grammarAccess.getIDENTITYAccess().getColonKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getIDENTITYAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__1__Impl"


    // $ANTLR start "rule__IDENTITY__Group__2"
    // InternalSpringFluentDSL.g:1996:1: rule__IDENTITY__Group__2 : rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3 ;
    public final void rule__IDENTITY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2000:1: ( rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3 )
            // InternalSpringFluentDSL.g:2001:2: rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__IDENTITY__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IDENTITY__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__2"


    // $ANTLR start "rule__IDENTITY__Group__2__Impl"
    // InternalSpringFluentDSL.g:2008:1: rule__IDENTITY__Group__2__Impl : ( ( rule__IDENTITY__TypeAssignment_2 ) ) ;
    public final void rule__IDENTITY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2012:1: ( ( ( rule__IDENTITY__TypeAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2013:1: ( ( rule__IDENTITY__TypeAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2013:1: ( ( rule__IDENTITY__TypeAssignment_2 ) )
            // InternalSpringFluentDSL.g:2014:2: ( rule__IDENTITY__TypeAssignment_2 )
            {
             before(grammarAccess.getIDENTITYAccess().getTypeAssignment_2()); 
            // InternalSpringFluentDSL.g:2015:2: ( rule__IDENTITY__TypeAssignment_2 )
            // InternalSpringFluentDSL.g:2015:3: rule__IDENTITY__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IDENTITY__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIDENTITYAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__2__Impl"


    // $ANTLR start "rule__IDENTITY__Group__3"
    // InternalSpringFluentDSL.g:2023:1: rule__IDENTITY__Group__3 : rule__IDENTITY__Group__3__Impl ;
    public final void rule__IDENTITY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2027:1: ( rule__IDENTITY__Group__3__Impl )
            // InternalSpringFluentDSL.g:2028:2: rule__IDENTITY__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IDENTITY__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__3"


    // $ANTLR start "rule__IDENTITY__Group__3__Impl"
    // InternalSpringFluentDSL.g:2034:1: rule__IDENTITY__Group__3__Impl : ( 'pk' ) ;
    public final void rule__IDENTITY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2038:1: ( ( 'pk' ) )
            // InternalSpringFluentDSL.g:2039:1: ( 'pk' )
            {
            // InternalSpringFluentDSL.g:2039:1: ( 'pk' )
            // InternalSpringFluentDSL.g:2040:2: 'pk'
            {
             before(grammarAccess.getIDENTITYAccess().getPkKeyword_3()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getIDENTITYAccess().getPkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalSpringFluentDSL.g:2050:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2054:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalSpringFluentDSL.g:2055:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalSpringFluentDSL.g:2062:1: rule__Operation__Group__0__Impl : ( 'ops' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2066:1: ( ( 'ops' ) )
            // InternalSpringFluentDSL.g:2067:1: ( 'ops' )
            {
            // InternalSpringFluentDSL.g:2067:1: ( 'ops' )
            // InternalSpringFluentDSL.g:2068:2: 'ops'
            {
             before(grammarAccess.getOperationAccess().getOpsKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOpsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalSpringFluentDSL.g:2077:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2081:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalSpringFluentDSL.g:2082:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalSpringFluentDSL.g:2089:1: rule__Operation__Group__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2093:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:2094:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:2094:1: ( ':' )
            // InternalSpringFluentDSL.g:2095:2: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalSpringFluentDSL.g:2104:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2108:1: ( rule__Operation__Group__2__Impl )
            // InternalSpringFluentDSL.g:2109:2: rule__Operation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalSpringFluentDSL.g:2115:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__OperationAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2119:1: ( ( ( rule__Operation__OperationAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2120:1: ( ( rule__Operation__OperationAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2120:1: ( ( rule__Operation__OperationAssignment_2 ) )
            // InternalSpringFluentDSL.g:2121:2: ( rule__Operation__OperationAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getOperationAssignment_2()); 
            // InternalSpringFluentDSL.g:2122:2: ( rule__Operation__OperationAssignment_2 )
            // InternalSpringFluentDSL.g:2122:3: rule__Operation__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSpringFluentDSL.g:2131:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2135:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSpringFluentDSL.g:2136:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSpringFluentDSL.g:2143:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2147:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:2148:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:2148:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalSpringFluentDSL.g:2149:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalSpringFluentDSL.g:2150:2: ( rule__Attribute__NameAssignment_0 )
            // InternalSpringFluentDSL.g:2150:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSpringFluentDSL.g:2158:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2162:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSpringFluentDSL.g:2163:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSpringFluentDSL.g:2170:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2174:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:2175:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:2175:1: ( ':' )
            // InternalSpringFluentDSL.g:2176:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSpringFluentDSL.g:2185:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2189:1: ( rule__Attribute__Group__2__Impl )
            // InternalSpringFluentDSL.g:2190:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSpringFluentDSL.g:2196:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2200:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2201:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2201:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalSpringFluentDSL.g:2202:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalSpringFluentDSL.g:2203:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalSpringFluentDSL.g:2203:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalSpringFluentDSL.g:2212:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2216:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSpringFluentDSL.g:2217:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalSpringFluentDSL.g:2224:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2228:1: ( ( ( rule__Relation__NameAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:2229:1: ( ( rule__Relation__NameAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:2229:1: ( ( rule__Relation__NameAssignment_0 ) )
            // InternalSpringFluentDSL.g:2230:2: ( rule__Relation__NameAssignment_0 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalSpringFluentDSL.g:2231:2: ( rule__Relation__NameAssignment_0 )
            // InternalSpringFluentDSL.g:2231:3: rule__Relation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalSpringFluentDSL.g:2239:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2243:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSpringFluentDSL.g:2244:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalSpringFluentDSL.g:2251:1: rule__Relation__Group__1__Impl : ( ':' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2255:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:2256:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:2256:1: ( ':' )
            // InternalSpringFluentDSL.g:2257:2: ':'
            {
             before(grammarAccess.getRelationAccess().getColonKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalSpringFluentDSL.g:2266:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2270:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSpringFluentDSL.g:2271:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalSpringFluentDSL.g:2278:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__TargetAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2282:1: ( ( ( rule__Relation__TargetAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2283:1: ( ( rule__Relation__TargetAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2283:1: ( ( rule__Relation__TargetAssignment_2 ) )
            // InternalSpringFluentDSL.g:2284:2: ( rule__Relation__TargetAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_2()); 
            // InternalSpringFluentDSL.g:2285:2: ( rule__Relation__TargetAssignment_2 )
            // InternalSpringFluentDSL.g:2285:3: rule__Relation__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalSpringFluentDSL.g:2293:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2297:1: ( rule__Relation__Group__3__Impl )
            // InternalSpringFluentDSL.g:2298:2: rule__Relation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalSpringFluentDSL.g:2304:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__TypeAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2308:1: ( ( ( rule__Relation__TypeAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:2309:1: ( ( rule__Relation__TypeAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:2309:1: ( ( rule__Relation__TypeAssignment_3 ) )
            // InternalSpringFluentDSL.g:2310:2: ( rule__Relation__TypeAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_3()); 
            // InternalSpringFluentDSL.g:2311:2: ( rule__Relation__TypeAssignment_3 )
            // InternalSpringFluentDSL.g:2311:3: rule__Relation__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Model__PrefixAssignment_0"
    // InternalSpringFluentDSL.g:2320:1: rule__Model__PrefixAssignment_0 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2324:1: ( ( rulePrefix ) )
            // InternalSpringFluentDSL.g:2325:2: ( rulePrefix )
            {
            // InternalSpringFluentDSL.g:2325:2: ( rulePrefix )
            // InternalSpringFluentDSL.g:2326:3: rulePrefix
            {
             before(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PrefixAssignment_0"


    // $ANTLR start "rule__Model__AppNameAssignment_1"
    // InternalSpringFluentDSL.g:2335:1: rule__Model__AppNameAssignment_1 : ( ruleAppName ) ;
    public final void rule__Model__AppNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2339:1: ( ( ruleAppName ) )
            // InternalSpringFluentDSL.g:2340:2: ( ruleAppName )
            {
            // InternalSpringFluentDSL.g:2340:2: ( ruleAppName )
            // InternalSpringFluentDSL.g:2341:3: ruleAppName
            {
             before(grammarAccess.getModelAccess().getAppNameAppNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAppName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAppNameAppNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AppNameAssignment_1"


    // $ANTLR start "rule__Model__DependenciesAssignment_2"
    // InternalSpringFluentDSL.g:2350:1: rule__Model__DependenciesAssignment_2 : ( ruleDependencies ) ;
    public final void rule__Model__DependenciesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2354:1: ( ( ruleDependencies ) )
            // InternalSpringFluentDSL.g:2355:2: ( ruleDependencies )
            {
            // InternalSpringFluentDSL.g:2355:2: ( ruleDependencies )
            // InternalSpringFluentDSL.g:2356:3: ruleDependencies
            {
             before(grammarAccess.getModelAccess().getDependenciesDependenciesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDependencies();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDependenciesDependenciesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DependenciesAssignment_2"


    // $ANTLR start "rule__Model__EntitiesAssignment_3"
    // InternalSpringFluentDSL.g:2365:1: rule__Model__EntitiesAssignment_3 : ( ruleEntities ) ;
    public final void rule__Model__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2369:1: ( ( ruleEntities ) )
            // InternalSpringFluentDSL.g:2370:2: ( ruleEntities )
            {
            // InternalSpringFluentDSL.g:2370:2: ( ruleEntities )
            // InternalSpringFluentDSL.g:2371:3: ruleEntities
            {
             before(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment_3"


    // $ANTLR start "rule__Prefix__PrefixAssignment_2"
    // InternalSpringFluentDSL.g:2380:1: rule__Prefix__PrefixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2384:1: ( ( RULE_STRING ) )
            // InternalSpringFluentDSL.g:2385:2: ( RULE_STRING )
            {
            // InternalSpringFluentDSL.g:2385:2: ( RULE_STRING )
            // InternalSpringFluentDSL.g:2386:3: RULE_STRING
            {
             before(grammarAccess.getPrefixAccess().getPrefixSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getPrefixSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__PrefixAssignment_2"


    // $ANTLR start "rule__AppName__AppNameAssignment_2"
    // InternalSpringFluentDSL.g:2395:1: rule__AppName__AppNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AppName__AppNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2399:1: ( ( RULE_STRING ) )
            // InternalSpringFluentDSL.g:2400:2: ( RULE_STRING )
            {
            // InternalSpringFluentDSL.g:2400:2: ( RULE_STRING )
            // InternalSpringFluentDSL.g:2401:3: RULE_STRING
            {
             before(grammarAccess.getAppNameAccess().getAppNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAppNameAccess().getAppNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppName__AppNameAssignment_2"


    // $ANTLR start "rule__Dependencies__DependenciesAssignment_3"
    // InternalSpringFluentDSL.g:2410:1: rule__Dependencies__DependenciesAssignment_3 : ( ruleDependency ) ;
    public final void rule__Dependencies__DependenciesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2414:1: ( ( ruleDependency ) )
            // InternalSpringFluentDSL.g:2415:2: ( ruleDependency )
            {
            // InternalSpringFluentDSL.g:2415:2: ( ruleDependency )
            // InternalSpringFluentDSL.g:2416:3: ruleDependency
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__DependenciesAssignment_3"


    // $ANTLR start "rule__Dependencies__DependenciesAssignment_4_1"
    // InternalSpringFluentDSL.g:2425:1: rule__Dependencies__DependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Dependencies__DependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2429:1: ( ( ruleDependency ) )
            // InternalSpringFluentDSL.g:2430:2: ( ruleDependency )
            {
            // InternalSpringFluentDSL.g:2430:2: ( ruleDependency )
            // InternalSpringFluentDSL.g:2431:3: ruleDependency
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependencies__DependenciesAssignment_4_1"


    // $ANTLR start "rule__Dependency__DependencyAssignment_1"
    // InternalSpringFluentDSL.g:2440:1: rule__Dependency__DependencyAssignment_1 : ( ruleDependencyType ) ;
    public final void rule__Dependency__DependencyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2444:1: ( ( ruleDependencyType ) )
            // InternalSpringFluentDSL.g:2445:2: ( ruleDependencyType )
            {
            // InternalSpringFluentDSL.g:2445:2: ( ruleDependencyType )
            // InternalSpringFluentDSL.g:2446:3: ruleDependencyType
            {
             before(grammarAccess.getDependencyAccess().getDependencyDependencyTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDependencyType();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getDependencyDependencyTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__DependencyAssignment_1"


    // $ANTLR start "rule__Entities__EntitiesAssignment_3"
    // InternalSpringFluentDSL.g:2455:1: rule__Entities__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Entities__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2459:1: ( ( ruleEntity ) )
            // InternalSpringFluentDSL.g:2460:2: ( ruleEntity )
            {
            // InternalSpringFluentDSL.g:2460:2: ( ruleEntity )
            // InternalSpringFluentDSL.g:2461:3: ruleEntity
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getEntitiesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__EntitiesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalSpringFluentDSL.g:2470:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2474:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2475:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2475:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2476:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__StrategyAssignment_2_4"
    // InternalSpringFluentDSL.g:2485:1: rule__Entity__StrategyAssignment_2_4 : ( ruleStrategy ) ;
    public final void rule__Entity__StrategyAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2489:1: ( ( ruleStrategy ) )
            // InternalSpringFluentDSL.g:2490:2: ( ruleStrategy )
            {
            // InternalSpringFluentDSL.g:2490:2: ( ruleStrategy )
            // InternalSpringFluentDSL.g:2491:3: ruleStrategy
            {
             before(grammarAccess.getEntityAccess().getStrategyStrategyParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getStrategyStrategyParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__StrategyAssignment_2_4"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_6"
    // InternalSpringFluentDSL.g:2500:1: rule__Entity__SuperTypeAssignment_2_6 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2504:1: ( ( ( RULE_ID ) ) )
            // InternalSpringFluentDSL.g:2505:2: ( ( RULE_ID ) )
            {
            // InternalSpringFluentDSL.g:2505:2: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2506:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_6_0()); 
            // InternalSpringFluentDSL.g:2507:3: ( RULE_ID )
            // InternalSpringFluentDSL.g:2508:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_6_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_6"


    // $ANTLR start "rule__Entity__FeatureAssignment_4"
    // InternalSpringFluentDSL.g:2519:1: rule__Entity__FeatureAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2523:1: ( ( ruleFeature ) )
            // InternalSpringFluentDSL.g:2524:2: ( ruleFeature )
            {
            // InternalSpringFluentDSL.g:2524:2: ( ruleFeature )
            // InternalSpringFluentDSL.g:2525:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeatureFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeatureFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeatureAssignment_4"


    // $ANTLR start "rule__Feature__OperationAssignment_1"
    // InternalSpringFluentDSL.g:2534:1: rule__Feature__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__Feature__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2538:1: ( ( ruleOperation ) )
            // InternalSpringFluentDSL.g:2539:2: ( ruleOperation )
            {
            // InternalSpringFluentDSL.g:2539:2: ( ruleOperation )
            // InternalSpringFluentDSL.g:2540:3: ruleOperation
            {
             before(grammarAccess.getFeatureAccess().getOperationOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getOperationOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__OperationAssignment_1"


    // $ANTLR start "rule__Feature__IdAssignment_2"
    // InternalSpringFluentDSL.g:2549:1: rule__Feature__IdAssignment_2 : ( ruleIDENTITY ) ;
    public final void rule__Feature__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2553:1: ( ( ruleIDENTITY ) )
            // InternalSpringFluentDSL.g:2554:2: ( ruleIDENTITY )
            {
            // InternalSpringFluentDSL.g:2554:2: ( ruleIDENTITY )
            // InternalSpringFluentDSL.g:2555:3: ruleIDENTITY
            {
             before(grammarAccess.getFeatureAccess().getIdIDENTITYParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIDENTITY();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getIdIDENTITYParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IdAssignment_2"


    // $ANTLR start "rule__Feature__AttributesAssignment_3"
    // InternalSpringFluentDSL.g:2564:1: rule__Feature__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Feature__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2568:1: ( ( ruleAttribute ) )
            // InternalSpringFluentDSL.g:2569:2: ( ruleAttribute )
            {
            // InternalSpringFluentDSL.g:2569:2: ( ruleAttribute )
            // InternalSpringFluentDSL.g:2570:3: ruleAttribute
            {
             before(grammarAccess.getFeatureAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AttributesAssignment_3"


    // $ANTLR start "rule__Feature__RelationsAssignment_4"
    // InternalSpringFluentDSL.g:2579:1: rule__Feature__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__Feature__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2583:1: ( ( ruleRelation ) )
            // InternalSpringFluentDSL.g:2584:2: ( ruleRelation )
            {
            // InternalSpringFluentDSL.g:2584:2: ( ruleRelation )
            // InternalSpringFluentDSL.g:2585:3: ruleRelation
            {
             before(grammarAccess.getFeatureAccess().getRelationsRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getRelationsRelationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__RelationsAssignment_4"


    // $ANTLR start "rule__Strategy__StrategyAssignment_1"
    // InternalSpringFluentDSL.g:2594:1: rule__Strategy__StrategyAssignment_1 : ( ( rule__Strategy__StrategyAlternatives_1_0 ) ) ;
    public final void rule__Strategy__StrategyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2598:1: ( ( ( rule__Strategy__StrategyAlternatives_1_0 ) ) )
            // InternalSpringFluentDSL.g:2599:2: ( ( rule__Strategy__StrategyAlternatives_1_0 ) )
            {
            // InternalSpringFluentDSL.g:2599:2: ( ( rule__Strategy__StrategyAlternatives_1_0 ) )
            // InternalSpringFluentDSL.g:2600:3: ( rule__Strategy__StrategyAlternatives_1_0 )
            {
             before(grammarAccess.getStrategyAccess().getStrategyAlternatives_1_0()); 
            // InternalSpringFluentDSL.g:2601:3: ( rule__Strategy__StrategyAlternatives_1_0 )
            // InternalSpringFluentDSL.g:2601:4: rule__Strategy__StrategyAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__StrategyAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getStrategyAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__StrategyAssignment_1"


    // $ANTLR start "rule__IDENTITY__TypeAssignment_2"
    // InternalSpringFluentDSL.g:2609:1: rule__IDENTITY__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__IDENTITY__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2613:1: ( ( ruleType ) )
            // InternalSpringFluentDSL.g:2614:2: ( ruleType )
            {
            // InternalSpringFluentDSL.g:2614:2: ( ruleType )
            // InternalSpringFluentDSL.g:2615:3: ruleType
            {
             before(grammarAccess.getIDENTITYAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIDENTITYAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDENTITY__TypeAssignment_2"


    // $ANTLR start "rule__Operation__OperationAssignment_2"
    // InternalSpringFluentDSL.g:2624:1: rule__Operation__OperationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Operation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2628:1: ( ( RULE_STRING ) )
            // InternalSpringFluentDSL.g:2629:2: ( RULE_STRING )
            {
            // InternalSpringFluentDSL.g:2629:2: ( RULE_STRING )
            // InternalSpringFluentDSL.g:2630:3: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getOperationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalSpringFluentDSL.g:2639:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2643:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2644:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2644:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2645:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalSpringFluentDSL.g:2654:1: rule__Attribute__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2658:1: ( ( ruleType ) )
            // InternalSpringFluentDSL.g:2659:2: ( ruleType )
            {
            // InternalSpringFluentDSL.g:2659:2: ( ruleType )
            // InternalSpringFluentDSL.g:2660:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Relation__NameAssignment_0"
    // InternalSpringFluentDSL.g:2669:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2673:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2674:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2674:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2675:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_0"


    // $ANTLR start "rule__Relation__TargetAssignment_2"
    // InternalSpringFluentDSL.g:2684:1: rule__Relation__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2688:1: ( ( ( RULE_ID ) ) )
            // InternalSpringFluentDSL.g:2689:2: ( ( RULE_ID ) )
            {
            // InternalSpringFluentDSL.g:2689:2: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2690:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_2_0()); 
            // InternalSpringFluentDSL.g:2691:3: ( RULE_ID )
            // InternalSpringFluentDSL.g:2692:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTargetEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TargetAssignment_2"


    // $ANTLR start "rule__Relation__TypeAssignment_3"
    // InternalSpringFluentDSL.g:2703:1: rule__Relation__TypeAssignment_3 : ( ( rule__Relation__TypeAlternatives_3_0 ) ) ;
    public final void rule__Relation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2707:1: ( ( ( rule__Relation__TypeAlternatives_3_0 ) ) )
            // InternalSpringFluentDSL.g:2708:2: ( ( rule__Relation__TypeAlternatives_3_0 ) )
            {
            // InternalSpringFluentDSL.g:2708:2: ( ( rule__Relation__TypeAlternatives_3_0 ) )
            // InternalSpringFluentDSL.g:2709:3: ( rule__Relation__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getRelationAccess().getTypeAlternatives_3_0()); 
            // InternalSpringFluentDSL.g:2710:3: ( rule__Relation__TypeAlternatives_3_0 )
            // InternalSpringFluentDSL.g:2710:4: rule__Relation__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0007FFFFFFFC0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x03F8000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000003C000L});

}