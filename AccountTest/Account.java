package AccountTest;

public class Account {
int balance=0;
	public void afterDeposit(int amount) {
        balance=amount;
		
	}

	public void afterWithdrawal(int amount) {
		
		balance -=amount;
	}

	public int balance() {
	return balance;
	}

}
