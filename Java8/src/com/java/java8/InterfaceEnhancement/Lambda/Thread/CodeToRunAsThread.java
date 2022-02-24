package com.java.java8.InterfaceEnhancement.Lambda.Thread;

public class CodeToRunAsThread implements Runnable{
    @Override
    public void run() {
        for (Integer count = 1; count <=5; count++){
            System.out.println("Child thread Counter value is : " +count);
        }
    }
}
