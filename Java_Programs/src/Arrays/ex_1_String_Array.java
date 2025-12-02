package Arrays;

import java.util.Arrays;

public class ex_1_String_Array {

	public static void main(String[] args) {
		
	
	String [] ar=new String[5];
	
	
	ar[0]="Shubham";
	ar[1]="Aaishwarya";
	ar[2]="Ketan";
	ar[3]="Rahul";
	ar[4]="Chetan";
	
	System.out.println(ar[2]);//ketan
	
	System.out.println("Length: "+ar.length);//5
	
	System.out.println("Print all using for loop");
	
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("Print in Assending Order");
	
	Arrays.sort(ar);
	
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("Print in Descending Order");
	
	for(int i=ar.length-1;i>=0;i--) {
		
		System.out.println(ar[i]);
	}
	}
}
