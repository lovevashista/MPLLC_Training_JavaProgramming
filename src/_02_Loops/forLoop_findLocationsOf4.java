package _02_Loops;

public class forLoop_findLocationsOf4 {
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6,7,3,5,3,6,4,4,4,42,2,2,23,4,43,3,3};
		for(int i=0; i<x.length; i++) {
			if(x[i] == 4) {
				System.out.println("4 is found in location: " + (i+1));
			}
		}
	}
}
