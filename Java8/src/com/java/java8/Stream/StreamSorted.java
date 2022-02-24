package com.java.java8.Stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(3);
        numbers.add(41);
        numbers.add(5);
        numbers.add(63);
        numbers.add(7);

        //Normal Insertion Order
        System.out.println(numbers);

        //ascending order sorting
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));

        //custom descending order sorting
        System.out.println(numbers.stream().sorted((elem1,elem2) -> elem2.compareTo(elem1)).collect(Collectors.toList()));

    }
}
