package interfaces;

import java.util.function.Function;

public class FunctionClass {
	public static void main(String[] args) {
		Function<Integer, Integer> half = a -> a / 2;
		half = half.andThen(a -> 3 * a);
		System.out.println(half.apply(5));
	}
}
