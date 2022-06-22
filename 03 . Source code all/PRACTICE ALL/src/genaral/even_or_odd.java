package genaral;

import java.util.Scanner;

public class even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		if (a%2==0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
