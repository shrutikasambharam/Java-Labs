/* 2. implement a bank account class showing method overloading with methods for 
deposit, withdrawal and balance inquiry. use method overloading to handle different types of transactions. in java */
/* The class has two overloaded transaction methods. */
class Bank //class created
{    
	double total_balance;    //instance variable
	int account_number;
	// Display current balance in Account
	void balanceDetails(double balance)      
	{
		this.total_balance=balance;
		System.out.println("****************Welocome to SBI*********************");
		//System.out.println("Account Number = "+a_number);
		System.out.println("Total Balance = $"+total_balance);
	}
	// Withdraw amount and update the balance
	void transaction(int account_no,double withdrawal_amount)    // this method has two arguments
	{
		this.account_number=account_no;
		System.out.println("*** Withdraw Operation ***");
		System.out.println("Account Number = "+account_no);
		System.out.println("Withdrawing Amount : "+withdrawal_amount);
		if (total_balance >= withdrawal_amount) // checking the withdrawal amount is not a grater than total amount
		{
            total_balance -= withdrawal_amount;
			this.total_balance = total_balance;
            System.out.println("After Withdrawing Amount = $" + total_balance);
        } 
		else   // total amount is less than withdrawal amount then execute the else block
		{
            System.out.println("Insufficient balance !!");
        }
	}
	// Deposite amount and update the balance 
	void transaction(double deposite_amount)     // method Overloading       // this method has one arguments
	{
		System.out.println("*** Deposite Operation ***");
		System.out.println("Account Number = "+this.account_number);
		System.out.println("Depositing Amount = "+deposite_amount);
		total_balance += deposite_amount;
        System.out.println("Successfully Deposited !!!!" );
		System.out.println("After Depositing Total balance is : $" + total_balance);	
	}	
}
class BankAccount       //created another class
{
	public static void main(String args[])         //Define the main method
	{
	Bank b=new Bank();
	b.balanceDetails(20000);     // calling the balance details method
	b.transaction(101,25000);     //calling the transaction method based on the arguments and it's types
	//b.transaction(101,7000);
	b.transaction(5000);         //calling the transaction method based on the arguments and it's types
	}
}


/*|| OutPut ||
D:\anudeep>javac BankAccount.java
D:\anudeep>java BankAccount

******Welcome to SBI*****
Total Balance = $20000.0

*** Withdraw Operation ***
Account Number = 101
Withdrawing Amount : 7000.0
After withdrawing Amount = $13000.0

*** Deposite Operation ***
Account Number = 101
Depositing Amount = 5000.0
Successfully Deposited !!!!
After Depositing Total balance is : $18000.0

D:\anudeep>javac BankAccount.java
D:\anudeep>java BankAccount *

*********Welcome to SBI**********
Total Balance = $20000.0

*** withdraw Operation ***
Account Number = 101
Withdrawing Amount : 25000.0
Insufficient balance !!

*** Deposite Operation ***
Account Number = 101
Depositing Amount = 5000.0
Successfully Deposited !!!!
After Depositing Total balance is : $25000.0
*/