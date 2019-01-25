package _13_ExceptionHandling;

import java.util.Scanner;

public class _09_Throw_ExplainingLoginUsingIfElseAndConsole {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first product price: ");
		int ProductOnePrice = s.nextInt();
		System.out.print("Enter second product price: ");
		int ProductTwoPrice = s.nextInt();
		int totalPrice = ProductOnePrice + ProductTwoPrice;
		if(totalPrice > 100) {
			System.out.println("Promotion Applied: ABOVE100OFF");
		}else {
			System.out.println("Promotion not applied");
		}
		s.close();
	}
}
