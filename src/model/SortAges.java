package model;

import java.util.Comparator;

public  class SortAges implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();

	}




	
}
