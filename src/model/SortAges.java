package model;

import java.util.Comparator;

public  class SortAges implements Comparator<Dog> {

	@Override
	public int compare(Dog arg0, Dog arg1) {
		// TODO Auto-generated method stub
		return arg0.getAge()-arg1.getAge();
	}
	
}
