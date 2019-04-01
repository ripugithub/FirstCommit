package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.practice.datastructure.LastNameSort;

public class Main {
	
	
	public static void main(String s[])
	{
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Ripu", "Singh"));
		list.add(new Employee("Lokesh", "Reddy"));
		list.add(new Employee("Amit", "Sharma"));
		
		/*Collections.sort(list);
		
		list.forEach((emp)->System.out.println(emp.getFirstName()));
		for(Object emp:list)
		{
			Employee empl = (Employee)emp;
			System.out.println(empl.getFirstName()+" "+empl.getLastName());
			
		}
		*/
		
		System.out.println("Last Name sort");
		
		Collections.sort(list, new LastNameSort());
		list.forEach((emp)->System.out.println(emp.getLastName()));
	}

}
