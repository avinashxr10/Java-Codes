package com.java.java8.InterfaceEnhancement.Predicates;

public class PredicateDemo implements Predicates<Integer> {
    @Override
    public boolean test(Integer age) {
        return age > 18;
    }
}
