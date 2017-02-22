package org.sinaf.tpsCleanCode.exercice_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RationalTest {

	Rational troisSurQuatre;
	Rational deuxSurSix;
	Rational rationalForAdd;
	Rational rationalForSub;
	Rational rationalForDiv;
	Rational rationalForMult;

	@Before
	public void setup() {
		this.troisSurQuatre = new Rational(3, 4);
		this.deuxSurSix = new Rational(2, 6);
		this.rationalForAdd = new Rational(13, 12);
		this.rationalForSub = new Rational(5, 12);
		this.rationalForDiv = new Rational(9, 4);
		this.rationalForMult = new Rational(1, 4);

	}

	@Test
	public void testAddRational() {

		assertEquals(this.troisSurQuatre.add(this.deuxSurSix), this.rationalForAdd);
	}

	@Test
	public void testMultiplyRational() {

		assertEquals(this.troisSurQuatre.multiply(this.deuxSurSix), this.rationalForMult);
	}

	@Test
	public void testDevideRational() {

		assertEquals(this.troisSurQuatre.divide(this.deuxSurSix), this.rationalForDiv);
	}

	@Test
	public void testSubstructRational() {
		assertEquals(this.troisSurQuatre.substract(this.deuxSurSix), this.rationalForSub);
	}

}
