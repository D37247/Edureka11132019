package day2;

public class Employee {
	int salary;
	int bonus;
	
	void calculateSalary ()
	{
		int salarytotal = salary+bonus;
		System.out.println("Employee Salary" +salarytotal);
	}
	int calculateSalary1()
	{
		int salarytotal = salary+bonus;
		return (salarytotal);
		
	}

	int calculateSalary2(int salary, int bonus)
	{
		int salarytotal = salary+bonus;
		return (salarytotal);
	}
	
}
