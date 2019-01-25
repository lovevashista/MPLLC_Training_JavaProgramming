package _15_Collections;
import java.util.ArrayList;

public class List_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Apple");
		al.add("Ball");
		al.add("Cat");
		al.add("Dog");
		
		System.out.println(al);
		
		al.add(3, "Cow");
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		String element = al.get(1);
		System.out.println(element);
		
		int index = al.indexOf("Apple");
		System.out.println(index);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
