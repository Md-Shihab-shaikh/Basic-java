package URI;

import java.util.Scanner;

public class u_1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X,Y;
		Scanner Sc = new Scanner(System.in);
		
		for(int i=0; i<100; i++)
		{
			X=Sc.nextInt();
			Y=Sc.nextInt();
			
			if((X==0) || (Y==0)) break;

		if((X>0)&&(Y>0))
		{
			System.out.println("primeiro");
		}
		else if((X>0)&&(Y<0))
		{
			System.out.println("quarto");
		}
		else if((X<0)&&(Y<0))
		{
			System.out.println("terceiro");
		}
		else if((X<0)&&(Y>0))
		{
			System.out.println("segundo");
		}
		
		
		}
		
		
	}

}
