package view;

import java.util.LinkedList;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Logic logic;

	
	public void settings() {
		size(800,700);
		logic = new Logic(this);
	}


	public void setup() {

		
		}
	
	public void draw() {
		background(180);
		
	}

}
