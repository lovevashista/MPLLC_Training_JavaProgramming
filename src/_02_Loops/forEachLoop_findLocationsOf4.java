package _02_Loops;

public class forEachLoop_findLocationsOf4 {
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6,7,3,5,3,6,4,4,4,42,2,2,23,4,43,3,3};
//		int i = 0;
//		for(int no : x) {
//			i++;
//			if(no==4) {
//				System.out.println("4 found in location: " + i);
//			}
//		}
		int i = 0;
		while(i<x.length) {
			System.out.println(x[i]);
			i++;
		}
	}
}
