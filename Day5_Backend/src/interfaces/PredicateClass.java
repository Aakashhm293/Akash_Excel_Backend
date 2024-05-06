package interfaces;

import java.util.function.Predicate;

public class PredicateClass {
	public static void main(String[] args) {
		
		Predicate<Integer> pre = (i) -> i > 20;
		System.out.println(pre.test(5));
		
		Predicate<Integer> pre1 = (i) -> i == 20;
		System.out.println(pre1.test(5));
		
		Predicate<Integer> pre2 = (i) -> i < 20;
		System.out.println(pre2.test(5));
		
		Predicate<Integer> pre3 = (i) -> i >= 20;
		System.out.println(pre3.test(5));
	}
}
