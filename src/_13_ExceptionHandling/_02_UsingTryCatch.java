package _13_ExceptionHandling;

public class _02_UsingTryCatch {
	public static void main(String[] args) {
		try {
			int a = 40;
			int b = 0;
			int div = a/b;
			System.out.println(div);
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero not allowed");
		}
		System.out.println("Executing rest of the code...");
		int c = 3;
		int d = 4;
		int add = c + d;
		System.out.println(add);
	}
}
