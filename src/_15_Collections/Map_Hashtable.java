package _15_Collections;
import java.util.Enumeration;
import java.util.Hashtable;

public class Map_Hashtable {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(33, "Apple");
		ht.put(56, "orange");
		ht.put(21, "yak");
		ht.put(42, "nest");
		
		System.out.println(ht);
		
		Enumeration<Integer> e = ht.keys();
		while(e.hasMoreElements()) {
			int key = e.nextElement();
			System.out.println(key + "\t|\t" + ht.get(key));
		}
	}
}
