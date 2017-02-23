package org.sinaf.tpsCleanCode.exercice_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DevideTest extends ARationalTest {

	@Test
	public void shouldReturnUnSurDeuxWhenRationalDevidedByRational() {
		assertEquals(new Rational(1, 2), this.deuxSurHuit.devide(this.deuxSurQuatre));
	}

	@Test
	public void shouldReturnZeroPointHuitWhenRationalDevidedByReal() {
		assertEquals(new Real(0.13333333333333333), this.deuxSurSix.devide(this.deuxPointCinq));
	}

	@Test
	public void shouldReturnZeroPoinSeptWhenRealDevidedByReal() {
		assertEquals(new Real(0.7142857142857142), this.deuxPointCinq.devide(this.troisPointCinq));
	}

	@Test
	public void shouldReturnSeptWhenRealDevidedByRational() {
		assertEquals(new Real(5.0), this.deuxPointCinq.devide(this.deuxSurQuatre));
	}

	@Test
	public void shouldThrowArithmeticExceptionWhenRationalDevidedByRational() {
		try {
			this.deuxSurHuit.devide(this.zeroSurSept);
		} catch (ArithmeticException arithmeticException) {
			assertEquals("Impossible de fair un inverse la cause : numerator = 0", arithmeticException.getMessage());
		}
	}

	@Test
	public void shouldThrowArithmeticExceptionWhenRealDevidedByRational() {
		try {
			this.deuxPointCinq.devide(this.zeroSurSept);
		} catch (ArithmeticException arithmeticException) {
			assertEquals("Impossible de fair un inverse la cause : numerator = 0", arithmeticException.getMessage());
		}
	}

	@Test
	public void shouldThrowArithmeticExceptionWhenRealDevidedByReal() {
		try {
			this.deuxPointCinq.devide(this.zero);
		} catch (ArithmeticException arithmeticException) {
			assertEquals("diviser par Zero!!", arithmeticException.getMessage());
		}
	}

}
