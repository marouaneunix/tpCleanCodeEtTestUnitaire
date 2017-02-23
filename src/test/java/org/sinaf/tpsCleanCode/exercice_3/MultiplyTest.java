package org.sinaf.tpsCleanCode.exercice_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.sinaf.tpsCleanCode.exercice_3.Rational;
import org.sinaf.tpsCleanCode.exercice_3.Real;

public class MultiplyTest extends ARationalTest {

	@Test
	public void shouldRetunrUnSurDouzeWhenMultiplyRationalToRational() {
		assertEquals(new Rational(1, 12), this.deuxSurHuit.multiply(this.deuxSurSix));
	}

	@Test
	public void shouldReturnUnPointVingtCincWhenMultiplyRationalToReal() {
		assertEquals(new Real(1.25), this.deuxSurQuatre.multiply(this.deuxPointCinq));
	}

	@Test
	public void shouldReturnHuitPointWhenMultiplyRealToReal() {
		assertEquals(new Real(8.75), this.troisPointCinq.multiply(this.deuxPointCinq));
	}

	@Test
	public void shouldReturnSixSurSixWhenMultiplyRealToRational() {
		assertEquals(new Real(1.1666666666666667), this.troisPointCinq.multiply(this.deuxSurSix));
	}

}