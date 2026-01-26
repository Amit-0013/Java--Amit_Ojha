package com.bankAccount;

public class Customer {
    public static void main(String[] args) {
        BankAccount BOI = new BankAccount(1001 , "Amit Kumar" , 0);
        BOI.depositMoney(1000);
        BOI.getBalance();
        BOI.withdrawMoney(2000);
        BOI.withdrawMoney(500);
        BOI.getBalance();
    }
}
