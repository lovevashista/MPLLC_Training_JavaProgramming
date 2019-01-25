package _07B_Inheritance_Pack2;

import _07A_Inheritance_Pack1.BaseClass;

public class TS2Class extends BaseClass{
	public void display() {
//		BaseClass b = new BaseClass();
//		b.invokeBrowser();
		invokeBrowser();
	}
	
	public static void main(String[] args) {
		TS2Class t2 = new TS2Class();
		t2.display();
	}
}
