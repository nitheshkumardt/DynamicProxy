package com.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerClass implements InvocationHandler {
    Object obj;

    public InvocationHandlerClass(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("In Invocation Handler Class");
        Long startTime = System.currentTimeMillis();
        String result= (String) method.invoke(this.obj,args);
        Long endTime = System.currentTimeMillis();
        System.out.println("Invocation handler completed. Execution Time " + (endTime-startTime));
        return result;
    }
}
