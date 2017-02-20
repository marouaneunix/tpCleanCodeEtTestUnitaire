package org.sinaf.tpsCleanCode.exercice_3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.sinaf.tpsCleanCode.exercice_1.Natural;
import org.sinaf.tpsCleanCode.exercice_2.Rational;

public class NaturalTest {
	

	private Rational troisSurQuatre = new Natural();
	private Rational deuxSurSix= new Natural();
	private Rational naturalForAdd= new Natural();
	private Rational naturalForSub= new Natural();
	private Rational naturalForDiv= new Natural();
	private Rational naturalForMult= new Natural();
	
	
	
	@Before
	public void setup() {
		troisSurQuatre.setNumerator(3);
		troisSurQuatre.setDenominator(4);
		
		deuxSurSix.setNumerator(2);
		deuxSurSix.setDenominator(6);
				
		naturalForAdd.setNumerator(13);
		naturalForAdd.setDenominator(12);
		
		naturalForSub.setNumerator(5);
		naturalForSub.setDenominator(12);
		
		naturalForDiv.setNumerator(9);
		naturalForDiv.setDenominator(4);
		
		naturalForMult.setNumerator(1);
		naturalForMult.setDenominator(4);
	}
	
	@Test
	public void TestAddNatural() {
		
		assertEquals(troisSurQuatre.add(deuxSurSix).getDenominator(),naturalForAdd.getDenominator());
		assertEquals(troisSurQuatre.add(deuxSurSix).getNumerator(),naturalForAdd.getNumerator());
	}
	
	@Test
	public void TestMultiplyNatural() {
		
		assertEquals(troisSurQuatre.multiply(deuxSurSix).getNumerator(),naturalForMult.getNumerator());
		assertEquals(troisSurQuatre.multiply(deuxSurSix).getDenominator(),naturalForMult.getDenominator());

	}
	
	@Test
	public void TestDevideNatural() {
		System.out.println(troisSurQuatre.divide(deuxSurSix));
		assertEquals(troisSurQuatre.divide(deuxSurSix).getDenominator(),naturalForDiv.getDenominator());
		assertEquals(troisSurQuatre.divide(deuxSurSix).getNumerator(),naturalForDiv.getNumerator());

	}
	
	@Test
	public void TestSubstructNatural() {
		
		assertEquals(troisSurQuatre.substract(deuxSurSix).getNumerator(),naturalForSub.getNumerator());
		assertEquals(troisSurQuatre.substract(deuxSurSix).getDenominator(),naturalForSub.getDenominator());

	}
	

}
