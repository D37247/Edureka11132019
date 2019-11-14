package Assignment;

public class BankAccountHolder {

	public static void main(String[] args) {
		BankAccount Cust1 = new BankAccount();
		int Dep = Cust1.depositfunds(1000, 15, 1234);
		System.out.println("Balance in Account"+ Dep);
		

	}

}
