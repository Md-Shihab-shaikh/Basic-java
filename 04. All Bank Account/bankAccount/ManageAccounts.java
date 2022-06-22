
	package bankAccount;
	import java.util.Scanner;
	import java.util.ArrayList;
	
	public class ManageAccounts
	
	{

	  public static void main(String[] args)

	  {

	    int menuItem;
	    	    
	    boolean exit = false; //initializes exit to be false

	    double fee = 2.00;//initializes a fee to be $2.00

	    String name;
	
	    double balance = 0.00;//initializes balance to be $0
	
	    double amount;
	
	    long accountNumber;

	    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

	    Scanner console = new Scanner(System.in);
	 
	    do{
	    	System.out.println("");

	      System.out.println("        ***** MENU ****");
	      System.out.println("");
	      System.out.println("        1. NEW ACCOUNT");
	
	      System.out.println("        2. BALANCE");
	
	      System.out.println("        3. DEPOSIT");
	
	      System.out.println("        4. WITHDRAW");
	
	      System.out.println("        0. EXIT");

	      System.out.println("------------------------------------");
	
	      System.out.print("       PLEASE SELECT AN OPTION: ");

	      menuItem = console.nextInt();

	      switch (menuItem) {
	
	        case 1:

	          for (int i = 0; i <= accounts.size(); i++)
	
	        {
	
	          System.out.println("CREATE NEW ACCOUNT");
	
	          System.out.println("  ");
	
	          System.out.print("NAME FOR NEW ACCOUNT: ");
	
	          name = console.next();
	
	          System.out.print("BALANCE FOR NEW ACCOUNT: ");
	
	          balance = console.nextDouble();

	          BankAccount acct1 = new BankAccount(balance, name);

	          name = acct1.getName();

	          acct1.setName(name);
	
	          balance = acct1.getBalance();
	
	          accountNumber = acct1.getAccountNumber();
	           
	
	          System.out.println(acct1.toString());
	
	        }

	          break;

	        case 2:

	          //chekcs the balance of an existing account
	     System.out.println("CHECK ACCOUNT BALANCE");
	
	          System.out.println("---------------------");
	
	          System.out.print("Account Number: ");

	          accountNumber = console.nextLong();

	           

	          break;

	        case 3:

	          //makes a deposit into an existing account

	          System.out.println("MAKE A DEPOSIT");

	          System.out.println("--------------");

	          System.out.print("Account Number: ");

	          accountNumber = console.nextLong();

	          break;

	        case 4:

	          System.out.println("WITHDRAW FROM ACCOUNT");
	     System.out.println("---------------------");
	
	          System.out.print("Account Number: ");
	
	          accountNumber = console.nextLong();

	          break;

	        case 0:
	
	          exit = true;
	
	          break;
	
	        default:

	          System.out.println("WRONG CHOICE");

	          System.out.println("------------");

	          break;

	      }

	    }

	    while(!exit);

	    System.out.println("--------");

	    System.out.println("GOODBYE!");

	  }

	}
	
	
	

