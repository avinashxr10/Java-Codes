package com.java.java8.Stream;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAvgSummarizing {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(11);
        numSet.add(12);
        numSet.add(13);
        numSet.add(14);
        numSet.add(1555);

        Double avg = numSet.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(avg);

       IntSummaryStatistics summary =  numSet.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(summary);

        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(11);
        numSet2.add(12);
        numSet2.add(13);
        numSet2.add(14);
        numSet2.add(1555);

        IntSummaryStatistics summary2 =  numSet2.stream().collect(Collectors.summarizingInt(x -> x));
        summary.combine(summary2);
        System.out.println(summary);

    }
}
