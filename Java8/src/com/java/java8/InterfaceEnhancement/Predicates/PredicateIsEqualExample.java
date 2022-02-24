package com.java.java8.InterfaceEnhancement.Predicates;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
    public static void main(String[] args) {

        String name = "John h";

        Predicate<String> nameEqualityPredicate = Predicate.isEqual("John");
        System.out.println(nameEqualityPredicate.test(name));
    }
}
