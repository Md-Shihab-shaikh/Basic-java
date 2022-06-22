package URI;

import java.util.Scanner;

public class u_1113 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X,Y;
		Scanner Sc = new Scanner(System.in);
		
		for(int i=0; i<100; i++)
		{
			X=Sc.nextInt();
			Y=Sc.nextInt();
			
			if(X==Y) break;

		if(X<Y)
		{
			System.out.println("Crescente");
		}
		else
		{
			System.out.println("Decrescente");
		}
		
		
		}
	}

}
