package _01_MethodsAndMethodCalls;

public class callingMethodClass {
	public static void main(String[] args) {
		calledMethodClass x = new calledMethodClass();
		x.displayJava();
		
		int sumResult = x.sum(2,3);
		
		System.out.println(sumResult);
	}
}
