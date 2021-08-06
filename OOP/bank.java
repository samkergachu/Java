public class bank{
	
	//instances
	private String account_number; 
	private double balance = 0.0; 
	private String customerName; 
	private String email; 
	private String phoneNumber; 


	//getters 
	
	public double amountInAccount() {

		return this.balance; 
	}

	public String accountID() {

		return this.account_number; 
	}

	public String ownerName() {

		return this.customerName; 
	}

	public String emailAccount() {

		return this.email; 
	}

	public String ownerPhoneNumber() {

		return this.phoneNumber; 
	}

	//setters
	public void setAccountNumber(String num) {
		this.account_number = num; 
	}

	public void setBalance( double amount) {
		this.balance = amount; 
	}

	public void setName(String name) {
		this.customerName = name; 
	}

	public void setEmail(String email) {
		this.email = email; 
	}

	public void setPhoneNumber (String num) {
		this.phoneNumber = num; 
	}


	//methods
	public static void deposit(double amount) {
		this.balance += amount; 
	}

	public static void withdraw(double amount) {
		this.balance -= amount; 
	}



}

public class Main {

	public static void main(String[] args) {
		
		bank a = new bank(); //new bank object
		
		//set-up a new account
		a.setAccountNumber("114456982345"); 
		a.setBalance(128000.04);
		a.setName("Dave Chapelle"); 
		a.setEmail("davechapelle@gmail.com"); 
		a.setPhoneNumber("+254707427208"); 
		
		System.out.println("Balance = " + a.amountInAccount()); 

		//deposit cash
		a.deposit(1000000); 

		System.out.println("Balance = " + a.amountInAccount()); 

		//withdraw to buy a porshe; 
		a.withdraw(200000); 

		//How much is left?
		System.out.println("Balance = "+ a.amountInAccount()); 

	}
} //end of main; 
