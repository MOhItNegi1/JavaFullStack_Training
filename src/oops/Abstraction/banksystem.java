package oops.Abstraction;
/* 
Banking System (Main Question)

- Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().

- Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.

- Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).

- Store multiple accounts in an ArrayList<Account>.

Demonstrate runtime polymorphism while performing operations.
	Add features:
	Add a new account
	Remove an account by account number
	Search for an account
	Display all accounts
	Deposit/Withdraw money into/from a chosen account

*/

 interface BankOperation {

    void deposit(int amount);

    void withdraw(int amount);

    void checkBalance();

    
}

abstract class Account{
    private int accountno;
    private String holdername;
    private  int balance;

    public Account(int accountno, String holdername, int balance){
        this.accountno=accountno;
        this.holdername=holdername;
        this.balance=balance;
    }   

    public int getAccountno(){
        return accountno;

    }
    public String getHoldername(){
        return holdername;
    }

    public int getbalance(){
        return balance;
    }

    public void setbalance(int balance){
        this.balance=balance;
    }

    public  abstract String AccType(); // abstract method 


    public void checkBalance(){
        System.out.println("Balance for " + AccType()+" account no "+accountno+" : "+balance);
    } 
    

}

class SavingsAccount extends Account implements BankOperation{

    public SavingsAccount(int accountno, String holdername, int balance){
        super(accountno,holdername,balance);
    }

    @Override
    public void deposit(int amount){
        setbalance(getbalance()+amount);
    }

    @Override
    public  void withdraw(int amount){
        setbalance(getbalance()-amount);
    }

    @Override
    public String AccType(){
        return "Savings account";
    }
     
    

    
} 

class CurrentAccount extends Account implements BankOperation{
     public CurrentAccount(int accountno, String holdername, int balance){
        super(accountno,holdername,balance);
    }

    @Override
    public void deposit(int amount){
        setbalance(getbalance()+amount);
    }

    @Override
    public  void withdraw(int amount){
        setbalance(getbalance()-amount);
    }

    @Override
    public String AccType(){
        return "Current type";
    }

}

class bank{
    
}


public class banksystem {
    public static void main(String[]args){

    }
    
}
