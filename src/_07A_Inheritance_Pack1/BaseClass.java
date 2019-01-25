package _07A_Inheritance_Pack1;

public class BaseClass {
	protected void invokeBrowser() {
		System.out.println("Successfully invoked browser from the base class.");
	}
	
	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		b.invokeBrowser();
	}
}
