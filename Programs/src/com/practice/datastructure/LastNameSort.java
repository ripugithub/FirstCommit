package com.practice.datastructure;

import java.util.Comparator;

import com.practice.Employee;

public class LastNameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getLastName().compareTo(o2.getLastName());
	}

}
