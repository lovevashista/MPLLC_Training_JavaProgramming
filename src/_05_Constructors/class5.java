package _05_Constructors;

public class class5 {
	String emp_id;
	String emp_name;
	String emp_address;
	long phoneno;
	
	public class5(String eid, String ename, String eadd, long ph) {
		emp_id = eid;
		emp_name = ename;
		emp_address = eadd;
		phoneno = ph;
	}
	
	public void display() {
		System.out.println(emp_id + " | " + emp_name + " | " + emp_address + " | " + phoneno);
	}
}
