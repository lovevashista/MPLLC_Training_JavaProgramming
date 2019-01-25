package _14_finalKeyword;

public class final_variable {
	public static void main(String[] args) {
		final int a = 2;
		
		int b = 0;
		
		// b = ++a; //commenting out since a variable declared as final, its value cannot be changed througout the program.
		
		System.out.println(b);
	}
}
