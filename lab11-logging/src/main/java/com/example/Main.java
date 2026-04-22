package com.example;

public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount(1000.0);
        Customer customer = new Customer("Batman",null);  // Pass null to trigger NullPointerException
        System.out.println("Customer Domain: " + customer.getDomain());

        account.deposit(700);
        account.withdraw(100);
        account.withdraw(2000);
        account.deposit(-36);
        account.triggerFatalError();
}}
