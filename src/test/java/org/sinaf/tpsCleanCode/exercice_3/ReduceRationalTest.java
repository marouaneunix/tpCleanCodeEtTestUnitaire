package org.sinaf.tpsCleanCode.exercice_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReduceRationalTest extends ARationalTest {

	@Test
	public void shouldReturnUnSurDeuxWhenReduce() {
		assertEquals(this.unSurDeux, this.deuxSurQuatre.reduce());
	}

	@Test
	public void shoudlReturnZeroSurHuitWhenReduce() {
		assertEquals(this.zeroSurHuit, this.zeroSurHuit.reduce());
	}

	@Test
	public void shoudlReturnMoinUnSurDeuxWhenReduce() {
		assertEquals(this.moinUnSurDeux, this.moinDeuxSurQuatre.reduce());
	}

}
