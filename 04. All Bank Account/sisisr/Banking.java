package sisisr;

	public class Banking extends Account implements send {
		public void deposit(double x)
		{
			if(exist) {
				balance=balance+x; 
			}
			else {
				System.out.println("The Account doesn't exists..!!");
			}
		}
		public void withdraw(double x)
		{
			if(exist) {
				balance=balance-x;
			}
			else {
				System.out.println("The Account doesn't exists..!!");
			}
		}
		@Override
		public void transfer(Banking a, Banking b,double n) {
			if(a.exist&&b.exist) {
				if(a.balance>=n) {
					a.balance=a.balance-n;
					b.balance=b.balance+n;
					System.out.println(n + "taka has been sent from ID: "+ a.id+" to ID: "+ b.id+"..!!");
				}
				else {
					System.out.println("The sender has not that many money on his account..!!");
				}
			}
			else {
				System.out.println("Either sender or reciever account doesn't exists..!!");
			}
		}
	}


