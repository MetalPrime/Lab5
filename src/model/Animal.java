package model;

import processing.core.PApplet;

public abstract  class  Animal implements Comparable<Animal>{
	
	protected int id;
	protected int age;
	protected String name;
	protected String race;
	protected int birthday;
	protected int posX,posY;
	protected PApplet app;

	public Animal(int id, String name, int age, String race, int birthday,PApplet app){
		this.id = id;
		this.name = name;
		this.age = age;
		this.race = race;
		this.birthday = birthday;
		this.app = app;
	}
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the birthday
	 */
	public int getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int compareTo(Dog ID) {
		// TODO Auto-generated method stub
		return this.id - ID.getId();
	}

	public void paint(int posX, int posY) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}


	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}


	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}


	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}



	
}
