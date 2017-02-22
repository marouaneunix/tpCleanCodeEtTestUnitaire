package org.sinaf.tpsCleanCode.exercice_3;

public class Math {
	public static void main(String[] args) {
		Numeric deuxVerguleTrois = new Real(2.3);
		Numeric zeroVerguleCinq = new Real(0.5);

		Numeric unSurQuatre = new Rational(1, 4);
		Rational deuxSurQuatre = new Rational(2, 4);
		Numeric unSurCinq = new Rational(1, 5);

		// Numeric dixSurZero = new Rational(10, 0);

		System.out.println(deuxVerguleTrois.add(zeroVerguleCinq));
		System.out.println(unSurQuatre.add(deuxSurQuatre));
		System.out.println(deuxVerguleTrois.add(unSurQuatre));
		System.out.println(zeroVerguleCinq.add(unSurCinq));
		System.out.println(deuxSurQuatre.add(unSurQuatre));

	}
}
