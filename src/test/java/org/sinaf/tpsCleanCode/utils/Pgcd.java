package org.sinaf.tpsCleanCode.utils;

public class Pgcd {

	public static int icounter = 0;

	public static int getPgcd(int a, int b) {
		icounter++;
		a = java.lang.Math.abs(a);
		b = java.lang.Math.abs(b);
		if (b == 0) {
			return a;
		} else if (a == 0) {
			return b;
		} else if (a >= b) {
			return getPgcd(b, a % b);
		} else {
			return getPgcd(a, b % a);
		}
	}

}
