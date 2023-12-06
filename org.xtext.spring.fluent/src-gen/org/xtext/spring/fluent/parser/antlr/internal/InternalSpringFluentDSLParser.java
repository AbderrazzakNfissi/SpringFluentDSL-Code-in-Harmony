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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpringFluentDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prefix:'", "'app_name:'", "'dependencies'", "'{'", "','", "'}'", "'entities'", "'entity'", "'extends'", "'['", "'strategy'", "'='", "']'", "'SingleTable'", "'JoinedTable'", "'TablePerClass'", "'id'", "':'", "'pk'", "'ops'", "'mto'", "'otm'", "'oto'", "'mtm'", "'SpringDataJpa'", "'SpringWeb'", "'Lombok'", "'MySQLDriver'", "'DevTools'", "'Thymeleaf'", "'Swagger'", "'SpringSecurity'", "'Long'", "'Integer'", "'Double'", "'String'", "'Date'", "'Time'", "'Boolean'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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




    // $ANTLR start "entryRuleModel"
    // InternalSpringFluentDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSpringFluentDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSpringFluentDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpringFluentDSL.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_prefix_0_0= rulePrefix ) ) ( (lv_appName_1_0= ruleAppName ) ) ( (lv_dependencies_2_0= ruleDependencies ) ) ( (lv_entities_3_0= ruleEntities ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_prefix_0_0 = null;

        EObject lv_appName_1_0 = null;

        EObject lv_dependencies_2_0 = null;

        EObject lv_entities_3_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:78:2: ( ( ( (lv_prefix_0_0= rulePrefix ) ) ( (lv_appName_1_0= ruleAppName ) ) ( (lv_dependencies_2_0= ruleDependencies ) ) ( (lv_entities_3_0= ruleEntities ) ) ) )
            // InternalSpringFluentDSL.g:79:2: ( ( (lv_prefix_0_0= rulePrefix ) ) ( (lv_appName_1_0= ruleAppName ) ) ( (lv_dependencies_2_0= ruleDependencies ) ) ( (lv_entities_3_0= ruleEntities ) ) )
            {
            // InternalSpringFluentDSL.g:79:2: ( ( (lv_prefix_0_0= rulePrefix ) ) ( (lv_appName_1_0= ruleAppName ) ) ( (lv_dependencies_2_0= ruleDependencies ) ) ( (lv_entities_3_0= ruleEntities ) ) )
            // InternalSpringFluentDSL.g:80:3: ( (lv_prefix_0_0= rulePrefix ) ) ( (lv_appName_1_0= ruleAppName ) ) ( (lv_dependencies_2_0= ruleDependencies ) ) ( (lv_entities_3_0= ruleEntities ) )
            {
            // InternalSpringFluentDSL.g:80:3: ( (lv_prefix_0_0= rulePrefix ) )
            // InternalSpringFluentDSL.g:81:4: (lv_prefix_0_0= rulePrefix )
            {
            // InternalSpringFluentDSL.g:81:4: (lv_prefix_0_0= rulePrefix )
            // InternalSpringFluentDSL.g:82:5: lv_prefix_0_0= rulePrefix
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPrefixPrefixParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_prefix_0_0=rulePrefix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"prefix",
            						lv_prefix_0_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Prefix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringFluentDSL.g:99:3: ( (lv_appName_1_0= ruleAppName ) )
            // InternalSpringFluentDSL.g:100:4: (lv_appName_1_0= ruleAppName )
            {
            // InternalSpringFluentDSL.g:100:4: (lv_appName_1_0= ruleAppName )
            // InternalSpringFluentDSL.g:101:5: lv_appName_1_0= ruleAppName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAppNameAppNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_appName_1_0=ruleAppName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"appName",
            						lv_appName_1_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.AppName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringFluentDSL.g:118:3: ( (lv_dependencies_2_0= ruleDependencies ) )
            // InternalSpringFluentDSL.g:119:4: (lv_dependencies_2_0= ruleDependencies )
            {
            // InternalSpringFluentDSL.g:119:4: (lv_dependencies_2_0= ruleDependencies )
            // InternalSpringFluentDSL.g:120:5: lv_dependencies_2_0= ruleDependencies
            {

            					newCompositeNode(grammarAccess.getModelAccess().getDependenciesDependenciesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_dependencies_2_0=ruleDependencies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"dependencies",
            						lv_dependencies_2_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Dependencies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringFluentDSL.g:137:3: ( (lv_entities_3_0= ruleEntities ) )
            // InternalSpringFluentDSL.g:138:4: (lv_entities_3_0= ruleEntities )
            {
            // InternalSpringFluentDSL.g:138:4: (lv_entities_3_0= ruleEntities )
            // InternalSpringFluentDSL.g:139:5: lv_entities_3_0= ruleEntities
            {

            					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_entities_3_0=ruleEntities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"entities",
            						lv_entities_3_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Entities");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePrefix"
    // InternalSpringFluentDSL.g:160:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalSpringFluentDSL.g:160:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalSpringFluentDSL.g:161:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalSpringFluentDSL.g:167:1: rulePrefix returns [EObject current=null] : ( () otherlv_1= 'prefix:' ( (lv_prefix_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;


        	enterRule();

        try {
            // InternalSpringFluentDSL.g:173:2: ( ( () otherlv_1= 'prefix:' ( (lv_prefix_2_0= RULE_STRING ) ) ) )
            // InternalSpringFluentDSL.g:174:2: ( () otherlv_1= 'prefix:' ( (lv_prefix_2_0= RULE_STRING ) ) )
            {
            // InternalSpringFluentDSL.g:174:2: ( () otherlv_1= 'prefix:' ( (lv_prefix_2_0= RULE_STRING ) ) )
            // InternalSpringFluentDSL.g:175:3: () otherlv_1= 'prefix:' ( (lv_prefix_2_0= RULE_STRING ) )
            {
            // InternalSpringFluentDSL.g:175:3: ()
            // InternalSpringFluentDSL.g:176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrefixAccess().getPrefixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPrefixAccess().getPrefixKeyword_1());
            		
            // InternalSpringFluentDSL.g:186:3: ( (lv_prefix_2_0= RULE_STRING ) )
            // InternalSpringFluentDSL.g:187:4: (lv_prefix_2_0= RULE_STRING )
            {
            // InternalSpringFluentDSL.g:187:4: (lv_prefix_2_0= RULE_STRING )
            // InternalSpringFluentDSL.g:188:5: lv_prefix_2_0= RULE_STRING
            {
            lv_prefix_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_prefix_2_0, grammarAccess.getPrefixAccess().getPrefixSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrefixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prefix",
            						lv_prefix_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleAppName"
    // InternalSpringFluentDSL.g:208:1: entryRuleAppName returns [EObject current=null] : iv_ruleAppName= ruleAppName EOF ;
    public final EObject entryRuleAppName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppName = null;


        try {
            // InternalSpringFluentDSL.g:208:48: (iv_ruleAppName= ruleAppName EOF )
            // InternalSpringFluentDSL.g:209:2: iv_ruleAppName= ruleAppName EOF
            {
             newCompositeNode(grammarAccess.getAppNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppName=ruleAppName();

            state._fsp--;

             current =iv_ruleAppName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppName"


    // $ANTLR start "ruleAppName"
    // InternalSpringFluentDSL.g:215:1: ruleAppName returns [EObject current=null] : ( () otherlv_1= 'app_name:' ( (lv_appName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAppName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_appName_2_0=null;


        	enterRule();

        try {
            // InternalSpringFluentDSL.g:221:2: ( ( () otherlv_1= 'app_name:' ( (lv_appName_2_0= RULE_STRING ) ) ) )
            // InternalSpringFluentDSL.g:222:2: ( () otherlv_1= 'app_name:' ( (lv_appName_2_0= RULE_STRING ) ) )
            {
            // InternalSpringFluentDSL.g:222:2: ( () otherlv_1= 'app_name:' ( (lv_appName_2_0= RULE_STRING ) ) )
            // InternalSpringFluentDSL.g:223:3: () otherlv_1= 'app_name:' ( (lv_appName_2_0= RULE_STRING ) )
            {
            // InternalSpringFluentDSL.g:223:3: ()
            // InternalSpringFluentDSL.g:224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAppNameAccess().getAppNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAppNameAccess().getApp_nameKeyword_1());
            		
            // InternalSpringFluentDSL.g:234:3: ( (lv_appName_2_0= RULE_STRING ) )
            // InternalSpringFluentDSL.g:235:4: (lv_appName_2_0= RULE_STRING )
            {
            // InternalSpringFluentDSL.g:235:4: (lv_appName_2_0= RULE_STRING )
            // InternalSpringFluentDSL.g:236:5: lv_appName_2_0= RULE_STRING
            {
            lv_appName_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_appName_2_0, grammarAccess.getAppNameAccess().getAppNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appName",
            						lv_appName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppName"


    // $ANTLR start "entryRuleDependencies"
    // InternalSpringFluentDSL.g:256:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // InternalSpringFluentDSL.g:256:53: (iv_ruleDependencies= ruleDependencies EOF )
            // InternalSpringFluentDSL.g:257:2: iv_ruleDependencies= ruleDependencies EOF
            {
             newCompositeNode(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;

             current =iv_ruleDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencies"


    // $ANTLR start "ruleDependencies"
    // InternalSpringFluentDSL.g:263:1: ruleDependencies returns [EObject current=null] : ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleDependency ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dependencies_3_0 = null;

        EObject lv_dependencies_5_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:269:2: ( ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleDependency ) ) )* otherlv_6= '}' ) )
            // InternalSpringFluentDSL.g:270:2: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleDependency ) ) )* otherlv_6= '}' )
            {
            // InternalSpringFluentDSL.g:270:2: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleDependency ) ) )* otherlv_6= '}' )
            // InternalSpringFluentDSL.g:271:3: () otherlv_1= 'dependencies' otherlv_2= '{' ( (lv_dependencies_3_0= ruleDependency ) ) (otherlv_4= ',' ( (lv_dependencies_5_0= ruleDependency ) ) )* otherlv_6= '}'
            {
            // InternalSpringFluentDSL.g:271:3: ()
            // InternalSpringFluentDSL.g:272:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpringFluentDSL.g:286:3: ( (lv_dependencies_3_0= ruleDependency ) )
            // InternalSpringFluentDSL.g:287:4: (lv_dependencies_3_0= ruleDependency )
            {
            // InternalSpringFluentDSL.g:287:4: (lv_dependencies_3_0= ruleDependency )
            // InternalSpringFluentDSL.g:288:5: lv_dependencies_3_0= ruleDependency
            {

            					newCompositeNode(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_dependencies_3_0=ruleDependency();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependenciesRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_3_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Dependency");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringFluentDSL.g:305:3: (otherlv_4= ',' ( (lv_dependencies_5_0= ruleDependency ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:306:4: otherlv_4= ',' ( (lv_dependencies_5_0= ruleDependency ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDependenciesAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSpringFluentDSL.g:310:4: ( (lv_dependencies_5_0= ruleDependency ) )
            	    // InternalSpringFluentDSL.g:311:5: (lv_dependencies_5_0= ruleDependency )
            	    {
            	    // InternalSpringFluentDSL.g:311:5: (lv_dependencies_5_0= ruleDependency )
            	    // InternalSpringFluentDSL.g:312:6: lv_dependencies_5_0= ruleDependency
            	    {

            	    						newCompositeNode(grammarAccess.getDependenciesAccess().getDependenciesDependencyParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_dependencies_5_0=ruleDependency();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dependencies",
            	    							lv_dependencies_5_0,
            	    							"org.xtext.spring.fluent.SpringFluentDSL.Dependency");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencies"


    // $ANTLR start "entryRuleDependency"
    // InternalSpringFluentDSL.g:338:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalSpringFluentDSL.g:338:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalSpringFluentDSL.g:339:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalSpringFluentDSL.g:345:1: ruleDependency returns [EObject current=null] : ( () ( (lv_dependency_1_0= ruleDependencyType ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Enumerator lv_dependency_1_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:351:2: ( ( () ( (lv_dependency_1_0= ruleDependencyType ) ) ) )
            // InternalSpringFluentDSL.g:352:2: ( () ( (lv_dependency_1_0= ruleDependencyType ) ) )
            {
            // InternalSpringFluentDSL.g:352:2: ( () ( (lv_dependency_1_0= ruleDependencyType ) ) )
            // InternalSpringFluentDSL.g:353:3: () ( (lv_dependency_1_0= ruleDependencyType ) )
            {
            // InternalSpringFluentDSL.g:353:3: ()
            // InternalSpringFluentDSL.g:354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependencyAccess().getDependencyAction_0(),
            					current);
            			

            }

            // InternalSpringFluentDSL.g:360:3: ( (lv_dependency_1_0= ruleDependencyType ) )
            // InternalSpringFluentDSL.g:361:4: (lv_dependency_1_0= ruleDependencyType )
            {
            // InternalSpringFluentDSL.g:361:4: (lv_dependency_1_0= ruleDependencyType )
            // InternalSpringFluentDSL.g:362:5: lv_dependency_1_0= ruleDependencyType
            {

            					newCompositeNode(grammarAccess.getDependencyAccess().getDependencyDependencyTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dependency_1_0=ruleDependencyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependencyRule());
            					}
            					set(
            						current,
            						"dependency",
            						lv_dependency_1_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.DependencyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleEntities"
    // InternalSpringFluentDSL.g:383:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalSpringFluentDSL.g:383:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalSpringFluentDSL.g:384:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalSpringFluentDSL.g:390:1: ruleEntities returns [EObject current=null] : ( () otherlv_1= 'entities' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entities_3_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:396:2: ( ( () otherlv_1= 'entities' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // InternalSpringFluentDSL.g:397:2: ( () otherlv_1= 'entities' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // InternalSpringFluentDSL.g:397:2: ( () otherlv_1= 'entities' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // InternalSpringFluentDSL.g:398:3: () otherlv_1= 'entities' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            // InternalSpringFluentDSL.g:398:3: ()
            // InternalSpringFluentDSL.g:399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntitiesAccess().getEntitiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEntitiesAccess().getEntitiesKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEntitiesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpringFluentDSL.g:413:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:414:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalSpringFluentDSL.g:414:4: (lv_entities_3_0= ruleEntity )
            	    // InternalSpringFluentDSL.g:415:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
            	    						"org.xtext.spring.fluent.SpringFluentDSL.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntitiesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleEntity"
    // InternalSpringFluentDSL.g:440:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSpringFluentDSL.g:440:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSpringFluentDSL.g:441:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSpringFluentDSL.g:447:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' otherlv_3= '[' otherlv_4= 'strategy' otherlv_5= '=' ( (lv_strategy_6_0= ruleStrategy ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_feature_10_0= ruleFeature ) ) otherlv_11= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_strategy_6_0 = null;

        EObject lv_feature_10_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:453:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' otherlv_3= '[' otherlv_4= 'strategy' otherlv_5= '=' ( (lv_strategy_6_0= ruleStrategy ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_feature_10_0= ruleFeature ) ) otherlv_11= '}' ) )
            // InternalSpringFluentDSL.g:454:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' otherlv_3= '[' otherlv_4= 'strategy' otherlv_5= '=' ( (lv_strategy_6_0= ruleStrategy ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_feature_10_0= ruleFeature ) ) otherlv_11= '}' )
            {
            // InternalSpringFluentDSL.g:454:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' otherlv_3= '[' otherlv_4= 'strategy' otherlv_5= '=' ( (lv_strategy_6_0= ruleStrategy ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_feature_10_0= ruleFeature ) ) otherlv_11= '}' )
            // InternalSpringFluentDSL.g:455:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' otherlv_3= '[' otherlv_4= 'strategy' otherlv_5= '=' ( (lv_strategy_6_0= ruleStrategy ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_feature_10_0= ruleFeature ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSpringFluentDSL.g:459:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringFluentDSL.g:460:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringFluentDSL.g:460:4: (lv_name_1_0= RULE_ID )
            // InternalSpringFluentDSL.g:461:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpringFluentDSL.g:477:3: (otherlv_2= 'extends' otherlv_3= '[' otherlv_4= 'strategy' otherlv_5= '=' ( (lv_strategy_6_0= ruleStrategy ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpringFluentDSL.g:478:4: otherlv_2= 'extends' otherlv_3= '[' otherlv_4= 'strategy' otherlv_5= '=' ( (lv_strategy_6_0= ruleStrategy ) ) otherlv_7= ']' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getStrategyKeyword_2_2());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEqualsSignKeyword_2_3());
                    			
                    // InternalSpringFluentDSL.g:494:4: ( (lv_strategy_6_0= ruleStrategy ) )
                    // InternalSpringFluentDSL.g:495:5: (lv_strategy_6_0= ruleStrategy )
                    {
                    // InternalSpringFluentDSL.g:495:5: (lv_strategy_6_0= ruleStrategy )
                    // InternalSpringFluentDSL.g:496:6: lv_strategy_6_0= ruleStrategy
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getStrategyStrategyParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_strategy_6_0=ruleStrategy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"strategy",
                    							lv_strategy_6_0,
                    							"org.xtext.spring.fluent.SpringFluentDSL.Strategy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_5());
                    			
                    // InternalSpringFluentDSL.g:517:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSpringFluentDSL.g:518:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSpringFluentDSL.g:518:5: (otherlv_8= RULE_ID )
                    // InternalSpringFluentDSL.g:519:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_6_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpringFluentDSL.g:535:3: ( (lv_feature_10_0= ruleFeature ) )
            // InternalSpringFluentDSL.g:536:4: (lv_feature_10_0= ruleFeature )
            {
            // InternalSpringFluentDSL.g:536:4: (lv_feature_10_0= ruleFeature )
            // InternalSpringFluentDSL.g:537:5: lv_feature_10_0= ruleFeature
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getFeatureFeatureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_feature_10_0=ruleFeature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"feature",
            						lv_feature_10_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Feature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalSpringFluentDSL.g:562:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSpringFluentDSL.g:562:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSpringFluentDSL.g:563:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSpringFluentDSL.g:569:1: ruleFeature returns [EObject current=null] : ( () ( (lv_operation_1_0= ruleOperation ) ) ( (lv_id_2_0= ruleIDENTITY ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_1_0 = null;

        EObject lv_id_2_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:575:2: ( ( () ( (lv_operation_1_0= ruleOperation ) ) ( (lv_id_2_0= ruleIDENTITY ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* ) )
            // InternalSpringFluentDSL.g:576:2: ( () ( (lv_operation_1_0= ruleOperation ) ) ( (lv_id_2_0= ruleIDENTITY ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* )
            {
            // InternalSpringFluentDSL.g:576:2: ( () ( (lv_operation_1_0= ruleOperation ) ) ( (lv_id_2_0= ruleIDENTITY ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* )
            // InternalSpringFluentDSL.g:577:3: () ( (lv_operation_1_0= ruleOperation ) ) ( (lv_id_2_0= ruleIDENTITY ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )*
            {
            // InternalSpringFluentDSL.g:577:3: ()
            // InternalSpringFluentDSL.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureAccess().getFeatureAction_0(),
            					current);
            			

            }

            // InternalSpringFluentDSL.g:584:3: ( (lv_operation_1_0= ruleOperation ) )
            // InternalSpringFluentDSL.g:585:4: (lv_operation_1_0= ruleOperation )
            {
            // InternalSpringFluentDSL.g:585:4: (lv_operation_1_0= ruleOperation )
            // InternalSpringFluentDSL.g:586:5: lv_operation_1_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getOperationOperationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_operation_1_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_1_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringFluentDSL.g:603:3: ( (lv_id_2_0= ruleIDENTITY ) )
            // InternalSpringFluentDSL.g:604:4: (lv_id_2_0= ruleIDENTITY )
            {
            // InternalSpringFluentDSL.g:604:4: (lv_id_2_0= ruleIDENTITY )
            // InternalSpringFluentDSL.g:605:5: lv_id_2_0= ruleIDENTITY
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getIdIDENTITYParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_id_2_0=ruleIDENTITY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.IDENTITY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringFluentDSL.g:622:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==28) ) {
                        int LA4_3 = input.LA(3);

                        if ( ((LA4_3>=43 && LA4_3<=49)) ) {
                            alt4=1;
                        }


                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:623:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalSpringFluentDSL.g:623:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalSpringFluentDSL.g:624:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.spring.fluent.SpringFluentDSL.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSpringFluentDSL.g:641:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSpringFluentDSL.g:642:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalSpringFluentDSL.g:642:4: (lv_relations_4_0= ruleRelation )
            	    // InternalSpringFluentDSL.g:643:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_relations_4_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_4_0,
            	    						"org.xtext.spring.fluent.SpringFluentDSL.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStrategy"
    // InternalSpringFluentDSL.g:664:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalSpringFluentDSL.g:664:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalSpringFluentDSL.g:665:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalSpringFluentDSL.g:671:1: ruleStrategy returns [EObject current=null] : ( () ( ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) ) ) ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_strategy_1_1=null;
        Token lv_strategy_1_2=null;
        Token lv_strategy_1_3=null;


        	enterRule();

        try {
            // InternalSpringFluentDSL.g:677:2: ( ( () ( ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) ) ) ) )
            // InternalSpringFluentDSL.g:678:2: ( () ( ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) ) ) )
            {
            // InternalSpringFluentDSL.g:678:2: ( () ( ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) ) ) )
            // InternalSpringFluentDSL.g:679:3: () ( ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) ) )
            {
            // InternalSpringFluentDSL.g:679:3: ()
            // InternalSpringFluentDSL.g:680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrategyAccess().getStrategyAction_0(),
            					current);
            			

            }

            // InternalSpringFluentDSL.g:686:3: ( ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) ) )
            // InternalSpringFluentDSL.g:687:4: ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) )
            {
            // InternalSpringFluentDSL.g:687:4: ( (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' ) )
            // InternalSpringFluentDSL.g:688:5: (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' )
            {
            // InternalSpringFluentDSL.g:688:5: (lv_strategy_1_1= 'SingleTable' | lv_strategy_1_2= 'JoinedTable' | lv_strategy_1_3= 'TablePerClass' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSpringFluentDSL.g:689:6: lv_strategy_1_1= 'SingleTable'
                    {
                    lv_strategy_1_1=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_strategy_1_1, grammarAccess.getStrategyAccess().getStrategySingleTableKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategyRule());
                    						}
                    						setWithLastConsumed(current, "strategy", lv_strategy_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:700:6: lv_strategy_1_2= 'JoinedTable'
                    {
                    lv_strategy_1_2=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_strategy_1_2, grammarAccess.getStrategyAccess().getStrategyJoinedTableKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategyRule());
                    						}
                    						setWithLastConsumed(current, "strategy", lv_strategy_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:711:6: lv_strategy_1_3= 'TablePerClass'
                    {
                    lv_strategy_1_3=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_strategy_1_3, grammarAccess.getStrategyAccess().getStrategyTablePerClassKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategyRule());
                    						}
                    						setWithLastConsumed(current, "strategy", lv_strategy_1_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleIDENTITY"
    // InternalSpringFluentDSL.g:728:1: entryRuleIDENTITY returns [EObject current=null] : iv_ruleIDENTITY= ruleIDENTITY EOF ;
    public final EObject entryRuleIDENTITY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDENTITY = null;


        try {
            // InternalSpringFluentDSL.g:728:49: (iv_ruleIDENTITY= ruleIDENTITY EOF )
            // InternalSpringFluentDSL.g:729:2: iv_ruleIDENTITY= ruleIDENTITY EOF
            {
             newCompositeNode(grammarAccess.getIDENTITYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDENTITY=ruleIDENTITY();

            state._fsp--;

             current =iv_ruleIDENTITY; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDENTITY"


    // $ANTLR start "ruleIDENTITY"
    // InternalSpringFluentDSL.g:735:1: ruleIDENTITY returns [EObject current=null] : (otherlv_0= 'id' otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= 'pk' ) ;
    public final EObject ruleIDENTITY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:741:2: ( (otherlv_0= 'id' otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= 'pk' ) )
            // InternalSpringFluentDSL.g:742:2: (otherlv_0= 'id' otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= 'pk' )
            {
            // InternalSpringFluentDSL.g:742:2: (otherlv_0= 'id' otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= 'pk' )
            // InternalSpringFluentDSL.g:743:3: otherlv_0= 'id' otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= 'pk'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getIDENTITYAccess().getIdKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIDENTITYAccess().getColonKeyword_1());
            		
            // InternalSpringFluentDSL.g:751:3: ( (lv_type_2_0= ruleType ) )
            // InternalSpringFluentDSL.g:752:4: (lv_type_2_0= ruleType )
            {
            // InternalSpringFluentDSL.g:752:4: (lv_type_2_0= ruleType )
            // InternalSpringFluentDSL.g:753:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIDENTITYAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIDENTITYRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIDENTITYAccess().getPkKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDENTITY"


    // $ANTLR start "entryRuleOperation"
    // InternalSpringFluentDSL.g:778:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSpringFluentDSL.g:778:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSpringFluentDSL.g:779:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSpringFluentDSL.g:785:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'ops' otherlv_1= ':' ( (lv_operation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_operation_2_0=null;


        	enterRule();

        try {
            // InternalSpringFluentDSL.g:791:2: ( (otherlv_0= 'ops' otherlv_1= ':' ( (lv_operation_2_0= RULE_STRING ) ) ) )
            // InternalSpringFluentDSL.g:792:2: (otherlv_0= 'ops' otherlv_1= ':' ( (lv_operation_2_0= RULE_STRING ) ) )
            {
            // InternalSpringFluentDSL.g:792:2: (otherlv_0= 'ops' otherlv_1= ':' ( (lv_operation_2_0= RULE_STRING ) ) )
            // InternalSpringFluentDSL.g:793:3: otherlv_0= 'ops' otherlv_1= ':' ( (lv_operation_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpsKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getColonKeyword_1());
            		
            // InternalSpringFluentDSL.g:801:3: ( (lv_operation_2_0= RULE_STRING ) )
            // InternalSpringFluentDSL.g:802:4: (lv_operation_2_0= RULE_STRING )
            {
            // InternalSpringFluentDSL.g:802:4: (lv_operation_2_0= RULE_STRING )
            // InternalSpringFluentDSL.g:803:5: lv_operation_2_0= RULE_STRING
            {
            lv_operation_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_operation_2_0, grammarAccess.getOperationAccess().getOperationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAttribute"
    // InternalSpringFluentDSL.g:823:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSpringFluentDSL.g:823:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSpringFluentDSL.g:824:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSpringFluentDSL.g:830:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringFluentDSL.g:836:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalSpringFluentDSL.g:837:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalSpringFluentDSL.g:837:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalSpringFluentDSL.g:838:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalSpringFluentDSL.g:838:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpringFluentDSL.g:839:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSpringFluentDSL.g:839:4: (lv_name_0_0= RULE_ID )
            // InternalSpringFluentDSL.g:840:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalSpringFluentDSL.g:860:3: ( (lv_type_2_0= ruleType ) )
            // InternalSpringFluentDSL.g:861:4: (lv_type_2_0= ruleType )
            {
            // InternalSpringFluentDSL.g:861:4: (lv_type_2_0= ruleType )
            // InternalSpringFluentDSL.g:862:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.spring.fluent.SpringFluentDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalSpringFluentDSL.g:883:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalSpringFluentDSL.g:883:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalSpringFluentDSL.g:884:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSpringFluentDSL.g:890:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;


        	enterRule();

        try {
            // InternalSpringFluentDSL.g:896:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) ) ) ) )
            // InternalSpringFluentDSL.g:897:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) ) ) )
            {
            // InternalSpringFluentDSL.g:897:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) ) ) )
            // InternalSpringFluentDSL.g:898:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) ) )
            {
            // InternalSpringFluentDSL.g:898:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpringFluentDSL.g:899:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSpringFluentDSL.g:899:4: (lv_name_0_0= RULE_ID )
            // InternalSpringFluentDSL.g:900:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getColonKeyword_1());
            		
            // InternalSpringFluentDSL.g:920:3: ( (otherlv_2= RULE_ID ) )
            // InternalSpringFluentDSL.g:921:4: (otherlv_2= RULE_ID )
            {
            // InternalSpringFluentDSL.g:921:4: (otherlv_2= RULE_ID )
            // InternalSpringFluentDSL.g:922:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getTargetEntityCrossReference_2_0());
            				

            }


            }

            // InternalSpringFluentDSL.g:933:3: ( ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) ) )
            // InternalSpringFluentDSL.g:934:4: ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) )
            {
            // InternalSpringFluentDSL.g:934:4: ( (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' ) )
            // InternalSpringFluentDSL.g:935:5: (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' )
            {
            // InternalSpringFluentDSL.g:935:5: (lv_type_3_1= 'mto' | lv_type_3_2= 'otm' | lv_type_3_3= 'oto' | lv_type_3_4= 'mtm' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSpringFluentDSL.g:936:6: lv_type_3_1= 'mto'
                    {
                    lv_type_3_1=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_type_3_1, grammarAccess.getRelationAccess().getTypeMtoKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:947:6: lv_type_3_2= 'otm'
                    {
                    lv_type_3_2=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_type_3_2, grammarAccess.getRelationAccess().getTypeOtmKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:958:6: lv_type_3_3= 'oto'
                    {
                    lv_type_3_3=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_type_3_3, grammarAccess.getRelationAccess().getTypeOtoKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:969:6: lv_type_3_4= 'mtm'
                    {
                    lv_type_3_4=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_type_3_4, grammarAccess.getRelationAccess().getTypeMtmKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_4, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "ruleDependencyType"
    // InternalSpringFluentDSL.g:986:1: ruleDependencyType returns [Enumerator current=null] : ( (enumLiteral_0= 'SpringDataJpa' ) | (enumLiteral_1= 'SpringWeb' ) | (enumLiteral_2= 'Lombok' ) | (enumLiteral_3= 'MySQLDriver' ) | (enumLiteral_4= 'DevTools' ) | (enumLiteral_5= 'Thymeleaf' ) | (enumLiteral_6= 'Swagger' ) | (enumLiteral_7= 'SpringSecurity' ) ) ;
    public final Enumerator ruleDependencyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalSpringFluentDSL.g:992:2: ( ( (enumLiteral_0= 'SpringDataJpa' ) | (enumLiteral_1= 'SpringWeb' ) | (enumLiteral_2= 'Lombok' ) | (enumLiteral_3= 'MySQLDriver' ) | (enumLiteral_4= 'DevTools' ) | (enumLiteral_5= 'Thymeleaf' ) | (enumLiteral_6= 'Swagger' ) | (enumLiteral_7= 'SpringSecurity' ) ) )
            // InternalSpringFluentDSL.g:993:2: ( (enumLiteral_0= 'SpringDataJpa' ) | (enumLiteral_1= 'SpringWeb' ) | (enumLiteral_2= 'Lombok' ) | (enumLiteral_3= 'MySQLDriver' ) | (enumLiteral_4= 'DevTools' ) | (enumLiteral_5= 'Thymeleaf' ) | (enumLiteral_6= 'Swagger' ) | (enumLiteral_7= 'SpringSecurity' ) )
            {
            // InternalSpringFluentDSL.g:993:2: ( (enumLiteral_0= 'SpringDataJpa' ) | (enumLiteral_1= 'SpringWeb' ) | (enumLiteral_2= 'Lombok' ) | (enumLiteral_3= 'MySQLDriver' ) | (enumLiteral_4= 'DevTools' ) | (enumLiteral_5= 'Thymeleaf' ) | (enumLiteral_6= 'Swagger' ) | (enumLiteral_7= 'SpringSecurity' ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 38:
                {
                alt8=4;
                }
                break;
            case 39:
                {
                alt8=5;
                }
                break;
            case 40:
                {
                alt8=6;
                }
                break;
            case 41:
                {
                alt8=7;
                }
                break;
            case 42:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSpringFluentDSL.g:994:3: (enumLiteral_0= 'SpringDataJpa' )
                    {
                    // InternalSpringFluentDSL.g:994:3: (enumLiteral_0= 'SpringDataJpa' )
                    // InternalSpringFluentDSL.g:995:4: enumLiteral_0= 'SpringDataJpa'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDependencyTypeAccess().getSpringDataJpaEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:1002:3: (enumLiteral_1= 'SpringWeb' )
                    {
                    // InternalSpringFluentDSL.g:1002:3: (enumLiteral_1= 'SpringWeb' )
                    // InternalSpringFluentDSL.g:1003:4: enumLiteral_1= 'SpringWeb'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDependencyTypeAccess().getSpringWebEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:1010:3: (enumLiteral_2= 'Lombok' )
                    {
                    // InternalSpringFluentDSL.g:1010:3: (enumLiteral_2= 'Lombok' )
                    // InternalSpringFluentDSL.g:1011:4: enumLiteral_2= 'Lombok'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDependencyTypeAccess().getLombokEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:1018:3: (enumLiteral_3= 'MySQLDriver' )
                    {
                    // InternalSpringFluentDSL.g:1018:3: (enumLiteral_3= 'MySQLDriver' )
                    // InternalSpringFluentDSL.g:1019:4: enumLiteral_3= 'MySQLDriver'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDependencyTypeAccess().getMySQLDriverEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:1026:3: (enumLiteral_4= 'DevTools' )
                    {
                    // InternalSpringFluentDSL.g:1026:3: (enumLiteral_4= 'DevTools' )
                    // InternalSpringFluentDSL.g:1027:4: enumLiteral_4= 'DevTools'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDependencyTypeAccess().getDevToolsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:1034:3: (enumLiteral_5= 'Thymeleaf' )
                    {
                    // InternalSpringFluentDSL.g:1034:3: (enumLiteral_5= 'Thymeleaf' )
                    // InternalSpringFluentDSL.g:1035:4: enumLiteral_5= 'Thymeleaf'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getThymeleafEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDependencyTypeAccess().getThymeleafEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:1042:3: (enumLiteral_6= 'Swagger' )
                    {
                    // InternalSpringFluentDSL.g:1042:3: (enumLiteral_6= 'Swagger' )
                    // InternalSpringFluentDSL.g:1043:4: enumLiteral_6= 'Swagger'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDependencyTypeAccess().getSwaggerEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSpringFluentDSL.g:1050:3: (enumLiteral_7= 'SpringSecurity' )
                    {
                    // InternalSpringFluentDSL.g:1050:3: (enumLiteral_7= 'SpringSecurity' )
                    // InternalSpringFluentDSL.g:1051:4: enumLiteral_7= 'SpringSecurity'
                    {
                    enumLiteral_7=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDependencyTypeAccess().getSpringSecurityEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyType"


    // $ANTLR start "ruleType"
    // InternalSpringFluentDSL.g:1061:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Long' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Double' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Time' ) | (enumLiteral_6= 'Boolean' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSpringFluentDSL.g:1067:2: ( ( (enumLiteral_0= 'Long' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Double' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Time' ) | (enumLiteral_6= 'Boolean' ) ) )
            // InternalSpringFluentDSL.g:1068:2: ( (enumLiteral_0= 'Long' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Double' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Time' ) | (enumLiteral_6= 'Boolean' ) )
            {
            // InternalSpringFluentDSL.g:1068:2: ( (enumLiteral_0= 'Long' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Double' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'Time' ) | (enumLiteral_6= 'Boolean' ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt9=1;
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case 45:
                {
                alt9=3;
                }
                break;
            case 46:
                {
                alt9=4;
                }
                break;
            case 47:
                {
                alt9=5;
                }
                break;
            case 48:
                {
                alt9=6;
                }
                break;
            case 49:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSpringFluentDSL.g:1069:3: (enumLiteral_0= 'Long' )
                    {
                    // InternalSpringFluentDSL.g:1069:3: (enumLiteral_0= 'Long' )
                    // InternalSpringFluentDSL.g:1070:4: enumLiteral_0= 'Long'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getLongEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpringFluentDSL.g:1077:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalSpringFluentDSL.g:1077:3: (enumLiteral_1= 'Integer' )
                    // InternalSpringFluentDSL.g:1078:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpringFluentDSL.g:1085:3: (enumLiteral_2= 'Double' )
                    {
                    // InternalSpringFluentDSL.g:1085:3: (enumLiteral_2= 'Double' )
                    // InternalSpringFluentDSL.g:1086:4: enumLiteral_2= 'Double'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpringFluentDSL.g:1093:3: (enumLiteral_3= 'String' )
                    {
                    // InternalSpringFluentDSL.g:1093:3: (enumLiteral_3= 'String' )
                    // InternalSpringFluentDSL.g:1094:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpringFluentDSL.g:1101:3: (enumLiteral_4= 'Date' )
                    {
                    // InternalSpringFluentDSL.g:1101:3: (enumLiteral_4= 'Date' )
                    // InternalSpringFluentDSL.g:1102:4: enumLiteral_4= 'Date'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSpringFluentDSL.g:1109:3: (enumLiteral_5= 'Time' )
                    {
                    // InternalSpringFluentDSL.g:1109:3: (enumLiteral_5= 'Time' )
                    // InternalSpringFluentDSL.g:1110:4: enumLiteral_5= 'Time'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getTimeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSpringFluentDSL.g:1117:3: (enumLiteral_6= 'Boolean' )
                    {
                    // InternalSpringFluentDSL.g:1117:3: (enumLiteral_6= 'Boolean' )
                    // InternalSpringFluentDSL.g:1118:4: enumLiteral_6= 'Boolean'
                    {
                    enumLiteral_6=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000007F800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0003F80000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000780000000L});

}