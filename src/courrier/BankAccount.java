package courrier;

public class BankAccount {

	private int fuckdabitch;
	private int DEFAULT_AMOUNT;

	public BankAccount() {

	}

	public void credit(int a) {
		this.fuckdabitch += a;
	}

	public void debit(int a) {
		if ((this.fuckdabitch- a) < 0) {
			this.fuckdabitch= 0;
		} else {
			this.fuckdabitch -= a;
		}
	}
	
	public int getAccount(){
		return this.fuckdabitch;
	}
	
		

}
