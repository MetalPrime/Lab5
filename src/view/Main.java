package view;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	// cargar txt
	String [] txt1;
	String [] txt2;
	//info parcial txt
	String [] text1;
	String [] text2;
	LinkedList <Lista> list;
	
	public void settings() {
		size(800,700);
	}
	
	public void setup() {
		text1 = loadStrings("./../data/txt1.txt");
		text2 = loadStrings("./../data/txt2.txt");
		
		list = new LinkedList <Lista>();
		for(int i=0; i<text1.length;i++) {
			txt1 = text1[i].split(" ");
			System.out.println(txt1[0]);
			for(int j=0; j<text2.length; j++) {
				txt2 = text2[i].split(" ");
				
				
					float posX = parseFloat(txt1[0]);
					float posY = parseFloat(txt1[1]);
					float sizeX = parseFloat(txt2[0]);
					float sizeY = parseFloat(txt2[1]);
		
					list.add(new Lista(this, posX, posY, sizeX, sizeY, txt1[2]));
					System.out.println(list.size());
				
				
			}
		}
		}
	
	public void draw() {
		background(180);
		for(int i=0; i<list.size(); i++) {
			list.get(i).paint();
		}
	}

}
