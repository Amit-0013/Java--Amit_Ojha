package com.bankAccount;

public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(long accountNumber , String accountHolder , double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void depositMoney(double money){
        if(money <= 0){
            System.out.println("Invalid deposit.");
        }
        else{
            balance += money;
            System.out.println("Deposit successful.");
        }
    }
    public double withdrawMoney(double money){
        if(money <= 0){
            System.out.println("Invalid withdrawal.");
        } else if(balance >= money){
            balance -= money;
            System.out.println("Withdrawal successful.");
        }else if(balance < money){
            System.out.println("Invalid withdrawal.");
        }
        return money;
    }
    public void getBalance(){
        System.out.println("The remaining balance is: "+balance);
    }

}
