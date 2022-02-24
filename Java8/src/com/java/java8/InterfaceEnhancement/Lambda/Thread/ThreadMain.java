package com.java.java8.InterfaceEnhancement.Lambda.Thread;

public class ThreadMain {
    public static void main(String[] args) {
        //Regular Expression
       // Runnable runnable = new CodeToRunAsThread();

        //Lambda Expression
        Runnable runnable = ()->{
            for (Integer count = 1; count <=5; count++){
                System.out.println("Child thread Counter value is : " +count);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        for (Integer count = 1; count <=5; count++){
            System.out.println("Main thread Counter value is : " +count);
        }
    }
}
