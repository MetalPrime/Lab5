package model;

import java.util.Comparator;

public  class SortBirthday implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o1.getBirthday()-o2.getBirthday();

	}
	
}
