package _15_Collections;
import java.util.ArrayList;

public class StudentDatabase {
	public static void main(String[] args) {
		ArrayList<Student> sarr = new ArrayList<Student>();
		sarr.add(new Student("Love", 111));
		sarr.add(new Student("Butter", 222));
		
		for(int i=0; i<sarr.size(); i++) {
			System.out.println("Name: " + sarr.get(i).name);
			System.out.println("Roll No: " + sarr.get(i).rollno);
		}
	}
}
