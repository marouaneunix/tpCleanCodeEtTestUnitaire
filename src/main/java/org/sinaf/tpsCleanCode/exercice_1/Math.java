package org.sinaf.tpsCleanCode.exercice_1;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Natural three = new Natural(3);
		
		Natural four = new Natural(4);
		
		
		System.out.println("4 + 3 = "+four.add(three));
		System.out.println("4 * 3 = "+four.multiply(three));
		System.out.println("4 - 3 = "+four.substract(three));
		System.out.println("4 / 3 = "+four.divide(three));
	
	}

}
