package User_Def_Construtor;

public class Sample1 {

	int num1;
	int num2;
	int num3;
	int num4;
	String name;
	
	Sample1(){
		
		num1=20;
		num2=30;
	}
	
	Sample1(int a , int b){
		
		num1=a;
		num2=b;
		
	}
	
	Sample1(String Name){
		
		name=Name;
	}
	
	public void add() {
		
		System.out.println(num1+num2);
		
	}
	
   public void mul() {
		
		System.out.println(num1*num2);
		
	}
   
   public void studentName() {
	   
	   System.out.println(name);
   }
	
	public static void main(String[] args) {
		 
		Sample1 s1=new Sample1();
		s1.add();
		s1.mul();
		
		Sample1 s2=new Sample1(50,50);
		s2.mul();
		s2.add();
		
		
		Sample1 s3=new Sample1("Shubham Sasane");
		s3.studentName();
		
		
	
	}
	
}
