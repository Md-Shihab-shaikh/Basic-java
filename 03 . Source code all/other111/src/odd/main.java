package odd;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		/* add last 2 number*/
	Scanner input = new Scanner (System.in);
			System.out.print("how number");
			int n= input.nextInt();
		int t=0;
		int p=1;
		int fibo;
		System.out.println(""+t);
				System.out.println(""+p);
		for(int i = 3; i<=n; i++) {
			fibo=t+p;
		System.out.println(""+fibo);
		t=p;
		p=fibo;
		
}}
}