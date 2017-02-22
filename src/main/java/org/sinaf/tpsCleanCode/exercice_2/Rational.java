package org.sinaf.tpsCleanCode.exercice_2;

/**
 * classe Rational contient des methode pour faire des opération arithmétiques
 * simples entre deux objets rational : l’addition, la multiplication, la
 * soustraction et la division. Exemple : (3/4) + (2/5)
 *
 * @author mar1
 *
 */

public class Rational {
	// TODO: final DONE
	private final int numerator;
	private final int denominator;

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * pgcd : le Plus Grand Commun Dénominateur
	 *
	 * @param firstDenominator
	 * @param secondDenominator
	 * @return un entier qu'est le Plus Grand Commun Dénominateur (pgcd)
	 */
	public int getPgcd(int firstDenominator, int secondDenominator) {

		if (secondDenominator == 0) {
			return firstDenominator;
		} else if (firstDenominator >= secondDenominator) {
			return this.getPgcd(secondDenominator, firstDenominator % secondDenominator);
		} else {
			return this.getPgcd(firstDenominator, secondDenominator % firstDenominator);
		}
	}

	/**
	 * permettant la réduction d'un nombre rationnel
	 *
	 * @return un objet Rational réductionner
	 */
	// TODO : return la valeur absoulut
	public Rational reduce() {

		int heigherDivisor = this.getPgcd(this.numerator, this.denominator);

		return new Rational(this.numerator / heigherDivisor, this.denominator / heigherDivisor);

	}

	public Rational add(Rational rational) {
		int numeratorResult = this.numerator * rational.getDenominator() + rational.getNumerator() * this.denominator;
		int denominatorResult = this.denominator * rational.getDenominator();
		return new Rational(numeratorResult, denominatorResult).reduce();
	}

	public Rational multiply(Rational rational) {
		return new Rational(this.getNumerator() * rational.getNumerator(),
				this.getDenominator() * rational.getDenominator()).reduce();
	}

	/**
	 * on fait l'opposer d'un rationel pour calculer la soustraction a l'aide de
	 * l'addition
	 */
	// TODO : recreer un nouvel objet DONE
	public Rational opposite() {
		return new Rational(-1 * this.numerator, this.denominator);
	}

	public Rational substract(Rational rational) {
		return this.add(rational.opposite());
	}

	/**
	 * on fait l'inverse d'un rationel pour calculer la division a l'aide de la
	 * multiplication
	 */
	// TODO : nouveau rational DONE
	public Rational inverse() {
		return new Rational(this.getDenominator(), this.getNumerator());
	}

	public Rational divide(Rational rational) {
		return this.multiply(rational.inverse());
	}

	@Override
	public String toString() {
		return (String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator)).toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.denominator;
		result = prime * result + this.numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Rational other = (Rational) obj;
		if (this.denominator != other.denominator) {
			return false;
		}
		if (this.numerator != other.numerator) {
			return false;
		}
		return true;
	}

}
