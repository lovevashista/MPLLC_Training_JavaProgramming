package _07A_Inheritance_Pack1;

public class TS1Class extends BaseClass {
	public void display() {
		BaseClass b = new BaseClass();
		b.invokeBrowser();
		invokeBrowser();
	}
	
	public static void main(String[] args) {
		TS1Class t1 = new TS1Class();
		t1.display();
	}
}
