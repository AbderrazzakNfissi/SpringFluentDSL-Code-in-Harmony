/*
 * generated by Xtext 2.32.0
 */
package org.xtext.spring.fluent.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.spring.fluent.parser.antlr.internal.InternalSpringFluentDSLParser;
import org.xtext.spring.fluent.services.SpringFluentDSLGrammarAccess;

public class SpringFluentDSLParser extends AbstractAntlrParser {

	@Inject
	private SpringFluentDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSpringFluentDSLParser createParser(XtextTokenStream stream) {
		return new InternalSpringFluentDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SpringFluentDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SpringFluentDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
