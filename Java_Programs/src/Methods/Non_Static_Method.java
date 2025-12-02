package Methods;

public class Non_Static_Method {

	public void add() {

		int a=20;
		int b=33;

		int addition=a+b;
		System.out.println("addition :"+ addition);

	}

	public void sub() {

		int a=20;
		int b=33;

		int subtraction=b-a;
		System.out.println("subtraction :" +subtraction);

	}
	public static void main(String[] args) {

		Non_Static_Method ns= new Non_Static_Method();   //non-static method call from same class
		ns.add();
		ns.sub();
		
		Diff_Class diff=new Diff_Class();               //non-static method call from diff class
		diff.mul(); 
		

 

	}
}
