package Access_Specifiers;

public class Sample1 {

	
	public static void m1() {
		
		System.out.println("Public access specifier");
	}
	
	
	private static void m2() {
		
		System.out.println("Private access specifier");
	}
	
	protected static void m3() {
		
		System.out.println("Protected access specifier");
	}
	
	static void m4() {
		
		System.out.println("Default access specifier");
	}
	
	public static void main(String[] args) {
		
		Sample1.m2();
	}
}
