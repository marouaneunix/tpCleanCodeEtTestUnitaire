package org.sinaf.tpsCleanCode.exercice_3.junit;

import org.junit.Before;
import org.sinaf.tpsCleanCode.exercice_3.Numeric;
import org.sinaf.tpsCleanCode.exercice_3.Rational;
import org.sinaf.tpsCleanCode.exercice_3.Real;
import org.sinaf.tpsCleanCode.utils.Pgcd;

public abstract class ARationalTest {

	/**
	 * Objets Real
	 */

	Numeric deuxPointCinq;
	Numeric troisPointCinq;
	Numeric zero;

	/**
	 * Objets Rational
	 */
	Rational unSurUn;
	Rational unSurDeux;
	Rational deuxSurQuatre;
	Rational zeroSurHuit;
	Rational moinUnSurDeux;
	Rational moinDeuxSurQuatre;

	Numeric deuxSurSix;
	Numeric deuxSurHuit;
	Numeric zeroSurSept;

	@Before
	public void setUp() {

		Pgcd.icounter = 0;

		this.unSurUn = new Rational(1, 1);
		this.unSurDeux = new Rational(1, 2);
		this.deuxSurQuatre = new Rational(2, 4);
		this.zeroSurHuit = new Rational(0, 8);
		this.moinUnSurDeux = new Rational(-1, 2);
		this.moinDeuxSurQuatre = new Rational(-2, 4);

		this.deuxSurSix = new Rational(2, 6);
		this.deuxSurHuit = new Rational(2, 8);
		this.zeroSurSept = new Rational(0, 7);
		this.deuxPointCinq = new Real(2.5);
		this.troisPointCinq = new Real(3.5);
		this.zero = new Real(0.0);

	}

}
