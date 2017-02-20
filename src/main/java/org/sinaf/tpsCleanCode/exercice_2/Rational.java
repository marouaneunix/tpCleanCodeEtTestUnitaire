package org.sinaf.tpsCleanCode.exercice_2;



public class Rational {
	
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
	 * @param firstNumber
	 * @param secondNumber
	 * @return un entier qu'est le Plus Grand Commun Dénominateur (pgcd)
	 */
	
	
	public int getPgcd(int firstNumber, int secondNumber){
		if(firstNumber == 0)
			return secondNumber;
		else if(secondNumber == 0)
			return firstNumber;
		else if(firstNumber>=secondNumber) {
			int rest = firstNumber%secondNumber;
    		return getPgcd(secondNumber, rest);
    	}else{
    		int rest = secondNumber%firstNumber;
    		return getPgcd(firstNumber, rest);
    	}
	}
	
	/*
	public int getPgcd(int firstNumber, int secondNumber){
		int rest;
		while(secondNumber != 0) {
			rest = firstNumber%secondNumber;
			firstNumber = secondNumber;
			secondNumber = rest;
		}
		return firstNumber;
	}
	*/
	
	/**
	 * ppcm (Plus Petit Multiple Commu)
	 * @param firstNumber
	 * @param secondNumber
	 * @return un entier qu'est le plus petit multiple commu
	 */
	public int getPpcm(int firstNumber, int secondNumber) {
		return (firstNumber*secondNumber) /getPgcd(firstNumber, secondNumber);
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
	
	public Rational add(Rational rational) {
		
		int ppcm = getPpcm(this.getDenominator(), rational.getDenominator());
		
		int numeratorResult = this.getNumerator()*(ppcm/this.getDenominator()) + rational.getNumerator()*(ppcm/rational.getDenominator());
		int denominatorResult = ppcm;
		
		return new Rational(numeratorResult, denominatorResult).reduce();
	}
	
	
	public Rational multiply(Rational rational) {
	
		int numeratorResult = this.getNumerator() *  rational.getNumerator();
		
		int denominatorResult = this.getDenominator() * rational.getDenominator();
		
		return new Rational(numeratorResult, denominatorResult).reduce();
	}
	
	public void opposite() {
		this.setNumerator(-1*this.getNumerator());
	}
	
	public Rational substract(Rational rational) {
		rational.opposite();
		return this.add(rational);
	}
	
	
	public void inverse() {
		int numerator = this.getNumerator();
		this.setNumerator(this.getDenominator());
		this.setDenominator(numerator);
	}
	
	public Rational divide(Rational rational){
		rational.inverse();
		return multiply(rational);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
