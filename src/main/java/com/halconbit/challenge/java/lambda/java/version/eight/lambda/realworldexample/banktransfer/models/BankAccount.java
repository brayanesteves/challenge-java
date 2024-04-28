package com.halconbit.challenge.java.lambda.java.version.eight.lambda.realworldexample.banktransfer.models;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankAccount {
    
    private int    id;
    private double balance;
    private String accountName;
    final   Lock   lock = new ReentrantLock();
    
    BiFunction<Double, Double, Double> subtractFunction = (a, b) -> a - b;
    BiFunction<Double, Double, Double> addFunction      = (a, b) -> a + b;
    
    public BankAccount(int id, double balance, String accountName) {
        this.id = id;
        this.balance = balance;
        this.accountName = accountName;
    }
    
    public boolean withdraw(double amount) {
        if(this.lock.tryLock()) {
            try {
                Thread.sleep(100);
                this.balance = subtractFunction.apply(this.balance, amount);
                this.lock.unlock();
                return true;
            } catch (InterruptedException ex) {
                Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public boolean deposit(double amount) {
        if(this.lock.tryLock()) {
            try {
                Thread.sleep(100);
                this.balance = addFunction.apply(this.balance, amount);
                this.lock.unlock();
                return true;
            } catch (InterruptedException ex) {
                Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public boolean transfer(BankAccount to, double amount) {
        if(this.withdraw(amount)) {
            System.out.println("Withdrawing amount: " + amount + " from: " + this.getAccountName());
            if(to.deposit(amount)) {
                System.out.println("Depositing amount: " + amount + " to: " + to.getAccountName());
                return true;
            } else {
                System.out.println("Failed to acquire both locks: refunding " + amount + " to: " + this.accountName);
                while(!this.deposit(amount)) {
                    continue;
                }
            }
        }
        return false;
    }
    
    
    // <GETTER & SETTER> //
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BiFunction<Double, Double, Double> getAddFunction() {
        return addFunction;
    }

    public void setAddFunction(BiFunction<Double, Double, Double> addFunction) {
        this.addFunction = addFunction;
    }
    // <.GETTER & SETTER> //

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + id + ", balance=" + balance + ", accountName=" + accountName + '}';
    }
    
}