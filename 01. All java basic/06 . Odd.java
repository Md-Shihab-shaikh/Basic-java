package odd;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("how number");
		int n= input.nextInt();
int i ;
for( i=1; i<=n; i=i+2)
{
		System.out.println(""+i);
}

	}
}
