package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetImpl {
	
	
	public static void main(String[] s)
	{
		
		HashSet<String> set = new HashSet<String>();
		set.add("India");
		set.add("Australia");
		set.add("China");
		set.add("US");
		
		set.forEach(country->System.out.println(country));
		
		
		ArrayList<String> list = new ArrayList<>(set);
		
		Collections.sort(list);
		
		System.out.println("--------------------------------------");
		list.forEach(country->System.out.println(country));
	}

}
