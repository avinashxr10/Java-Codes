package com.java.java8.InterfaceEnhancement.Predicates;

import java.util.function.Predicate;

public class PredicateOddEvenCheck {
    public static void main(String[] args) {
        Integer[] numbers = {2, 6, 9, 4, 8, 22, 19, 23, 11, 5, 11};

        Predicate<Integer> OddEvenPredicate = num -> num % 2 != 0;

        for (Integer num : numbers) {
            if (OddEvenPredicate.test(num)) {
                System.out.println("Odd Number " + num);
            }

            if (OddEvenPredicate.negate().test(num)) {
                System.out.println("Even Number " + num);
            }
        }

        //find all the odd numbers which are greater than 10
        Predicate<Integer> gt10Predicate = num -> num > 10;

        for (Integer num : numbers) {
            if (gt10Predicate.and(OddEvenPredicate).test(num)) {
                System.out.println("Odd number > 10 : " + num);
            }
        }
    }
}
