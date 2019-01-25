package _05_Constructors;

public class class8 {
	public static void main(String[] args) {
		class7 c71 = new class7("EMP001", "EmployeeOne", "EmployeeOneAddress", 123123123);
		c71.display();
		class7 c72 = new class7(c71);
		c72.display();
	}
}
