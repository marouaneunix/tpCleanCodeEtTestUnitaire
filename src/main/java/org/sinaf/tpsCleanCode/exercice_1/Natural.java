package org.sinaf.tpsCleanCode.exercice_1;
/**
 * Classe Natural contient des methode pour faire des  opération arithmétiques 
 * simples entre deux objets Natural: l’addition, la multiplication, la soustraction et la division.
 * @author mar1
 *
 */

public class Natural {
	
	private int value;
	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Natural(int value) {
		super();
		this.value = value;
	}

	public Natural() {
	}
	
	public Natural add(Natural natural) {
		int result = this.getValue() + natural.getValue();
		return new Natural(result);
	}
	
	public Natural multiply(Natural natural){
		int result = this.getValue()*natural.getValue();
		return new Natural(result);
	}
	
	public Natural substract(Natural natural){
		int result = this.getValue()-natural.getValue();
		return new Natural(result);
	}
	
	public Natural divide(Natural natural){
		int result = this.getValue()/natural.getValue();
		return new Natural(result);
	}

	@Override
	public String toString() {
		return value+"";
	}
	
	
	

	
	
	
	

}
