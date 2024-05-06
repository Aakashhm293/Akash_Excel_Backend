package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LHM {
public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> marks = new LinkedHashMap<String,Integer>();
		
		marks.put("John", 66);
		marks.put("Oliver", 76);
		marks.put("Antony", 88);
		marks.put("David", 55);
		
//		Iterator<String> iterator = marks.keySet().iterator();
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str + " ==> " + marks.get(str));
//		}
		
		Set<Entry<String,Integer>> entrySet = marks.entrySet();
		
		for (Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " ===> " + entry.getValue());
		}
	}
}
