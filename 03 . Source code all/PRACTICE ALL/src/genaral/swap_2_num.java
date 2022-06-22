package genaral;

import java.util.Scanner;

public class swap_2_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,temp;
		
		Scanner Sc = new Scanner(System.in);
		a = Sc.nextInt();
		b = Sc.nextInt();
		
		System.out.println("Before swap : "+a+"   "+b);
		
		// swaping 
		temp = a;
		a = b;
		b = a;
		System.out.println("After swap  : "+a+"   "+b);
		 
	}

}
