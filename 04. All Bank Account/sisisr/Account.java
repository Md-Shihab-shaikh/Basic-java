package sisisr;

	public class Account {
		int id;
		String name;
		double balance;
		boolean exist=false;
		public void openAcc(int id, String name)
		{
			this.id=id;
			this.name=name;
			balance=0; 
			exist=true;
		}
		public void statement()
		{
			if(exist) {
				System.out.println("Account ID : "+id);
				System.out.println("Account Name : "+name);
				System.out.println("Account Balance : "+balance);
			}
			else {
				System.out.println("The account doesn't exists..!!");
			}
		}	
	}

