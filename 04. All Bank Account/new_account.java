import java.util.Scanner;

public class new_account {
	
	

		public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num;
		    double balance = 0;
		    double AddBalance= 0;

			 String accno;
			 String name;
	    
		        double amount = 0;
		       
		    
			   System.out.println("             MAIN MENU  ");
			   System.out.println("           1.new account ");
			 
			   
		        num = scan.nextInt();        
		        
		      
			{ 
				if(num==1) {
				System.out.print("Enter Account No: ");
				accno=scan.next();
				System.out.print("Enter Name: ");
				name=scan.next();
				System.out.print("Enter Balance: ");
				balance=scan.nextLong();
				System.out.println(" account sas");	
				
				
				
				System.out.println("");
				System.out.println("Enter Account No: "+accno);
				System.out.println("Enter name No: "+name);
				System.out.println("Enter ballance: " +balance);
				}    
				
				

			}}
		        
	}

