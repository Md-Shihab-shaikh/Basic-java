package genaral;

import java.util.Scanner;

public class factorial_1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,count,fact;
		Scanner Sc = new Scanner(System.in);
		System.out.println(" how number need ");
		num = Sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			count = i;
			fact = 1;
			for(int j =1; j<count; j++)
			{
				fact = fact+j;
			}
			System.out.printf("%5d : %d\n",count,fact);
		}
		
	}

}
