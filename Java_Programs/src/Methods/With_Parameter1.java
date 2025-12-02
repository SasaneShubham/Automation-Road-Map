package Methods;

public class With_Parameter1 {

	public static void area_of_rectangle(int a, int b) {
		
		System.out.println("area_of_rectangle:"+a*b);
	}
	
	public void area_of_circle(int a) {
		
		System.out.println("area_of_circle:"+a*a);
	}
	
	public static void main(String[] args) {
		
		With_Parameter1.area_of_rectangle(20,30);
		
		With_Parameter1 area=new With_Parameter1();
		area.area_of_circle(50);
		
	}
}
