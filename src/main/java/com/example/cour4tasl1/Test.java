package com.example.cour4tasl1;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> testList = new Random().ints(10, 1, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(testList);
        Stream<Integer> stream = testList.stream();
        Comparator<Integer> comparator = Comparator.naturalOrder();
        BiConsumer<Integer, Integer> biConsumer = (min, max) -> System.out.println(min + ", " + max);
        Task1.findMinMax(stream, comparator, biConsumer);
    }
}
