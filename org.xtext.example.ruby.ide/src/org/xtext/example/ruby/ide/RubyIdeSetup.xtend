/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.ruby.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.ruby.RubyRuntimeModule
import org.xtext.example.ruby.RubyStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RubyIdeSetup extends RubyStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RubyRuntimeModule, new RubyIdeModule))
	}
	
}
