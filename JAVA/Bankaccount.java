public class Bankaccount {
String accountholder;
int balance;
public static void main(String[]agrs) {
Bankaccount account1 = new Bankaccount("sudhakar", 5000);
   account1.deposit(5000);
	   account1.withdraw(500);
	
}

public void deposit(int amount)  {

 	this.balance = balance + amount;
	System.out.println(account1.balance);
	System.out.println("Deposit Successfully "+""+ amount);
}
public void withdraw(int amount) 
{
	
	balance = balance - amount;
	System.out.println(balance);
	System.out.println("withdraw Successfully "+""+ amount);
	
}
	public void showbalance() {
	this.balance = this.balance;
		System.out.println("balance" );
	}
		



public Bankaccount(String accountholder,int balance) {

     this.accountholder = accountholder;
     this.balance = balance;
	System.out.println(balance);
	System.out.println(accountholder);
}
}
