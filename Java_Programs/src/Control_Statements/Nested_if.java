package Control_Statements;

public class Nested_if {

	public static void main(String[] args) {

		int PEP=666;
		int MEM=200;


		if(PEP>=500) {

			System.out.println("Eligible for MEM exam");


			if(MEM>=300) {

				System.out.println("Got selected");
			}
			else {

				System.out.println("Not selected as marks MEM<300");
			}

		}else {
			
			System.out.println("Not Eligible as marks PEP<500");
			
		}

	}

}
