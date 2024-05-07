package streamsprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Problems {
	public static void main(String[] args) {
		java.util.List<Integer> asList = Arrays.asList(1,2,3,4,5);

		asList.stream()
		.filter(n -> n%2==0)
		.forEach(System.out::println);
	
		System.out.println("<------->");

		asList.stream()
		.map(n -> n + "")
		.filter(n -> n.startsWith("1"))
		.forEach(System.out::println);

//		asList.stream()
//		.map(n -> Integer.toString(n))
//		.filter(n -> n.startsWith("1"))
//		.forEach(System.out::println);

//		Set<Integer> set = new HashSet();
//		
//		asList.stream()
//		.filter(e -> !set.add(e)).forEach(System.out::println);

//		Integer value = asList.stream().findFirst().orElse(0);
//		System.out.println(value);

//		Integer num = asList.stream().count();

//		Integer integer = asList.stream().max((o1, o2) -> o1.compareTo(o2)).get();
//		System.out.println(integer);
		
//		String string = "Java is a programming language";
//		Character input = string.chars()
//		.mapToObj(c -> (char) c)
//		.filter(e -> string.indexOf(e)==string.lastIndexOf(e))
//		.findFirst().get();
//		
//		System.out.println(input);
		
//		String string = "Java is a programming language";
//		Character input = string.chars()
//		.mapToObj(c -> (char) c)
//		.filter(e -> string.indexOf(e)!=string.lastIndexOf(e))
//		.findFirst().get();
//		
//		System.out.println(input);
		
//		asList.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		int size = asList.stream().distinct().collect(Collectors.toList()).size();
//		System.out.println(size);
		
//		asList.stream().map(n -> n*n*n).filter(n -> n>50).forEach(System.out::println);
		
//		String str = "This is a java program";
//		
//		Map<Character,Long> chr= str.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println();
		
		List<String> names = Arrays.asList("AA","BB","AA","DD");
		
		names.stream().filter(e -> Collections.frequency(names, e) > 1)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((str,count) -> System.out.println(str + " -----> " + count));
	}
}
