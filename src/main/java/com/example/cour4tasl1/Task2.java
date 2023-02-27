package com.example.cour4tasl1;

import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static void findEvenNumbers (List<Integer> list){
        Stream <Integer> stream = list.stream();
        stream.filter(x->x%2==0)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
