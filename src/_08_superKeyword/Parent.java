package _08_superKeyword;

public class Parent extends GrandParent{
	String name = "Parent::name";
	
	public void displayNames() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void dispMethod() {
		super.dispMethod();
		System.out.println("Parent::method()");
	}
	
	public Parent() {
		super();
		System.out.println("Parent::constructor");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println();
		p.displayNames();
		System.out.println();
		p.dispMethod();
	}
}
