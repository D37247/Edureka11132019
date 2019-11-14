package Assignment;

public class BankAccount {
	int accountnumber;
	int balance;
	char customername;
	char email;
	int phone;
	
	int depositfunds(int currentbalance, int deposits, int account)
	{
		int balance = currentbalance+deposits;
		return (balance);
				
	}

}
