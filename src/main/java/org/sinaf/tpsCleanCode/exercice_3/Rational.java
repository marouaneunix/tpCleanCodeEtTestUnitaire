package org.sinaf.tpsCleanCode.exercice_3;

/**
 * classe Rational contient des methode pour faire des  opération arithmétiques 
 * simples entre deux objets rational : l’addition, la multiplication, la soustraction et la division.
 * Exemple : (3/4) + (2/5)
 * @author mar1
 *
 */

public class Rational extends Numeric{
	
	private int numerator;
	private int denominator;
	
	
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Rational() {	
	}
	
	
	
	
	/**
	 * pgcd : le Plus Grand Commun Dénominateur
	 * @param firstDenominator
	 * @param secondDenominator
	 * @return un entier qu'est le Plus Grand Commun Dénominateur (pgcd)
	 */
	public int getPgcd(int firstDenominator, int secondDenominator){
		if(firstDenominator == 0)
			return secondDenominator;
		else if(secondDenominator == 0)
			return firstDenominator;
		else if(firstDenominator>=secondDenominator) {
			int rest = firstDenominator%secondDenominator;
    		return getPgcd(secondDenominator, rest);
    	}else{
    		int rest = secondDenominator%firstDenominator;
    		return getPgcd(firstDenominator, rest);
    	}
	}
	
	
	/**
	 * ppcm (Plus Petit Multiple Commu)
	 * @param firstDenominator 
	 * @param secondDenominator
	 * @return un entier qu'est le plus petit multiple commu
	 */
	public int getPpcm(int firstDenominator, int secondDenominator) {
		return (firstDenominator*secondDenominator) /getPgcd(firstDenominator, secondDenominator);
	}
	
	/**
	 * permettant la réduction d'un nombre rationnel
	 * @return un objet Rational réductionner
	 */
	public Rational reduce() {
		
		int heigherDivisor = getPgcd(this.numerator, this.denominator);
		
		int numeratorResult = this.numerator/heigherDivisor;
		int denominatorResult  = this.denominator/heigherDivisor;
		
		return new Rational(numeratorResult,denominatorResult);
	}
	
	
	public Rational addRational(Rational rational) {
		
		int ppcm = getPpcm(this.getDenominator(), rational.getDenominator());
		
		int numeratorResult = this.getNumerator()*(ppcm/this.getDenominator()) + rational.getNumerator()*(ppcm/rational.getDenominator());
		int denominatorResult = ppcm;
		
		return new Rational(numeratorResult, denominatorResult).reduce();
	}
	
	
	public Rational multiplyRational(Rational rational) {
	
		int numeratorResult = this.getNumerator() *  rational.getNumerator();
		
		int denominatorResult = this.getDenominator() * rational.getDenominator();
		
		return new Rational(numeratorResult, denominatorResult).reduce();
	}
	
	/**
	 * on fait l'opposer d'un rationel pour calculer 
	 * la soustraction a l'aide de l'addition 
	 */
	public void opposite() {
		this.setNumerator(-1*this.getNumerator());
	}
	
	
	public Rational substractRational(Rational rational) {
		rational.opposite();
		return this.addRational(rational);
	}
	
	/**
	 * on fait l'inverse d'un rationel pour calculer
	 * la division a l'aide de la multiplication
	 */
	public void inverse() {
		int numerator = this.getNumerator();
		this.setNumerator(this.getDenominator());
		this.setDenominator(numerator);
	}
	
	public Rational divideRational(Rational rational){
		rational.inverse();
		return multiplyRational(rational);
	}
	
	@Override
	public String toString() {
		return numerator+"/"+denominator;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}
	
	
	
	
	/**
	 * Les methodes Hérité par la classe Numeric
	 */
	
	
	
	@Override
	Numeric add(Numeric numeric) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	Numeric multiply(Numeric numeric) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	Numeric devide(Numeric numeric) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	Numeric substruct(Numeric numeric) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
