package com.java.java8.Stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {

        // Calculate the sum of 10 numbers
       OptionalInt optionalInt = IntStream.rangeClosed(1,10).reduce(Integer::sum);
        System.out.println(optionalInt.getAsInt());
    }
}
