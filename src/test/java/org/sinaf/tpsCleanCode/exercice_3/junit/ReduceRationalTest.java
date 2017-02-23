package org.sinaf.tpsCleanCode.exercice_3.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReduceRationalTest extends ARationalTest {

	@Test
	public void shouldReturnUnSurDeuxWhenReduce() {
		assertEquals(this.unSurDeux, this.deuxSurQuatre.reduce());
	}

	@Test
	public void shoudlReturnZeroSurHuitWhenReduce() {
		assertEquals(this.zeroSurUn, this.zeroSurHuit.reduce());
	}

	@Test
	public void shoudlReturnMoinUnSurDeuxWhenReduce() {
		assertEquals(this.moinUnSurDeux, this.moinDeuxSurQuatre.reduce());
	}

}
