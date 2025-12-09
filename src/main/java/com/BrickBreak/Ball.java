//Peter Daniel
//12/9/25
//This class will be used to create the ball that will be used in the Brick Break game.

package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int yVelocity;
	private int xVelocity;
	
	
	
	//constructor(s):
	public Ball(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
		xVelocity = 5;
		yVelocity = 5;
	}
	
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x, y, size, size);
	}

}
