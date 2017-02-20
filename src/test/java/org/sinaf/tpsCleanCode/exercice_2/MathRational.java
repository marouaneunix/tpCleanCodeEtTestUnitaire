package org.sinaf.tpsCleanCode.exercice_2;

public class MathRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational rational = new Rational(3,4);
        Rational rational2 = new Rational(2,6);
      
       
       System.out.println("addition : "+rational.add(rational2));
       System.out.println("substruct : "+rational.substract(rational2));
       System.out.println("division : "+rational.divide(rational2));
       System.out.println("multiplication : "+rational.multiply(rational2));
	}

}
