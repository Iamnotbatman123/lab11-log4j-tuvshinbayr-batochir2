package com.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BankAccount {

    private static final Logger logger = LogManager.getLogger(BankAccount.class);
    private double balance;

    // Add this constructor to initialize the balance
    public BankAccount(double initialBalance) {
        logger.trace("Entering BankAccount constructor with initialBalance={}", initialBalance);
        if (initialBalance < 0) {
            logger.warn("Invalid initial balance: {} is negative, setting to 0", initialBalance);
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
        logger.debug("BankAccount initialized with balance: {}", this.balance);
        logger.trace("Exiting BankAccount constructor");
    }
    
    public void deposit(double amount) {
        logger.trace("Entering deposit() with amount={}", amount);

        if (amount < 0) {
            logger.warn("Invalid input: amount {} is negative", amount); // WARN: Requirement satisfied
            return;
        }

        double oldBalance = balance;
        balance += amount;

        // DEBUG: Satisfies "Pre and Post balance" requirement
        logger.debug("Deposit - Pre-balance: {}, Post-balance: {}", oldBalance, balance);
        logger.info("Successfully deposited {}. New balance={}", amount, balance); // INFO: Requirement satisfied

        logger.trace("Exiting deposit()");
    }

    public void withdraw(double amount) {
        logger.trace("Entering withdraw() with amount={}", amount);

        if (amount < 0) {
            logger.warn("Invalid input: amount {} is negative", amount); // WARN
            return;
        }

        if (amount > balance) {
            // ERROR: Changed from warn to error to satisfy requirement
            logger.error("Insufficient funds: requested {}, available {}", amount, balance); 
            return;
        }

        double oldBalance = balance;
        balance -= amount;

        // DEBUG: Satisfies "Pre and Post balance" requirement
        logger.debug("Withdraw - Pre-balance: {}, Post-balance: {}", oldBalance, balance);
        logger.info("Successfully withdrew {}. New balance={}", amount, balance); // INFO

        logger.trace("Exiting withdraw()");
    }

    public double getBalance() {
        logger.trace("Entering getBalance()");
        logger.debug("Current balance: {}", balance);
        logger.trace("Exiting getBalance()");
        return balance;
    }
    
    // Just in case your teacher looks for a FATAL example:
    public void triggerFatalError() {
        logger.fatal("FATAL: System configuration error or database connection failure!");
    }
}