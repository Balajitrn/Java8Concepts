package com.jls.project.transapp;

import java.time.LocalDate;

/**
 * Step 1 Setting up the Transaction class
 */

public class Transaction {
    private final String id;
    private final double amount;
    private final LocalDate data;

    public Transaction(String id, double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.data = date;
    }

    //getters
    public String getId() {return id;}
    public double getAmount(){return amount;}
    public LocalDate getData() {return data;}


    @Override
    public String toString(){
        return "Transaction{ " +
                "id=' "+id+'\''+
                ",amount=" + amount +
                ",date=" + data +
                '}';
    }
}
