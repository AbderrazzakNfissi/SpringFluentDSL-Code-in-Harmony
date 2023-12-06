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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SingleTable'", "'JoinedTable'", "'TablePerClass'", "'mto'", "'otm'", "'oto'", "'mtm'", "'SpringDataJpa'", "'SpringWeb'", "'Lombok'", "'MySQLDriver'", "'DevTools'", "'Thymeleaf'", "'Swagger'", "'SpringSecurity'", "'Long'", "'Integer'", "'Double'", "'String'", "'Date'", "'Time'", "'Boolean'", "'prefix:'", "'app_name:'", "'dependencies'", "'{'", "'}'", "','", "'entities'", "'entity'", "'extends'", "'['", "'strategy'", "'='", "']'", "'id'", "':'", "'pk'", "'ops'", "'r'", "'u'", "'d'", "'none'", "'c'"
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


    // $ANTLR start "entryRuleOperationType"
    // InternalSpringFluentDSL.g:328:1: entryRuleOperationType : ruleOperationType EOF ;
    public final void entryRuleOperationType() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:329:1: ( ruleOperationType EOF )
            // InternalSpringFluentDSL.g:330:1: ruleOperationType EOF
            {
             before(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationTypeRule()); 
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
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // InternalSpringFluentDSL.g:337:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:341:2: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalSpringFluentDSL.g:342:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalSpringFluentDSL.g:342:2: ( ( rule__OperationType__Alternatives ) )
            // InternalSpringFluentDSL.g:343:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalSpringFluentDSL.g:344:3: ( rule__OperationType__Alternatives )
            // InternalSpringFluentDSL.g:344:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleAttribute"
    // InternalSpringFluentDSL.g:353:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:354:1: ( ruleAttribute EOF )
            // InternalSpringFluentDSL.g:355:1: ruleAttribute EOF
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
    // InternalSpringFluentDSL.g:362:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:366:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSpringFluentDSL.g:367:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:367:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSpringFluentDSL.g:368:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSpringFluentDSL.g:369:3: ( rule__Attribute__Group__0 )
            // InternalSpringFluentDSL.g:369:4: rule__Attribute__Group__0
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
    // InternalSpringFluentDSL.g:378:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalSpringFluentDSL.g:379:1: ( ruleRelation EOF )
            // InternalSpringFluentDSL.g:380:1: ruleRelation EOF
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
    // InternalSpringFluentDSL.g:387:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:391:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalSpringFluentDSL.g:392:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalSpringFluentDSL.g:392:2: ( ( rule__Relation__Group__0 ) )
            // InternalSpringFluentDSL.g:393:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalSpringFluentDSL.g:394:3: ( rule__Relation__Group__0 )
            // InternalSpringFluentDSL.g:394:4: rule__Relation__Group__0
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
    // InternalSpringFluentDSL.g:403:1: ruleDependencyType : ( ( rule__DependencyType__Alternatives ) ) ;
    public final void ruleDependencyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:407:1: ( ( ( rule__DependencyType__Alternatives ) ) )
            // InternalSpringFluentDSL.g:408:2: ( ( rule__DependencyType__Alternatives ) )
            {
            // InternalSpringFluentDSL.g:408:2: ( ( rule__DependencyType__Alternatives ) )
            // InternalSpringFluentDSL.g:409:3: ( rule__DependencyType__Alternatives )
            {
             before(grammarAccess.getDependencyTypeAccess().getAlternatives()); 
            // InternalSpringFluentDSL.g:410:3: ( rule__DependencyType__Alternatives )
            // InternalSpringFluentDSL.g:410:4: rule__DependencyType__Alternatives
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
    // InternalSpringFluentDSL.g:419:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:423:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSpringFluentDSL.g:424:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSpringFluentDSL.g:424:2: ( ( rule__Type__Alternatives ) )
            // InternalSpringFluentDSL.g:425:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSpringFluentDSL.g:426:3: ( rule__Type__Alternatives )
            // InternalSpringFluentDSL.g:426:4: rule__Type__Alternatives
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
    // InternalSpringFluentDSL.g:434:1: rule__Strategy__StrategyAlternatives_1_0 : ( ( 'SingleTable' ) | ( 'JoinedTable' ) | ( 'TablePerClass' ) );
    public final void rule__Strategy__StrategyAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:438:1: ( ( 'SingleTable' ) | ( 'JoinedTable' ) | ( 'TablePerClass' ) )
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
                    // InternalSpringFluentDSL.g:439:2: ( 'SingleTable' )
                    {
                    // InternalSpringFluentDSL.g:439:2: ( 'SingleTable' )
                    // InternalSpringFluentDSL.g:440:3: 'SingleTable'
                    {
                     before(grammarAccess.getStrategyAccess().getStrategySingleTableKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getStrategySingleTableKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:445:2: ( 'JoinedTable' )
                    {
                    // InternalSpringFluentDSL.g:445:2: ( 'JoinedTable' )
                    // InternalSpringFluentDSL.g:446:3: 'JoinedTable'
                    {
                     before(grammarAccess.getStrategyAccess().getStrategyJoinedTableKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStrategyAccess().getStrategyJoinedTableKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:451:2: ( 'TablePerClass' )
                    {
                    // InternalSpringFluentDSL.g:451:2: ( 'TablePerClass' )
                    // InternalSpringFluentDSL.g:452:3: 'TablePerClass'
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


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalSpringFluentDSL.g:461:1: rule__OperationType__Alternatives : ( ( ( rule__OperationType__Group_0__0 ) ) | ( ( rule__OperationType__Group_1__0 ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:465:1: ( ( ( rule__OperationType__Group_0__0 ) ) | ( ( rule__OperationType__Group_1__0 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
            case 52:
            case 54:
                {
                alt2=1;
                }
                break;
            case EOF:
                {
                alt2=1;
                }
                break;
            case 46:
                {
                alt2=1;
                }
                break;
            case 53:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSpringFluentDSL.g:466:2: ( ( rule__OperationType__Group_0__0 ) )
                    {
                    // InternalSpringFluentDSL.g:466:2: ( ( rule__OperationType__Group_0__0 ) )
                    // InternalSpringFluentDSL.g:467:3: ( rule__OperationType__Group_0__0 )
                    {
                     before(grammarAccess.getOperationTypeAccess().getGroup_0()); 
                    // InternalSpringFluentDSL.g:468:3: ( rule__OperationType__Group_0__0 )
                    // InternalSpringFluentDSL.g:468:4: rule__OperationType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:472:2: ( ( rule__OperationType__Group_1__0 ) )
                    {
                    // InternalSpringFluentDSL.g:472:2: ( ( rule__OperationType__Group_1__0 ) )
                    // InternalSpringFluentDSL.g:473:3: ( rule__OperationType__Group_1__0 )
                    {
                     before(grammarAccess.getOperationTypeAccess().getGroup_1()); 
                    // InternalSpringFluentDSL.g:474:3: ( rule__OperationType__Group_1__0 )
                    // InternalSpringFluentDSL.g:474:4: rule__OperationType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__Relation__TypeAlternatives_3_0"
    // InternalSpringFluentDSL.g:482:1: rule__Relation__TypeAlternatives_3_0 : ( ( 'mto' ) | ( 'otm' ) | ( 'oto' ) | ( 'mtm' ) );
    public final void rule__Relation__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:486:1: ( ( 'mto' ) | ( 'otm' ) | ( 'oto' ) | ( 'mtm' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpringFluentDSL.g:487:2: ( 'mto' )
                    {
                    // InternalSpringFluentDSL.g:487:2: ( 'mto' )
                    // InternalSpringFluentDSL.g:488:3: 'mto'
                    {
                     before(grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:493:2: ( 'otm' )
                    {
                    // InternalSpringFluentDSL.g:493:2: ( 'otm' )
                    // InternalSpringFluentDSL.g:494:3: 'otm'
                    {
                     before(grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:499:2: ( 'oto' )
                    {
                    // InternalSpringFluentDSL.g:499:2: ( 'oto' )
                    // InternalSpringFluentDSL.g:500:3: 'oto'
                    {
                     before(grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:505:2: ( 'mtm' )
                    {
                    // InternalSpringFluentDSL.g:505:2: ( 'mtm' )
                    // InternalSpringFluentDSL.g:506:3: 'mtm'
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
    // InternalSpringFluentDSL.g:515:1: rule__DependencyType__Alternatives : ( ( ( 'SpringDataJpa' ) ) | ( ( 'SpringWeb' ) ) | ( ( 'Lombok' ) ) | ( ( 'MySQLDriver' ) ) | ( ( 'DevTools' ) ) | ( ( 'Thymeleaf' ) ) | ( ( 'Swagger' ) ) | ( ( 'SpringSecurity' ) ) );
    public final void rule__DependencyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:519:1: ( ( ( 'SpringDataJpa' ) ) | ( ( 'SpringWeb' ) ) | ( ( 'Lombok' ) ) | ( ( 'MySQLDriver' ) ) | ( ( 'DevTools' ) ) | ( ( 'Thymeleaf' ) ) | ( ( 'Swagger' ) ) | ( ( 'SpringSecurity' ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            case 25:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpringFluentDSL.g:520:2: ( ( 'SpringDataJpa' ) )
                    {
                    // InternalSpringFluentDSL.g:520:2: ( ( 'SpringDataJpa' ) )
                    // InternalSpringFluentDSL.g:521:3: ( 'SpringDataJpa' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0()); 
                    // InternalSpringFluentDSL.g:522:3: ( 'SpringDataJpa' )
                    // InternalSpringFluentDSL.g:522:4: 'SpringDataJpa'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:526:2: ( ( 'SpringWeb' ) )
                    {
                    // InternalSpringFluentDSL.g:526:2: ( ( 'SpringWeb' ) )
                    // InternalSpringFluentDSL.g:527:3: ( 'SpringWeb' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1()); 
                    // InternalSpringFluentDSL.g:528:3: ( 'SpringWeb' )
                    // InternalSpringFluentDSL.g:528:4: 'SpringWeb'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:532:2: ( ( 'Lombok' ) )
                    {
                    // InternalSpringFluentDSL.g:532:2: ( ( 'Lombok' ) )
                    // InternalSpringFluentDSL.g:533:3: ( 'Lombok' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2()); 
                    // InternalSpringFluentDSL.g:534:3: ( 'Lombok' )
                    // InternalSpringFluentDSL.g:534:4: 'Lombok'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:538:2: ( ( 'MySQLDriver' ) )
                    {
                    // InternalSpringFluentDSL.g:538:2: ( ( 'MySQLDriver' ) )
                    // InternalSpringFluentDSL.g:539:3: ( 'MySQLDriver' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3()); 
                    // InternalSpringFluentDSL.g:540:3: ( 'MySQLDriver' )
                    // InternalSpringFluentDSL.g:540:4: 'MySQLDriver'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:544:2: ( ( 'DevTools' ) )
                    {
                    // InternalSpringFluentDSL.g:544:2: ( ( 'DevTools' ) )
                    // InternalSpringFluentDSL.g:545:3: ( 'DevTools' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4()); 
                    // InternalSpringFluentDSL.g:546:3: ( 'DevTools' )
                    // InternalSpringFluentDSL.g:546:4: 'DevTools'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:550:2: ( ( 'Thymeleaf' ) )
                    {
                    // InternalSpringFluentDSL.g:550:2: ( ( 'Thymeleaf' ) )
                    // InternalSpringFluentDSL.g:551:3: ( 'Thymeleaf' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getThymeleafEnumLiteralDeclaration_5()); 
                    // InternalSpringFluentDSL.g:552:3: ( 'Thymeleaf' )
                    // InternalSpringFluentDSL.g:552:4: 'Thymeleaf'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getThymeleafEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:556:2: ( ( 'Swagger' ) )
                    {
                    // InternalSpringFluentDSL.g:556:2: ( ( 'Swagger' ) )
                    // InternalSpringFluentDSL.g:557:3: ( 'Swagger' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_6()); 
                    // InternalSpringFluentDSL.g:558:3: ( 'Swagger' )
                    // InternalSpringFluentDSL.g:558:4: 'Swagger'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpringFluentDSL.g:562:2: ( ( 'SpringSecurity' ) )
                    {
                    // InternalSpringFluentDSL.g:562:2: ( ( 'SpringSecurity' ) )
                    // InternalSpringFluentDSL.g:563:3: ( 'SpringSecurity' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_7()); 
                    // InternalSpringFluentDSL.g:564:3: ( 'SpringSecurity' )
                    // InternalSpringFluentDSL.g:564:4: 'SpringSecurity'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalSpringFluentDSL.g:572:1: rule__Type__Alternatives : ( ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:576:1: ( ( ( 'Long' ) ) | ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Boolean' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSpringFluentDSL.g:577:2: ( ( 'Long' ) )
                    {
                    // InternalSpringFluentDSL.g:577:2: ( ( 'Long' ) )
                    // InternalSpringFluentDSL.g:578:3: ( 'Long' )
                    {
                     before(grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0()); 
                    // InternalSpringFluentDSL.g:579:3: ( 'Long' )
                    // InternalSpringFluentDSL.g:579:4: 'Long'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:583:2: ( ( 'Integer' ) )
                    {
                    // InternalSpringFluentDSL.g:583:2: ( ( 'Integer' ) )
                    // InternalSpringFluentDSL.g:584:3: ( 'Integer' )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalSpringFluentDSL.g:585:3: ( 'Integer' )
                    // InternalSpringFluentDSL.g:585:4: 'Integer'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:589:2: ( ( 'Double' ) )
                    {
                    // InternalSpringFluentDSL.g:589:2: ( ( 'Double' ) )
                    // InternalSpringFluentDSL.g:590:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // InternalSpringFluentDSL.g:591:3: ( 'Double' )
                    // InternalSpringFluentDSL.g:591:4: 'Double'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:595:2: ( ( 'String' ) )
                    {
                    // InternalSpringFluentDSL.g:595:2: ( ( 'String' ) )
                    // InternalSpringFluentDSL.g:596:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // InternalSpringFluentDSL.g:597:3: ( 'String' )
                    // InternalSpringFluentDSL.g:597:4: 'String'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:601:2: ( ( 'Date' ) )
                    {
                    // InternalSpringFluentDSL.g:601:2: ( ( 'Date' ) )
                    // InternalSpringFluentDSL.g:602:3: ( 'Date' )
                    {
                     before(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalSpringFluentDSL.g:603:3: ( 'Date' )
                    // InternalSpringFluentDSL.g:603:4: 'Date'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:607:2: ( ( 'Time' ) )
                    {
                    // InternalSpringFluentDSL.g:607:2: ( ( 'Time' ) )
                    // InternalSpringFluentDSL.g:608:3: ( 'Time' )
                    {
                     before(grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5()); 
                    // InternalSpringFluentDSL.g:609:3: ( 'Time' )
                    // InternalSpringFluentDSL.g:609:4: 'Time'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:613:2: ( ( 'Boolean' ) )
                    {
                    // InternalSpringFluentDSL.g:613:2: ( ( 'Boolean' ) )
                    // InternalSpringFluentDSL.g:614:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // InternalSpringFluentDSL.g:615:3: ( 'Boolean' )
                    // InternalSpringFluentDSL.g:615:4: 'Boolean'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalSpringFluentDSL.g:623:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:627:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSpringFluentDSL.g:628:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSpringFluentDSL.g:635:1: rule__Model__Group__0__Impl : ( ( rule__Model__PrefixAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:639:1: ( ( ( rule__Model__PrefixAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:640:1: ( ( rule__Model__PrefixAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:640:1: ( ( rule__Model__PrefixAssignment_0 ) )
            // InternalSpringFluentDSL.g:641:2: ( rule__Model__PrefixAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getPrefixAssignment_0()); 
            // InternalSpringFluentDSL.g:642:2: ( rule__Model__PrefixAssignment_0 )
            // InternalSpringFluentDSL.g:642:3: rule__Model__PrefixAssignment_0
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
    // InternalSpringFluentDSL.g:650:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:654:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSpringFluentDSL.g:655:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSpringFluentDSL.g:662:1: rule__Model__Group__1__Impl : ( ( rule__Model__AppNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:666:1: ( ( ( rule__Model__AppNameAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:667:1: ( ( rule__Model__AppNameAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:667:1: ( ( rule__Model__AppNameAssignment_1 ) )
            // InternalSpringFluentDSL.g:668:2: ( rule__Model__AppNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAppNameAssignment_1()); 
            // InternalSpringFluentDSL.g:669:2: ( rule__Model__AppNameAssignment_1 )
            // InternalSpringFluentDSL.g:669:3: rule__Model__AppNameAssignment_1
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
    // InternalSpringFluentDSL.g:677:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:681:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSpringFluentDSL.g:682:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSpringFluentDSL.g:689:1: rule__Model__Group__2__Impl : ( ( rule__Model__DependenciesAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:693:1: ( ( ( rule__Model__DependenciesAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:694:1: ( ( rule__Model__DependenciesAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:694:1: ( ( rule__Model__DependenciesAssignment_2 ) )
            // InternalSpringFluentDSL.g:695:2: ( rule__Model__DependenciesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getDependenciesAssignment_2()); 
            // InternalSpringFluentDSL.g:696:2: ( rule__Model__DependenciesAssignment_2 )
            // InternalSpringFluentDSL.g:696:3: rule__Model__DependenciesAssignment_2
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
    // InternalSpringFluentDSL.g:704:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:708:1: ( rule__Model__Group__3__Impl )
            // InternalSpringFluentDSL.g:709:2: rule__Model__Group__3__Impl
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
    // InternalSpringFluentDSL.g:715:1: rule__Model__Group__3__Impl : ( ( rule__Model__EntitiesAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:719:1: ( ( ( rule__Model__EntitiesAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:720:1: ( ( rule__Model__EntitiesAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:720:1: ( ( rule__Model__EntitiesAssignment_3 ) )
            // InternalSpringFluentDSL.g:721:2: ( rule__Model__EntitiesAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 
            // InternalSpringFluentDSL.g:722:2: ( rule__Model__EntitiesAssignment_3 )
            // InternalSpringFluentDSL.g:722:3: rule__Model__EntitiesAssignment_3
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
    // InternalSpringFluentDSL.g:731:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:735:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalSpringFluentDSL.g:736:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
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
    // InternalSpringFluentDSL.g:743:1: rule__Prefix__Group__0__Impl : ( () ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:747:1: ( ( () ) )
            // InternalSpringFluentDSL.g:748:1: ( () )
            {
            // InternalSpringFluentDSL.g:748:1: ( () )
            // InternalSpringFluentDSL.g:749:2: ()
            {
             before(grammarAccess.getPrefixAccess().getPrefixAction_0()); 
            // InternalSpringFluentDSL.g:750:2: ()
            // InternalSpringFluentDSL.g:750:3: 
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
    // InternalSpringFluentDSL.g:758:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:762:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalSpringFluentDSL.g:763:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
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
    // InternalSpringFluentDSL.g:770:1: rule__Prefix__Group__1__Impl : ( 'prefix:' ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:774:1: ( ( 'prefix:' ) )
            // InternalSpringFluentDSL.g:775:1: ( 'prefix:' )
            {
            // InternalSpringFluentDSL.g:775:1: ( 'prefix:' )
            // InternalSpringFluentDSL.g:776:2: 'prefix:'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:785:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:789:1: ( rule__Prefix__Group__2__Impl )
            // InternalSpringFluentDSL.g:790:2: rule__Prefix__Group__2__Impl
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
    // InternalSpringFluentDSL.g:796:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__PrefixAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:800:1: ( ( ( rule__Prefix__PrefixAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:801:1: ( ( rule__Prefix__PrefixAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:801:1: ( ( rule__Prefix__PrefixAssignment_2 ) )
            // InternalSpringFluentDSL.g:802:2: ( rule__Prefix__PrefixAssignment_2 )
            {
             before(grammarAccess.getPrefixAccess().getPrefixAssignment_2()); 
            // InternalSpringFluentDSL.g:803:2: ( rule__Prefix__PrefixAssignment_2 )
            // InternalSpringFluentDSL.g:803:3: rule__Prefix__PrefixAssignment_2
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
    // InternalSpringFluentDSL.g:812:1: rule__AppName__Group__0 : rule__AppName__Group__0__Impl rule__AppName__Group__1 ;
    public final void rule__AppName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:816:1: ( rule__AppName__Group__0__Impl rule__AppName__Group__1 )
            // InternalSpringFluentDSL.g:817:2: rule__AppName__Group__0__Impl rule__AppName__Group__1
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
    // InternalSpringFluentDSL.g:824:1: rule__AppName__Group__0__Impl : ( () ) ;
    public final void rule__AppName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:828:1: ( ( () ) )
            // InternalSpringFluentDSL.g:829:1: ( () )
            {
            // InternalSpringFluentDSL.g:829:1: ( () )
            // InternalSpringFluentDSL.g:830:2: ()
            {
             before(grammarAccess.getAppNameAccess().getAppNameAction_0()); 
            // InternalSpringFluentDSL.g:831:2: ()
            // InternalSpringFluentDSL.g:831:3: 
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
    // InternalSpringFluentDSL.g:839:1: rule__AppName__Group__1 : rule__AppName__Group__1__Impl rule__AppName__Group__2 ;
    public final void rule__AppName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:843:1: ( rule__AppName__Group__1__Impl rule__AppName__Group__2 )
            // InternalSpringFluentDSL.g:844:2: rule__AppName__Group__1__Impl rule__AppName__Group__2
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
    // InternalSpringFluentDSL.g:851:1: rule__AppName__Group__1__Impl : ( 'app_name:' ) ;
    public final void rule__AppName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:855:1: ( ( 'app_name:' ) )
            // InternalSpringFluentDSL.g:856:1: ( 'app_name:' )
            {
            // InternalSpringFluentDSL.g:856:1: ( 'app_name:' )
            // InternalSpringFluentDSL.g:857:2: 'app_name:'
            {
             before(grammarAccess.getAppNameAccess().getApp_nameKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:866:1: rule__AppName__Group__2 : rule__AppName__Group__2__Impl ;
    public final void rule__AppName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:870:1: ( rule__AppName__Group__2__Impl )
            // InternalSpringFluentDSL.g:871:2: rule__AppName__Group__2__Impl
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
    // InternalSpringFluentDSL.g:877:1: rule__AppName__Group__2__Impl : ( ( rule__AppName__AppNameAssignment_2 ) ) ;
    public final void rule__AppName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:881:1: ( ( ( rule__AppName__AppNameAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:882:1: ( ( rule__AppName__AppNameAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:882:1: ( ( rule__AppName__AppNameAssignment_2 ) )
            // InternalSpringFluentDSL.g:883:2: ( rule__AppName__AppNameAssignment_2 )
            {
             before(grammarAccess.getAppNameAccess().getAppNameAssignment_2()); 
            // InternalSpringFluentDSL.g:884:2: ( rule__AppName__AppNameAssignment_2 )
            // InternalSpringFluentDSL.g:884:3: rule__AppName__AppNameAssignment_2
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
    // InternalSpringFluentDSL.g:893:1: rule__Dependencies__Group__0 : rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1 ;
    public final void rule__Dependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:897:1: ( rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1 )
            // InternalSpringFluentDSL.g:898:2: rule__Dependencies__Group__0__Impl rule__Dependencies__Group__1
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
    // InternalSpringFluentDSL.g:905:1: rule__Dependencies__Group__0__Impl : ( () ) ;
    public final void rule__Dependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:909:1: ( ( () ) )
            // InternalSpringFluentDSL.g:910:1: ( () )
            {
            // InternalSpringFluentDSL.g:910:1: ( () )
            // InternalSpringFluentDSL.g:911:2: ()
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAction_0()); 
            // InternalSpringFluentDSL.g:912:2: ()
            // InternalSpringFluentDSL.g:912:3: 
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
    // InternalSpringFluentDSL.g:920:1: rule__Dependencies__Group__1 : rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2 ;
    public final void rule__Dependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:924:1: ( rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2 )
            // InternalSpringFluentDSL.g:925:2: rule__Dependencies__Group__1__Impl rule__Dependencies__Group__2
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
    // InternalSpringFluentDSL.g:932:1: rule__Dependencies__Group__1__Impl : ( 'dependencies' ) ;
    public final void rule__Dependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:936:1: ( ( 'dependencies' ) )
            // InternalSpringFluentDSL.g:937:1: ( 'dependencies' )
            {
            // InternalSpringFluentDSL.g:937:1: ( 'dependencies' )
            // InternalSpringFluentDSL.g:938:2: 'dependencies'
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:947:1: rule__Dependencies__Group__2 : rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3 ;
    public final void rule__Dependencies__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:951:1: ( rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3 )
            // InternalSpringFluentDSL.g:952:2: rule__Dependencies__Group__2__Impl rule__Dependencies__Group__3
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
    // InternalSpringFluentDSL.g:959:1: rule__Dependencies__Group__2__Impl : ( '{' ) ;
    public final void rule__Dependencies__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:963:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:964:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:964:1: ( '{' )
            // InternalSpringFluentDSL.g:965:2: '{'
            {
             before(grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:974:1: rule__Dependencies__Group__3 : rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4 ;
    public final void rule__Dependencies__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:978:1: ( rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4 )
            // InternalSpringFluentDSL.g:979:2: rule__Dependencies__Group__3__Impl rule__Dependencies__Group__4
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
    // InternalSpringFluentDSL.g:986:1: rule__Dependencies__Group__3__Impl : ( ( rule__Dependencies__DependenciesAssignment_3 ) ) ;
    public final void rule__Dependencies__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:990:1: ( ( ( rule__Dependencies__DependenciesAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:991:1: ( ( rule__Dependencies__DependenciesAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:991:1: ( ( rule__Dependencies__DependenciesAssignment_3 ) )
            // InternalSpringFluentDSL.g:992:2: ( rule__Dependencies__DependenciesAssignment_3 )
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAssignment_3()); 
            // InternalSpringFluentDSL.g:993:2: ( rule__Dependencies__DependenciesAssignment_3 )
            // InternalSpringFluentDSL.g:993:3: rule__Dependencies__DependenciesAssignment_3
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
    // InternalSpringFluentDSL.g:1001:1: rule__Dependencies__Group__4 : rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5 ;
    public final void rule__Dependencies__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1005:1: ( rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5 )
            // InternalSpringFluentDSL.g:1006:2: rule__Dependencies__Group__4__Impl rule__Dependencies__Group__5
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
    // InternalSpringFluentDSL.g:1013:1: rule__Dependencies__Group__4__Impl : ( ( rule__Dependencies__Group_4__0 )* ) ;
    public final void rule__Dependencies__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1017:1: ( ( ( rule__Dependencies__Group_4__0 )* ) )
            // InternalSpringFluentDSL.g:1018:1: ( ( rule__Dependencies__Group_4__0 )* )
            {
            // InternalSpringFluentDSL.g:1018:1: ( ( rule__Dependencies__Group_4__0 )* )
            // InternalSpringFluentDSL.g:1019:2: ( rule__Dependencies__Group_4__0 )*
            {
             before(grammarAccess.getDependenciesAccess().getGroup_4()); 
            // InternalSpringFluentDSL.g:1020:2: ( rule__Dependencies__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1020:3: rule__Dependencies__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Dependencies__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSpringFluentDSL.g:1028:1: rule__Dependencies__Group__5 : rule__Dependencies__Group__5__Impl ;
    public final void rule__Dependencies__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1032:1: ( rule__Dependencies__Group__5__Impl )
            // InternalSpringFluentDSL.g:1033:2: rule__Dependencies__Group__5__Impl
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
    // InternalSpringFluentDSL.g:1039:1: rule__Dependencies__Group__5__Impl : ( '}' ) ;
    public final void rule__Dependencies__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1043:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1044:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1044:1: ( '}' )
            // InternalSpringFluentDSL.g:1045:2: '}'
            {
             before(grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1055:1: rule__Dependencies__Group_4__0 : rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1 ;
    public final void rule__Dependencies__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1059:1: ( rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1 )
            // InternalSpringFluentDSL.g:1060:2: rule__Dependencies__Group_4__0__Impl rule__Dependencies__Group_4__1
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
    // InternalSpringFluentDSL.g:1067:1: rule__Dependencies__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Dependencies__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1071:1: ( ( ',' ) )
            // InternalSpringFluentDSL.g:1072:1: ( ',' )
            {
            // InternalSpringFluentDSL.g:1072:1: ( ',' )
            // InternalSpringFluentDSL.g:1073:2: ','
            {
             before(grammarAccess.getDependenciesAccess().getCommaKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1082:1: rule__Dependencies__Group_4__1 : rule__Dependencies__Group_4__1__Impl ;
    public final void rule__Dependencies__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1086:1: ( rule__Dependencies__Group_4__1__Impl )
            // InternalSpringFluentDSL.g:1087:2: rule__Dependencies__Group_4__1__Impl
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
    // InternalSpringFluentDSL.g:1093:1: rule__Dependencies__Group_4__1__Impl : ( ( rule__Dependencies__DependenciesAssignment_4_1 ) ) ;
    public final void rule__Dependencies__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1097:1: ( ( ( rule__Dependencies__DependenciesAssignment_4_1 ) ) )
            // InternalSpringFluentDSL.g:1098:1: ( ( rule__Dependencies__DependenciesAssignment_4_1 ) )
            {
            // InternalSpringFluentDSL.g:1098:1: ( ( rule__Dependencies__DependenciesAssignment_4_1 ) )
            // InternalSpringFluentDSL.g:1099:2: ( rule__Dependencies__DependenciesAssignment_4_1 )
            {
             before(grammarAccess.getDependenciesAccess().getDependenciesAssignment_4_1()); 
            // InternalSpringFluentDSL.g:1100:2: ( rule__Dependencies__DependenciesAssignment_4_1 )
            // InternalSpringFluentDSL.g:1100:3: rule__Dependencies__DependenciesAssignment_4_1
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
    // InternalSpringFluentDSL.g:1109:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1113:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalSpringFluentDSL.g:1114:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
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
    // InternalSpringFluentDSL.g:1121:1: rule__Dependency__Group__0__Impl : ( () ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1125:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1126:1: ( () )
            {
            // InternalSpringFluentDSL.g:1126:1: ( () )
            // InternalSpringFluentDSL.g:1127:2: ()
            {
             before(grammarAccess.getDependencyAccess().getDependencyAction_0()); 
            // InternalSpringFluentDSL.g:1128:2: ()
            // InternalSpringFluentDSL.g:1128:3: 
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
    // InternalSpringFluentDSL.g:1136:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1140:1: ( rule__Dependency__Group__1__Impl )
            // InternalSpringFluentDSL.g:1141:2: rule__Dependency__Group__1__Impl
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
    // InternalSpringFluentDSL.g:1147:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__DependencyAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1151:1: ( ( ( rule__Dependency__DependencyAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1152:1: ( ( rule__Dependency__DependencyAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1152:1: ( ( rule__Dependency__DependencyAssignment_1 ) )
            // InternalSpringFluentDSL.g:1153:2: ( rule__Dependency__DependencyAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyAssignment_1()); 
            // InternalSpringFluentDSL.g:1154:2: ( rule__Dependency__DependencyAssignment_1 )
            // InternalSpringFluentDSL.g:1154:3: rule__Dependency__DependencyAssignment_1
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
    // InternalSpringFluentDSL.g:1163:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1167:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalSpringFluentDSL.g:1168:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
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
    // InternalSpringFluentDSL.g:1175:1: rule__Entities__Group__0__Impl : ( () ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1179:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1180:1: ( () )
            {
            // InternalSpringFluentDSL.g:1180:1: ( () )
            // InternalSpringFluentDSL.g:1181:2: ()
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAction_0()); 
            // InternalSpringFluentDSL.g:1182:2: ()
            // InternalSpringFluentDSL.g:1182:3: 
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
    // InternalSpringFluentDSL.g:1190:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl rule__Entities__Group__2 ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1194:1: ( rule__Entities__Group__1__Impl rule__Entities__Group__2 )
            // InternalSpringFluentDSL.g:1195:2: rule__Entities__Group__1__Impl rule__Entities__Group__2
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
    // InternalSpringFluentDSL.g:1202:1: rule__Entities__Group__1__Impl : ( 'entities' ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1206:1: ( ( 'entities' ) )
            // InternalSpringFluentDSL.g:1207:1: ( 'entities' )
            {
            // InternalSpringFluentDSL.g:1207:1: ( 'entities' )
            // InternalSpringFluentDSL.g:1208:2: 'entities'
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1217:1: rule__Entities__Group__2 : rule__Entities__Group__2__Impl rule__Entities__Group__3 ;
    public final void rule__Entities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1221:1: ( rule__Entities__Group__2__Impl rule__Entities__Group__3 )
            // InternalSpringFluentDSL.g:1222:2: rule__Entities__Group__2__Impl rule__Entities__Group__3
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
    // InternalSpringFluentDSL.g:1229:1: rule__Entities__Group__2__Impl : ( '{' ) ;
    public final void rule__Entities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1233:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:1234:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:1234:1: ( '{' )
            // InternalSpringFluentDSL.g:1235:2: '{'
            {
             before(grammarAccess.getEntitiesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1244:1: rule__Entities__Group__3 : rule__Entities__Group__3__Impl rule__Entities__Group__4 ;
    public final void rule__Entities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1248:1: ( rule__Entities__Group__3__Impl rule__Entities__Group__4 )
            // InternalSpringFluentDSL.g:1249:2: rule__Entities__Group__3__Impl rule__Entities__Group__4
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
    // InternalSpringFluentDSL.g:1256:1: rule__Entities__Group__3__Impl : ( ( rule__Entities__EntitiesAssignment_3 )* ) ;
    public final void rule__Entities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1260:1: ( ( ( rule__Entities__EntitiesAssignment_3 )* ) )
            // InternalSpringFluentDSL.g:1261:1: ( ( rule__Entities__EntitiesAssignment_3 )* )
            {
            // InternalSpringFluentDSL.g:1261:1: ( ( rule__Entities__EntitiesAssignment_3 )* )
            // InternalSpringFluentDSL.g:1262:2: ( rule__Entities__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesAssignment_3()); 
            // InternalSpringFluentDSL.g:1263:2: ( rule__Entities__EntitiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==40) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1263:3: rule__Entities__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Entities__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSpringFluentDSL.g:1271:1: rule__Entities__Group__4 : rule__Entities__Group__4__Impl ;
    public final void rule__Entities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1275:1: ( rule__Entities__Group__4__Impl )
            // InternalSpringFluentDSL.g:1276:2: rule__Entities__Group__4__Impl
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
    // InternalSpringFluentDSL.g:1282:1: rule__Entities__Group__4__Impl : ( '}' ) ;
    public final void rule__Entities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1286:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1287:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1287:1: ( '}' )
            // InternalSpringFluentDSL.g:1288:2: '}'
            {
             before(grammarAccess.getEntitiesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1298:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1302:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSpringFluentDSL.g:1303:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalSpringFluentDSL.g:1310:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1314:1: ( ( 'entity' ) )
            // InternalSpringFluentDSL.g:1315:1: ( 'entity' )
            {
            // InternalSpringFluentDSL.g:1315:1: ( 'entity' )
            // InternalSpringFluentDSL.g:1316:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1325:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1329:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSpringFluentDSL.g:1330:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalSpringFluentDSL.g:1337:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1341:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1342:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1342:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSpringFluentDSL.g:1343:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSpringFluentDSL.g:1344:2: ( rule__Entity__NameAssignment_1 )
            // InternalSpringFluentDSL.g:1344:3: rule__Entity__NameAssignment_1
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
    // InternalSpringFluentDSL.g:1352:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1356:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSpringFluentDSL.g:1357:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalSpringFluentDSL.g:1364:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1368:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalSpringFluentDSL.g:1369:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalSpringFluentDSL.g:1369:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalSpringFluentDSL.g:1370:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalSpringFluentDSL.g:1371:2: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==41) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpringFluentDSL.g:1371:3: rule__Entity__Group_2__0
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
    // InternalSpringFluentDSL.g:1379:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1383:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSpringFluentDSL.g:1384:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalSpringFluentDSL.g:1391:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1395:1: ( ( '{' ) )
            // InternalSpringFluentDSL.g:1396:1: ( '{' )
            {
            // InternalSpringFluentDSL.g:1396:1: ( '{' )
            // InternalSpringFluentDSL.g:1397:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1406:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1410:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSpringFluentDSL.g:1411:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalSpringFluentDSL.g:1418:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeatureAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1422:1: ( ( ( rule__Entity__FeatureAssignment_4 ) ) )
            // InternalSpringFluentDSL.g:1423:1: ( ( rule__Entity__FeatureAssignment_4 ) )
            {
            // InternalSpringFluentDSL.g:1423:1: ( ( rule__Entity__FeatureAssignment_4 ) )
            // InternalSpringFluentDSL.g:1424:2: ( rule__Entity__FeatureAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getFeatureAssignment_4()); 
            // InternalSpringFluentDSL.g:1425:2: ( rule__Entity__FeatureAssignment_4 )
            // InternalSpringFluentDSL.g:1425:3: rule__Entity__FeatureAssignment_4
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
    // InternalSpringFluentDSL.g:1433:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1437:1: ( rule__Entity__Group__5__Impl )
            // InternalSpringFluentDSL.g:1438:2: rule__Entity__Group__5__Impl
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
    // InternalSpringFluentDSL.g:1444:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1448:1: ( ( '}' ) )
            // InternalSpringFluentDSL.g:1449:1: ( '}' )
            {
            // InternalSpringFluentDSL.g:1449:1: ( '}' )
            // InternalSpringFluentDSL.g:1450:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1460:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1464:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalSpringFluentDSL.g:1465:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalSpringFluentDSL.g:1472:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1476:1: ( ( 'extends' ) )
            // InternalSpringFluentDSL.g:1477:1: ( 'extends' )
            {
            // InternalSpringFluentDSL.g:1477:1: ( 'extends' )
            // InternalSpringFluentDSL.g:1478:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1487:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1491:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalSpringFluentDSL.g:1492:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalSpringFluentDSL.g:1499:1: rule__Entity__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1503:1: ( ( '[' ) )
            // InternalSpringFluentDSL.g:1504:1: ( '[' )
            {
            // InternalSpringFluentDSL.g:1504:1: ( '[' )
            // InternalSpringFluentDSL.g:1505:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1514:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1518:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalSpringFluentDSL.g:1519:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
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
    // InternalSpringFluentDSL.g:1526:1: rule__Entity__Group_2__2__Impl : ( 'strategy' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1530:1: ( ( 'strategy' ) )
            // InternalSpringFluentDSL.g:1531:1: ( 'strategy' )
            {
            // InternalSpringFluentDSL.g:1531:1: ( 'strategy' )
            // InternalSpringFluentDSL.g:1532:2: 'strategy'
            {
             before(grammarAccess.getEntityAccess().getStrategyKeyword_2_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1541:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1545:1: ( rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 )
            // InternalSpringFluentDSL.g:1546:2: rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4
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
    // InternalSpringFluentDSL.g:1553:1: rule__Entity__Group_2__3__Impl : ( '=' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1557:1: ( ( '=' ) )
            // InternalSpringFluentDSL.g:1558:1: ( '=' )
            {
            // InternalSpringFluentDSL.g:1558:1: ( '=' )
            // InternalSpringFluentDSL.g:1559:2: '='
            {
             before(grammarAccess.getEntityAccess().getEqualsSignKeyword_2_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1568:1: rule__Entity__Group_2__4 : rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5 ;
    public final void rule__Entity__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1572:1: ( rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5 )
            // InternalSpringFluentDSL.g:1573:2: rule__Entity__Group_2__4__Impl rule__Entity__Group_2__5
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
    // InternalSpringFluentDSL.g:1580:1: rule__Entity__Group_2__4__Impl : ( ( rule__Entity__StrategyAssignment_2_4 ) ) ;
    public final void rule__Entity__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1584:1: ( ( ( rule__Entity__StrategyAssignment_2_4 ) ) )
            // InternalSpringFluentDSL.g:1585:1: ( ( rule__Entity__StrategyAssignment_2_4 ) )
            {
            // InternalSpringFluentDSL.g:1585:1: ( ( rule__Entity__StrategyAssignment_2_4 ) )
            // InternalSpringFluentDSL.g:1586:2: ( rule__Entity__StrategyAssignment_2_4 )
            {
             before(grammarAccess.getEntityAccess().getStrategyAssignment_2_4()); 
            // InternalSpringFluentDSL.g:1587:2: ( rule__Entity__StrategyAssignment_2_4 )
            // InternalSpringFluentDSL.g:1587:3: rule__Entity__StrategyAssignment_2_4
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
    // InternalSpringFluentDSL.g:1595:1: rule__Entity__Group_2__5 : rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6 ;
    public final void rule__Entity__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1599:1: ( rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6 )
            // InternalSpringFluentDSL.g:1600:2: rule__Entity__Group_2__5__Impl rule__Entity__Group_2__6
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
    // InternalSpringFluentDSL.g:1607:1: rule__Entity__Group_2__5__Impl : ( ']' ) ;
    public final void rule__Entity__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1611:1: ( ( ']' ) )
            // InternalSpringFluentDSL.g:1612:1: ( ']' )
            {
            // InternalSpringFluentDSL.g:1612:1: ( ']' )
            // InternalSpringFluentDSL.g:1613:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1622:1: rule__Entity__Group_2__6 : rule__Entity__Group_2__6__Impl ;
    public final void rule__Entity__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1626:1: ( rule__Entity__Group_2__6__Impl )
            // InternalSpringFluentDSL.g:1627:2: rule__Entity__Group_2__6__Impl
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
    // InternalSpringFluentDSL.g:1633:1: rule__Entity__Group_2__6__Impl : ( ( rule__Entity__SuperTypeAssignment_2_6 ) ) ;
    public final void rule__Entity__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1637:1: ( ( ( rule__Entity__SuperTypeAssignment_2_6 ) ) )
            // InternalSpringFluentDSL.g:1638:1: ( ( rule__Entity__SuperTypeAssignment_2_6 ) )
            {
            // InternalSpringFluentDSL.g:1638:1: ( ( rule__Entity__SuperTypeAssignment_2_6 ) )
            // InternalSpringFluentDSL.g:1639:2: ( rule__Entity__SuperTypeAssignment_2_6 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_6()); 
            // InternalSpringFluentDSL.g:1640:2: ( rule__Entity__SuperTypeAssignment_2_6 )
            // InternalSpringFluentDSL.g:1640:3: rule__Entity__SuperTypeAssignment_2_6
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
    // InternalSpringFluentDSL.g:1649:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1653:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSpringFluentDSL.g:1654:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalSpringFluentDSL.g:1661:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1665:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1666:1: ( () )
            {
            // InternalSpringFluentDSL.g:1666:1: ( () )
            // InternalSpringFluentDSL.g:1667:2: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // InternalSpringFluentDSL.g:1668:2: ()
            // InternalSpringFluentDSL.g:1668:3: 
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
    // InternalSpringFluentDSL.g:1676:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1680:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSpringFluentDSL.g:1681:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalSpringFluentDSL.g:1688:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__OperationAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1692:1: ( ( ( rule__Feature__OperationAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1693:1: ( ( rule__Feature__OperationAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1693:1: ( ( rule__Feature__OperationAssignment_1 ) )
            // InternalSpringFluentDSL.g:1694:2: ( rule__Feature__OperationAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getOperationAssignment_1()); 
            // InternalSpringFluentDSL.g:1695:2: ( rule__Feature__OperationAssignment_1 )
            // InternalSpringFluentDSL.g:1695:3: rule__Feature__OperationAssignment_1
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
    // InternalSpringFluentDSL.g:1703:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1707:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSpringFluentDSL.g:1708:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalSpringFluentDSL.g:1715:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IdAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1719:1: ( ( ( rule__Feature__IdAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:1720:1: ( ( rule__Feature__IdAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:1720:1: ( ( rule__Feature__IdAssignment_2 ) )
            // InternalSpringFluentDSL.g:1721:2: ( rule__Feature__IdAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getIdAssignment_2()); 
            // InternalSpringFluentDSL.g:1722:2: ( rule__Feature__IdAssignment_2 )
            // InternalSpringFluentDSL.g:1722:3: rule__Feature__IdAssignment_2
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
    // InternalSpringFluentDSL.g:1730:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1734:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSpringFluentDSL.g:1735:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalSpringFluentDSL.g:1742:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__AttributesAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1746:1: ( ( ( rule__Feature__AttributesAssignment_3 )* ) )
            // InternalSpringFluentDSL.g:1747:1: ( ( rule__Feature__AttributesAssignment_3 )* )
            {
            // InternalSpringFluentDSL.g:1747:1: ( ( rule__Feature__AttributesAssignment_3 )* )
            // InternalSpringFluentDSL.g:1748:2: ( rule__Feature__AttributesAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getAttributesAssignment_3()); 
            // InternalSpringFluentDSL.g:1749:2: ( rule__Feature__AttributesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==47) ) {
                        int LA9_3 = input.LA(3);

                        if ( ((LA9_3>=26 && LA9_3<=32)) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1749:3: rule__Feature__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Feature__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSpringFluentDSL.g:1757:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1761:1: ( rule__Feature__Group__4__Impl )
            // InternalSpringFluentDSL.g:1762:2: rule__Feature__Group__4__Impl
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
    // InternalSpringFluentDSL.g:1768:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__RelationsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1772:1: ( ( ( rule__Feature__RelationsAssignment_4 )* ) )
            // InternalSpringFluentDSL.g:1773:1: ( ( rule__Feature__RelationsAssignment_4 )* )
            {
            // InternalSpringFluentDSL.g:1773:1: ( ( rule__Feature__RelationsAssignment_4 )* )
            // InternalSpringFluentDSL.g:1774:2: ( rule__Feature__RelationsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getRelationsAssignment_4()); 
            // InternalSpringFluentDSL.g:1775:2: ( rule__Feature__RelationsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:1775:3: rule__Feature__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Feature__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSpringFluentDSL.g:1784:1: rule__Strategy__Group__0 : rule__Strategy__Group__0__Impl rule__Strategy__Group__1 ;
    public final void rule__Strategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1788:1: ( rule__Strategy__Group__0__Impl rule__Strategy__Group__1 )
            // InternalSpringFluentDSL.g:1789:2: rule__Strategy__Group__0__Impl rule__Strategy__Group__1
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
    // InternalSpringFluentDSL.g:1796:1: rule__Strategy__Group__0__Impl : ( () ) ;
    public final void rule__Strategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1800:1: ( ( () ) )
            // InternalSpringFluentDSL.g:1801:1: ( () )
            {
            // InternalSpringFluentDSL.g:1801:1: ( () )
            // InternalSpringFluentDSL.g:1802:2: ()
            {
             before(grammarAccess.getStrategyAccess().getStrategyAction_0()); 
            // InternalSpringFluentDSL.g:1803:2: ()
            // InternalSpringFluentDSL.g:1803:3: 
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
    // InternalSpringFluentDSL.g:1811:1: rule__Strategy__Group__1 : rule__Strategy__Group__1__Impl ;
    public final void rule__Strategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1815:1: ( rule__Strategy__Group__1__Impl )
            // InternalSpringFluentDSL.g:1816:2: rule__Strategy__Group__1__Impl
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
    // InternalSpringFluentDSL.g:1822:1: rule__Strategy__Group__1__Impl : ( ( rule__Strategy__StrategyAssignment_1 ) ) ;
    public final void rule__Strategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1826:1: ( ( ( rule__Strategy__StrategyAssignment_1 ) ) )
            // InternalSpringFluentDSL.g:1827:1: ( ( rule__Strategy__StrategyAssignment_1 ) )
            {
            // InternalSpringFluentDSL.g:1827:1: ( ( rule__Strategy__StrategyAssignment_1 ) )
            // InternalSpringFluentDSL.g:1828:2: ( rule__Strategy__StrategyAssignment_1 )
            {
             before(grammarAccess.getStrategyAccess().getStrategyAssignment_1()); 
            // InternalSpringFluentDSL.g:1829:2: ( rule__Strategy__StrategyAssignment_1 )
            // InternalSpringFluentDSL.g:1829:3: rule__Strategy__StrategyAssignment_1
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
    // InternalSpringFluentDSL.g:1838:1: rule__IDENTITY__Group__0 : rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1 ;
    public final void rule__IDENTITY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1842:1: ( rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1 )
            // InternalSpringFluentDSL.g:1843:2: rule__IDENTITY__Group__0__Impl rule__IDENTITY__Group__1
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
    // InternalSpringFluentDSL.g:1850:1: rule__IDENTITY__Group__0__Impl : ( 'id' ) ;
    public final void rule__IDENTITY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1854:1: ( ( 'id' ) )
            // InternalSpringFluentDSL.g:1855:1: ( 'id' )
            {
            // InternalSpringFluentDSL.g:1855:1: ( 'id' )
            // InternalSpringFluentDSL.g:1856:2: 'id'
            {
             before(grammarAccess.getIDENTITYAccess().getIdKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1865:1: rule__IDENTITY__Group__1 : rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2 ;
    public final void rule__IDENTITY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1869:1: ( rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2 )
            // InternalSpringFluentDSL.g:1870:2: rule__IDENTITY__Group__1__Impl rule__IDENTITY__Group__2
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
    // InternalSpringFluentDSL.g:1877:1: rule__IDENTITY__Group__1__Impl : ( ':' ) ;
    public final void rule__IDENTITY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1881:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:1882:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:1882:1: ( ':' )
            // InternalSpringFluentDSL.g:1883:2: ':'
            {
             before(grammarAccess.getIDENTITYAccess().getColonKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1892:1: rule__IDENTITY__Group__2 : rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3 ;
    public final void rule__IDENTITY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1896:1: ( rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3 )
            // InternalSpringFluentDSL.g:1897:2: rule__IDENTITY__Group__2__Impl rule__IDENTITY__Group__3
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
    // InternalSpringFluentDSL.g:1904:1: rule__IDENTITY__Group__2__Impl : ( ( rule__IDENTITY__TypeAssignment_2 ) ) ;
    public final void rule__IDENTITY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1908:1: ( ( ( rule__IDENTITY__TypeAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:1909:1: ( ( rule__IDENTITY__TypeAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:1909:1: ( ( rule__IDENTITY__TypeAssignment_2 ) )
            // InternalSpringFluentDSL.g:1910:2: ( rule__IDENTITY__TypeAssignment_2 )
            {
             before(grammarAccess.getIDENTITYAccess().getTypeAssignment_2()); 
            // InternalSpringFluentDSL.g:1911:2: ( rule__IDENTITY__TypeAssignment_2 )
            // InternalSpringFluentDSL.g:1911:3: rule__IDENTITY__TypeAssignment_2
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
    // InternalSpringFluentDSL.g:1919:1: rule__IDENTITY__Group__3 : rule__IDENTITY__Group__3__Impl ;
    public final void rule__IDENTITY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1923:1: ( rule__IDENTITY__Group__3__Impl )
            // InternalSpringFluentDSL.g:1924:2: rule__IDENTITY__Group__3__Impl
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
    // InternalSpringFluentDSL.g:1930:1: rule__IDENTITY__Group__3__Impl : ( 'pk' ) ;
    public final void rule__IDENTITY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1934:1: ( ( 'pk' ) )
            // InternalSpringFluentDSL.g:1935:1: ( 'pk' )
            {
            // InternalSpringFluentDSL.g:1935:1: ( 'pk' )
            // InternalSpringFluentDSL.g:1936:2: 'pk'
            {
             before(grammarAccess.getIDENTITYAccess().getPkKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1946:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1950:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalSpringFluentDSL.g:1951:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
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
    // InternalSpringFluentDSL.g:1958:1: rule__Operation__Group__0__Impl : ( 'ops' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1962:1: ( ( 'ops' ) )
            // InternalSpringFluentDSL.g:1963:1: ( 'ops' )
            {
            // InternalSpringFluentDSL.g:1963:1: ( 'ops' )
            // InternalSpringFluentDSL.g:1964:2: 'ops'
            {
             before(grammarAccess.getOperationAccess().getOpsKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:1973:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1977:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalSpringFluentDSL.g:1978:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
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
    // InternalSpringFluentDSL.g:1985:1: rule__Operation__Group__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:1989:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:1990:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:1990:1: ( ':' )
            // InternalSpringFluentDSL.g:1991:2: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:2000:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2004:1: ( rule__Operation__Group__2__Impl )
            // InternalSpringFluentDSL.g:2005:2: rule__Operation__Group__2__Impl
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
    // InternalSpringFluentDSL.g:2011:1: rule__Operation__Group__2__Impl : ( ruleOperationType ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2015:1: ( ( ruleOperationType ) )
            // InternalSpringFluentDSL.g:2016:1: ( ruleOperationType )
            {
            // InternalSpringFluentDSL.g:2016:1: ( ruleOperationType )
            // InternalSpringFluentDSL.g:2017:2: ruleOperationType
            {
             before(grammarAccess.getOperationAccess().getOperationTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getOperationTypeParserRuleCall_2()); 

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


    // $ANTLR start "rule__OperationType__Group_0__0"
    // InternalSpringFluentDSL.g:2027:1: rule__OperationType__Group_0__0 : rule__OperationType__Group_0__0__Impl rule__OperationType__Group_0__1 ;
    public final void rule__OperationType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2031:1: ( rule__OperationType__Group_0__0__Impl rule__OperationType__Group_0__1 )
            // InternalSpringFluentDSL.g:2032:2: rule__OperationType__Group_0__0__Impl rule__OperationType__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__OperationType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationType__Group_0__1();

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
    // $ANTLR end "rule__OperationType__Group_0__0"


    // $ANTLR start "rule__OperationType__Group_0__0__Impl"
    // InternalSpringFluentDSL.g:2039:1: rule__OperationType__Group_0__0__Impl : ( () ) ;
    public final void rule__OperationType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2043:1: ( ( () ) )
            // InternalSpringFluentDSL.g:2044:1: ( () )
            {
            // InternalSpringFluentDSL.g:2044:1: ( () )
            // InternalSpringFluentDSL.g:2045:2: ()
            {
             before(grammarAccess.getOperationTypeAccess().getOperationTypeAction_0_0()); 
            // InternalSpringFluentDSL.g:2046:2: ()
            // InternalSpringFluentDSL.g:2046:3: 
            {
            }

             after(grammarAccess.getOperationTypeAccess().getOperationTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__Group_0__0__Impl"


    // $ANTLR start "rule__OperationType__Group_0__1"
    // InternalSpringFluentDSL.g:2054:1: rule__OperationType__Group_0__1 : rule__OperationType__Group_0__1__Impl rule__OperationType__Group_0__2 ;
    public final void rule__OperationType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2058:1: ( rule__OperationType__Group_0__1__Impl rule__OperationType__Group_0__2 )
            // InternalSpringFluentDSL.g:2059:2: rule__OperationType__Group_0__1__Impl rule__OperationType__Group_0__2
            {
            pushFollow(FOLLOW_29);
            rule__OperationType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationType__Group_0__2();

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
    // $ANTLR end "rule__OperationType__Group_0__1"


    // $ANTLR start "rule__OperationType__Group_0__1__Impl"
    // InternalSpringFluentDSL.g:2066:1: rule__OperationType__Group_0__1__Impl : ( ( rule__OperationType__OprationTypeAssignment_0_1 )? ) ;
    public final void rule__OperationType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2070:1: ( ( ( rule__OperationType__OprationTypeAssignment_0_1 )? ) )
            // InternalSpringFluentDSL.g:2071:1: ( ( rule__OperationType__OprationTypeAssignment_0_1 )? )
            {
            // InternalSpringFluentDSL.g:2071:1: ( ( rule__OperationType__OprationTypeAssignment_0_1 )? )
            // InternalSpringFluentDSL.g:2072:2: ( rule__OperationType__OprationTypeAssignment_0_1 )?
            {
             before(grammarAccess.getOperationTypeAccess().getOprationTypeAssignment_0_1()); 
            // InternalSpringFluentDSL.g:2073:2: ( rule__OperationType__OprationTypeAssignment_0_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==54) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpringFluentDSL.g:2073:3: rule__OperationType__OprationTypeAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationType__OprationTypeAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationTypeAccess().getOprationTypeAssignment_0_1()); 

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
    // $ANTLR end "rule__OperationType__Group_0__1__Impl"


    // $ANTLR start "rule__OperationType__Group_0__2"
    // InternalSpringFluentDSL.g:2081:1: rule__OperationType__Group_0__2 : rule__OperationType__Group_0__2__Impl rule__OperationType__Group_0__3 ;
    public final void rule__OperationType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2085:1: ( rule__OperationType__Group_0__2__Impl rule__OperationType__Group_0__3 )
            // InternalSpringFluentDSL.g:2086:2: rule__OperationType__Group_0__2__Impl rule__OperationType__Group_0__3
            {
            pushFollow(FOLLOW_29);
            rule__OperationType__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationType__Group_0__3();

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
    // $ANTLR end "rule__OperationType__Group_0__2"


    // $ANTLR start "rule__OperationType__Group_0__2__Impl"
    // InternalSpringFluentDSL.g:2093:1: rule__OperationType__Group_0__2__Impl : ( ( 'r' )? ) ;
    public final void rule__OperationType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2097:1: ( ( ( 'r' )? ) )
            // InternalSpringFluentDSL.g:2098:1: ( ( 'r' )? )
            {
            // InternalSpringFluentDSL.g:2098:1: ( ( 'r' )? )
            // InternalSpringFluentDSL.g:2099:2: ( 'r' )?
            {
             before(grammarAccess.getOperationTypeAccess().getRKeyword_0_2()); 
            // InternalSpringFluentDSL.g:2100:2: ( 'r' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpringFluentDSL.g:2100:3: 'r'
                    {
                    match(input,50,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationTypeAccess().getRKeyword_0_2()); 

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
    // $ANTLR end "rule__OperationType__Group_0__2__Impl"


    // $ANTLR start "rule__OperationType__Group_0__3"
    // InternalSpringFluentDSL.g:2108:1: rule__OperationType__Group_0__3 : rule__OperationType__Group_0__3__Impl rule__OperationType__Group_0__4 ;
    public final void rule__OperationType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2112:1: ( rule__OperationType__Group_0__3__Impl rule__OperationType__Group_0__4 )
            // InternalSpringFluentDSL.g:2113:2: rule__OperationType__Group_0__3__Impl rule__OperationType__Group_0__4
            {
            pushFollow(FOLLOW_29);
            rule__OperationType__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationType__Group_0__4();

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
    // $ANTLR end "rule__OperationType__Group_0__3"


    // $ANTLR start "rule__OperationType__Group_0__3__Impl"
    // InternalSpringFluentDSL.g:2120:1: rule__OperationType__Group_0__3__Impl : ( ( 'u' )? ) ;
    public final void rule__OperationType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2124:1: ( ( ( 'u' )? ) )
            // InternalSpringFluentDSL.g:2125:1: ( ( 'u' )? )
            {
            // InternalSpringFluentDSL.g:2125:1: ( ( 'u' )? )
            // InternalSpringFluentDSL.g:2126:2: ( 'u' )?
            {
             before(grammarAccess.getOperationTypeAccess().getUKeyword_0_3()); 
            // InternalSpringFluentDSL.g:2127:2: ( 'u' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpringFluentDSL.g:2127:3: 'u'
                    {
                    match(input,51,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationTypeAccess().getUKeyword_0_3()); 

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
    // $ANTLR end "rule__OperationType__Group_0__3__Impl"


    // $ANTLR start "rule__OperationType__Group_0__4"
    // InternalSpringFluentDSL.g:2135:1: rule__OperationType__Group_0__4 : rule__OperationType__Group_0__4__Impl ;
    public final void rule__OperationType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2139:1: ( rule__OperationType__Group_0__4__Impl )
            // InternalSpringFluentDSL.g:2140:2: rule__OperationType__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Group_0__4__Impl();

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
    // $ANTLR end "rule__OperationType__Group_0__4"


    // $ANTLR start "rule__OperationType__Group_0__4__Impl"
    // InternalSpringFluentDSL.g:2146:1: rule__OperationType__Group_0__4__Impl : ( ( 'd' )? ) ;
    public final void rule__OperationType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2150:1: ( ( ( 'd' )? ) )
            // InternalSpringFluentDSL.g:2151:1: ( ( 'd' )? )
            {
            // InternalSpringFluentDSL.g:2151:1: ( ( 'd' )? )
            // InternalSpringFluentDSL.g:2152:2: ( 'd' )?
            {
             before(grammarAccess.getOperationTypeAccess().getDKeyword_0_4()); 
            // InternalSpringFluentDSL.g:2153:2: ( 'd' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpringFluentDSL.g:2153:3: 'd'
                    {
                    match(input,52,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationTypeAccess().getDKeyword_0_4()); 

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
    // $ANTLR end "rule__OperationType__Group_0__4__Impl"


    // $ANTLR start "rule__OperationType__Group_1__0"
    // InternalSpringFluentDSL.g:2162:1: rule__OperationType__Group_1__0 : rule__OperationType__Group_1__0__Impl rule__OperationType__Group_1__1 ;
    public final void rule__OperationType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2166:1: ( rule__OperationType__Group_1__0__Impl rule__OperationType__Group_1__1 )
            // InternalSpringFluentDSL.g:2167:2: rule__OperationType__Group_1__0__Impl rule__OperationType__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__OperationType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationType__Group_1__1();

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
    // $ANTLR end "rule__OperationType__Group_1__0"


    // $ANTLR start "rule__OperationType__Group_1__0__Impl"
    // InternalSpringFluentDSL.g:2174:1: rule__OperationType__Group_1__0__Impl : ( () ) ;
    public final void rule__OperationType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2178:1: ( ( () ) )
            // InternalSpringFluentDSL.g:2179:1: ( () )
            {
            // InternalSpringFluentDSL.g:2179:1: ( () )
            // InternalSpringFluentDSL.g:2180:2: ()
            {
             before(grammarAccess.getOperationTypeAccess().getOperationTypeAction_1_0()); 
            // InternalSpringFluentDSL.g:2181:2: ()
            // InternalSpringFluentDSL.g:2181:3: 
            {
            }

             after(grammarAccess.getOperationTypeAccess().getOperationTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__Group_1__0__Impl"


    // $ANTLR start "rule__OperationType__Group_1__1"
    // InternalSpringFluentDSL.g:2189:1: rule__OperationType__Group_1__1 : rule__OperationType__Group_1__1__Impl ;
    public final void rule__OperationType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2193:1: ( rule__OperationType__Group_1__1__Impl )
            // InternalSpringFluentDSL.g:2194:2: rule__OperationType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Group_1__1__Impl();

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
    // $ANTLR end "rule__OperationType__Group_1__1"


    // $ANTLR start "rule__OperationType__Group_1__1__Impl"
    // InternalSpringFluentDSL.g:2200:1: rule__OperationType__Group_1__1__Impl : ( ( 'none' )? ) ;
    public final void rule__OperationType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2204:1: ( ( ( 'none' )? ) )
            // InternalSpringFluentDSL.g:2205:1: ( ( 'none' )? )
            {
            // InternalSpringFluentDSL.g:2205:1: ( ( 'none' )? )
            // InternalSpringFluentDSL.g:2206:2: ( 'none' )?
            {
             before(grammarAccess.getOperationTypeAccess().getNoneKeyword_1_1()); 
            // InternalSpringFluentDSL.g:2207:2: ( 'none' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpringFluentDSL.g:2207:3: 'none'
                    {
                    match(input,53,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationTypeAccess().getNoneKeyword_1_1()); 

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
    // $ANTLR end "rule__OperationType__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSpringFluentDSL.g:2216:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2220:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSpringFluentDSL.g:2221:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalSpringFluentDSL.g:2228:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2232:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:2233:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:2233:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalSpringFluentDSL.g:2234:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalSpringFluentDSL.g:2235:2: ( rule__Attribute__NameAssignment_0 )
            // InternalSpringFluentDSL.g:2235:3: rule__Attribute__NameAssignment_0
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
    // InternalSpringFluentDSL.g:2243:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2247:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSpringFluentDSL.g:2248:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalSpringFluentDSL.g:2255:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2259:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:2260:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:2260:1: ( ':' )
            // InternalSpringFluentDSL.g:2261:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:2270:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2274:1: ( rule__Attribute__Group__2__Impl )
            // InternalSpringFluentDSL.g:2275:2: rule__Attribute__Group__2__Impl
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
    // InternalSpringFluentDSL.g:2281:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2285:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2286:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2286:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalSpringFluentDSL.g:2287:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalSpringFluentDSL.g:2288:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalSpringFluentDSL.g:2288:3: rule__Attribute__TypeAssignment_2
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
    // InternalSpringFluentDSL.g:2297:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2301:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSpringFluentDSL.g:2302:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalSpringFluentDSL.g:2309:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2313:1: ( ( ( rule__Relation__NameAssignment_0 ) ) )
            // InternalSpringFluentDSL.g:2314:1: ( ( rule__Relation__NameAssignment_0 ) )
            {
            // InternalSpringFluentDSL.g:2314:1: ( ( rule__Relation__NameAssignment_0 ) )
            // InternalSpringFluentDSL.g:2315:2: ( rule__Relation__NameAssignment_0 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalSpringFluentDSL.g:2316:2: ( rule__Relation__NameAssignment_0 )
            // InternalSpringFluentDSL.g:2316:3: rule__Relation__NameAssignment_0
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
    // InternalSpringFluentDSL.g:2324:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2328:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSpringFluentDSL.g:2329:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalSpringFluentDSL.g:2336:1: rule__Relation__Group__1__Impl : ( ':' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2340:1: ( ( ':' ) )
            // InternalSpringFluentDSL.g:2341:1: ( ':' )
            {
            // InternalSpringFluentDSL.g:2341:1: ( ':' )
            // InternalSpringFluentDSL.g:2342:2: ':'
            {
             before(grammarAccess.getRelationAccess().getColonKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSpringFluentDSL.g:2351:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2355:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSpringFluentDSL.g:2356:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
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
    // InternalSpringFluentDSL.g:2363:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__TargetAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2367:1: ( ( ( rule__Relation__TargetAssignment_2 ) ) )
            // InternalSpringFluentDSL.g:2368:1: ( ( rule__Relation__TargetAssignment_2 ) )
            {
            // InternalSpringFluentDSL.g:2368:1: ( ( rule__Relation__TargetAssignment_2 ) )
            // InternalSpringFluentDSL.g:2369:2: ( rule__Relation__TargetAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_2()); 
            // InternalSpringFluentDSL.g:2370:2: ( rule__Relation__TargetAssignment_2 )
            // InternalSpringFluentDSL.g:2370:3: rule__Relation__TargetAssignment_2
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
    // InternalSpringFluentDSL.g:2378:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2382:1: ( rule__Relation__Group__3__Impl )
            // InternalSpringFluentDSL.g:2383:2: rule__Relation__Group__3__Impl
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
    // InternalSpringFluentDSL.g:2389:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__TypeAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2393:1: ( ( ( rule__Relation__TypeAssignment_3 ) ) )
            // InternalSpringFluentDSL.g:2394:1: ( ( rule__Relation__TypeAssignment_3 ) )
            {
            // InternalSpringFluentDSL.g:2394:1: ( ( rule__Relation__TypeAssignment_3 ) )
            // InternalSpringFluentDSL.g:2395:2: ( rule__Relation__TypeAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_3()); 
            // InternalSpringFluentDSL.g:2396:2: ( rule__Relation__TypeAssignment_3 )
            // InternalSpringFluentDSL.g:2396:3: rule__Relation__TypeAssignment_3
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
    // InternalSpringFluentDSL.g:2405:1: rule__Model__PrefixAssignment_0 : ( rulePrefix ) ;
    public final void rule__Model__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2409:1: ( ( rulePrefix ) )
            // InternalSpringFluentDSL.g:2410:2: ( rulePrefix )
            {
            // InternalSpringFluentDSL.g:2410:2: ( rulePrefix )
            // InternalSpringFluentDSL.g:2411:3: rulePrefix
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
    // InternalSpringFluentDSL.g:2420:1: rule__Model__AppNameAssignment_1 : ( ruleAppName ) ;
    public final void rule__Model__AppNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2424:1: ( ( ruleAppName ) )
            // InternalSpringFluentDSL.g:2425:2: ( ruleAppName )
            {
            // InternalSpringFluentDSL.g:2425:2: ( ruleAppName )
            // InternalSpringFluentDSL.g:2426:3: ruleAppName
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
    // InternalSpringFluentDSL.g:2435:1: rule__Model__DependenciesAssignment_2 : ( ruleDependencies ) ;
    public final void rule__Model__DependenciesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2439:1: ( ( ruleDependencies ) )
            // InternalSpringFluentDSL.g:2440:2: ( ruleDependencies )
            {
            // InternalSpringFluentDSL.g:2440:2: ( ruleDependencies )
            // InternalSpringFluentDSL.g:2441:3: ruleDependencies
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
    // InternalSpringFluentDSL.g:2450:1: rule__Model__EntitiesAssignment_3 : ( ruleEntities ) ;
    public final void rule__Model__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2454:1: ( ( ruleEntities ) )
            // InternalSpringFluentDSL.g:2455:2: ( ruleEntities )
            {
            // InternalSpringFluentDSL.g:2455:2: ( ruleEntities )
            // InternalSpringFluentDSL.g:2456:3: ruleEntities
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
    // InternalSpringFluentDSL.g:2465:1: rule__Prefix__PrefixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Prefix__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2469:1: ( ( RULE_STRING ) )
            // InternalSpringFluentDSL.g:2470:2: ( RULE_STRING )
            {
            // InternalSpringFluentDSL.g:2470:2: ( RULE_STRING )
            // InternalSpringFluentDSL.g:2471:3: RULE_STRING
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
    // InternalSpringFluentDSL.g:2480:1: rule__AppName__AppNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AppName__AppNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2484:1: ( ( RULE_STRING ) )
            // InternalSpringFluentDSL.g:2485:2: ( RULE_STRING )
            {
            // InternalSpringFluentDSL.g:2485:2: ( RULE_STRING )
            // InternalSpringFluentDSL.g:2486:3: RULE_STRING
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
    // InternalSpringFluentDSL.g:2495:1: rule__Dependencies__DependenciesAssignment_3 : ( ruleDependency ) ;
    public final void rule__Dependencies__DependenciesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2499:1: ( ( ruleDependency ) )
            // InternalSpringFluentDSL.g:2500:2: ( ruleDependency )
            {
            // InternalSpringFluentDSL.g:2500:2: ( ruleDependency )
            // InternalSpringFluentDSL.g:2501:3: ruleDependency
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
    // InternalSpringFluentDSL.g:2510:1: rule__Dependencies__DependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Dependencies__DependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2514:1: ( ( ruleDependency ) )
            // InternalSpringFluentDSL.g:2515:2: ( ruleDependency )
            {
            // InternalSpringFluentDSL.g:2515:2: ( ruleDependency )
            // InternalSpringFluentDSL.g:2516:3: ruleDependency
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
    // InternalSpringFluentDSL.g:2525:1: rule__Dependency__DependencyAssignment_1 : ( ruleDependencyType ) ;
    public final void rule__Dependency__DependencyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2529:1: ( ( ruleDependencyType ) )
            // InternalSpringFluentDSL.g:2530:2: ( ruleDependencyType )
            {
            // InternalSpringFluentDSL.g:2530:2: ( ruleDependencyType )
            // InternalSpringFluentDSL.g:2531:3: ruleDependencyType
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
    // InternalSpringFluentDSL.g:2540:1: rule__Entities__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Entities__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2544:1: ( ( ruleEntity ) )
            // InternalSpringFluentDSL.g:2545:2: ( ruleEntity )
            {
            // InternalSpringFluentDSL.g:2545:2: ( ruleEntity )
            // InternalSpringFluentDSL.g:2546:3: ruleEntity
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
    // InternalSpringFluentDSL.g:2555:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2559:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2560:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2560:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2561:3: RULE_ID
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
    // InternalSpringFluentDSL.g:2570:1: rule__Entity__StrategyAssignment_2_4 : ( ruleStrategy ) ;
    public final void rule__Entity__StrategyAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2574:1: ( ( ruleStrategy ) )
            // InternalSpringFluentDSL.g:2575:2: ( ruleStrategy )
            {
            // InternalSpringFluentDSL.g:2575:2: ( ruleStrategy )
            // InternalSpringFluentDSL.g:2576:3: ruleStrategy
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
    // InternalSpringFluentDSL.g:2585:1: rule__Entity__SuperTypeAssignment_2_6 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2589:1: ( ( ( RULE_ID ) ) )
            // InternalSpringFluentDSL.g:2590:2: ( ( RULE_ID ) )
            {
            // InternalSpringFluentDSL.g:2590:2: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2591:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_6_0()); 
            // InternalSpringFluentDSL.g:2592:3: ( RULE_ID )
            // InternalSpringFluentDSL.g:2593:4: RULE_ID
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
    // InternalSpringFluentDSL.g:2604:1: rule__Entity__FeatureAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2608:1: ( ( ruleFeature ) )
            // InternalSpringFluentDSL.g:2609:2: ( ruleFeature )
            {
            // InternalSpringFluentDSL.g:2609:2: ( ruleFeature )
            // InternalSpringFluentDSL.g:2610:3: ruleFeature
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
    // InternalSpringFluentDSL.g:2619:1: rule__Feature__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__Feature__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2623:1: ( ( ruleOperation ) )
            // InternalSpringFluentDSL.g:2624:2: ( ruleOperation )
            {
            // InternalSpringFluentDSL.g:2624:2: ( ruleOperation )
            // InternalSpringFluentDSL.g:2625:3: ruleOperation
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
    // InternalSpringFluentDSL.g:2634:1: rule__Feature__IdAssignment_2 : ( ruleIDENTITY ) ;
    public final void rule__Feature__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2638:1: ( ( ruleIDENTITY ) )
            // InternalSpringFluentDSL.g:2639:2: ( ruleIDENTITY )
            {
            // InternalSpringFluentDSL.g:2639:2: ( ruleIDENTITY )
            // InternalSpringFluentDSL.g:2640:3: ruleIDENTITY
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
    // InternalSpringFluentDSL.g:2649:1: rule__Feature__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Feature__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2653:1: ( ( ruleAttribute ) )
            // InternalSpringFluentDSL.g:2654:2: ( ruleAttribute )
            {
            // InternalSpringFluentDSL.g:2654:2: ( ruleAttribute )
            // InternalSpringFluentDSL.g:2655:3: ruleAttribute
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
    // InternalSpringFluentDSL.g:2664:1: rule__Feature__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__Feature__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2668:1: ( ( ruleRelation ) )
            // InternalSpringFluentDSL.g:2669:2: ( ruleRelation )
            {
            // InternalSpringFluentDSL.g:2669:2: ( ruleRelation )
            // InternalSpringFluentDSL.g:2670:3: ruleRelation
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
    // InternalSpringFluentDSL.g:2679:1: rule__Strategy__StrategyAssignment_1 : ( ( rule__Strategy__StrategyAlternatives_1_0 ) ) ;
    public final void rule__Strategy__StrategyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2683:1: ( ( ( rule__Strategy__StrategyAlternatives_1_0 ) ) )
            // InternalSpringFluentDSL.g:2684:2: ( ( rule__Strategy__StrategyAlternatives_1_0 ) )
            {
            // InternalSpringFluentDSL.g:2684:2: ( ( rule__Strategy__StrategyAlternatives_1_0 ) )
            // InternalSpringFluentDSL.g:2685:3: ( rule__Strategy__StrategyAlternatives_1_0 )
            {
             before(grammarAccess.getStrategyAccess().getStrategyAlternatives_1_0()); 
            // InternalSpringFluentDSL.g:2686:3: ( rule__Strategy__StrategyAlternatives_1_0 )
            // InternalSpringFluentDSL.g:2686:4: rule__Strategy__StrategyAlternatives_1_0
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
    // InternalSpringFluentDSL.g:2694:1: rule__IDENTITY__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__IDENTITY__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2698:1: ( ( ruleType ) )
            // InternalSpringFluentDSL.g:2699:2: ( ruleType )
            {
            // InternalSpringFluentDSL.g:2699:2: ( ruleType )
            // InternalSpringFluentDSL.g:2700:3: ruleType
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


    // $ANTLR start "rule__OperationType__OprationTypeAssignment_0_1"
    // InternalSpringFluentDSL.g:2709:1: rule__OperationType__OprationTypeAssignment_0_1 : ( ( 'c' ) ) ;
    public final void rule__OperationType__OprationTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2713:1: ( ( ( 'c' ) ) )
            // InternalSpringFluentDSL.g:2714:2: ( ( 'c' ) )
            {
            // InternalSpringFluentDSL.g:2714:2: ( ( 'c' ) )
            // InternalSpringFluentDSL.g:2715:3: ( 'c' )
            {
             before(grammarAccess.getOperationTypeAccess().getOprationTypeCKeyword_0_1_0()); 
            // InternalSpringFluentDSL.g:2716:3: ( 'c' )
            // InternalSpringFluentDSL.g:2717:4: 'c'
            {
             before(grammarAccess.getOperationTypeAccess().getOprationTypeCKeyword_0_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getOperationTypeAccess().getOprationTypeCKeyword_0_1_0()); 

            }

             after(grammarAccess.getOperationTypeAccess().getOprationTypeCKeyword_0_1_0()); 

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
    // $ANTLR end "rule__OperationType__OprationTypeAssignment_0_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalSpringFluentDSL.g:2728:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2732:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2733:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2733:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2734:3: RULE_ID
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
    // InternalSpringFluentDSL.g:2743:1: rule__Attribute__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2747:1: ( ( ruleType ) )
            // InternalSpringFluentDSL.g:2748:2: ( ruleType )
            {
            // InternalSpringFluentDSL.g:2748:2: ( ruleType )
            // InternalSpringFluentDSL.g:2749:3: ruleType
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
    // InternalSpringFluentDSL.g:2758:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2762:1: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2763:2: ( RULE_ID )
            {
            // InternalSpringFluentDSL.g:2763:2: ( RULE_ID )
            // InternalSpringFluentDSL.g:2764:3: RULE_ID
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
    // InternalSpringFluentDSL.g:2773:1: rule__Relation__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2777:1: ( ( ( RULE_ID ) ) )
            // InternalSpringFluentDSL.g:2778:2: ( ( RULE_ID ) )
            {
            // InternalSpringFluentDSL.g:2778:2: ( ( RULE_ID ) )
            // InternalSpringFluentDSL.g:2779:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_2_0()); 
            // InternalSpringFluentDSL.g:2780:3: ( RULE_ID )
            // InternalSpringFluentDSL.g:2781:4: RULE_ID
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
    // InternalSpringFluentDSL.g:2792:1: rule__Relation__TypeAssignment_3 : ( ( rule__Relation__TypeAlternatives_3_0 ) ) ;
    public final void rule__Relation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpringFluentDSL.g:2796:1: ( ( ( rule__Relation__TypeAlternatives_3_0 ) ) )
            // InternalSpringFluentDSL.g:2797:2: ( ( rule__Relation__TypeAlternatives_3_0 ) )
            {
            // InternalSpringFluentDSL.g:2797:2: ( ( rule__Relation__TypeAlternatives_3_0 ) )
            // InternalSpringFluentDSL.g:2798:3: ( rule__Relation__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getRelationAccess().getTypeAlternatives_3_0()); 
            // InternalSpringFluentDSL.g:2799:3: ( rule__Relation__TypeAlternatives_3_0 )
            // InternalSpringFluentDSL.g:2799:4: rule__Relation__TypeAlternatives_3_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003FC0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x007C000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x005C000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000003C000L});

}