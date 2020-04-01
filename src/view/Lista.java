package view;

import processing.core.PApplet;

public class Lista {
	
	

	private PApplet app;
	private float x;
	private float y;
	private float sizeX;
	private float sizeY;
	private String type;

	public Lista( PApplet app, float x, float y, float sizeX, float sizeY,String type) {
		this.type = type;
		this.app = app;
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	public void paint() {
		app.fill(255);
		app.ellipse(x, y, sizeX, sizeY);
	}
}
