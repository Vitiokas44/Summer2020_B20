package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String clientAccountType, String name, String acctNum){ // sets the info
        accountType = clientAccountType;
        accountHolder = name;
        accountNumber = acctNum;
    }

    public void getAccountInfo(){ // displays account info
        System.out.println("============================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+balance);
        System.out.println("============================");
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        balance -= amount;
    }





}