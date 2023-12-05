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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SingleTable'", "'JoinedTable'", "'TablePerClass'", "'none'", "'mto'", "'otm'", "'oto'", "'mtm'", "'SpringDataJpa'", "'SpringWeb'", "'Lombok'", "'MySQLDriver'", "'DevTools'", "'Thymeleaf'", "'Swagger'", "'SpringSecurity'", "'Long'", "'Integer'", "'Double'", "'String'", "'Date'", "'Time'", "'Boolean'", "'prefix:'", "'app_name:'", "'dependencies'", "'{'", "'}'", "','", "'entities'", "'entity'", "'extends'", "'['", "'strategy'", "'='", "']'", "'id'", "':'", "'pk'", "'ops'", "'c'", "'r'", "'u'", "'d'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
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


    // $ANTLR start "rule__Operation__Alternatives_2"
    // InternalSpringFluentDSL.g:436:1: rule__Operation__Alternatives_2 : ( ( ( rule__Operation__Group_2_0__0 ) ) | ( ( 'none' )? ) );
    public final void rule__Operation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:440:1: ( ( ( rule__Operation__Group_2_0__0 ) ) | ( ( 'none' )? ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt3=1;
                }
                break;
            case EOF:
                {
                alt3=1;
                }
                break;
            case 47:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpringFluentDSL.g:441:2: ( ( rule__Operation__Group_2_0__0 ) )
                    {
                    // InternalSpringFluentDSL.g:441:2: ( ( rule__Operation__Group_2_0__0 ) )
                    // InternalSpringFluentDSL.g:442:3: ( rule__Operation__Group_2_0__0 )
                    {
                     before(grammarAccess.getOperationAccess().getGroup_2_0()); 
                    // InternalSpringFluentDSL.g:443:3: ( rule__Operation__Group_2_0__0 )
                    // InternalSpringFluentDSL.g:443:4: rule__Operation__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:447:2: ( ( 'none' )? )
                    {
                    // InternalSpringFluentDSL.g:447:2: ( ( 'none' )? )
                    // InternalSpringFluentDSL.g:448:3: ( 'none' )?
                    {
                     before(grammarAccess.getOperationAccess().getNoneKeyword_2_1()); 
                    // InternalSpringFluentDSL.g:449:3: ( 'none' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSpringFluentDSL.g:449:4: 'none'
                            {
                            match(input,14,FOLLOW_2); 

                            }
                            break;

                    }

                     after(grammarAccess.getOperationAccess().getNoneKeyword_2_1()); 

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
    // $ANTLR end "rule__Operation__Alternatives_2"


    // $ANTLR start "rule__Relation__TypeAlternatives_3_0"
    // InternalSpringFluentDSL.g:457:1: rule__Relation__TypeAlternatives_3_0 : ( ( 'mto' ) | ( 'otm' ) | ( 'oto' ) | ( 'mtm' ) );
    public final void rule__Relation__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:461:1: ( ( 'mto' ) | ( 'otm' ) | ( 'oto' ) | ( 'mtm' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpringFluentDSL.g:462:2: ( 'mto' )
                    {
                    // InternalSpringFluentDSL.g:462:2: ( 'mto' )
                    // InternalSpringFluentDSL.g:463:3: 'mto'
                    {
                     before(grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:468:2: ( 'otm' )
                    {
                    // InternalSpringFluentDSL.g:468:2: ( 'otm' )
                    // InternalSpringFluentDSL.g:469:3: 'otm'
                    {
                     before(grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:474:2: ( 'oto' )
                    {
                    // InternalSpringFluentDSL.g:474:2: ( 'oto' )
                    // InternalSpringFluentDSL.g:475:3: 'oto'
                    {
                     before(grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:480:2: ( 'mtm' )
                    {
                    // InternalSpringFluentDSL.g:480:2: ( 'mtm' )
                    // InternalSpringFluentDSL.g:481:3: 'mtm'
                    {
                     before(grammarAccess.getRelationAccess().getTypeMtmKeyword_3_0_3()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:490:1: rule__DependencyType__Alternatives : ( ( ( 'SpringDataJpa' ) ) | ( ( 'SpringWeb' ) ) | ( ( 'Lombok' ) ) | ( ( 'MySQLDriver' ) ) | ( ( 'DevTools' ) ) | ( ( 'Thymeleaf' ) ) | ( ( 'Swagger' ) ) | ( ( 'SpringSecurity' ) ) );
    public final void rule__DependencyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:494:1: ( ( ( 'SpringDataJpa' ) ) | ( ( 'SpringWeb' ) ) | ( ( 'Lombok' ) ) | ( ( 'MySQLDriver' ) ) | ( ( 'DevTools' ) ) | ( ( 'Thymeleaf' ) ) | ( ( 'Swagger' ) ) | ( ( 'SpringSecurity' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            case 24:
                {
                alt5=6;
                }
                break;
            case 25:
                {
                alt5=7;
                }
                break;
            case 26:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSpringFluentDSL.g:495:2: ( ( 'SpringDataJpa' ) )
                    {
                    // InternalSpringFluentDSL.g:495:2: ( ( 'SpringDataJpa' ) )
                    // InternalSpringFluentDSL.g:496:3: ( 'SpringDataJpa' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0()); 
                    // InternalSpringFluentDSL.g:497:3: ( 'SpringDataJpa' )
                    // InternalSpringFluentDSL.g:497:4: 'SpringDataJpa'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:501:2: ( ( 'SpringWeb' ) )
                    {
                    // InternalSpringFluentDSL.g:501:2: ( ( 'SpringWeb' ) )
                    // InternalSpringFluentDSL.g:502:3: ( 'SpringWeb' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1()); 
                    // InternalSpringFluentDSL.g:503:3: ( 'SpringWeb' )
                    // InternalSpringFluentDSL.g:503:4: 'SpringWeb'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:507:2: ( ( 'Lombok' ) )
                    {
                    // InternalSpringFluentDSL.g:507:2: ( ( 'Lombok' ) )
                    // InternalSpringFluentDSL.g:508:3: ( 'Lombok' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2()); 
                    // InternalSpringFluentDSL.g:509:3: ( 'Lombok' )
                    // InternalSpringFluentDSL.g:509:4: 'Lombok'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:513:2: ( ( 'MySQLDriver' ) )
                    {
                    // InternalSpringFluentDSL.g:513:2: ( ( 'MySQLDriver' ) )
                    // InternalSpringFluentDSL.g:514:3: ( 'MySQLDriver' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3()); 
                    // InternalSpringFluentDSL.g:515:3: ( 'MySQLDriver' )
                    // InternalSpringFluentDSL.g:515:4: 'MySQLDriver'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:519:2: ( ( 'DevTools' ) )
                    {
                    // InternalSpringFluentDSL.g:519:2: ( ( 'DevTools' ) )
                    // InternalSpringFluentDSL.g:520:3: ( 'DevTools' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4()); 
                    // InternalSpringFluentDSL.g:521:3: ( 'DevTools' )
                    // InternalSpringFluentDSL.g:521:4: 'DevTools'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:525:2: ( ( 'Thymeleaf' ) )
                    {
                    // InternalSpringFluentDSL.g:525:2: ( ( 'Thymeleaf' ) )
                    // InternalSpringFluentDSL.g:526:3: ( 'Thymeleaf' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getThymeleafEnumLiteralDeclaration_5()); 
                    // InternalSpringFluentDSL.g:527:3: ( 'Thymeleaf' )
                    // InternalSpringFluentDSL.g:527:4: 'Thymeleaf'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getThymeleafEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:531:2: ( ( 'Swagger' ) )
                    {
                    // InternalSpringFluentDSL.g:531:2: ( ( 'Swagger' ) )
                    // InternalSpringFluentDSL.g:532:3: ( 'Swagger' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_6()); 
                    // InternalSpringFluentDSL.g:533:3: ( 'Swagger' )
                    // InternalSpringFluentDSL.g:533:4: 'Swagger'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpringFluentDSL.g:537:2: ( ( 'SpringSecurity' ) )
                    {
                    // InternalSpringFluentDSL.g:537:2: ( ( 'SpringSecurity' ) )
                    // InternalSpringFluentDSL.g:538:3: ( 'SpringSecurity' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_7()); 
                    // InternalSpringFluentDSL.g:539:3: ( 'SpringSecurity' )
                    // InternalSpringFluentDSL.g:539:4: 'SpringSecurity'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_7()); 

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
    // InternalSpringFluentDSL.g:547:1: rule__Type__Alternatives : ( ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:551:1: ( ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Boolean' ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSpringFluentDSL.g:552:2: ( ( 'Long' ) )
                    {
                    // InternalSpringFluentDSL.g:552:2: ( ( 'Long' ) )
                    // InternalSpringFluentDSL.g:553:3: ( 'Long' )
                    {
                     before(grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0()); 
                    // InternalSpringFluentDSL.g:554:3: ( 'Long' )
                    // InternalSpringFluentDSL.g:554:4: 'Long'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:558:2: ( ( 'Integer' ) )
                    {
                    // InternalSpringFluentDSL.g:558:2: ( ( 'Integer' ) )
                    // InternalSpringFluentDSL.g:559:3: ( 'Integer' )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalSpringFluentDSL.g:560:3: ( 'Integer' )
                    // InternalSpringFluentDSL.g:560:4: 'Integer'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:564:2: ( ( 'Double' ) )
                    {
                    // InternalSpringFluentDSL.g:564:2: ( ( 'Double' ) )
                    // InternalSpringFluentDSL.g:565:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // InternalSpringFluentDSL.g:566:3: ( 'Double' )
                    // InternalSpringFluentDSL.g:566:4: 'Double'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:570:2: ( ( 'String' ) )
                    {
                    // InternalSpringFluentDSL.g:570:2: ( ( 'String' ) )
                    // InternalSpringFluentDSL.g:571:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // InternalSpringFluentDSL.g:572:3: ( 'String' )
                    // InternalSpringFluentDSL.g:572:4: 'String'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:576:2: ( ( 'Date' ) )
                    {
                    // InternalSpringFluentDSL.g:576:2: ( ( 'Date' ) )
                    // InternalSpringFluentDSL.g:577:3: ( 'Date' )
                    {
                     before(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalSpringFluentDSL.g:578:3: ( 'Date' )
                    // InternalSpringFluentDSL.g:578:4: 'Date'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:582:2: ( ( 'Time' ) )
                    {
                    // InternalSpringFluentDSL.g:582:2: ( ( 'Time' ) )
                    // InternalSpringFluentDSL.g:583:3: ( 'Time' )
                    {
                     before(grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5()); 
                    // InternalSpringFluentDSL.g:584:3: ( 'Time' )
                    // InternalSpringFluentDSL.g:584:4: 'Time'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:588:2: ( ( 'Boolean' ) )
                    {
                    // InternalSpringFluentDSL.g:588:2: ( ( 'Boolean' ) )
                    // InternalSpringFluentDSL.g:589:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // InternalSpringFluentDSL.g:590:3: ( 'Boolean' )
                    // InternalSpringFluentDSL.g:590:4: 'Boolean'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalSpringFluentDSL.g:598:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:602:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSpringFluentDSL.g:603:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSpringFluentDSL.g:610:1: rule__Model__Group__0__Impl : ( ( rule__Model__PrefixAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:614:1: ( ( ( rule__Model__PrefixAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:615:1: ( ( rule__Model__PrefixAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:615:1: ( ( rule__Model__PrefixAssignment_0 ) )
            // InternalSpringFluentDSL.g:616:2: ( rule__Model__PrefixAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_0()); 
            // InternalSpringFluentDSL.g:617:2: ( rule__Model__PrefixAssignment_0 )
            // InternalSpringFluentDSL.g:617:3: rule__Model__PrefixAssignment_0
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
    // InternalSpringFluentDSL.g:625:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:629:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSpringFluentDSL.g:630:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSpringFluentDSL.g:637:1: rule__Model__Group__1__Impl : ( ( rule__Model__AppNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:641:1: ( ( ( rule__Model__AppNameAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:642:1: ( ( rule__Model__AppNameAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:642:1: ( ( rule__Model__AppNameAssignment_1 ) )
            // InternalSpringFluentDSL.g:643:2: ( rule__Model__AppNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAppNameAssignment_1()); 
            // InternalSpringFluentDSL.g:644:2: ( rule__Model__AppNameAssignment_1 )
            // InternalSpringFluentDSL.g:644:3: rule__Model__AppNameAssignment_1
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
    // InternalSpringFluentDSL.g:652:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:656:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSpringFluentDSL.g:657:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSpringFluentDSL.g:664:1: rule__Model__Group__2__Impl : ( ( rule__Model__DependenciesAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:668:1: ( ( ( rule__Model__DependenciesAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:669:1: ( ( rule__Model__DependenciesAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:669:1: ( ( rule__Model__DependenciesAssignment_2 ) )
            // InternalSpringFluentDSL.g:670:2: ( rule__Model__DependenciesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getDependenciesAssignment_2()); 
            // InternalSpringFluentDSL.g:671:2: ( rule__Model__DependenciesAssignment_2 )
            // InternalSpringFluentDSL.g:671:3: rule__Model__DependenciesAssignment_2
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
    // InternalSpringFluentDSL.g:679:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:683:1: ( rule__Model__Group__3__Impl )
            // InternalSpringFluentDSL.g:684:2: rule__Model__Group__3__Impl
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
    // InternalSpringFluentDSL.g:690:1: rule__Model__Group__3__Impl : ( ( rule__Model__EntitiesAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:694:1: ( ( ( rule__Model__EntitiesAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:695:1: ( ( rule__Model__EntitiesAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:695:1: ( ( rule__Model__EntitiesAssignment_3 ) )
            // InternalSpringFluentDSL.g:696:2: ( rule__Model__EntitiesAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 
            // InternalSpringFluentDSL.g:697:2: ( rule__Model__EntitiesAssignment_3 )
            // InternalSpringFluentDSL.g:697:3: rule__Model__EntitiesAssignment_3
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
    // InternalSpringFluentDSL.g:706:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:710:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalSpringFluentDSL.g:711:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
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
    // InternalSpringFluentDSL.g:718:1: rule__Prefix__Group__0__Impl : ( () ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:722:1: ( ( () ) )
            // InternalSpringFluentDSL.g:723:1: ( () )
            {
            // InternalSpringFluentDSL.g:723:1: ( () )
            // InternalSpringFluentDSL.g:724:2: ()
            {
             before(grammarAccess.getPrefixAccess().getPrefixAction_0()); 
            // InternalSpringFluentDSL.g:725:2: ()
            // InternalSpringFluentDSL.g:725:3: 
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
    // InternalSpringFluentDSL.g:733:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:737:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalSpringFluentDSL.g:738:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
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
    // InternalSpringFluentDSL.g:745:1: rule__Prefix__Group__1__Impl : ( 'prefix:' ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:749:1: ( ( 'prefix:' ) )
            // InternalSpringFluentDSL.g:750:1: ( 'prefix:' )
            {
            // InternalSpringFluentDSL.g:750:1: ( 'prefix:' )
            // InternalSpringFluentDSL.g:751:2: 'prefix:'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:760:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:764:1: ( rule__Prefix__Group__2__Impl )
            // InternalSpringFluentDSL.g:765:2: rule__Prefix__Group__2__Impl
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
    // InternalSpringFluentDSL.g:771:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__PrefixAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:775:1: ( ( ( rule__Prefix__PrefixAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:776:1: ( ( rule__Prefix__PrefixAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:776:1: ( ( rule__Prefix__PrefixAssignment_2 ) )
            // InternalSpringFluentDSL.g:777:2: ( rule__Prefix__PrefixAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getPrefixAssignment_2()); 
            // InternalSpringFluentDSL.g:778:2: ( rule__Prefix__PrefixAssignment_2 )
            // InternalSpringFluentDSL.g:778:3: rule__Prefix__PrefixAssignment_2
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
    // InternalSpringFluentDSL.g:787:1: rule__AppName__Group__0 : rule__AppName__Group__0__Impl rule__AppName__Group__1 ;
    public final void rule__AppName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:791:1: ( rule__AppName__Group__0__Impl rule__AppName__Group__1 )
            // InternalSpringFluentDSL.g:792:2: rule__AppName__Group__0__Impl rule__AppName__Group__1
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
    // InternalSpringFluentDSL.g:799:1: rule__AppName__Group__0__Impl : ( () ) ;
    public final void rule__AppName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:803:1: ( ( () ) )
            // InternalSpringFluentDSL.g:804:1: ( () )
            {
            // InternalSpringFluentDSL.g:804:1: ( () )
            // InternalSpringFluentDSL.g:805:2: ()
            {
             before(grammarAccess.getAppNameAccess().getAppNameAction_0()); 
            // InternalSpringFluentDSL.g:806:2: ()
            // InternalSpringFluentDSL.g:806:3: 
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
    // InternalSpringFluentDSL.g:814:1: rule__AppName__Group__1 : rule__AppName__Group__1__Impl rule__AppName__Group__2 ;
    public final void rule__AppName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:818:1: ( rule__AppName__Group__1__Impl rule__AppName__Group__2 )
            // InternalSpringFluentDSL.g:819:2: rule__AppName__Group__1__Impl rule__AppName__Group__2
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
    // InternalSpringFluentDSL.g:826:1: rule__AppName__Group__1__Impl : ( 'app_name:' ) ;
    public final void rule__AppName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:830:1: ( ( 'app_name:' ) )
            // InternalSpringFluentDSL.g:831:1: ( 'app_name:' )
            {
            // InternalSpringFluentDSL.g:831:1: ( 'app_name:' )
            // InternalSpringFluentDSL.g:832:2: 'app_name:'
            {
             before(grammarAccess.getAppNameAccess().getApp_nameKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:841:1: rule__AppName__Group__2 : rule__AppName__Group__2__Impl ;
    public final void rule__AppName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:845:1: ( rule__AppName__Group__2__Impl )
            // InternalSpringFluentDSL.g:846:2: rule__AppName__Group__2__Impl
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
    // InternalSpringFluentDSL.g:852:1: rule__AppName__Group__2__Impl : ( ( rule__AppName__AppNameAssignment_2 ) ) ;
    public final void rule__AppName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:856:1: ( ( ( rule__AppName__AppNameAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:857:1: ( ( rule__AppName__AppNameAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:857:1: ( ( rule__AppName__AppNameAssignment_2 ) )
            // InternalSpringFluentDSL.g:858:2: ( rule__AppName__AppNameAssignment_2 )
            {
             before(grammarAccess.getAppNameAccess().getAppNameAssignment_2()); 
            // InternalSpringFluentDSL.g:859:2: ( rule__AppName__AppNameAssignment_2 )
            // InternalSpringFluentDSL.g:859:3: rule__AppName__AppNameAssignment_2
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
    // InternalSpringFluentDSL.g:868:1: rule__Dependencies__Group__0 : rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1 ;
    public final void rule__Dependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:872:1: ( rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1 )
            // InternalSpringFluentDSL.g:873:2: rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1
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
    // InternalSpringFluentDSL.g:880:1: rule__Dependencies__Group__0__Impl : ( () ) ;
    public final void rule__Dependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:884:1: ( ( () ) )
            // InternalSpringFluentDSL.g:885:1: ( () )
            {
            // InternalSpringFluentDSL.g:885:1: ( () )
            // InternalSpringFluentDSL.g:886:2: ()
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAction_0()); 
            // InternalSpringFluentDSL.g:887:2: ()
            // InternalSpringFluentDSL.g:887:3: 
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
    // InternalSpringFluentDSL.g:895:1: rule__Dependencies__Group__1 : rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2 ;
    public final void rule__Dependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:899:1: ( rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2 )
            // InternalSpringFluentDSL.g:900:2: rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2
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
    // InternalSpringFluentDSL.g:907:1: rule__Dependencies__Group__1__Impl : ( 'dependencies' ) ;
    public final void rule__Dependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:911:1: ( ( 'dependencies' ) )
            // InternalSpringFluentDSL.g:912:1: ( 'dependencies' )
            {
            // InternalSpringFluentDSL.g:912:1: ( 'dependencies' )
            // InternalSpringFluentDSL.g:913:2: 'dependencies'
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:922:1: rule__Dependencies__Group__2 : rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3 ;
    public final void rule__Dependencies__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:926:1: ( rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3 )
            // InternalSpringFluentDSL.g:927:2: rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3
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
    // InternalSpringFluentDSL.g:934:1: rule__Dependencies__Group__2__Impl : ( '{' ) ;
    public final void rule__Dependencies__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:938:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:939:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:939:1: ( '{' )
            // InternalSpringFluentDSL.g:940:2: '{'
            {
             before(grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:949:1: rule__Dependencies__Group__3 : rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4 ;
    public final void rule__Dependencies__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:953:1: ( rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4 )
            // InternalSpringFluentDSL.g:954:2: rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4
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
    // InternalSpringFluentDSL.g:961:1: rule__Dependencies__Group__3__Impl : ( ( rule__Dependencies__DependenciesAssignment_3 ) ) ;
    public final void rule__Dependencies__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:965:1: ( ( ( rule__Dependencies__DependenciesAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:966:1: ( ( rule__Dependencies__DependenciesAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:966:1: ( ( rule__Dependencies__DependenciesAssignment_3 ) )
            // InternalSpringFluentDSL.g:967:2: ( rule__Dependencies__DependenciesAssignment_3 )
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAssignment_3()); 
            // InternalSpringFluentDSL.g:968:2: ( rule__Dependencies__DependenciesAssignment_3 )
            // InternalSpringFluentDSL.g:968:3: rule__Dependencies__DependenciesAssignment_3
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
    // InternalSpringFluentDSL.g:976:1: rule__Dependencies__Group__4 : rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5 ;
    public final void rule__Dependencies__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:980:1: ( rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5 )
            // InternalSpringFluentDSL.g:981:2: rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5
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
    // InternalSpringFluentDSL.g:988:1: rule__Dependencies__Group__4__Impl : ( ( rule__Dependencies__Group_4__0 )* ) ;
    public final void rule__Dependencies__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:992:1: ( ( ( rule__Dependencies__Group_4__0 )* ) )
            // InternalSpringFluentDSL.g:993:1: ( ( rule__Dependencies__Group_4__0 )* )
            {
            // InternalSpringFluentDSL.g:993:1: ( ( rule__Dependencies__Group_4__0 )* )
            // InternalSpringFluentDSL.g:994:2: ( rule__Dependencies__Group_4__0 )*
            {
             before(grammarAccess.getDependenciesAccess().getGroup_4()); 
            // InternalSpringFluentDSL.g:995:2: ( rule__Dependencies__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:995:3: rule__Dependencies__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Dependencies__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSpringFluentDSL.g:1003:1: rule__Dependencies__Group__5 : rule__Dependencies__Group__5__Impl ;
    public final void rule__Dependencies__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1007:1: ( rule__Dependencies__Group__5__Impl )
            // InternalSpringFluentDSL.g:1008:2: rule__Dependencies__Group__5__Impl
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
    // InternalSpringFluentDSL.g:1014:1: rule__Dependencies__Group__5__Impl : ( '}' ) ;
    public final void rule__Dependencies__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1018:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1019:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1019:1: ( '}' )
            // InternalSpringFluentDSL.g:1020:2: '}'
            {
             before(grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1030:1: rule__Dependencies__Group_4__0 : rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1 ;
    public final void rule__Dependencies__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1034:1: ( rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1 )
            // InternalSpringFluentDSL.g:1035:2: rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1
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
    // InternalSpringFluentDSL.g:1042:1: rule__Dependencies__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Dependencies__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1046:1: ( ( ',' ) )
            // InternalSpringFluentDSL.g:1047:1: ( ',' )
            {
            // InternalSpringFluentDSL.g:1047:1: ( ',' )
            // InternalSpringFluentDSL.g:1048:2: ','
            {
             before(grammarAccess.getDependenciesAccess().getCommaKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1057:1: rule__Dependencies__Group_4__1 : rule__Dependencies__Group_4__1__Impl ;
    public final void rule__Dependencies__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1061:1: ( rule__Dependencies__Group_4__1__Impl )
            // InternalSpringFluentDSL.g:1062:2: rule__Dependencies__Group_4__1__Impl
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
    // InternalSpringFluentDSL.g:1068:1: rule__Dependencies__Group_4__1__Impl : ( ( rule__Dependencies__DependenciesAssignment_4_1 ) ) ;
    public final void rule__Dependencies__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1072:1: ( ( ( rule__Dependencies__DependenciesAssignment_4_1 ) ) )
            // InternalSpringFluentDSL.g:1073:1: ( ( rule__Dependencies__DependenciesAssignment_4_1 ) )
            {
            // InternalSpringFluentDSL.g:1073:1: ( ( rule__Dependencies__DependenciesAssignment_4_1 ) )
            // InternalSpringFluentDSL.g:1074:2: ( rule__Dependencies__DependenciesAssignment_4_1 )
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAssignment_4_1()); 
            // InternalSpringFluentDSL.g:1075:2: ( rule__Dependencies__DependenciesAssignment_4_1 )
            // InternalSpringFluentDSL.g:1075:3: rule__Dependencies__DependenciesAssignment_4_1
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
    // InternalSpringFluentDSL.g:1084:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1088:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalSpringFluentDSL.g:1089:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
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
    // InternalSpringFluentDSL.g:1096:1: rule__Dependency__Group__0__Impl : ( () ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1100:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1101:1: ( () )
            {
            // InternalSpringFluentDSL.g:1101:1: ( () )
            // InternalSpringFluentDSL.g:1102:2: ()
            {
             before(grammarAccess.getDependencyAccess().getDependencyAction_0()); 
            // InternalSpringFluentDSL.g:1103:2: ()
            // InternalSpringFluentDSL.g:1103:3: 
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
    // InternalSpringFluentDSL.g:1111:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1115:1: ( rule__Dependency__Group__1__Impl )
            // InternalSpringFluentDSL.g:1116:2: rule__Dependency__Group__1__Impl
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
    // InternalSpringFluentDSL.g:1122:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__DependencyAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1126:1: ( ( ( rule__Dependency__DependencyAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1127:1: ( ( rule__Dependency__DependencyAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1127:1: ( ( rule__Dependency__DependencyAssignment_1 ) )
            // InternalSpringFluentDSL.g:1128:2: ( rule__Dependency__DependencyAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyAssignment_1()); 
            // InternalSpringFluentDSL.g:1129:2: ( rule__Dependency__DependencyAssignment_1 )
            // InternalSpringFluentDSL.g:1129:3: rule__Dependency__DependencyAssignment_1
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
    // InternalSpringFluentDSL.g:1138:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1142:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalSpringFluentDSL.g:1143:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
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
    // InternalSpringFluentDSL.g:1150:1: rule__Entities__Group__0__Impl : ( () ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1154:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1155:1: ( () )
            {
            // InternalSpringFluentDSL.g:1155:1: ( () )
            // InternalSpringFluentDSL.g:1156:2: ()
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAction_0()); 
            // InternalSpringFluentDSL.g:1157:2: ()
            // InternalSpringFluentDSL.g:1157:3: 
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
    // InternalSpringFluentDSL.g:1165:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl rule__Entities__Group__2 ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1169:1: ( rule__Entities__Group__1__Impl rule__Entities__Group__2 )
            // InternalSpringFluentDSL.g:1170:2: rule__Entities__Group__1__Impl rule__Entities__Group__2
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
    // InternalSpringFluentDSL.g:1177:1: rule__Entities__Group__1__Impl : ( 'entities' ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1181:1: ( ( 'entities' ) )
            // InternalSpringFluentDSL.g:1182:1: ( 'entities' )
            {
            // InternalSpringFluentDSL.g:1182:1: ( 'entities' )
            // InternalSpringFluentDSL.g:1183:2: 'entities'
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1192:1: rule__Entities__Group__2 : rule__Entities__Group__2__Impl rule__Entities__Group__3 ;
    public final void rule__Entities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1196:1: ( rule__Entities__Group__2__Impl rule__Entities__Group__3 )
            // InternalSpringFluentDSL.g:1197:2: rule__Entities__Group__2__Impl rule__Entities__Group__3
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
    // InternalSpringFluentDSL.g:1204:1: rule__Entities__Group__2__Impl : ( '{' ) ;
    public final void rule__Entities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1208:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:1209:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:1209:1: ( '{' )
            // InternalSpringFluentDSL.g:1210:2: '{'
            {
             before(grammarAccess.getEntitiesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1219:1: rule__Entities__Group__3 : rule__Entities__Group__3__Impl rule__Entities__Group__4 ;
    public final void rule__Entities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1223:1: ( rule__Entities__Group__3__Impl rule__Entities__Group__4 )
            // InternalSpringFluentDSL.g:1224:2: rule__Entities__Group__3__Impl rule__Entities__Group__4
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
    // InternalSpringFluentDSL.g:1231:1: rule__Entities__Group__3__Impl : ( ( rule__Entities__EntitiesAssignment_3 )* ) ;
    public final void rule__Entities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1235:1: ( ( ( rule__Entities__EntitiesAssignment_3 )* ) )
            // InternalSpringFluentDSL.g:1236:1: ( ( rule__Entities__EntitiesAssignment_3 )* )
            {
            // InternalSpringFluentDSL.g:1236:1: ( ( rule__Entities__EntitiesAssignment_3 )* )
            // InternalSpringFluentDSL.g:1237:2: ( rule__Entities__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAssignment_3()); 
            // InternalSpringFluentDSL.g:1238:2: ( rule__Entities__EntitiesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1238:3: rule__Entities__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Entities__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSpringFluentDSL.g:1246:1: rule__Entities__Group__4 : rule__Entities__Group__4__Impl ;
    public final void rule__Entities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1250:1: ( rule__Entities__Group__4__Impl )
            // InternalSpringFluentDSL.g:1251:2: rule__Entities__Group__4__Impl
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
    // InternalSpringFluentDSL.g:1257:1: rule__Entities__Group__4__Impl : ( '}' ) ;
    public final void rule__Entities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1261:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1262:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1262:1: ( '}' )
            // InternalSpringFluentDSL.g:1263:2: '}'
            {
             before(grammarAccess.getEntitiesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1273:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1277:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSpringFluentDSL.g:1278:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalSpringFluentDSL.g:1285:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1289:1: ( ( 'entity' ) )
            // InternalSpringFluentDSL.g:1290:1: ( 'entity' )
            {
            // InternalSpringFluentDSL.g:1290:1: ( 'entity' )
            // InternalSpringFluentDSL.g:1291:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1300:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1304:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSpringFluentDSL.g:1305:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalSpringFluentDSL.g:1312:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1316:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1317:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1317:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSpringFluentDSL.g:1318:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSpringFluentDSL.g:1319:2: ( rule__Entity__NameAssignment_1 )
            // InternalSpringFluentDSL.g:1319:3: rule__Entity__NameAssignment_1
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
    // InternalSpringFluentDSL.g:1327:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1331:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSpringFluentDSL.g:1332:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalSpringFluentDSL.g:1339:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1343:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalSpringFluentDSL.g:1344:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalSpringFluentDSL.g:1344:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalSpringFluentDSL.g:1345:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalSpringFluentDSL.g:1346:2: ( rule__Entity__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpringFluentDSL.g:1346:3: rule__Entity__Group_2__0
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
    // InternalSpringFluentDSL.g:1354:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1358:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSpringFluentDSL.g:1359:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalSpringFluentDSL.g:1366:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1370:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:1371:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:1371:1: ( '{' )
            // InternalSpringFluentDSL.g:1372:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1381:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1385:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSpringFluentDSL.g:1386:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalSpringFluentDSL.g:1393:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeatureAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1397:1: ( ( ( rule__Entity__FeatureAssignment_4 ) ) )
            // InternalSpringFluentDSL.g:1398:1: ( ( rule__Entity__FeatureAssignment_4 ) )
            {
            // InternalSpringFluentDSL.g:1398:1: ( ( rule__Entity__FeatureAssignment_4 ) )
            // InternalSpringFluentDSL.g:1399:2: ( rule__Entity__FeatureAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getFeatureAssignment_4()); 
            // InternalSpringFluentDSL.g:1400:2: ( rule__Entity__FeatureAssignment_4 )
            // InternalSpringFluentDSL.g:1400:3: rule__Entity__FeatureAssignment_4
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
    // InternalSpringFluentDSL.g:1408:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1412:1: ( rule__Entity__Group__5__Impl )
            // InternalSpringFluentDSL.g:1413:2: rule__Entity__Group__5__Impl
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
    // InternalSpringFluentDSL.g:1419:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1423:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1424:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1424:1: ( '}' )
            // InternalSpringFluentDSL.g:1425:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1435:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1439:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalSpringFluentDSL.g:1440:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalSpringFluentDSL.g:1447:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1451:1: ( ( 'extends' ) )
            // InternalSpringFluentDSL.g:1452:1: ( 'extends' )
            {
            // InternalSpringFluentDSL.g:1452:1: ( 'extends' )
            // InternalSpringFluentDSL.g:1453:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1462:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1466:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalSpringFluentDSL.g:1467:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalSpringFluentDSL.g:1474:1: rule__Entity__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1478:1: ( ( '[' ) )
            // InternalSpringFluentDSL.g:1479:1: ( '[' )
            {
            // InternalSpringFluentDSL.g:1479:1: ( '[' )
            // InternalSpringFluentDSL.g:1480:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1489:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1493:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalSpringFluentDSL.g:1494:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
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
    // InternalSpringFluentDSL.g:1501:1: rule__Entity__Group_2__2__Impl : ( 'strategy' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1505:1: ( ( 'strategy' ) )
            // InternalSpringFluentDSL.g:1506:1: ( 'strategy' )
            {
            // InternalSpringFluentDSL.g:1506:1: ( 'strategy' )
            // InternalSpringFluentDSL.g:1507:2: 'strategy'
            {
             before(grammarAccess.getEntityAccess().getStrategyKeyword_2_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1516:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1520:1: ( rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 )
            // InternalSpringFluentDSL.g:1521:2: rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4
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
    // InternalSpringFluentDSL.g:1528:1: rule__Entity__Group_2__3__Impl : ( '=' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1532:1: ( ( '=' ) )
            // InternalSpringFluentDSL.g:1533:1: ( '=' )
            {
            // InternalSpringFluentDSL.g:1533:1: ( '=' )
            // InternalSpringFluentDSL.g:1534:2: '='
            {
             before(grammarAccess.getEntityAccess().getEqualsSignKeyword_2_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1543:1: rule__Entity__Group_2__4 : rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5 ;
    public final void rule__Entity__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1547:1: ( rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5 )
            // InternalSpringFluentDSL.g:1548:2: rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5
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
    // InternalSpringFluentDSL.g:1555:1: rule__Entity__Group_2__4__Impl : ( ( rule__Entity__StrategyAssignment_2_4 ) ) ;
    public final void rule__Entity__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1559:1: ( ( ( rule__Entity__StrategyAssignment_2_4 ) ) )
            // InternalSpringFluentDSL.g:1560:1: ( ( rule__Entity__StrategyAssignment_2_4 ) )
            {
            // InternalSpringFluentDSL.g:1560:1: ( ( rule__Entity__StrategyAssignment_2_4 ) )
            // InternalSpringFluentDSL.g:1561:2: ( rule__Entity__StrategyAssignment_2_4 )
            {
             before(grammarAccess.getEntityAccess().getStrategyAssignment_2_4()); 
            // InternalSpringFluentDSL.g:1562:2: ( rule__Entity__StrategyAssignment_2_4 )
            // InternalSpringFluentDSL.g:1562:3: rule__Entity__StrategyAssignment_2_4
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
    // InternalSpringFluentDSL.g:1570:1: rule__Entity__Group_2__5 : rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6 ;
    public final void rule__Entity__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1574:1: ( rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6 )
            // InternalSpringFluentDSL.g:1575:2: rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6
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
    // InternalSpringFluentDSL.g:1582:1: rule__Entity__Group_2__5__Impl : ( ']' ) ;
    public final void rule__Entity__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1586:1: ( ( ']' ) )
            // InternalSpringFluentDSL.g:1587:1: ( ']' )
            {
            // InternalSpringFluentDSL.g:1587:1: ( ']' )
            // InternalSpringFluentDSL.g:1588:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_5()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1597:1: rule__Entity__Group_2__6 : rule__Entity__Group_2__6__Impl ;
    public final void rule__Entity__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1601:1: ( rule__Entity__Group_2__6__Impl )
            // InternalSpringFluentDSL.g:1602:2: rule__Entity__Group_2__6__Impl
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
    // InternalSpringFluentDSL.g:1608:1: rule__Entity__Group_2__6__Impl : ( ( rule__Entity__SuperTypeAssignment_2_6 ) ) ;
    public final void rule__Entity__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1612:1: ( ( ( rule__Entity__SuperTypeAssignment_2_6 ) ) )
            // InternalSpringFluentDSL.g:1613:1: ( ( rule__Entity__SuperTypeAssignment_2_6 ) )
            {
            // InternalSpringFluentDSL.g:1613:1: ( ( rule__Entity__SuperTypeAssignment_2_6 ) )
            // InternalSpringFluentDSL.g:1614:2: ( rule__Entity__SuperTypeAssignment_2_6 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_6()); 
            // InternalSpringFluentDSL.g:1615:2: ( rule__Entity__SuperTypeAssignment_2_6 )
            // InternalSpringFluentDSL.g:1615:3: rule__Entity__SuperTypeAssignment_2_6
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
    // InternalSpringFluentDSL.g:1624:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1628:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSpringFluentDSL.g:1629:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalSpringFluentDSL.g:1636:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1640:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1641:1: ( () )
            {
            // InternalSpringFluentDSL.g:1641:1: ( () )
            // InternalSpringFluentDSL.g:1642:2: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // InternalSpringFluentDSL.g:1643:2: ()
            // InternalSpringFluentDSL.g:1643:3: 
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
    // InternalSpringFluentDSL.g:1651:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1655:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSpringFluentDSL.g:1656:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalSpringFluentDSL.g:1663:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__OperationAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1667:1: ( ( ( rule__Feature__OperationAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1668:1: ( ( rule__Feature__OperationAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1668:1: ( ( rule__Feature__OperationAssignment_1 ) )
            // InternalSpringFluentDSL.g:1669:2: ( rule__Feature__OperationAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getOperationAssignment_1()); 
            // InternalSpringFluentDSL.g:1670:2: ( rule__Feature__OperationAssignment_1 )
            // InternalSpringFluentDSL.g:1670:3: rule__Feature__OperationAssignment_1
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
    // InternalSpringFluentDSL.g:1678:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1682:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSpringFluentDSL.g:1683:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalSpringFluentDSL.g:1690:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IdAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1694:1: ( ( ( rule__Feature__IdAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:1695:1: ( ( rule__Feature__IdAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:1695:1: ( ( rule__Feature__IdAssignment_2 ) )
            // InternalSpringFluentDSL.g:1696:2: ( rule__Feature__IdAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getIdAssignment_2()); 
            // InternalSpringFluentDSL.g:1697:2: ( rule__Feature__IdAssignment_2 )
            // InternalSpringFluentDSL.g:1697:3: rule__Feature__IdAssignment_2
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
    // InternalSpringFluentDSL.g:1705:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1709:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSpringFluentDSL.g:1710:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalSpringFluentDSL.g:1717:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__AttributesAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1721:1: ( ( ( rule__Feature__AttributesAssignment_3 )* ) )
            // InternalSpringFluentDSL.g:1722:1: ( ( rule__Feature__AttributesAssignment_3 )* )
            {
            // InternalSpringFluentDSL.g:1722:1: ( ( rule__Feature__AttributesAssignment_3 )* )
            // InternalSpringFluentDSL.g:1723:2: ( rule__Feature__AttributesAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getAttributesAssignment_3()); 
            // InternalSpringFluentDSL.g:1724:2: ( rule__Feature__AttributesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==48) ) {
                        int LA10_3 = input.LA(3);

                        if ( ((LA10_3>=27 && LA10_3<=33)) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1724:3: rule__Feature__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Feature__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSpringFluentDSL.g:1732:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1736:1: ( rule__Feature__Group__4__Impl )
            // InternalSpringFluentDSL.g:1737:2: rule__Feature__Group__4__Impl
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
    // InternalSpringFluentDSL.g:1743:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__RelationsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1747:1: ( ( ( rule__Feature__RelationsAssignment_4 )* ) )
            // InternalSpringFluentDSL.g:1748:1: ( ( rule__Feature__RelationsAssignment_4 )* )
            {
            // InternalSpringFluentDSL.g:1748:1: ( ( rule__Feature__RelationsAssignment_4 )* )
            // InternalSpringFluentDSL.g:1749:2: ( rule__Feature__RelationsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getRelationsAssignment_4()); 
            // InternalSpringFluentDSL.g:1750:2: ( rule__Feature__RelationsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1750:3: rule__Feature__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Feature__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSpringFluentDSL.g:1759:1: rule__Strategy__Group__0 : rule__Strategy__Group__0__Impl rule__Strategy__Group__1 ;
    public final void rule__Strategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1763:1: ( rule__Strategy__Group__0__Impl rule__Strategy__Group__1 )
            // InternalSpringFluentDSL.g:1764:2: rule__Strategy__Group__0__Impl rule__Strategy__Group__1
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
    // InternalSpringFluentDSL.g:1771:1: rule__Strategy__Group__0__Impl : ( () ) ;
    public final void rule__Strategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1775:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1776:1: ( () )
            {
            // InternalSpringFluentDSL.g:1776:1: ( () )
            // InternalSpringFluentDSL.g:1777:2: ()
            {
             before(grammarAccess.getStrategyAccess().getStrategyAction_0()); 
            // InternalSpringFluentDSL.g:1778:2: ()
            // InternalSpringFluentDSL.g:1778:3: 
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
    // InternalSpringFluentDSL.g:1786:1: rule__Strategy__Group__1 : rule__Strategy__Group__1__Impl ;
    public final void rule__Strategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1790:1: ( rule__Strategy__Group__1__Impl )
            // InternalSpringFluentDSL.g:1791:2: rule__Strategy__Group__1__Impl
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
    // InternalSpringFluentDSL.g:1797:1: rule__Strategy__Group__1__Impl : ( ( rule__Strategy__StrategyAssignment_1 ) ) ;
    public final void rule__Strategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1801:1: ( ( ( rule__Strategy__StrategyAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1802:1: ( ( rule__Strategy__StrategyAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1802:1: ( ( rule__Strategy__StrategyAssignment_1 ) )
            // InternalSpringFluentDSL.g:1803:2: ( rule__Strategy__StrategyAssignment_1 )
            {
             before(grammarAccess.getStrategyAccess().getStrategyAssignment_1()); 
            // InternalSpringFluentDSL.g:1804:2: ( rule__Strategy__StrategyAssignment_1 )
            // InternalSpringFluentDSL.g:1804:3: rule__Strategy__StrategyAssignment_1
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
    // InternalSpringFluentDSL.g:1813:1: rule__IDENTITY__Group__0 : rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1 ;
    public final void rule__IDENTITY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1817:1: ( rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1 )
            // InternalSpringFluentDSL.g:1818:2: rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1
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
    // InternalSpringFluentDSL.g:1825:1: rule__IDENTITY__Group__0__Impl : ( 'id' ) ;
    public final void rule__IDENTITY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1829:1: ( ( 'id' ) )
            // InternalSpringFluentDSL.g:1830:1: ( 'id' )
            {
            // InternalSpringFluentDSL.g:1830:1: ( 'id' )
            // InternalSpringFluentDSL.g:1831:2: 'id'
            {
             before(grammarAccess.getIDENTITYAccess().getIdKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1840:1: rule__IDENTITY__Group__1 : rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2 ;
    public final void rule__IDENTITY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1844:1: ( rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2 )
            // InternalSpringFluentDSL.g:1845:2: rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2
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
    // InternalSpringFluentDSL.g:1852:1: rule__IDENTITY__Group__1__Impl : ( ':' ) ;
    public final void rule__IDENTITY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1856:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:1857:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:1857:1: ( ':' )
            // InternalSpringFluentDSL.g:1858:2: ':'
            {
             before(grammarAccess.getIDENTITYAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1867:1: rule__IDENTITY__Group__2 : rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3 ;
    public final void rule__IDENTITY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1871:1: ( rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3 )
            // InternalSpringFluentDSL.g:1872:2: rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3
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
    // InternalSpringFluentDSL.g:1879:1: rule__IDENTITY__Group__2__Impl : ( ( rule__IDENTITY__TypeAssignment_2 ) ) ;
    public final void rule__IDENTITY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1883:1: ( ( ( rule__IDENTITY__TypeAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:1884:1: ( ( rule__IDENTITY__TypeAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:1884:1: ( ( rule__IDENTITY__TypeAssignment_2 ) )
            // InternalSpringFluentDSL.g:1885:2: ( rule__IDENTITY__TypeAssignment_2 )
            {
             before(grammarAccess.getIDENTITYAccess().getTypeAssignment_2()); 
            // InternalSpringFluentDSL.g:1886:2: ( rule__IDENTITY__TypeAssignment_2 )
            // InternalSpringFluentDSL.g:1886:3: rule__IDENTITY__TypeAssignment_2
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
    // InternalSpringFluentDSL.g:1894:1: rule__IDENTITY__Group__3 : rule__IDENTITY__Group__3__Impl ;
    public final void rule__IDENTITY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1898:1: ( rule__IDENTITY__Group__3__Impl )
            // InternalSpringFluentDSL.g:1899:2: rule__IDENTITY__Group__3__Impl
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
    // InternalSpringFluentDSL.g:1905:1: rule__IDENTITY__Group__3__Impl : ( 'pk' ) ;
    public final void rule__IDENTITY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1909:1: ( ( 'pk' ) )
            // InternalSpringFluentDSL.g:1910:1: ( 'pk' )
            {
            // InternalSpringFluentDSL.g:1910:1: ( 'pk' )
            // InternalSpringFluentDSL.g:1911:2: 'pk'
            {
             before(grammarAccess.getIDENTITYAccess().getPkKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1921:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1925:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalSpringFluentDSL.g:1926:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
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
    // InternalSpringFluentDSL.g:1933:1: rule__Operation__Group__0__Impl : ( 'ops' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1937:1: ( ( 'ops' ) )
            // InternalSpringFluentDSL.g:1938:1: ( 'ops' )
            {
            // InternalSpringFluentDSL.g:1938:1: ( 'ops' )
            // InternalSpringFluentDSL.g:1939:2: 'ops'
            {
             before(grammarAccess.getOperationAccess().getOpsKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1948:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1952:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalSpringFluentDSL.g:1953:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSpringFluentDSL.g:1960:1: rule__Operation__Group__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1964:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:1965:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:1965:1: ( ':' )
            // InternalSpringFluentDSL.g:1966:2: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1975:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1979:1: ( rule__Operation__Group__2__Impl )
            // InternalSpringFluentDSL.g:1980:2: rule__Operation__Group__2__Impl
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
    // InternalSpringFluentDSL.g:1986:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__Alternatives_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1990:1: ( ( ( rule__Operation__Alternatives_2 ) ) )
            // InternalSpringFluentDSL.g:1991:1: ( ( rule__Operation__Alternatives_2 ) )
            {
            // InternalSpringFluentDSL.g:1991:1: ( ( rule__Operation__Alternatives_2 ) )
            // InternalSpringFluentDSL.g:1992:2: ( rule__Operation__Alternatives_2 )
            {
             before(grammarAccess.getOperationAccess().getAlternatives_2()); 
            // InternalSpringFluentDSL.g:1993:2: ( rule__Operation__Alternatives_2 )
            // InternalSpringFluentDSL.g:1993:3: rule__Operation__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives_2()); 

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


    // $ANTLR start "rule__Operation__Group_2_0__0"
    // InternalSpringFluentDSL.g:2002:1: rule__Operation__Group_2_0__0 : rule__Operation__Group_2_0__0__Impl rule__Operation__Group_2_0__1 ;
    public final void rule__Operation__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2006:1: ( rule__Operation__Group_2_0__0__Impl rule__Operation__Group_2_0__1 )
            // InternalSpringFluentDSL.g:2007:2: rule__Operation__Group_2_0__0__Impl rule__Operation__Group_2_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Operation__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_2_0__1();

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
    // $ANTLR end "rule__Operation__Group_2_0__0"


    // $ANTLR start "rule__Operation__Group_2_0__0__Impl"
    // InternalSpringFluentDSL.g:2014:1: rule__Operation__Group_2_0__0__Impl : ( ( 'c' )? ) ;
    public final void rule__Operation__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2018:1: ( ( ( 'c' )? ) )
            // InternalSpringFluentDSL.g:2019:1: ( ( 'c' )? )
            {
            // InternalSpringFluentDSL.g:2019:1: ( ( 'c' )? )
            // InternalSpringFluentDSL.g:2020:2: ( 'c' )?
            {
             before(grammarAccess.getOperationAccess().getCKeyword_2_0_0()); 
            // InternalSpringFluentDSL.g:2021:2: ( 'c' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==51) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpringFluentDSL.g:2021:3: 'c'
                    {
                    match(input,51,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getCKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Operation__Group_2_0__0__Impl"


    // $ANTLR start "rule__Operation__Group_2_0__1"
    // InternalSpringFluentDSL.g:2029:1: rule__Operation__Group_2_0__1 : rule__Operation__Group_2_0__1__Impl rule__Operation__Group_2_0__2 ;
    public final void rule__Operation__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2033:1: ( rule__Operation__Group_2_0__1__Impl rule__Operation__Group_2_0__2 )
            // InternalSpringFluentDSL.g:2034:2: rule__Operation__Group_2_0__1__Impl rule__Operation__Group_2_0__2
            {
            pushFollow(FOLLOW_29);
            rule__Operation__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_2_0__2();

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
    // $ANTLR end "rule__Operation__Group_2_0__1"


    // $ANTLR start "rule__Operation__Group_2_0__1__Impl"
    // InternalSpringFluentDSL.g:2041:1: rule__Operation__Group_2_0__1__Impl : ( ( 'r' )? ) ;
    public final void rule__Operation__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2045:1: ( ( ( 'r' )? ) )
            // InternalSpringFluentDSL.g:2046:1: ( ( 'r' )? )
            {
            // InternalSpringFluentDSL.g:2046:1: ( ( 'r' )? )
            // InternalSpringFluentDSL.g:2047:2: ( 'r' )?
            {
             before(grammarAccess.getOperationAccess().getRKeyword_2_0_1()); 
            // InternalSpringFluentDSL.g:2048:2: ( 'r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==52) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpringFluentDSL.g:2048:3: 'r'
                    {
                    match(input,52,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getRKeyword_2_0_1()); 

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
    // $ANTLR end "rule__Operation__Group_2_0__1__Impl"


    // $ANTLR start "rule__Operation__Group_2_0__2"
    // InternalSpringFluentDSL.g:2056:1: rule__Operation__Group_2_0__2 : rule__Operation__Group_2_0__2__Impl rule__Operation__Group_2_0__3 ;
    public final void rule__Operation__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2060:1: ( rule__Operation__Group_2_0__2__Impl rule__Operation__Group_2_0__3 )
            // InternalSpringFluentDSL.g:2061:2: rule__Operation__Group_2_0__2__Impl rule__Operation__Group_2_0__3
            {
            pushFollow(FOLLOW_29);
            rule__Operation__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_2_0__3();

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
    // $ANTLR end "rule__Operation__Group_2_0__2"


    // $ANTLR start "rule__Operation__Group_2_0__2__Impl"
    // InternalSpringFluentDSL.g:2068:1: rule__Operation__Group_2_0__2__Impl : ( ( 'u' )? ) ;
    public final void rule__Operation__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2072:1: ( ( ( 'u' )? ) )
            // InternalSpringFluentDSL.g:2073:1: ( ( 'u' )? )
            {
            // InternalSpringFluentDSL.g:2073:1: ( ( 'u' )? )
            // InternalSpringFluentDSL.g:2074:2: ( 'u' )?
            {
             before(grammarAccess.getOperationAccess().getUKeyword_2_0_2()); 
            // InternalSpringFluentDSL.g:2075:2: ( 'u' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpringFluentDSL.g:2075:3: 'u'
                    {
                    match(input,53,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getUKeyword_2_0_2()); 

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
    // $ANTLR end "rule__Operation__Group_2_0__2__Impl"


    // $ANTLR start "rule__Operation__Group_2_0__3"
    // InternalSpringFluentDSL.g:2083:1: rule__Operation__Group_2_0__3 : rule__Operation__Group_2_0__3__Impl ;
    public final void rule__Operation__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2087:1: ( rule__Operation__Group_2_0__3__Impl )
            // InternalSpringFluentDSL.g:2088:2: rule__Operation__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_2_0__3__Impl();

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
    // $ANTLR end "rule__Operation__Group_2_0__3"


    // $ANTLR start "rule__Operation__Group_2_0__3__Impl"
    // InternalSpringFluentDSL.g:2094:1: rule__Operation__Group_2_0__3__Impl : ( ( 'd' )? ) ;
    public final void rule__Operation__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2098:1: ( ( ( 'd' )? ) )
            // InternalSpringFluentDSL.g:2099:1: ( ( 'd' )? )
            {
            // InternalSpringFluentDSL.g:2099:1: ( ( 'd' )? )
            // InternalSpringFluentDSL.g:2100:2: ( 'd' )?
            {
             before(grammarAccess.getOperationAccess().getDKeyword_2_0_3()); 
            // InternalSpringFluentDSL.g:2101:2: ( 'd' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpringFluentDSL.g:2101:3: 'd'
                    {
                    match(input,54,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getDKeyword_2_0_3()); 

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
    // $ANTLR end "rule__Operation__Group_2_0__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSpringFluentDSL.g:2110:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2114:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSpringFluentDSL.g:2115:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSpringFluentDSL.g:2122:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2126:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:2127:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:2127:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalSpringFluentDSL.g:2128:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalSpringFluentDSL.g:2129:2: ( rule__Attribute__NameAssignment_0 )
            // InternalSpringFluentDSL.g:2129:3: rule__Attribute__NameAssignment_0
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
    // InternalSpringFluentDSL.g:2137:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2141:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSpringFluentDSL.g:2142:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSpringFluentDSL.g:2149:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2153:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:2154:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:2154:1: ( ':' )
            // InternalSpringFluentDSL.g:2155:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:2164:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2168:1: ( rule__Attribute__Group__2__Impl )
            // InternalSpringFluentDSL.g:2169:2: rule__Attribute__Group__2__Impl
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
    // InternalSpringFluentDSL.g:2175:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2179:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2180:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2180:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalSpringFluentDSL.g:2181:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalSpringFluentDSL.g:2182:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalSpringFluentDSL.g:2182:3: rule__Attribute__TypeAssignment_2
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
    // InternalSpringFluentDSL.g:2191:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2195:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSpringFluentDSL.g:2196:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalSpringFluentDSL.g:2203:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2207:1: ( ( ( rule__Relation__NameAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:2208:1: ( ( rule__Relation__NameAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:2208:1: ( ( rule__Relation__NameAssignment_0 ) )
            // InternalSpringFluentDSL.g:2209:2: ( rule__Relation__NameAssignment_0 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalSpringFluentDSL.g:2210:2: ( rule__Relation__NameAssignment_0 )
            // InternalSpringFluentDSL.g:2210:3: rule__Relation__NameAssignment_0
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
    // InternalSpringFluentDSL.g:2218:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2222:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSpringFluentDSL.g:2223:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalSpringFluentDSL.g:2230:1: rule__Relation__Group__1__Impl : ( ':' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2234:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:2235:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:2235:1: ( ':' )
            // InternalSpringFluentDSL.g:2236:2: ':'
            {
             before(grammarAccess.getRelationAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:2245:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2249:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSpringFluentDSL.g:2250:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSpringFluentDSL.g:2257:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__TargetAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2261:1: ( ( ( rule__Relation__TargetAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2262:1: ( ( rule__Relation__TargetAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2262:1: ( ( rule__Relation__TargetAssignment_2 ) )
            // InternalSpringFluentDSL.g:2263:2: ( rule__Relation__TargetAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_2()); 
            // InternalSpringFluentDSL.g:2264:2: ( rule__Relation__TargetAssignment_2 )
            // InternalSpringFluentDSL.g:2264:3: rule__Relation__TargetAssignment_2
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
    // InternalSpringFluentDSL.g:2272:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2276:1: ( rule__Relation__Group__3__Impl )
            // InternalSpringFluentDSL.g:2277:2: rule__Relation__Group__3__Impl
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
    // InternalSpringFluentDSL.g:2283:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__TypeAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2287:1: ( ( ( rule__Relation__TypeAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:2288:1: ( ( rule__Relation__TypeAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:2288:1: ( ( rule__Relation__TypeAssignment_3 ) )
            // InternalSpringFluentDSL.g:2289:2: ( rule__Relation__TypeAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_3()); 
            // InternalSpringFluentDSL.g:2290:2: ( rule__Relation__TypeAssignment_3 )
            // InternalSpringFluentDSL.g:2290:3: rule__Relation__TypeAssignment_3
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
    // InternalSpringFluentDSL.g:2299:1: rule__Model__PrefixAssignment_0 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2303:1: ( ( rulePrefix ) )
            // InternalSpringFluentDSL.g:2304:2: ( rulePrefix )
            {
            // InternalSpringFluentDSL.g:2304:2: ( rulePrefix )
            // InternalSpringFluentDSL.g:2305:3: rulePrefix
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
    // InternalSpringFluentDSL.g:2314:1: rule__Model__AppNameAssignment_1 : ( ruleAppName ) ;
    public final void rule__Model__AppNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2318:1: ( ( ruleAppName ) )
            // InternalSpringFluentDSL.g:2319:2: ( ruleAppName )
            {
            // InternalSpringFluentDSL.g:2319:2: ( ruleAppName )
            // InternalSpringFluentDSL.g:2320:3: ruleAppName
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
    // InternalSpringFluentDSL.g:2329:1: rule__Model__DependenciesAssignment_2 : ( ruleDependencies ) ;
    public final void rule__Model__DependenciesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2333:1: ( ( ruleDependencies ) )
            // InternalSpringFluentDSL.g:2334:2: ( ruleDependencies )
            {
            // InternalSpringFluentDSL.g:2334:2: ( ruleDependencies )
            // InternalSpringFluentDSL.g:2335:3: ruleDependencies
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
    // InternalSpringFluentDSL.g:2344:1: rule__Model__EntitiesAssignment_3 : ( ruleEntities ) ;
    public final void rule__Model__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2348:1: ( ( ruleEntities ) )
            // InternalSpringFluentDSL.g:2349:2: ( ruleEntities )
            {
            // InternalSpringFluentDSL.g:2349:2: ( ruleEntities )
            // InternalSpringFluentDSL.g:2350:3: ruleEntities
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
    // InternalSpringFluentDSL.g:2359:1: rule__Prefix__PrefixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2363:1: ( ( RULE_STRING ) )
            // InternalSpringFluentDSL.g:2364:2: ( RULE_STRING )
            {
            // InternalSpringFluentDSL.g:2364:2: ( RULE_STRING )
            // InternalSpringFluentDSL.g:2365:3: RULE_STRING
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
    // InternalSpringFluentDSL.g:2374:1: rule__AppName__AppNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AppName__AppNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2378:1: ( ( RULE_STRING ) )
            // InternalSpringFluentDSL.g:2379:2: ( RULE_STRING )
            {
            // InternalSpringFluentDSL.g:2379:2: ( RULE_STRING )
            // InternalSpringFluentDSL.g:2380:3: RULE_STRING
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
    // InternalSpringFluentDSL.g:2389:1: rule__Dependencies__DependenciesAssignment_3 : ( ruleDependency ) ;
    public final void rule__Dependencies__DependenciesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2393:1: ( ( ruleDependency ) )
            // InternalSpringFluentDSL.g:2394:2: ( ruleDependency )
            {
            // InternalSpringFluentDSL.g:2394:2: ( ruleDependency )
            // InternalSpringFluentDSL.g:2395:3: ruleDependency
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
    // InternalSpringFluentDSL.g:2404:1: rule__Dependencies__DependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Dependencies__DependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2408:1: ( ( ruleDependency ) )
            // InternalSpringFluentDSL.g:2409:2: ( ruleDependency )
            {
            // InternalSpringFluentDSL.g:2409:2: ( ruleDependency )
            // InternalSpringFluentDSL.g:2410:3: ruleDependency
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
    // InternalSpringFluentDSL.g:2419:1: rule__Dependency__DependencyAssignment_1 : ( ruleDependencyType ) ;
    public final void rule__Dependency__DependencyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2423:1: ( ( ruleDependencyType ) )
            // InternalSpringFluentDSL.g:2424:2: ( ruleDependencyType )
            {
            // InternalSpringFluentDSL.g:2424:2: ( ruleDependencyType )
            // InternalSpringFluentDSL.g:2425:3: ruleDependencyType
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
    // InternalSpringFluentDSL.g:2434:1: rule__Entities__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Entities__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2438:1: ( ( ruleEntity ) )
            // InternalSpringFluentDSL.g:2439:2: ( ruleEntity )
            {
            // InternalSpringFluentDSL.g:2439:2: ( ruleEntity )
            // InternalSpringFluentDSL.g:2440:3: ruleEntity
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
    // InternalSpringFluentDSL.g:2449:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2453:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2454:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2454:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2455:3: RULE_ID
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
    // InternalSpringFluentDSL.g:2464:1: rule__Entity__StrategyAssignment_2_4 : ( ruleStrategy ) ;
    public final void rule__Entity__StrategyAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2468:1: ( ( ruleStrategy ) )
            // InternalSpringFluentDSL.g:2469:2: ( ruleStrategy )
            {
            // InternalSpringFluentDSL.g:2469:2: ( ruleStrategy )
            // InternalSpringFluentDSL.g:2470:3: ruleStrategy
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
    // InternalSpringFluentDSL.g:2479:1: rule__Entity__SuperTypeAssignment_2_6 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2483:1: ( ( ( RULE_ID ) ) )
            // InternalSpringFluentDSL.g:2484:2: ( ( RULE_ID ) )
            {
            // InternalSpringFluentDSL.g:2484:2: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2485:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_6_0()); 
            // InternalSpringFluentDSL.g:2486:3: ( RULE_ID )
            // InternalSpringFluentDSL.g:2487:4: RULE_ID
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
    // InternalSpringFluentDSL.g:2498:1: rule__Entity__FeatureAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2502:1: ( ( ruleFeature ) )
            // InternalSpringFluentDSL.g:2503:2: ( ruleFeature )
            {
            // InternalSpringFluentDSL.g:2503:2: ( ruleFeature )
            // InternalSpringFluentDSL.g:2504:3: ruleFeature
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
    // InternalSpringFluentDSL.g:2513:1: rule__Feature__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__Feature__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2517:1: ( ( ruleOperation ) )
            // InternalSpringFluentDSL.g:2518:2: ( ruleOperation )
            {
            // InternalSpringFluentDSL.g:2518:2: ( ruleOperation )
            // InternalSpringFluentDSL.g:2519:3: ruleOperation
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
    // InternalSpringFluentDSL.g:2528:1: rule__Feature__IdAssignment_2 : ( ruleIDENTITY ) ;
    public final void rule__Feature__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2532:1: ( ( ruleIDENTITY ) )
            // InternalSpringFluentDSL.g:2533:2: ( ruleIDENTITY )
            {
            // InternalSpringFluentDSL.g:2533:2: ( ruleIDENTITY )
            // InternalSpringFluentDSL.g:2534:3: ruleIDENTITY
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
    // InternalSpringFluentDSL.g:2543:1: rule__Feature__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Feature__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2547:1: ( ( ruleAttribute ) )
            // InternalSpringFluentDSL.g:2548:2: ( ruleAttribute )
            {
            // InternalSpringFluentDSL.g:2548:2: ( ruleAttribute )
            // InternalSpringFluentDSL.g:2549:3: ruleAttribute
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
    // InternalSpringFluentDSL.g:2558:1: rule__Feature__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__Feature__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2562:1: ( ( ruleRelation ) )
            // InternalSpringFluentDSL.g:2563:2: ( ruleRelation )
            {
            // InternalSpringFluentDSL.g:2563:2: ( ruleRelation )
            // InternalSpringFluentDSL.g:2564:3: ruleRelation
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
    // InternalSpringFluentDSL.g:2573:1: rule__Strategy__StrategyAssignment_1 : ( ( rule__Strategy__StrategyAlternatives_1_0 ) ) ;
    public final void rule__Strategy__StrategyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2577:1: ( ( ( rule__Strategy__StrategyAlternatives_1_0 ) ) )
            // InternalSpringFluentDSL.g:2578:2: ( ( rule__Strategy__StrategyAlternatives_1_0 ) )
            {
            // InternalSpringFluentDSL.g:2578:2: ( ( rule__Strategy__StrategyAlternatives_1_0 ) )
            // InternalSpringFluentDSL.g:2579:3: ( rule__Strategy__StrategyAlternatives_1_0 )
            {
             before(grammarAccess.getStrategyAccess().getStrategyAlternatives_1_0()); 
            // InternalSpringFluentDSL.g:2580:3: ( rule__Strategy__StrategyAlternatives_1_0 )
            // InternalSpringFluentDSL.g:2580:4: rule__Strategy__StrategyAlternatives_1_0
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
    // InternalSpringFluentDSL.g:2588:1: rule__IDENTITY__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__IDENTITY__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2592:1: ( ( ruleType ) )
            // InternalSpringFluentDSL.g:2593:2: ( ruleType )
            {
            // InternalSpringFluentDSL.g:2593:2: ( ruleType )
            // InternalSpringFluentDSL.g:2594:3: ruleType
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalSpringFluentDSL.g:2603:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2607:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2608:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2608:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2609:3: RULE_ID
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
    // InternalSpringFluentDSL.g:2618:1: rule__Attribute__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2622:1: ( ( ruleType ) )
            // InternalSpringFluentDSL.g:2623:2: ( ruleType )
            {
            // InternalSpringFluentDSL.g:2623:2: ( ruleType )
            // InternalSpringFluentDSL.g:2624:3: ruleType
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
    // InternalSpringFluentDSL.g:2633:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2637:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2638:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2638:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2639:3: RULE_ID
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
    // InternalSpringFluentDSL.g:2648:1: rule__Relation__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2652:1: ( ( ( RULE_ID ) ) )
            // InternalSpringFluentDSL.g:2653:2: ( ( RULE_ID ) )
            {
            // InternalSpringFluentDSL.g:2653:2: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2654:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_2_0()); 
            // InternalSpringFluentDSL.g:2655:3: ( RULE_ID )
            // InternalSpringFluentDSL.g:2656:4: RULE_ID
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
    // InternalSpringFluentDSL.g:2667:1: rule__Relation__TypeAssignment_3 : ( ( rule__Relation__TypeAlternatives_3_0 ) ) ;
    public final void rule__Relation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2671:1: ( ( ( rule__Relation__TypeAlternatives_3_0 ) ) )
            // InternalSpringFluentDSL.g:2672:2: ( ( rule__Relation__TypeAlternatives_3_0 ) )
            {
            // InternalSpringFluentDSL.g:2672:2: ( ( rule__Relation__TypeAlternatives_3_0 ) )
            // InternalSpringFluentDSL.g:2673:3: ( rule__Relation__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getRelationAccess().getTypeAlternatives_3_0()); 
            // InternalSpringFluentDSL.g:2674:3: ( rule__Relation__TypeAlternatives_3_0 )
            // InternalSpringFluentDSL.g:2674:4: rule__Relation__TypeAlternatives_3_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0078000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000078000L});

}