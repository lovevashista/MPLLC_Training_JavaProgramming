package _09_staticKeyword;

public class staticMethod_Class1 {
	int a = 2;
	int b = 3;
	int sum = 0;
	
	public void add() {
		sum = a + b;
		display();
	}
	
	public void display() {
		System.out.println(sum);
	}
}
