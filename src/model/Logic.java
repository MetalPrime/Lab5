package model;

import java.util.Collections;
import java.util.Comparator;
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
	private SortAges SAges;
	private SortBirthday SBirthday;
	private SortName SName;
	private SortRace SRace;
	private String [] tID,tName,tAge,tRace,tBirthday;
	
	public Logic(PApplet app) {
		this.app = app;
		DogList = new LinkedList<Dog>();
		txt1 = app.loadStrings("./../data/txt1.txt");
		txt2 = app.loadStrings("./../data/txt2.txt");
		
		SAges = new SortAges();
		SBirthday = new SortBirthday();
		SName = new SortName();
		SRace = new SortRace();
		
		tID = new String[10];
		tName = new String[10];
		tAge = new String[10];
		tRace = new String[10];
		tBirthday = new String[10];
		
		
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
					

					DogList.add(new Dog(id, name, age, race, birthday,app));
				}
				}
			}

		}
				
			
	//	System.out.println(birthday);
					
				
				
			
	
	
	public void sortList(char c) {
		switch (c) { 
		case 'i':
				Collections.sort(DogList);
				for(int i=0; i<DogList.size(); i++) {
					String line= (DogList.get(i).getId() + " " + DogList.get(i).getName() + " "  + DogList.get(i).getAge() + " "   + DogList.get(i).getRace() + " "  + DogList.get(i).getBirthday() );
					tID[i] = line;
					app.saveStrings("byID.txt", tID);
				}
			
			break;
		case 'a':
				Collections.sort(DogList,SAges);
				for(int i=0; i<DogList.size(); i++) {
					String line= (DogList.get(i).getId() + " " + DogList.get(i).getName() + " "  + DogList.get(i).getAge() + " "   + DogList.get(i).getRace() + " "  + DogList.get(i).getBirthday() );
					tAge[i] = line;
					app.saveStrings("byAge.txt", tAge);
				}
			break;
		case 'b':
				Collections.sort(DogList,SBirthday);
				for(int i=0; i<DogList.size(); i++) {
					String line= (DogList.get(i).getId() + " " + DogList.get(i).getName() + " "  + DogList.get(i).getAge() + " "   + DogList.get(i).getRace() + " "  + DogList.get(i).getBirthday() );
					tBirthday[i] = line;
					app.saveStrings("byBirthday.txt", tBirthday);
				}
			break;
		case 'n':
			Collections.sort(DogList,SName);
			for(int i=0; i<DogList.size(); i++) {
				String line= (DogList.get(i).getId() + " " + DogList.get(i).getName() + " "  + DogList.get(i).getAge() + " "   + DogList.get(i).getRace() + " "  + DogList.get(i).getBirthday() );
				tName[i] = line;
				app.saveStrings("byName.txt", tName);
			}
		break;
		case 'r':
			Collections.sort(DogList,SRace);
			for(int i=0; i<DogList.size(); i++) {
				String line= (DogList.get(i).getId() + " " + DogList.get(i).getName() + " "  + DogList.get(i).getAge() + " "   + DogList.get(i).getRace() + " "  + DogList.get(i).getBirthday() );
				tRace[i] = line;
				app.saveStrings("byRace.txt", tRace);
			}
			System.out.println(tRace[0]);
		break;

		}
		
	}	
		
		
	/**
	 * @return the dogList
	 */
	public LinkedList<Dog> getDogList() {
		return DogList;
	}

	
	
}
