package _10_Arrays;

public class _2D_MaxNoInEntireMatrix {
	public static void main(String[] args) {
		int x[][] = {
						{3,5,4},
						{7,9,2},
						{9,3,1}
					};
		int max = 0;
		for(int i=0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		System.out.println("The minimum number in the entire matrix: " + max);
	}
}
