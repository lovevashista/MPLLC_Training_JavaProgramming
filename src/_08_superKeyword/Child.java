package _08_superKeyword;

public class Child extends Parent{
	String name = "Child::name";
	
	public void displayNames() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void dispMethod() {
		super.dispMethod();
		System.out.println("Child::method()");
	}
	
	public Child() {
		super();
		System.out.println("Child::Constructor");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println();
		c.displayNames();
		System.out.println();
		c.dispMethod();
	}
}
