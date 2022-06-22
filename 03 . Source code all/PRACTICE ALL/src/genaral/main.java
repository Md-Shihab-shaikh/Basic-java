package genaral;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner Sc = new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("big is a");
		}
		else if(b>a && b>c)
		{
			System.out.println(" big is b");
		}
		else if(c>a && c>b )
		{
			System.out.println("big is c");
		}
		
	}
	}
