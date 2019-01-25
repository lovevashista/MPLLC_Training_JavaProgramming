package _13_ExceptionHandling;

public class _08_Finally_WithoutCatchBlock_WithException {
	public static void main(String[] args) {
		try {
			int a = 40;
			int b = 0;
			int div = a/b;
			System.out.println(div);
		}finally {
			System.out.println("Finally block execution");
		}
		System.out.println("Finally block executed");
		System.out.println("Executing rest of the code...");
		int c = 3;
		int d = 4;
		int add = c + d;
		System.out.println(add);
	}
}
