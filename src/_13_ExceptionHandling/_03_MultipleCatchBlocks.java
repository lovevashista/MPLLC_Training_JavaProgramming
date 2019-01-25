package _13_ExceptionHandling;

public class _03_MultipleCatchBlocks {
	public static void main(String[] args) {
		try {
			int a = 40;
			int b = 8;
			int div = a/b;
			System.out.println(div);
			int[] arr = new int[5];
			arr[4] = 5;
			System.out.println(arr[4]);
			_03_MultipleCatchBlocks x = null;
			System.out.println(x.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Divide by zero not allowed");
		}catch(ArithmeticException e) {
			System.out.println("Array index out of bounds");
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer exception occured");
		}
//		catch(Exception e) {
//			System.out.println("Exception occured");
//		}
		System.out.println("Executing rest of the code...");
		int c = 3;
		int d = 4;
		int add = c + d;
		System.out.println(add);
	}
}
