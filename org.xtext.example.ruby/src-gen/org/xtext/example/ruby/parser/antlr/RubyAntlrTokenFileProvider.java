/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.ruby.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RubyAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/ruby/parser/antlr/internal/InternalRuby.tokens");
	}
}
