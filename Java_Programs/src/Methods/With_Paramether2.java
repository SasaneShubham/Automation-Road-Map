package Methods;

public class With_Paramether2 {

	
	public static void info1(String name, String FN, String LN) {
		
		System.out.println(name + FN + LN);
	}
	
	
	public void info2(int roll_no, int marks, float percent) {
		
		System.out.println("roll_no:"+roll_no);
		System.out.println("marks:"+ marks);
		System.out.println("percent:"+percent);
		
	}
	public static void main(String[] args) {
		
		With_Paramether2.info1("Shubham ", "Anil ", "Sasane ");
		
		With_Paramether2 para=new With_Paramether2();
		para.info2(87, 65, 87.44f);
	}
}
