package genaral;

import java.util.Scanner;

public class add_1_to_n {

	public static void main(String[] args) {
		

		int n,count=0,max=0,i,j=0;
		Scanner Sc=new Scanner(System.in);

		for(i=0; i<3; i++)
		{
			n=Sc.nextInt();
			count++;
			if(n>max)
			{
				max=n;
				j=count;
			}
		}
		System.out.println(max);
		System.out.println(j);

	
		
	}
}
