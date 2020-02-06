package org.o7planning.sbjsp;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StaApplet extends Applet implements Runnable {
	
	
    int x1;
	int x2;
	int x3;
	int x4;
	int y;
	int sides;
	private Image i;
	private Graphics doubleG;
	boolean finish;
	private static int[] values = new int[4];
	
	Dog d1;
	Dog d2;
	Dog d3;
	Dog d4;
    
    //============================================================ main
    public static void main(String[] args) {
        //... Create an initialize the applet.
       Applet theApplet = new StaApplet();
       theApplet.init();         // Needed if overridden in applet
       theApplet.start();        // Needed if overridden in applet
       
        //... Create a window (JFrame) and make applet the content pane.
        JFrame window = new JFrame("Sample Applet and Application");
      window.setContentPane(theApplet);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.pack();
       window.setSize(1350, 650);// Arrange the components.
        //System.out.println(theApplet.getSize());
       window.setVisible(true);    // Make the window visible.
    }
    
    //=============================================== Applet constructor
	
    public StaApplet() {
    	this.x1 = 0;
    	this.x2 = 0;
    	this.x3 = 0;
    	this.x4 = 0;
    	this.y = 0;
    	this.sides = 50;
    	d1 = new Dog("first", x1);
    	d2 = new Dog("second", x2);
    	d3 = new Dog("third", x3);
    	d4 = new Dog("fourth", x4);
    }
    
	@Override
	public void init() {
		this.setSize(1350, 650);
	}
	
	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		while(x1 < 1200 || x2 < 1200 || x3 < 1200 || x4 < 1200) {
			int move1 = (int) (Math.random() * 5);
			int move2 = (int) (Math.random() * 5);
			int move3 = (int) (Math.random() * 5);
			int move4 = (int) (Math.random() * 5);
			x1 += move1;
			d1.setNum(x1);
			x2 += move2;
			d2.setNum(x2);
			x3 += move3;
			d3.setNum(x3);
			x4 += move4;
			d4.setNum(x4);
			//doMath();
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		finish = true;
		repaint();
	}

	@Override
	public void update(Graphics g) {
		if(i == null) {
			i = createImage(this.getSize().width, this.getSize().height);
			doubleG = i.getGraphics();
		}
		doubleG.setColor(getBackground());
		doubleG.fillRect(0, 0, this.getSize().width, this.getSize().height);
		
		doubleG.setColor(getForeground());
		paint(doubleG);
		
		g.drawImage(i, 0, 0, this);
	}
	
	@Override
	public void paint(Graphics g) {
			g.setColor(Color.CYAN);
			g.fillOval(x1, y, sides, sides);
			g.drawString(d1.getNum() + ", ", x1, y + 60);

			g.setColor(Color.BLACK);
			g.fillOval(x2, y + 100, sides, sides);
			g.drawString(d2.getNum() + ", ", x2, y + 100);
			
			g.setColor(Color.BLUE);
			g.fillOval(x3, y + 200, sides, sides);
			g.drawString(d3.getNum() + ", ", x3, y + 200);

			g.setColor(Color.RED);
			g.fillOval(x4, y + 300, sides, sides); 
			g.drawString(d4.getNum() + ", ", x4, y + 300);
			
			if(finish == true) {
				g.drawString(d1.getName() + ", " + d1.getNum(),150,400);  
				g.drawString(d2.getName() + ", " + d2.getNum(),150,450);  
				g.drawString(d3.getName() + ", " + d3.getNum(),150,500);  
				g.drawString(d4.getName() + ", " + d4.getNum(),150,550);
				StaApplet.values[0] = d1.getNum();
				StaApplet.values[1] = d2.getNum();
				StaApplet.values[2] = d3.getNum();
				StaApplet.values[3] = d4.getNum();
				PrintWriter writer;
				try {
					writer = new PrintWriter("winner.txt", "UTF-8");
					writer.println(d1.getNum());
					writer.println("The the winner is " + d1.getName());
					writer.close();
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(d1.getNum());
				jspPrint(d1.getNum());
			}
	}
	
	private void jspPrint(int num) {
	      PrintWriter out;
		try {
			out = new PrintWriter("/mainStart");
		      out.println("<html>");
		      out.println(num);
		      out.println("</html>");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void stop() {
		
	}
	
	@Override
	public void destroy() {
		System.exit(99);
	}

	public static int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		StaApplet.values = values;
	}
}