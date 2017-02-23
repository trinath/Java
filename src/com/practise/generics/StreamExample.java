// Source: geeks
package com.practise.generics;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> iSquare = iList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("Printing Squares of Integers: " + iSquare);

        List<String> sList = Arrays.asList("String", "Collection", "Sample", "Demo");
        List<String> filteredList = sList.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
        System.out.println("Filtering strings starting with S: " + filteredList);

        List<String> sortedList = sList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorting strings: " + sortedList);

        int even = iList.stream().filter(x->x%2==0).reduce(0, (ans, i) -> ans + i);
        System.out.println("Sum of Even Numbers (1 - 5): " + even);
    }
}
