package model;

import java.util.LinkedList;

public class Logic {
	
	private LinkedList<Dog>DogList;
	private LinkedList<Cat>CatList;
	
	public Logic() {
		DogList = new LinkedList<Dog>();
		CatList = new LinkedList<Cat>();
	}

	/**
	 * @return the dogList
	 */
	public LinkedList<Dog> getDogList() {
		return DogList;
	}

	/**
	 * @return the catList
	 */
	public LinkedList<Cat> getCatList() {
		return CatList;
	}
	
}
