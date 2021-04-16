package com.Dynamic;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        CustomerClass customerClass=new CustomerClass();
        InvocationHandlerClass invocationHandlerClass=new InvocationHandlerClass(customerClass);
        CustomerInterface customerInterface= (CustomerInterface) Proxy.newProxyInstance(Main.class.getClassLoader(),new Class[] {CustomerInterface.class},invocationHandlerClass);
        System.out.println(customerInterface.DisplayCustomerName("Abi"));
    }
}
