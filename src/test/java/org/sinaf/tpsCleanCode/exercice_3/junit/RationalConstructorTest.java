package org.sinaf.tpsCleanCode.exercice_3.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.sinaf.tpsCleanCode.exercice_3.Rational;

public class RationalConstructorTest extends ARationalTest {

	@Test
	public void whenInstanciatRationalObjectThenThrowArithmeticException() {
		try {
			Rational rational = new Rational(1, 0);
		} catch (ArithmeticException arithmeticException) {
			assertEquals("/ sur Zero", arithmeticException.getMessage());
		}
	}

}
