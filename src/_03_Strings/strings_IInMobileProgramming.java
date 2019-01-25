package _03_Strings;

public class strings_IInMobileProgramming {
	public static void main(String[] args) {
		String str = "Mobile Programming";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'I') {
				count++;
			}
		}
		System.out.println("The total number of 'I' in the string is " + count);
		
	}
}
