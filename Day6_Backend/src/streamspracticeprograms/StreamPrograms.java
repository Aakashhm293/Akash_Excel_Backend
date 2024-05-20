package streamspracticeprograms;

public class StreamPrograms {
	public static void main(String[] args) {

// 		1 Seperate Odd And Even Numbers

//		{
//			ArrayList<Integer> listOfIntegers = new ArrayList<>();
//
//			listOfIntegers.add(1);
//			listOfIntegers.add(2);
//			listOfIntegers.add(3);
//			listOfIntegers.add(4);
//
//			Map<Boolean, List<Integer>> mapOfIntegers = listOfIntegers.stream()
//					.collect(Collectors.partitioningBy(i -> i % 2 == 0));
//
//			System.out.println(mapOfIntegers);
//		}

//		------------------------------------------------------------------------------------------------------

// 		2 Frequency of Each character in String

//		{
//			String str = "Java is a programming language";
//			
//			Map<Character, Long> chrs = str.chars()
//			.mapToObj(c -> (char) c)
//			.collect(Collectors.groupingBy(Function.identity(),
//					Collectors.counting()));
//			
//			System.out.println(chrs);
//		}

//		------------------------------------------------------------------------------------------------------

// 		3 Sort The List in Reverse order

//		{
//			List<Integer> intList = new ArrayList<>();
//			
//			intList.add(1);
//			intList.add(2);
//			intList.add(3);
//			intList.add(4);
//			
//			intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		}

//		------------------------------------------------------------------------------------------------------

// 		4 Print multiples of 5 from the list

//		{
//			List<Integer> intList = new ArrayList<>();
//			
//			intList.add(5);
//			intList.add(15);
//			intList.add(25);
//			intList.add(7);
//			
//			intList.stream()
//			.filter(i -> i%5 == 0)
//			.forEach(System.out::println);
//		}

//		------------------------------------------------------------------------------------------------------

// 		5 Merge Two Unsorted Arrays Into Single Sorted Array

//		{
//			int[] array = {1,5,3,2,4};
//			int[] array1 = {7,6,8,9};
//			
//			int[] newArray = IntStream
//					.concat(Arrays.stream(array),Arrays.stream(array1))
//					.sorted().toArray();
//			
//			for(int i=0;i<newArray.length;i++) {
//				System.out.println(newArray[i]);
//			}
//		}

//		------------------------------------------------------------------------------------------------------

// 		6 Merge Two Unsorted Arrays Into Single Sorted Array Without Duplicates

//		{
//			int[] array = {1,5,3,2,4};
//			int[] array1 = {7,6,8,9};
//			
//			int[] newArray = IntStream
//					.concat(Arrays.stream(array),Arrays.stream(array1))
//					.sorted().distinct().toArray();
//			
//			for(int i=0;i<newArray.length;i++) {
//				System.out.println(newArray[i]);
//			}
//		}

//		------------------------------------------------------------------------------------------------------

// 		7 Three Max & Min Numbers From The List

		// Min

//				{
//					List<?> list = Arrays.asList(1, 2, 3, 4, 5);
//					list.stream().sorted().limit(3).forEach(System.out::println);
//				}
		// Min

//				{
//					List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//					list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
//				}

//		------------------------------------------------------------------------------------------------------

// 		8 Sort List of Strings In Increasing Order of their length

//		{
//			List<String> listStrings = new ArrayList();
//			
//			listStrings.add("Pravin");
//			listStrings.add("Chethan");
//			listStrings.add("Akash");
//			
//			
//			listStrings.stream().sorted(Comparator.comparing(String::length)).
//			forEach(System.out::println);
//		}

//		------------------------------------------------------------------------------------------------------

// 		9 Sum & Average of All Elements of an Array

//		{
//			int[] arr = {1,2,3,4,5};
//			
//			int newarr = Arrays.stream(arr).sum();
//			
//			System.out.println(newarr);
//		}
		// Average
//		{
//			int[] arr = {1,2,3,4,5};
//			double newarr = Arrays.stream(arr).average().getAsDouble();
//			System.out.println(newarr);
//		}

//		------------------------------------------------------------------------------------------------------

// 		10 Reverse An Integer Array

//		{
//			int[] array = {1,2,3,4,5};
//			
//			int[] array2 = IntStream.rangeClosed(1, array.length)
//			.map(i -> array[array.length -i])
//			.toArray();
//			
//			for(int i=0;i<array2.length;i++) {
//				System.out.println(array2[i]);
//			}
//		}

//		------------------------------------------------------------------------------------------------------

// 		11 Palindrome Program In Java

//		{
//			String str = "malayalam";
//			
//			boolean num = IntStream.range(0, str.length()/2)
//			.noneMatch(i -> str.charAt(i) != str.charAt(str.length() -i -1));
//			
//			System.out.println(num);
//		}

//		------------------------------------------------------------------------------------------------------

//		12 Last Element of An Array

//		{
//			List<String> listOfStrings = new ArrayList();
//			
//			listOfStrings.add("Akash");
//			listOfStrings.add("Sachin");
//			listOfStrings.add("Chethan");
//			listOfStrings.add("Swamy");
//			
//			String list = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
//			System.out.println(list);
//		}

//		------------------------------------------------------------------------------------------------------

//		13 Age Of Person In Years

//		{
//			LocalDate birthDay = LocalDate.of(1985, 01, 23);
//			LocalDate today = LocalDate.now();
//			System.out.println(ChronoUnit.YEARS.between(birthDay, today));
//		}

//		------------------------------------------------------------------------------------------------------

// 		14 Remove Duplicate Elements From List

//		{
//			List<Integer> intList = new ArrayList<>();
//			
//			intList.add(1);
//			intList.add(2);
//			intList.add(3);
//			intList.add(3);
//			intList.add(4);
//			intList.add(4);
//			
//			List<Integer> newIntList = intList.stream().distinct().collect(Collectors.toList());
//			
//			System.out.println(newIntList);
//		}

//		------------------------------------------------------------------------------------------------------

// 		15 Frequency of Each element in an array

//		{
//			Map<Integer, Long>num = input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//			System.out.println(num);
//		}

//		------------------------------------------------------------------------------------------------------

//		16 Join last of strings with prefix, suffix and delimiter

//		{
//			List<String> listOfStrings = new ArrayList();
//			
//			listOfStrings.add("Akash");
//			listOfStrings.add("Chethan");
//			listOfStrings.add("Sachin");
//			listOfStrings.add("Swamy");
//			
//			String newString = listOfStrings.stream().collect(Collectors.joining(" <-> "," Prefix "," Suffix "));
//			System.out.println(newString);
//		}

//		------------------------------------------------------------------------------------------------------

// 		17 Maximum & Minimum in A List

//		{
//			List<Integer> integers = new ArrayList<>();
//			
//			integers.add(1);
//			integers.add(3);
//			integers.add(2);
//			integers.add(5);
//			integers.add(4);
//			
//			Integer list = integers.stream().max(Comparator.naturalOrder()).get();
//			Integer list1 = integers.stream().min(Comparator.naturalOrder()).get();
//			
//			System.out.println(list);
//			System.out.println(list1);
//		}

//		------------------------------------------------------------------------------------------------------

// 		18 Anagram Program In Java8

//		{
//			String str = "race";
//			String str2 = "care";
//			
//			String string1 = Stream.of(str.split("")).map(String::toUpperCase).sorted()
//					.collect(Collectors.joining());
//			
//			String string2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted()
//					.collect(Collectors.joining());
//			if(string1.equals(string2)) {
//				System.out.println("Is Anagram");
//			}
//		}

//		------------------------------------------------------------------------------------------------------

//		19 Sum of all digits of a number

//		{
//			int input = 5116451;
//			
//			IntSummaryStatistics intSummary = Stream.of(String.valueOf(input).split(""))
//			.collect(Collectors.summarizingInt(Integer::parseInt));
//			
//			System.out.println(intSummary);
//		}

//		------------------------------------------------------------------------------------------------------

//		20 Second largest number in an Integer Array
//		
//		{
//			ArrayList<Integer> listOfIntegers = new ArrayList<>();
//			listOfIntegers.add(1);
//			listOfIntegers.add(2);
//			listOfIntegers.add(3);
//			listOfIntegers.add(4);
//			
//			int list = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1)
//			.findFirst().get();
//			
//			System.out.println(list);
//		}

//		------------------------------------------------------------------------------------------------------

//		21 Common Elements Between Two Arrays

//		{
//			List<Integer> list1 = new ArrayList();
//			list1.add(1);
//			list1.add(2);
//			list1.add(3);
//			list1.add(4);
//			List<Integer> list2 = new ArrayList();
//			list2.add(5);
//			list2.add(1);
//			list2.add(2);
//			list2.add(8);
//			
//			list1.stream().filter(list2::contains).forEach(System.out::println);;
//		}

//		------------------------------------------------------------------------------------------------------

//		22 Reverse Each Word of A String

//		{
//			String str = "Akash";
//			
//			String str1 = Arrays.stream(str.split(" "))
//			.map(word -> new StringBuffer(word).reverse())
//			.collect(Collectors.joining(" "));
//			
//			System.out.println(str1);
//		}

//		------------------------------------------------------------------------------------------------------

// 		23 Sum of First 10 Natural Numbers

//		{
//			Integer ints = IntStream.range(1, 11).sum();
//			System.out.println(ints);
//		}

//		------------------------------------------------------------------------------------------------------

//		24 Find Strings which start with number

//		{
//			List<String> str = new ArrayList<>();
//			
//			str.add("1Akash");
//			str.add("Chethan");
//			str.add("Sachin");
//			str.add("Swamy");
//			
//			str.stream()
//			.filter(s -> Character.isDigit(s.charAt(0)))
//			.forEach(System.out::println);
//		}
//		------------------------------------------------------------------------------------------------------

// 		25 Find Duplicate Elements from an array

//		{
//			List<Integer> intList = new ArrayList<>();
//			
//			intList.add(1);
//			intList.add(2);
//			intList.add(2);
//			intList.add(3);
//			intList.add(3);
//			intList.add(4);
//			
//			Set set = new HashSet<>();
//			
//			Set<?> mySet = intList.stream()
//			.filter(i -> ! set.add(i))
//			.collect(Collectors.toSet());
//			
//			System.out.println(mySet);
//		}

//		------------------------------------------------------------------------------------------------------

// 		26 Fibonacci Series

//		{
//		Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10).map(f -> f[0])
//				.forEach(System.out::println);
//		}

	}
}
