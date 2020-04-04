package model;

import processing.core.PApplet;

public class Dog extends Animal  {

	private int id;
	private String name;
	private int age;
	private String race;
	private int birthday;
	private PApplet app;
	private int posX, posY;

	public Dog(int id, String name, int age, String race, int birthday, PApplet app) {
		super(id, name, age, race, birthday, app);
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.age = age;
		this.race = race;
		this.birthday = birthday;
		this.app = app;
	}

	@Override
	public void paint(int posX, int posY) {
		// TODO Auto-generated method stub
		app.text(id, posX, posY+30);
		app.text(name, posX+25, posY+30);
		app.text(age, posX+90, posY+30);
		app.text(race, posX+140, posY+30);
		app.text(birthday, posX+240, posY+30);

		
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}


	




}
