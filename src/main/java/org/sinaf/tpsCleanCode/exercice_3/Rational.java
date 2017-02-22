package org.sinaf.tpsCleanCode.exercice_3;

/**
 * classe Rational contient des methode pour faire des opération arithmétiques
 * simples entre deux objets rational : l’addition, la multiplication, la
 * soustraction et la division. Exemple : (3/4) + (2/5)
 *
 * @author mar1
 *
 */

public class Rational extends Numeric {

	private final int numerator;
	private final int denominator;

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public Rational(int numerator, int denominator) {
		if (denominator == 0) {
			throw new ArithmeticException("il faut avoir un denominator different de zero");
		}
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
	private int getPgcd(int firstDenominator, int secondDenominator) {

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
	private Rational reduce() {

		int heigherDivisor = this.getPgcd(this.numerator, this.denominator);

		return new Rational(this.numerator / heigherDivisor, this.denominator / heigherDivisor);
	}

	private Rational addRational(Rational rational) {
		return new Rational(this.numerator * rational.getDenominator() + rational.getNumerator() * this.denominator, this.denominator * rational.getDenominator()).reduce();
	}

	private Rational multiplyRational(Rational rational) {
		return new Rational(this.getNumerator() * rational.getNumerator(),
				this.getDenominator() * rational.getDenominator()).reduce();
	}

	/**
	 * on fait l'opposer d'un rationel pour calculer la soustraction a l'aide de
	 * l'addition
	 */
	private Rational opposite() {
		return new Rational(-1 * this.numerator, this.denominator);
	}

	private Rational substractRational(Rational rational) {
		return this.addRational(rational.opposite());
	}

	/**
	 * on fait l'inverse d'un rationel pour calculer la division a l'aide de la
	 * multiplication
	 */
	private Rational inverse() {

		if (this.numerator == 0) {
			throw new ArithmeticException("Impossible de fair un inverse la cause : numerator = 0");
		}

		return new Rational(this.getDenominator(), this.getNumerator());
	}

	private Rational divideRational(Rational rational) {
		return this.multiplyRational(rational.inverse());
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

	/**
	 * Les methodes Hérité par la classe Numeric
	 */

	@Override
	Numeric add(Numeric numeric) {
		// TODO Auto-generated method stub
		Rational rational = (Rational) numeric;
		return this.addRational(rational);
	}

	@Override
	Numeric multiply(Numeric numeric) {
		// TODO Auto-generated method stub
		Rational rational = (Rational) numeric;
		return this.multiplyRational(rational);
	}

	@Override
	Numeric devide(Numeric numeric) {
		// TODO Auto-generated method stub
		Rational rational = (Rational) numeric;
		return this.divideRational(rational);
	}

	@Override
	Numeric substruct(Numeric numeric) {
		// TODO Auto-generated method stub
		Rational rational = (Rational) numeric;
		return this.substractRational(rational);
	}

}
