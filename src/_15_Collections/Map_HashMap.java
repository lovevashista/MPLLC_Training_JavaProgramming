package _15_Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(22, "Apple");
		hm.put(43, "Cat");
		hm.put(56, "Cat");
		hm.put(56, "Dog");
		
		System.out.println(hm);
		
		Set<Entry<Integer, String>> e = hm.entrySet();
		Iterator<Entry<Integer, String>> it = e.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			System.out.println(me.getKey() + "\t|\t" + me.getValue());
		}
	}
}
