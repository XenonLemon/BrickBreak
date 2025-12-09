//Peter Daniel
//12/9/25
//This class will be used to create the paddel that will be used by the player in the Brick Break game.

package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!

	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int xVelocity;

	
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.xVelocity = 6;
	}
	
	//Getters and Setters:
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getVelocity(){
		return xVelocity;
	}

	public void setVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

	public void addVelocity(int addVelocity){
		this.xVelocity += addVelocity;
	}



	//methods:
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	
	
}
