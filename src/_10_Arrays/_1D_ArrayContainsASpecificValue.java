package _10_Arrays;

public class _1D_ArrayContainsASpecificValue {
	public static void main(String[] args) {
		int x[] = {3,2,4,5,3,4,5,6,4,5,6,7,8,9};
		int num = 4;
		int y[] = new int[10];
		int flag = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] == num) {
				y[i] = i+1;
				flag = 1;
			}
		}
		if(flag==0) {
			System.out.println("Element Not Found.");
		}else {
			System.out.println("Element is present at the following locations: ");
			for(int i = 0; i<y.length; i++) {
				if(y[i]!=0) {
					System.out.println(y[i]);
				}
			}
		}
 	}
}
