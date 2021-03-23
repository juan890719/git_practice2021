package com.tom.shop;

public class Customer {
    String id;
    int amount;
    public Customer(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
