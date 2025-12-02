package Arrays;

import java.util.Arrays;

public class ex_2_Int_Array {

	
	public static void main(String[] args) {
		
		int ar[]=new int [5];
		
		ar[0]=34;
		ar[1]=55;
		ar[2]=23;
		ar[3]=67;
		ar[4]=11;
		
		System.out.println(ar[3]);//67
		
		System.out.println("length: "+ ar.length);
		
		System.out.println("Print all using for loop");
		
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("Print in assending order");
		
		Arrays.sort(ar);
		
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("Print in descending order");
		
		for(int i=ar.length-1;i>=0;i--) {
			
			System.out.println(ar[i]);
		}
	}
}
