package _14_finalKeyword;

public class final_method_driverClass {
	public static void main(String[] args) {
		final_method_parentClass p = new final_method_parentClass();
		final_method_childClass c = new final_method_childClass();
		final_method_parentClass pp = new final_method_childClass();
		p.play();
		c.play();
		pp.play();
	}
}
