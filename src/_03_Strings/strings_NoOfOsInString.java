package _03_Strings;

public class strings_NoOfOsInString {
	public static void main(String[] args) {
		String str = "Hello World";
		int count = 0;
		int i = 0;
		while(i<str.length()) {
			if(str.charAt(i)=='o') {
				count++;
			}
			i++;
		}
		System.out.println("Number of 'o's in the string are: " + count);
	}
}
