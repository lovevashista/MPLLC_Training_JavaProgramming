package _09_staticKeyword;

public class staticMethod_Class3 {
	static int a = 2;
	static int b = 3;
	static int sum = 0;
	
	public static void add() {
		sum = a + b;
		display();
	}
	
	public static void display() {
		System.out.println(sum);
	}
}
