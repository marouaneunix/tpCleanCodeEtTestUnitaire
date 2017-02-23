package org.sinaf.tpsCleanCode.exercice_3;

/**
 *
 * @author mar1
 *
 */

public abstract class Numeric {

	public abstract Numeric add(Numeric numeric);

	public abstract Numeric multiply(Numeric numeric);

	public abstract Numeric devide(Numeric numeric);

	public abstract Numeric substruct(Numeric numeric);

	protected abstract Numeric addRational(Rational rational);

	protected abstract Numeric multiplyRational(Rational rational);

	protected abstract Numeric substructRational(Rational rational);

	protected abstract Numeric devideRational(Rational rational);

	protected abstract Numeric devideReal(Real real);

	protected abstract Numeric substructReal(Real real);

	protected abstract Numeric addReal(Real real);

	protected abstract Numeric multiplyReal(Real real);

	protected abstract Numeric apposite();

	protected abstract Numeric inverse();

}
