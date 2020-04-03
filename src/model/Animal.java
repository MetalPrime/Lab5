package model;

public abstract  class  Animal implements Comparable{
	
	protected int id;
	protected int age;
	protected String name;
	protected String race;
	protected int birthday;

	public Animal(int id, String name, int age, String race, int birthday){
		this.id = id;
		this.name = name;
		this.age = age;
		this.race = race;
		this.birthday = birthday;
	}
	
	public abstract void paint();

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
	
	
}
