package _06_thisKeyword;

public class Employee {
	String emp_id, emp_name, emp_address;
	long phoneno;
	int num1, num2, sum = 0;
	
//	public E(String eid, String ename, String eadd, long ph) {
//		emp_id = eid;
//		emp_name = ename;
//		emp_address = eadd;
//		phoneno = ph;
//	}
	
	public Employee(String emp_id, String emp_name, String emp_address, long phoneno) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.phoneno = phoneno;
	}
	
	public Employee(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
//	public E(int n1, int n2) {
//		num1 = n1;
//		num2 = n2;
//	}
	
	public void add() {
		sum = num1 + num2;
		System.out.println(sum);
	}
	
	public void add(int num1, int num2) {
		this.num1 = num1 + this.num1;
		this.num2 = num2 + this.num2;
		sum = this.num1 + this.num2;
		System.out.println(sum);
	}
	
	public void display() {
		System.out.println(emp_id + " | " + emp_name + " | " + emp_address + " | " + phoneno);
	}
}
