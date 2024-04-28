package com.halconbit.challenge.java.lambda.java.version.eight.lambda.realworldexample.banktransfer.interfaces;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.realworldexample.banktransfer.models.BankAccount;

public interface AccountFactoryInterface {
    public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}