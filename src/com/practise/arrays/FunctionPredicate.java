// source: geeksforgeeks
package com.practise.arrays;

import java.util.*;
import java.util.function.Predicate;

public class FunctionPredicate {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
        Predicate<String> p = (s)->s.startsWith("G");
        for(String s : names){
            if(p.test(s))
                System.out.println(s);
        }
    }
}
