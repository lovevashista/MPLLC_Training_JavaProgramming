package _15_Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Ball");
		hs.add("Cat");
		hs.add("Dog");
		hs.add("Ball"); //won't get entered in the set as the set does not allow storing of duplicate elements
		
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
