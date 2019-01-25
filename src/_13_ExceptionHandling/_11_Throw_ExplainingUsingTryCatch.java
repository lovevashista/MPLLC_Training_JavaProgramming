package _13_ExceptionHandling;

import java.util.Scanner;

public class _11_Throw_ExplainingUsingTryCatch {
	public static void main(String[] args) {
		int productOnePrice;
		int productTwoPrice;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter product one price: ");
		productOnePrice = s.nextInt();
		System.out.println("Enter product two price: ");
		productTwoPrice = s.nextInt();
		int totalPrice = productOnePrice + productTwoPrice;
		s.close();
		try {
			if(totalPrice > 100) {
				System.out.println("Promotion Applied: ABOVE10050OFF");
			}else {
				throw new ArithmeticException("Promotion Not Applied");
			}
		}catch(ArithmeticException e) {
			System.out.println("'Promotion Not Applied' arithmetic exception caught");
		}
		System.out.println("Rest of the code");
	}
}
