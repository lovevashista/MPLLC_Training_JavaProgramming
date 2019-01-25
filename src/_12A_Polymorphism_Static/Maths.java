package _12A_Polymorphism_Static;

public class Maths {
	public static void main(String[] args) {
		Geometry g = new Geometry();
		int area_Square = g.findArea(2);
		int area_Rectangle = g.findArea(3, 4);
		System.out.println(area_Square);
		System.out.println(area_Rectangle);
	}

	
}
