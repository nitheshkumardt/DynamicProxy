package com.Dynamic;

public class CustomerClass implements CustomerInterface{
    @Override
    public String DisplayCustomerName(String name) {
        System.out.println("In Customer Class");
        System.out.println("Customer Name "+name);
        return name;
    }
}
