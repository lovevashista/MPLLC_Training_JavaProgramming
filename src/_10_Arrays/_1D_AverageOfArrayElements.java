package _10_Arrays;

public class _1D_AverageOfArrayElements {
	public static void main(String[] args) {
		int x[] = {3,5,4,6,7,5,7,4,5,73};
		float sum = 0;
		float avg = 0;
		for(int i=0; i<x.length; i++) {
			sum = sum + x[i];
		}
		avg = sum / x.length;
		System.out.println("AVG of all array elements: " + avg);
	}
}
