package _05_Constructors;

public class class7 {
	String emp_id;
	String emp_name;
	String emp_address;
	long phoneno;
	public class7(String eid, String ename, String eaddress, long ph) {
		emp_id = eid;
		emp_name = ename;
		emp_address = eaddress;
		phoneno = ph;
	}
	
	public void display() {
		System.out.println(emp_id + " | " + emp_name + " | " + emp_address + " | " + phoneno);
	}
	
	public class7(class7 x) {
		emp_id = x.emp_id;
		emp_name = x.emp_name;
		emp_address = x.emp_address;
		phoneno = x.phoneno;
	}
}
