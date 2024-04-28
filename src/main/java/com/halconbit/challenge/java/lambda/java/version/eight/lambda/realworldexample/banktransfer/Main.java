package com.halconbit.challenge.java.lambda.java.version.eight.lambda.realworldexample.banktransfer;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.realworldexample.banktransfer.interfaces.AccountFactoryInterface;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.realworldexample.banktransfer.models.BankAccount;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Bank Transfer.
 * 1. We will be implementing a real world bank transfer program using what we
 *    have learned with lambda expressions.
 * 2. The example will transfer money from student bank account to university
 *    bank account. It will run 20 transactions in parallel using 'Threads'.
 * @author Brayan Esteves (Email: brayan.esteves93@gmail.com).
 */
public class Main {
    public static void main(String[] args) {
        
        AccountFactoryInterface accountFactoryInterface = BankAccount::new;
        BankAccount studentBankAccount                  = accountFactoryInterface.getBankAccount(1,  50000, "Student A");
        BankAccount universityBankAccount               = accountFactoryInterface.getBankAccount(2, 100000, "University A");
    
        BiPredicate<Double, Double> biPredicateBalanceGreatherAmount = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> biConsumerStringDouble            = (x, y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> biConsumerBankAccount   = (student, university) -> System.out.println("Ending balance of student account: " + studentBankAccount.getBalance() + " University account: " + universityBankAccount.getBalance());
        
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        Thread threadZero = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " says :: Executing Transfer");
            try {
                double amount = 1000;
                if(!biPredicateBalanceGreatherAmount.test(studentBankAccount.getBalance(), amount)) {
                    biConsumerStringDouble.accept(Thread.currentThread().getName() + " says :: balance insufficient, ", amount);
                    return;
                }
                while(!studentBankAccount.transfer(universityBankAccount, amount)) {
                    TimeUnit.MICROSECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            biConsumerStringDouble.accept(Thread.currentThread().getName() + " says transfer is successful: Balance in account ", universityBankAccount.getBalance());
        });        
        
        for(int i = 0; i < 20; i++) {
            executorService.submit(threadZero);
        }
        executorService.shutdown();
        try {
            while(!executorService.awaitTermination(24L, TimeUnit.HOURS)) {
                System.out.println("Not Yet. Still waiting for termination.");
            }
        } catch(InterruptedException interruptedException) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, interruptedException);
        }
        
        biConsumerBankAccount.accept(studentBankAccount, universityBankAccount);
        
    }
}