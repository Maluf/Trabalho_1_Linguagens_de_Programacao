/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.ruby;

import org.xtext.example.ruby.RubyStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RubyStandaloneSetup extends RubyStandaloneSetupGenerated {
  public static void doSetup() {
    new RubyStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
