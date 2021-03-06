package org.sinaf.tpsCleanCode.exercice_3.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.sinaf.tpsCleanCode.utils.Pgcd;

public class GetPgcdTest extends ARationalTest {

	@Test
	public void shouldReturnTowWhenGetPgcd() {
		assertEquals(2, this.unSurUn.getPgcd(4, 6));
	}

	@Test
	public void shouldReturnDeuxWhenGetPgcd() {
		assertEquals(2, this.unSurDeux.getPgcd(2, 0));
	}

	/**
	 * ce test permet de test combien de fois la methode getPgcd a etait appeler
	 */
	@Test
	public void shouldGetPgcdAppelerTroisFoixFoisWhenGetPgcd() {

		Pgcd.getPgcd(4, 6);
		assertEquals(3, Pgcd.icounter);

	}

	@Test
	public void shouldGetPgcdAppelerUneSeuleFoisxhenGetPgcd() {
		Pgcd.getPgcd(2, 0);
		assertEquals(1, Pgcd.icounter);
	}

}
