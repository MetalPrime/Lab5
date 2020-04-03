package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	private LinkedList<Dog>DogList;
	private String [] txt1;
	private String [] txt2;
	private String [] info1;
	private String [] info2;
	private int id;
	private int id2;
	private String name;
	private int age;
	private String race;
	private int birthday;
	
	public Logic(PApplet app) {
		this.app = app;
		DogList = new LinkedList<Dog>();
		txt1 = app.loadStrings("./../data/txt1.txt");
		txt2 = app.loadStrings("./../data/txt2.txt");
		
		for (int i = 0; i < txt1.length; i++) {

			info1 = txt1[i].split(",");
			id = Integer.parseInt(info1[0]);
			name = info1[1];
			age = Integer.parseInt(info1[2]);
			
			for (int j = 0; j < txt2.length; j++) {

				info2 = txt2[j].split(",");
				
				id2=Integer.parseInt(info2[0]);

				if (id == id2) {
					race = info2[1];

					birthday = Integer.parseInt(info2[2]);
					

					DogList.add(new Dog(id, name, age, race, birthday));
					System.out.println(DogList.size());
				}
			}

		}
				
			
	//	System.out.println(birthday);
					
				
				
			}
			
			
				
						
				
			
		
		
		
	/**
	 * @return the dogList
	 */
	public LinkedList<Dog> getDogList() {
		return DogList;
	}

	
	
}
