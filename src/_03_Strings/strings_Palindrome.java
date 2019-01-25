package _03_Strings;

import java.util.Scanner;

public class strings_Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str;
		str = s.nextLine();
		String rev = "";
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + rev);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		s.close();
	}
}
