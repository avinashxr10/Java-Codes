package com.java.java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println(numbers); //[1, 2, 3, 4, 5, 6, 7]

        //Odd Numbers until java 7

        List<Integer> oddNumber = new ArrayList<>();

        for (Integer num : numbers){
            if(num % 2 != 0){
                oddNumber.add(num);
            }
        }
        System.out.println(oddNumber); //[1, 3, 5, 7]


        //Odd Numbers until java 8
        //Stream<Integer> stream = numbers.stream();

        oddNumber=numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println("Java 8 Stream : "+oddNumber); //[1, 3, 5, 7]

        Predicate<Integer> OddEvenPredicate = num -> num % 2 != 0;
        oddNumber=numbers.stream().filter(OddEvenPredicate).collect(Collectors.toList());
        System.out.println("Java 8 Stream Predicates : "+oddNumber);
    }
}
