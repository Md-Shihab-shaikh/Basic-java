import java.util.Scanner;

public class cash_in {

	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num;
	    double balance = 0;
	    double AddBalance= 0;

		 String accno;
		 String name;
    
	        double amount = 0;
	   do {     
	    
		   System.out.println("             MAIN MENU  ");
		   System.out.println("           1.new account ");
		   System.out.println("           2.ballance");
		   System.out.println("           3.cash in ");
		   System.out.println("           4.exit ");
		   
	        num = scan.nextInt();        
	        
	      
		{ 
			if(num==1) {
			System.out.print("Enter Account No: ");
			accno=scan.next();
			System.out.print("Enter Name: ");
			name=scan.next();
			System.out.print("Enter Balance: ");
			balance=scan.nextLong(); 
			
			
			System.out.println("");
			System.out.println("Enter Account No: "+accno);
			System.out.println("Enter name No: "+name);
			System.out.println("Enter ballance: " +balance);
		     System.out.println("  press any key to continiew");
             num = scan.nextInt(); 
			}    
			
		
            
            else if (num ==2) {            	 	     	
	           	System.out.println(" balance is " + balance);
	            System.out.println(" ");
	            System.out.println("press  any key to continiew");
	            num = scan.nextInt(); 
            }
			 if (num == 3) { 
	                System.out.println("  Enter amount : ");
	           	
	                amount = scan.nextDouble();
	               
	           balance += amount;
	           
	            System.out.println("Enter ballance: " +balance);
	            System.out.println("  press any key to continiew");
	            num = scan.nextInt();
				 }
			}
		
			

		}
		while (num !=4);
		System.out.println("    Good Bye!");
		
	   

	}
	        
}
