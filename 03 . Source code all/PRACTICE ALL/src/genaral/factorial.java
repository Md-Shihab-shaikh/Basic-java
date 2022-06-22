package genaral;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		int n,fact=1;
		Scanner Sc =new Scanner(System.in);
		System.out.print(" Input is : ");
		n=Sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("Answer is :"+fact);	
		
	}

}
