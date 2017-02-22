package org.sinaf.tpsCleanCode.exercice_1;

/**
 * Classe Natural contient des methode pour faire des opération arithmétiques
 * simples entre deux objets Natural: l’addition, la multiplication, la
 * soustraction et la division.
 *
 * @author mar1
 *
 */

public class Natural {

	private final int value;

	public int getValue() {
		return this.value;
	}

	public Natural(int value) {

		this.value = value;
	}

	public Natural() {
		this.value = 0;
	}

	public Natural add(Natural natural) {

		return new Natural(this.getValue() + natural.getValue());
	}

	public Natural multiply(Natural natural) {

		return new Natural(this.getValue() * natural.getValue());
	}

	public Natural substract(Natural natural) {

		return new Natural(this.getValue() - natural.getValue());
	}

	// TODO: verifier la division par 0 DONE
	public Natural divide(Natural natural) {
		if (natural.getValue() == 0) {
			throw new ArithmeticException("Il ne faut pas entres un ZERO !!");
		}
		return new Natural(this.getValue() / natural.getValue());
	}

	@Override
	public String toString() {
		// toString
		// TODO : toString DONE
		return String.valueOf(this.value).toString();
	}

}
