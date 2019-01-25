package _10_Arrays;

public class _2D_PrintingValues {
	public static void main(String[] args) {
		String[][] strObj = new String[2][3];
		strObj[0][0] = "String 1";		strObj[0][1] = "String 2";		strObj[0][2] = "String 3";
		strObj[1][0] = "String 4";		strObj[1][1] = "String 5";		strObj[1][2] = "String 6";
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(strObj[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}
