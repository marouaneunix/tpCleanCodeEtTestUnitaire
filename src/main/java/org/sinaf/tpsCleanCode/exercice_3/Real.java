package org.sinaf.tpsCleanCode.exercice_3;

public class Real extends Numeric {

	private double value;

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Real(double value) {
		this.value = value;
	}

	@Override
	public Real addReal(Real real) {
		return new Real(this.getValue() + real.getValue());
	}

	@Override
	public Real multiplyReal(Real real) {
		return new Real(this.getValue() * real.getValue());
	}

	@Override
	public Real substructReal(Real real) {
		return this.addReal((Real) real.apposite());
	}

	@Override
	public Real devideReal(Real real) {
		return this.multiplyReal(real);
	}

	@Override
	protected Numeric addRational(Rational rational) {
		return new Real(this.getValue() + (double) rational.getNumerator() / (double) rational.getDenominator());
	}

	@Override
	protected Numeric multiplyRational(Rational rational) {
		return new Real(this.getValue() * rational.getNumerator() / rational.getDenominator());
	}

	@Override
	protected Numeric substructRational(Rational rational) {
		return new Real(rational.getNumerator() / (double) rational.getDenominator() - this.getValue());
	}

	@Override
	public Numeric add(Numeric numeric) {
		return numeric.addReal(this);
	}

	@Override
	public Numeric multiply(Numeric numeric) {
		return numeric.multiplyReal(this);
	}

	@Override
	public Numeric devide(Numeric numeric) {
		return numeric.inverse().devideReal(this);
	}

	@Override
	public Numeric substruct(Numeric numeric) {

		return numeric.apposite().add(this);
	}

	@Override
	public String toString() {
		return String.valueOf(this.value).toString();
	}

	@Override
	protected Numeric apposite() {
		return new Real(this.value * -1.0);
	}

	@Override
	protected Numeric inverse() {
		if (this.getValue() == 0) {
			throw new ArithmeticException("diviser par Zero!!");
		}
		return new Real(1 / this.getValue());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.value);
		result = prime * result + (int) (temp ^ temp >>> 32);
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
		Real other = (Real) obj;
		if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		return true;
	}

	@Override
	protected Numeric devideRational(Rational rational) {
		return new Real(rational.getNumerator() / (double) rational.getDenominator() / this.getValue());
	}

}
