package Programs;

public class Father extends GrandFather {

	int num = 2;

	
	public static void house() {
		System.out.println("Father's house");
	}

	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		Father ft = new Father();
		System.out.println(gf.num);
		System.out.println(ft.num);
	}
}