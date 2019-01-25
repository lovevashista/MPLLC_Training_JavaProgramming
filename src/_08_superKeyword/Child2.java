package _08_superKeyword;

public class Child2 extends GrandParent{
	String name = "Child2::name";
	
	public void displayNames() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
	
	public void dispMethod() {
		super.dispMethod();
		System.out.println("Child2::method");
	}
	
	public Child2() {
		super();
		System.out.println("Child2::constructor");
	}
	
	public static void main(String[] args) {
		Child2 c = new Child2();
		System.out.println();
		c.displayNames();
		System.out.println();
		c.dispMethod();
	}
}
