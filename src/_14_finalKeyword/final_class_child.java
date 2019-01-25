package _14_finalKeyword;

public class final_class_child extends final_class_parent{
	
	public final_class_child(int x, int y) {
		super(x, y);
		System.out.println("Inside child class");
	}
	
	public static void main(String[] args) {
		final_class_child c = new final_class_child(55,66);
		c.display();
	}
}
