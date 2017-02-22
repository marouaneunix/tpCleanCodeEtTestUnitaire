package org.sinaf.tpsCleanCode.bonus;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {

	private final int sommet_1;
	private final int sommet_2;
	private final int sommet_3;

	public Triangle(int sommet_1, int sommet_2, int sommet_3) {
		this.sommet_1 = sommet_1;
		this.sommet_2 = sommet_2;
		this.sommet_3 = sommet_3;
	}

	public Triangle() {
		super();
		this.sommet_1 = 0;
		this.sommet_2 = 0;
		this.sommet_3 = 0;
	}

	public int getSommet_1() {
		return this.sommet_1;
	}

	public int getSommet_2() {
		return this.sommet_2;
	}

	public int getSommet_3() {
		return this.sommet_3;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw : " + this);

	}

	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delele : " + this);
	}

	@Override
	public void paint(Graphics g) {
		int xpoints[] = { 25, 145, 25, 145, 25 };
		int ypoints[] = { 25, 25, 145, 145, 25 };
		int npoints = 3;

		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		// g.fillRect(150, 50, 120, 120);
		g.drawPolygon(xpoints, ypoints, npoints);
		g.setColor(c);
	}

	@Override
	public String toString() {
		return ("Trangle [sommet_1=" + this.sommet_1 + ", sommet_2=" + this.sommet_2 + ", sommet_3=" + this.sommet_3
				+ "]").toString();
	}

}
