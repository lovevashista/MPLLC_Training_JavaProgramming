package _10_Arrays;

public class _1D_SortANumberArray {
	public static void main(String[] args) {
		int x[] = {3,4,6,4,3,2,6,5,7,4,9};
		int temp;
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
