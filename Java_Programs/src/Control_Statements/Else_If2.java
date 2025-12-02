package Control_Statements;

public class Else_If2 {

	public static void main(String[] args) {
		
		int SA=300;
		
		if( SA>=5000) {
			
			System.out.println("10% discount");
		}
		else if(SA>=3000 & SA<=5000) {
			
			System.out.println("5% discount");
		}
		else if(SA>1000 & SA<=3000) {
			
			System.out.println("2% discount");
		}
		else {
			
			System.out.println("No discount");
		}
	}
}
