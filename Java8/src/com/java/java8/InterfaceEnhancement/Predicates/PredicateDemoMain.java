package com.java.java8.InterfaceEnhancement.Predicates;

public class PredicateDemoMain {
    public static void main(String[] args) {
        Predicates predicates = new PredicateDemo();
        boolean result = predicates.test(20);
        System.out.println(result);
    }
}
