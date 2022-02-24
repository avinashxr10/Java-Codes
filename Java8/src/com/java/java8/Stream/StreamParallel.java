package com.java.java8.Stream;

import java.util.*;

public class StreamParallel {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        intList.forEach(System.out::println);
        System.out.println("\nParallel Stream\n");
        intList.stream().parallel().forEach(System.out::println);
    }
}
