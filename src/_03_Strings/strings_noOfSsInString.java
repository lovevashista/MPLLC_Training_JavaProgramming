package _03_Strings;

import java.util.Scanner;

public class strings_noOfSsInString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 's') {
				System.out.println("'s' is present at location: " + (i+1));
				count++;
			}
		}
		System.out.println("Number of occurances of 's' in the string " + str + " is: " + count);
		s.close();
	}
}
