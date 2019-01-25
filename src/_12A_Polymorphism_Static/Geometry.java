package _12A_Polymorphism_Static;

public class Geometry {
	int area = 0;
	public int findArea(int side) {
		return side * side;
	}
	
	public int findArea(int length, int breadth) {
		return length * breadth;
	}
}
