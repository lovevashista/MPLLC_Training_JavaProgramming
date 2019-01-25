package _08_superKeyword;

public class GrandParent {
	String name = "GrandParent::name";
	
	public void dispMethod() {
		System.out.println("GrandParent::method()");
	}
	
	public GrandParent() {
		System.out.println("GrandParent::constructor");
	}
}
