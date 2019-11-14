package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
Employee Anil;

Anil = new Employee();

Anil.salary = 10000;
Anil.bonus = 5000;
Anil.calculateSalary();
//------------------------
Employee Kumar = new Employee();
Kumar.salary = 20000;
Kumar.bonus = 5000;
int KumarSalary = Kumar.calculateSalary1();
System.out.println("Salary of Kumar"+KumarSalary);
//------------------------
Employee Bommana = new Employee();
int BommanaSalary = Bommana.calculateSalary2(30000, 5000);
System.out.println("Salary of B"+BommanaSalary);
	}

}
