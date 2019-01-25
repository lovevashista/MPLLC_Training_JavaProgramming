package _02_Loops;

public class whileLoop_findLocationsOf4 {
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6,7,3,5,3,6,4,4,4,42,2,2,23,4,43,3,3};
		int i = 0;
		while(i<x.length) {
			if(x[i] == 4) {
				System.out.println("4 found in location: " + (i+1));
			}
			i++;
		}
	}
}
