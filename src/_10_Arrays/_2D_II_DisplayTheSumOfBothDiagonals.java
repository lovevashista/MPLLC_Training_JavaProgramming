package _10_Arrays;

public class _2D_II_DisplayTheSumOfBothDiagonals {
	public static void main(String[] args) {
		int [][]arr = {
				{11,22,33}, //0,2		0,1 S		0,0 S
				{44,13,66}, //1,1		1,2 S		1,0 S
				{33,88,11}  //2,0		2,1 S		2,2 S
				};
		int D1Sum = 0, D2Sum = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==j) {
					D1Sum += arr[i][j];
				}
			}
		}
		System.out.println("Diagonal 1 sum: " + D1Sum);
		
		for(int i=0; i<3; i++) {
			for(int j=2; j>=0; j--) {
				if((i==0 && j==2) || (i==2 && j==0) || (i==1 && j==1))
					D2Sum += arr[i][j];
				else
					continue;
			}
		}
		System.out.println("Diagonal 2 sum: " + D2Sum);
	}
}
