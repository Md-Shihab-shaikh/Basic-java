package method;

import java.util.Scanner;

public class Compare_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	StringBuffer S1,S2;
	S1= new StringBuffer();
	S2 = new StringBuffer();
		
		Scanner input = new Scanner(System.in);
		S1.append(input.nextLine());
		S2.append(input.nextLine());
		System.out.println(S1);
		System.out.println(S2);
		
	int i = S1.compareTo(S2);
	   if(i==0)
	   {
		   System.out.println("it is equal");
	   }
	   else if(i<0)
	   {
		   System.out.println("S1 less then S2");
	   }
	   else if(i>0)
	   {
		   System.out.println("S2 less then S1");
	   }
		
		S1.reverse();
		System.out.println(S1);
	}

}
