package org.sinaf.tpsCleanCode.exercice_3;

public abstract class Numeric {
	
	private double number;
	
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	abstract Numeric add(Numeric numeric);
	abstract Numeric multiply(Numeric numeric);
	abstract Numeric devide(Numeric numeric);
	abstract Numeric substruct(Numeric numeric);
	

}
