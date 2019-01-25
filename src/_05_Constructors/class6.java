package _05_Constructors;

public class class6 {
	public static void main(String[] args) {
		class5 c51 = new class5("EMP001","EmployeeOne", "EmployeeOneAddress", 123456789);
		class5 c52 = new class5("EMP002", "EmployeeTwo", "EmployeeTwoAddress", 123456788);
		class5 c53 = new class5("EMP003", "EmployeeThree", "EmployeeThreeAddress", 123456787);
		c51.display();
		c52.display();
		c53.display();
	}
}
