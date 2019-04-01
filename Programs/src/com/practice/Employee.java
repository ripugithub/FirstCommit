package com.practice;

public class Employee implements Comparable<Employee> {

	private String firstName;
	private String lastName;
	
	public Employee()
	{
	}
	public Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public int compareTo(Employee e) {
		
		return this.firstName.compareTo(e.firstName);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
