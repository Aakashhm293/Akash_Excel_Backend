package collectionclaasses;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass implements Comparable<IteratorClass> {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);

		Iterator<Integer> iterator = al.iterator();

//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		while (iterator.hasNext()) {
			Integer temp = iterator.next();
			if (temp == 3)
				iterator.remove();
		}
		System.out.println(al);
	}

	@Override
	public int compareTo(IteratorClass o) {
		return 0;
	}

//	Comparable<T>;
//	Comparator<T>;
}
