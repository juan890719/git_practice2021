package com.tom.shop;

public class SliverCustomer extends Customer{
    float discount = 0.1f;
    public SliverCustomer(String id, int amount) {
        super(id, amount);
    }

    @Override
    public int getAmount() {
        return amount - (int)(amount * discount);
    }
}
