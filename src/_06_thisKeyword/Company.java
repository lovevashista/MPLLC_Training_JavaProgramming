package _06_thisKeyword;

public class Company {
	public static void main(String[] args) {
		Employee e1 = new Employee("EmpID1", "EmpName1", "EmpAdd1", 1234123412);
		e1.display();
		Employee e11 = new Employee(2,3);
		e11.add();
		e11.add(1,1);
	}
}	
