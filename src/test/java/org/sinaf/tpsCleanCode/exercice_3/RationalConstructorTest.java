package org.sinaf.tpsCleanCode.exercice_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
