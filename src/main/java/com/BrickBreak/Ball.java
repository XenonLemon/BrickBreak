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

	//Getters and Setters:
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getXpos() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getYpos() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getXVelocity(){
		return xVelocity;
	}

	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}
	
	public int getYVelocity(){
		return yVelocity;
	}

	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

	//Precondition: There must be a value for the xVelocity variable. 
	//Postcondition: The xVelocity will be multiplied by negative one, thus flipping the ball the other direction.
	public void reverseX(){
		xVelocity *= -1;
	}

	//Precondition: There must be a value for the yVelocity variable. 
	//Postcondition: The yVelocity will be multiplied by negative one, thus flipping the ball the other direction.
	public void reverseY(){
		yVelocity *= -1;
	}

	//Precondition: There must be values for  the x value, y value, xVelocity, and the yVelocity value.
	//Postcondition: The ball will then start to move based off of the xVelocity and yVelocity.
	public void move(){
		x += xVelocity;
		y += yVelocity;
	}


	
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x, y, size, size);
	}

}
