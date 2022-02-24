package com.java.java8.Stream;

import java.util.HashSet;
import java.util.Set;
import static java.util.stream.Collectors.*;

public class StreamToSet {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(3);
        numSet.add(4);
        numSet.add(7);
        numSet.add(9);

        Set<Integer> filteredSet =  numSet.stream().filter(a -> a > 2).collect(toSet());
        System.out.println(filteredSet);
    }
}
