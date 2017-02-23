package org.sinaf.tpsCleanCode.exercice_3;

public class Math {
	public static void main(String[] args) {
		Numeric deuxVerguleTrois = new Real(2.3);
		Numeric zeroVerguleCinq = new Real(0.5);

		Numeric unSurQuatre = new Rational(1, 4);
		Rational deuxSurQuatre = new Rational(2, 4);
		Numeric unSurCinq = new Rational(1, 5);

		System.out.println(deuxVerguleTrois.add(deuxSurQuatre));
		System.out.println(unSurQuatre.add(deuxSurQuatre));
		System.out.println(deuxSurQuatre.add(unSurCinq));
		System.out.println(deuxSurQuatre.add(zeroVerguleCinq));

	}
}
