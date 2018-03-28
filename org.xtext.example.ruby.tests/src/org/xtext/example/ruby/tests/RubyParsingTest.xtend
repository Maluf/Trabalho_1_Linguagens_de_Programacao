/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.ruby.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.ruby.ruby.Model

@RunWith(XtextRunner)
@InjectWith(RubyInjectorProvider)
class RubyParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void loadModelTest1() {
		val result = parseHelper.parse("
			begin
				puts ''begin''
			end
		")
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModelTest2() {
		val result = parseHelper.parse("
			begin
				puts ''begin''
			rescue
				puts ''rescue''
			end
		")
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModelTest3() {
		val result = parseHelper.parse("
			begin
				puts ''begin''
			rescue
				puts ''rescue''
			ensure
				puts ''ensure''
			end
		")
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModelTest4() {
		val result = parseHelper.parse("
			begin
				puts ''begin1''
				begin
					puts ''begin2''
				rescue
					puts ''rescue1''
				ensure
					puts ''ensure1''
				end
			rescue
				puts ''rescue2''
			ensure
				puts ''ensure2''
			end
		")
		Assert.assertNotNull(result)
		System.out.println("Erro: " + result.eResource.errors.get(0));
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModelTest5() {
		val result = parseHelper.parse("
			begin
				puts ''begin1''
				begin
					puts ''begin2''
				rescue
					puts ''rescue1''
				ensure
					puts ''ensure1''
				end
			rescue
				puts ''rescue2''
				begin
					puts ''begin3''
				rescue
					puts ''rescue3''
				ensure
					puts ''ensure2''
				end
			ensure
				puts ''ensure3''
				begin
					puts ''begin4''
				rescue
					puts ''rescue4''
				ensure
					puts ''ensure4''
				end
			end
		")
		Assert.assertNotNull(result)
		System.out.println("Erro: " + result.eResource.errors.get(0));
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
