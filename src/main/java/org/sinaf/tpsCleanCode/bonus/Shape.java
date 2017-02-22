package org.sinaf.tpsCleanCode.bonus;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public abstract class Shape extends JPanel implements Drawable {

	public Shape() {
		// TODO Auto-generated constructor stub
		// this.graphicsProperty = null;
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(400, 200));

	}

}
