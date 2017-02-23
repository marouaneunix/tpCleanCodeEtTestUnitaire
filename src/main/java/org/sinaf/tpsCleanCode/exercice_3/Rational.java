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
			throw new ArithmeticException("/ sur Zero");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * pgcd : le Plus Grand Commun Dénominateur
	 *
	 * @return un entier qu'est le Plus Grand Commun Dénominateur (pgcd)
	 */
	public int getPgcd(int a, int b) {
		a = java.lang.Math.abs(a);
		b = java.lang.Math.abs(b);
		if (b == 0) {
			return a;
		} else if (a == 0) {
			return b;
		} else if (a >= 0) {
			return this.getPgcd(b, a % b);
		} else {
			return this.getPgcd(a, b % a);
		}
	}

	@Override
	public String toString() {
		return (String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator)).toString();
	}

	@Override
	public Numeric add(Numeric numeric) {
		return numeric.addRational(this);
	}

	@Override
	public Numeric multiply(Numeric numeric) {
		return numeric.multiplyRational(this);
	}

	@Override
	public Numeric devide(Numeric numeric) {
		try {
			return numeric.devideRational(this);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Devide NOOOOO !!!");
		}
	}

	@Override
	public Numeric substruct(Numeric numeric) {
		return numeric.substructRational(this);
	}

	@Override
	protected Numeric addRational(Rational rational) {
		return new Rational(this.numerator * rational.getDenominator() + rational.getNumerator() * this.denominator,
				this.denominator * rational.getDenominator()).reduce();
	}

	@Override
	protected Numeric multiplyRational(Rational rational) {
		return new Rational(this.getNumerator() * rational.getNumerator(),
				this.getDenominator() * rational.getDenominator()).reduce();
	}

	@Override
	protected Numeric substructRational(Rational rational) {
		return this.apposite().add(rational);
	}

	@Override
	protected Numeric devideRational(Rational rational) {
		return this.inverse().multiply(rational);
	}

	@Override
	protected Numeric devideReal(Real real) {
		return this.multiply(real);
	}

	@Override
	protected Numeric addReal(Real real) {
		return new Real(real.getValue() + this.numerator / (double) this.denominator);
	}

	@Override
	protected Numeric multiplyReal(Real real) {
		return new Real(real.getValue() * this.numerator / this.denominator);
	}

	@Override
	protected Numeric substructReal(Real real) {
		return this.substruct(real.apposite());
	}

	@Override
	protected Numeric apposite() {
		return new Rational(-1 * this.numerator, this.denominator);
	}

	@Override
	protected Numeric inverse() {
		if (this.numerator == 0) {
			throw new ArithmeticException("Impossible de fair un inverse la cause : numerator = 0");
		}

		return new Rational(this.getDenominator(), this.getNumerator());
	}

	public Rational reduce() {

		int heigherDivisor = this.getPgcd(this.numerator, this.denominator);
		return new Rational(this.numerator / heigherDivisor, this.denominator / heigherDivisor);
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
