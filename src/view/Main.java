package view;

import java.util.LinkedList;

import comtroler.Controller;
import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Logic logic;
	Controller controller;
	
	public void settings() {
		size(800,700);

	}


	public void setup() {
		logic = new Logic(this);
		controller = new Controller(this);
		
		}
	
	public void draw() {
		background(0);
		for(int i=0; i<controller.listBall().size(); i++) {
			//System.out.println(controller.listBall().size());
			
			controller.listBall().get(i).paint(40, i*60);
		}
	}
	
	public void keyPressed() {
		controller.sortList(key);
	}

}
