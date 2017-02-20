package org.sinaf.tpsCleanCode.exercice_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RationalTest {
	
	private Rational rational1 = new Rational();
	private Rational rational2= new Rational();
	private Rational rationalForAdd= new Rational();
	private Rational rationalForSub= new Rational();
	private Rational rationalForDiv= new Rational();
	private Rational rationalForMult= new Rational();
	
	
	
	@Before
	public void setup() {
		rational1.setNumerator(3);
		rational1.setDenominator(4);
		
		rational2.setNumerator(2);
		rational2.setDenominator(6);
				
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
		
		assertEquals(rational1.add(rational2),rationalForAdd);
	}
	
	@Test
	public void TestMultiplyRational() {
		
		assertEquals(rational1.multiply(rational2),rationalForMult);
	}
	
	@Test
	public void TestDevideRational() {
		
		assertEquals(rational1.divide(rational2),rationalForDiv);
	}
	
	@Test
	public void TestSubstructRational() {
		assertEquals(rational1.substract(rational2),rationalForSub);
	}
	
	

}
