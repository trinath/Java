// Source: geeks
package com.practise.generics;

class Test<T>{
    T obj;
    Test(T obj){ this.obj = obj;}
    public T getObject(){ return this.obj; }
    public <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }
}

public class Template {
    public static void main(String[] args){
        Test<Integer> iObj= new Test<Integer>(15);
        System.out.println(iObj.getObject());
        iObj.genericDisplay(25);

        Test<String> sObj= new Test<String>("String Object");
        System.out.println(sObj.getObject());

        sObj.genericDisplay("New String Object");
    }
}
