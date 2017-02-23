package org.sinaf.tpsCleanCode.exercice_3.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.sinaf.tpsCleanCode.exercice_3.Rational;
import org.sinaf.tpsCleanCode.exercice_3.Real;

public class AddTest extends ARationalTest {

	@Test
	public void shouldReturnSeptSurDeuzeWhenAddRationalToRational() {
		assertEquals(new Rational(7, 12), this.deuxSurHuit.add(this.deuxSurSix));
	}

	@Test
	public void shouldReturnTroisWhenAddRationalToReal() {
		assertEquals(new Real(3.0), this.unSurDeux.add(this.deuxPointCinq));
	}

	@Test
	public void shouldReturnCinqSurDeuxWhenAddRealToRational() {
		assertEquals(new Real(3.0), this.deuxPointCinq.add(this.unSurDeux));
	}

	@Test
	public void shouldReturnSixWhenAddRealToReal() {
		assertEquals(new Real(6.0), this.deuxPointCinq.add(this.troisPointCinq));
	}
}
