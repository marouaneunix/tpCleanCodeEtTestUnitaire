package org.sinaf.tpsCleanCode.bonus;

import java.awt.Color;
import java.awt.Graphics;

public class Cercle extends Shape {

	private final double rayon;
	private final int centre;

	public double getRayon() {
		return this.rayon;
	}

	public int getCentre() {
		return this.centre;
	}

	public Cercle(double rayon, int centre) {
		this.rayon = rayon;
		this.centre = centre;
	}

	public Cercle() {
		super();
		this.rayon = 0;
		this.centre = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// this.paint(super.getGraphics());
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delele : " + this);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillOval(150, 50, 120, 120);
		g.setColor(c);
	}

	@Override
	public String toString() {
		return ("Cercle [rayon=" + this.rayon + ", centre=" + this.centre + "]").toString();
	}

}
