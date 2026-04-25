package myfirstproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;

public class CircleButton  extends JButton{


	    public CircleButton(String text) {
	        super(text);
	        setFocusPainted(false);
	        setContentAreaFilled(false);
	        setBorderPainted(false);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g;
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                            RenderingHints.VALUE_ANTIALIAS_ON);

	        g2.setColor(getBackground());
	        g2.fillOval(0, 0, getWidth(), getHeight());

	        super.paintComponent(g);
	    }

	    @Override
	    public boolean contains(int x, int y) {
	        int radius = getWidth() / 2;
	        return Math.pow(x - radius, 2) + Math.pow(y - radius, 2) <= radius * radius;
	    }
	}


