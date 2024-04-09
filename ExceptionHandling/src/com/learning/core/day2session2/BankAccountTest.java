package com.learning.core.day2session2;

public class BankAccountTest {
    public static void main(String[] args){

        int accNo = 123;
        String custName = "john";
        String accType = "saving";
        float balance = -900;
        BankAccount ba = new BankAccount(accNo,custName,accType, balance );
        try {
            ba.deposit(balance);
            System.out.println("Amount inserted successfully.");
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            ba.getBalance();
        }
        catch (LowBalanceException l){
            System.out.println(l.getMessage());
        }
    }
}
