package org.sinaf.tpsCleanCode.exercice_3.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.sinaf.tpsCleanCode.exercice_3.Rational;
import org.sinaf.tpsCleanCode.exercice_3.Real;

public class SubstructTest extends ARationalTest {

	@Test
	public void shoudlReturnUnSurMoinQuatreWhenSubstructRationalFromRational() {
		assertEquals(new Rational(1, -4), this.deuxSurHuit.substruct(this.deuxSurQuatre));
	}

	@Test
	public void shouldReturnMoinTroisPointUuWhenSubstructRationaFromReal() {
		assertEquals(new Real(-3.1666666666666665), this.deuxSurSix.substruct(this.troisPointCinq));
	}

	@Test
	public void shouldReturnUnPointZeroWhenSubstructRealFromReal() {
		assertEquals(new Real(-1.0), this.deuxPointCinq.substruct(this.troisPointCinq));
	}

	@Test
	public void shouldReturnTroisPoin1WhenSubstructRealFromRational() {
		assertEquals(new Real(3.1666666666666665), this.troisPointCinq.substruct(this.deuxSurSix));
	}

}
