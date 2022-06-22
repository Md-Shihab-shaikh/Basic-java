package bankAccount;

public class BankAccount

{

  private double balance;

  private String name;

  private long accountNumber;

  private static long acctNum = 1000; //initialze to be 1000 to count from

  private static int numAccounts;

  private static double consolidatedBalance;

  public BankAccount(double balance, String name)

  {

    this.balance = balance;

    this.name = name;

    this.accountNumber = acctNum; //sets first accountNumber to 1000

    acctNum++; //adds one to accountNumber every time a bank account is created

    numAccounts++; //counts the number of accounts created, starting from 0

  }

  public BankAccount(String name)

  {

    this.balance = balance;

    this.name = name;

    this.accountNumber = acctNum;

    acctNum++;

    numAccounts++;

  }

  public BankAccount(double balance)

  {

    this.balance = balance;

    this.name = name;

    this.accountNumber = acctNum;

    acctNum++;

    numAccounts++;

  }

  public String getName()

  {

    return this.name;

  }

  public void setName(String name)

  {

    this.name = name;

  }

  public double getBalance()

  {

    return this.balance;

  }

  public long getAccountNumber()

  {

    return this.accountNumber;

  }

  public void withdraw(double amount)

  {

    if (balance >= amount)

      balance -= amount;

    else

      System.out.println("INSUFFICIENT FUNDS!");

  }

  public void withdraw(double amount, double fee)

  {

    if (balance >= amount + fee)

      balance -= amount + fee;

    else

      System.out.println("INSUFFICIENT FUNDS!");

  }

  public void deposit(double amount)

  {

    balance += amount;

  }

  public static int getNumAccounts()

  {

	  
    return numAccounts;  
  }
    
  public String toString()

  {

    String output = "Name: " + name + " Balance: " + balance + " Account Number: " + accountNumber;

    return output;

  }

  public void close()

  {

    name = name + ": CLOSED!";

    balance = 0;

    numAccounts--;

    System.out.println(name);

  }

    public static BankAccount consolidate(BankAccount acct1, BankAccount acct2)

  {

    if (acct1.name == acct2.name && acct1.acctNum != acct2.acctNum) 

    {

   BankAccount consolidatedAccount = new BankAccount(0, acct1.name);   

   double a1Bal = acct1.getBalance();

   double a2Bal = acct2.getBalance(); 

   consolidatedBalance = a1Bal + a2Bal;

   consolidatedAccount.balance = consolidatedBalance;

   acct1.close();

   acct2.close();

      return consolidatedAccount;    

    }

    else

    {  

      System.out.println("Cannot consolidate, either names do not match"

       + " or account numbers are the same");

       return null;

    }

  }

}
