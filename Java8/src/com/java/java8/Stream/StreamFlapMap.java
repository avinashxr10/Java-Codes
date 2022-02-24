package com.java.java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlapMap {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11,22,33,44,55,66,77);
        System.out.println("numList1 : "+numList);

        List<Integer> numListNew = numList.stream().map(x -> x).collect(Collectors.toList());
        System.out.println("numList2 : "+numListNew);

        List numListNew3 = numList.stream().map(x -> Arrays.asList(x, x+1)).collect(Collectors.toList());
        System.out.println("numList3 : "+numListNew3);

       List<Integer> numListNew4 = numList.stream().flatMap(x -> Stream.of(x, x+1)).collect(Collectors.toList());
        System.out.println("numList4 : "+numListNew4);

        List<Integer> numListNew5 = numList.stream().flatMap(x -> {
            if (x % 2 !=0){
                return Stream.empty();
            }else {
                return Stream.of(x, x*2, x*3);
            }
        }).collect(Collectors.toList());

        System.out.println("numList5 : "+numListNew5);

    }
}
