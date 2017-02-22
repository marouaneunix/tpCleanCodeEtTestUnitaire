package org.sinaf.tpsCleanCode.bonus;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	private final int point_1;
	private final int point_2;
	private final int point_3;
	private final int point_4;

	public Rectangle() {
		this.point_1 = 0;
		this.point_2 = 0;
		this.point_3 = 0;
		this.point_4 = 0;
	}

	public int getPoint_1() {
		return this.point_1;
	}

	public int getPoint_2() {
		return this.point_2;
	}

	public int getPoint_3() {
		return this.point_3;
	}

	public int getPoint_4() {
		return this.point_4;
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

		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.fillRect(150, 50, 120, 120);
		g.setColor(c);
	}

	@Override
	public String toString() {
		return ("Rectangle [point_1=" + this.point_1 + ", point_2=" + this.point_2 + ", point_3=" + this.point_3
				+ ", point_4=" + this.point_4 + "]").toString();
	}

}
