package org.sinaf.tpsCleanCode.exercice_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RationalTest {
	
	private Rational troisSurQuatre = new Rational();
	private Rational deuxSurSix= new Rational();
	private Rational rationalForAdd= new Rational();
	private Rational rationalForSub= new Rational();
	private Rational rationalForDiv= new Rational();
	private Rational rationalForMult= new Rational();
	
	
	
	@Before
	public void setup() {
		troisSurQuatre.setNumerator(3);
		troisSurQuatre.setDenominator(4);
		
		deuxSurSix.setNumerator(2);
		deuxSurSix.setDenominator(6);
				
		rationalForAdd.setNumerator(13);
		rationalForAdd.setDenominator(12);
		
		rationalForSub.setNumerator(5);
		rationalForSub.setDenominator(12);
		
		rationalForDiv.setNumerator(9);
		rationalForDiv.setDenominator(4);
		
		rationalForMult.setNumerator(1);
		rationalForMult.setDenominator(4);
	}
	
	@Test
	public void TestAddRational() {
		
		assertEquals(troisSurQuatre.add(deuxSurSix),rationalForAdd);
	}
	
	@Test
	public void TestMultiplyRational() {
		
		assertEquals(troisSurQuatre.multiply(deuxSurSix),rationalForMult);
	}
	
	@Test
	public void TestDevideRational() {
		
		assertEquals(troisSurQuatre.divide(deuxSurSix),rationalForDiv);
	}
	
	@Test
	public void TestSubstructRational() {
		assertEquals(troisSurQuatre.substract(deuxSurSix),rationalForSub);
	}
	
	

}
