package _02_Loops;

public class forLoop {
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5};
		int i;
		int sum = 0;
		for(i=0; i<x.length; i++) {
			sum = sum + x[i];
		}
		System.out.println("SUM: " + sum);
	}
}
