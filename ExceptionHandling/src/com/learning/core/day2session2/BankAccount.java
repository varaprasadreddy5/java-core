package com.learning.core.day2session2;

public class BankAccount {

    int accNo;
    String custName;
    String accType;
    float balance;

    public BankAccount() {
    }

    public BankAccount(int accNo, String custName, String accType, float balance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = balance;
    }

    public void deposit(float amt) throws NegativeAmountException{
        if(amt < 0){
            throw new NegativeAmountException("Negative Amount");
        }
        else{
            balance += amt;
        }
    }

    public float getBalance() throws LowBalanceException{
        if(accType.equals("saving") && balance < 1000){
            throw new LowBalanceException("Lowbalance");
        }
        else if (accType.equals("current") && balance < 5000) {
            throw new LowBalanceException("Lowbalance");
        }
        else
            return balance;
    }

}
