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
		super();
		this.value = value;
	}

	public Real addReal(Real real) {
		return new Real(this.getValue() + real.getValue());
	}

	public Real multiplyReal(Real real) {
		return new Real(this.getValue() * real.getValue());
	}

	public Real substructReal(Real real) {
		return new Real(this.getValue() - real.getValue());
	}

	public Real devideReal(Real real) {
		return new Real(this.getValue() / real.getValue());
	}

	@Override
	Numeric add(Numeric numeric) {
		// TODO Auto-generated method stub
		Real real = (Real) this.getNumericFactory(numeric);
		return this.addReal(real);
	}

	@Override
	Numeric multiply(Numeric numeric) {

		Real real = (Real) this.getNumericFactory(numeric);
		return this.multiplyReal(real);
	}

	@Override
	Numeric devide(Numeric numeric) {

		Real real = (Real) this.getNumericFactory(numeric);
		return this.devideReal(real);
	}

	@Override
	Numeric substruct(Numeric numeric) {

		Real real = (Real) this.getNumericFactory(numeric);
		return this.substructReal(real);
	}

	@Override
	public String toString() {
		return String.valueOf(this.value).toString();
	}

	/**
	 * l'objectif de la methode est de convertir un object rational a un objet
	 * Real
	 *
	 * @param rational
	 *            : un attribut de type Rational
	 * @return : permet de retourner un objet Real
	 */
	private Real formatToRational(Rational rational) {
		return new Real((double) rational.getNumerator() / (double) rational.getDenominator());
	}

	/**
	 * cette methode permet de Générer des objets de classes concrètes basés sur
	 * des informations données
	 *
	 */
	private Numeric getNumericFactory(Numeric numeric) {
		if (numeric instanceof Rational) {
			return this.formatToRational((Rational) numeric);
		} else {
			return numeric;
		}
	}

}
