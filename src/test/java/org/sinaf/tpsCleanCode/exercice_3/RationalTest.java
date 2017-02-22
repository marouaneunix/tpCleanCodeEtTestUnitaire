package org.sinaf.tpsCleanCode.exercice_3;

import org.junit.Before;
import org.junit.Test;

public class RationalTest {

	Rational zeroSurTrois;
	Rational troisSurDeux;

	@Before
	public void setup() {
		this.zeroSurTrois = new Rational(0, 3);
		this.troisSurDeux = new Rational(3, 2);
	}

	@Test(expected = ArithmeticException.class)
	public void whenMultiplyTowRationalThenThrowArithmeticException() {
		this.troisSurDeux.devide(this.zeroSurTrois);
	}

}
