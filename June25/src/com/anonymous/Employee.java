package com.anonymous;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private static String organisationName="WIPRO";
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee Details"+"\nid-"+id+
				"\nname-"+name+"\nsalary-"+salary+
				"\norganisation-"+Employee.organisationName;				
	}
	
	public double getsalary() {
		return this.salary;
	}

}
