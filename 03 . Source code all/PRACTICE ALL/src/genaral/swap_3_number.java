package genaral;

import java.util.Scanner;

public class swap_3_number {
	public static void main(String[] args) {
		
	int a,b,c,temp;
		
		Scanner Sc = new Scanner(System.in);
		a = Sc.nextInt();
		b = Sc.nextInt();
		c = Sc.nextInt();
		
		System.out.println("Before swap : "+a+"   "+b+"  "+c);
		
		// swaping 
		temp = a;
		a = c;
		b = b;
		c = temp;
		System.out.println("After swap  : "+a+"   "+b+"  "+c);
		 
		
	}

}
