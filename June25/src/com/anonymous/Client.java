package com.anonymous;

public class Client {
	
	public static void displayFilterSalary(Employee [] emp, FilterSalary fs) 
	{
		for(Employee e:emp) 
		{
			if(fs.criteria(e)) 
			{
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		Employee [] emp = new Employee[5];
		
		emp[0]=new Employee(101, "raja", 78000);
		emp[1]=new Employee(102, "rajesh", 58000);
		emp[2]=new Employee(103, "karan", 71000);
		emp[3]=new Employee(104, "shyam", 50000);
		emp[4]=new Employee(105, "fharan", 88000);
		
		
		displayFilterSalary(emp, new FilterSalary() {
			
			@Override
			public boolean criteria(Employee emp) {
				
				if(emp.getsalary()<70000) 
				{
					return true;
				}
					return false;
		
				
			}
		});
	}
}
