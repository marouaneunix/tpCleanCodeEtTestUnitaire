package org.sinaf.tpsCleanCode.exercice_2;

public class MathRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational troisSurQuarte = new Rational(3,4);
        Rational deuxSurSix = new Rational(2,6);
      
       
       System.out.println("addition : "+troisSurQuarte.add(deuxSurSix));
       System.out.println("substruct : "+troisSurQuarte.substract(deuxSurSix));
       System.out.println("division : "+troisSurQuarte.divide(deuxSurSix));
       System.out.println("multiplication : "+troisSurQuarte.multiply(deuxSurSix));
	}

}
