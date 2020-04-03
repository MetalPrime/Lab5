package model;

import java.util.Comparator;

public  class SortName implements Comparator<Dog> {

	@Override
	public int compare(Dog arg0, Dog arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}
	
}
