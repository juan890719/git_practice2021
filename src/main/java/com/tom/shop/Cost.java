package com.tom.shop;

public class Cost {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 800);
        System.out.println(c1.id + "\t" + c1.amount + "\t" + c1.getAmount());
        SliverCustomer s1 = new SliverCustomer("Mary", 1000);
        System.out.println(s1.id + "\t" + s1.amount + "\t" + s1.getAmount());
    }
}
