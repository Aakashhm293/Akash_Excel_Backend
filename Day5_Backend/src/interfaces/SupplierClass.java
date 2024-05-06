package interfaces;

import java.util.function.Supplier;

public class SupplierClass {
	public static void main(String[] args) {
		Supplier<Integer> sup = () -> 10+20;
		System.out.println(sup.get());
		
		Supplier<Float> sup1 = () -> 10.0f+20.0f;
		System.out.println(sup1.get());
		
		Supplier<Integer> sup2 = () -> 20/10;
		System.out.println(sup2.get());
		
		Supplier<Double> sup3 = () -> 10.0+9990.0;
		System.out.println(sup3.get());
	}
}
