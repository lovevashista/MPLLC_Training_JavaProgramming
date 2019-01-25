package _02_Loops;

public class forEachLoop {
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5};
		int sum = 0;
		for(int no : x) {
			sum = sum + no;
		}
		System.out.println("SUM: " + sum);
	}
}
