package _05_Constructors;

public class class9 {
	int num1, num2, sum = 0;
	public class9(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public void displaySum() {
		sum = num1 + num2;
		System.out.println("SUM: " + sum);
	}
}
