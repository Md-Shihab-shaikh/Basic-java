package sisisr;

	import java.util.*;
	public class Main {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Banking obj[] =new Banking[20];
			for(int i=0;i<20;i++)
			{
				obj[i]=new Banking();
			}
			System.out.println("    ::------------------------------:: ");
			System.out.println("    ::     Press   any     number   :: ");
			System.out.println("    ::------------------------------:: ");
			System.out.println("    ::------------------------------:: ");
			System.out.println("    ::     1 to   Open New account  :: ");
			System.out.println("    ::     2 to     View   account  :: ");
			System.out.println("    ::     3 to   deposit  balance  :: ");
			System.out.println("    ::     4 to  withdraw  balance  :: ");
			System.out.println("    ::     5 to  Trasnfer    money  :: ");
			System.out.println("    ::     6 to Remove any Account  :: ");
			System.out.println("    ::------------------------------:: ");
			System.out.println("    ::------------------------------:: ");
			
			while(true) {
		   int input = in.nextInt();
		  
			
			if(input==1)
		{
				System.out.println("Enter the ID number: ");
				int i= in.nextInt();
				System.out.println(" Account name  : ");
				String s=in.next();
				obj[i].openAcc(i,s);
				System.out.println("Account Opene Complete.");
				System.out.println("------------------------  : ");
			}
			else if(input==2)
			{
				System.out.println("Enter the ID number of the account : ");
				int i= in.nextInt();
				obj[i].statement();
			}
			else if(input==3)
			{
				System.out.println("Enter the ID number  to deposit : ");
				int i= in.nextInt();
				System.out.println("How much you  deposit? : ");
				double x=in.nextDouble();
				obj[i].deposit(x);
			}
			else if(input==4)
			{
				System.out.println("Enter the ID number  withdraw from : ");
				int i= in.nextInt();
				System.out.println("How much you withdraw? : ");
				double x=in.nextDouble();
				obj[i].withdraw(x);
			}
			else if(input==5) {
				System.out.println(" you want to send money from : ");
				int i=in.nextInt();
				System.out.println("Enter the reciever's ID number : ");
				int j = in.nextInt();
				System.out.println("Enter the ammount : ");
				double k=in.nextDouble();
				obj[i].transfer(obj[i], obj[j], k);
			}
			else if(input==6) {
				System.out.println("Enter the id you want to remove..!!");
				int i=in.nextInt();
				obj[i]=null;
				System.out.println("sucessful to remove"
						+ "");
				obj[i]= new Banking();
			}
			else if(input==0) {
				System.exit(0);
			}
			else
			{
				System.out.println("The input is invalid!!!");
			}
			
			
			
		}
		}
	}

