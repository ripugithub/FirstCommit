package com.practice.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetImpl1 {
	
	public static void main(String[] s)
	{
		HashSet<String> set = new HashSet<String>();
		
		set.add("India");
		set.add("Australia");
		set.add("China");
		set.add("US");
		System.out.println("---Before-----");
		set.forEach(country->System.out.println(country));
		Set<String> treeSet = new TreeSet<String>(set);
		System.out.println("-----After-----");
		treeSet.forEach(country->System.out.println(country));
		
		
		
	}

}
