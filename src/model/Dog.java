package model;

public class Dog extends Animal{

	private int id;
	private String name;
	private int age;
	private String race;
	private int birthday;

	public Dog(int id, String name, int age, String race, int birthday) {
		super(id, name, age, race, birthday);
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.age = age;
		this.race = race;
		this.birthday = birthday;
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}

}
