package Default_Constructor;

public class Sample1 {
	
	//default constructor -provided by compiler
	//use to load non static member of class into object
	
//	Sample1(){
//		
//		
//	}
//	

	public void m1() {
		
		System.out.println("Method calling form same class");
	}
	
	
	public static void main(String[] args) {
		
		Sample1 s1=new Sample1();
		s1.m1();
		
		Sample2 s2=new Sample2();
		s2.m2();
		
	}
}
