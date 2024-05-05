package classprograms;

public class Child {

	public static void main(String[] args) {
		try {
			int num = 1/0;
			System.out.println(num);
		} catch (Exception e) {
			throw new AkashException("Who on earth devides an integer with zero?,JVM -> I'm not compiling this code.");
		}
	}
}
