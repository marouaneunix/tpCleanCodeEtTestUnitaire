package org.sinaf.tpsCleanCode.exercice_1;

import org.sinaf.tpsCleanCode.exercice_2.Rational;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rational troisSurQuarte = new Natural(3,4);
        Rational deuxSurSix = new Natural(2,6);
      
       
       System.out.println("addition : "+troisSurQuarte.add(deuxSurSix));
       //System.out.println("substruct : "+troisSurQuarte.substract(deuxSurSix));
       System.out.println("division : "+troisSurQuarte.divide(deuxSurSix));
       System.out.println("multiplication : "+troisSurQuarte.multiply(deuxSurSix));
	
	
	}

}
