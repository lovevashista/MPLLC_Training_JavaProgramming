package _14_finalKeyword;

public class final_class_parent {
	int a = 2;
	int b = 3;
	
	public final_class_parent(int a, int b) {
		System.out.println("Inside parent class");
		this.a = a;
		this.b = b;
	}
	
	public void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
