package _01_MethodsAndMethodCalls;

import java.util.Scanner;

public class returnTypeInMethods {
	int num1, num2, sum = 0;
	Scanner s = new Scanner(System.in);
	
	public void add() {
		System.out.println("Enter first number: ");
		num1 = s.nextInt();
		System.out.println("Enter second number: ");
		num2 = s.nextInt();
		sum = num1 + num2;
		System.out.println("SUM: " + sum);
	}
	
	public int add2() {
		System.out.println("Enter third number: ");
		num1 = s.nextInt();
		System.out.println("Enter fourth number: ");
		num2 = s.nextInt();
		sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		returnTypeInMethods x = new returnTypeInMethods();
		x.add();
		int res = x.add2();
		System.out.println("SUM: " + res);
	}
}
