// Source: geeks
package com.practise.generics;

import java.util.ArrayList;

public class LambdaExpression {

    interface FunInter1{
        int operation(int a, int b);
    }

    interface FunInter2{
        void printMessage(String message);
    }

    private int apply(int a, int b, FunInter1 fun){
        return fun.operation(a, b);
    }

    public static void main(String[] args){

        FunInter1 add = (int a, int b)->a + b;

        FunInter1 multiply = (int a, int b)->a * b;

        FunInter2 printit = (String s)->System.out.println(s);

        ArrayList<Integer> array= new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.forEach(x->System.out.println(x));

        printit.printMessage("Printing Even Numbers");

        array.forEach(x->{if (x%2==0) System.out.println(x);});


        printit.printMessage("Lambda Expressions");

        LambdaExpression lex = new LambdaExpression();

        String result = "Addition is: " + lex.apply(3 , 4, add);

        printit.printMessage(result);

        result = "Multiplication is: " + lex.apply(3, 4, multiply);

        printit.printMessage(result);
    }
}
