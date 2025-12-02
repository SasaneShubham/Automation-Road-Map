package Control_Statements;

public class Else_If {

	public static void main(String[] args) {
		
		int marks=52;
		
		if(marks>=75 & marks<=80) {
			
			System.out.println("Distiction");
		}
		else if(marks>=65 & marks<=75) {
			System.out.println("First Class");
			
		}
		else if(marks>=55 & marks<=65) {
			System.out.println("Second Class");
			
		}
		else if(marks>=45 & marks<=55) {
			System.out.println("Third Class");
			
		}
		else if(marks>=35 & marks<=45) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("fail");
		}
		
		
	}

	
}
