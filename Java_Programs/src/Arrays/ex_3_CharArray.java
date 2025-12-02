package Arrays;

import java.util.Arrays;

public class ex_3_CharArray {

public static void main(String[] args) {
		
		char ar[]=new char [5];
		
		ar[0]='D';
		ar[1]='B';
		ar[2]='A';
		ar[3]='E';
		ar[4]='C';
		
		System.out.println(ar[3]);//T
		
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
