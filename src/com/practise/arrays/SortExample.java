// Source: geeksforgeeks
package com.practise.arrays;
import java.util.*;
import java.io.*;
import java.lang.*;

class Student implements Comparable<Student>{
    int rollno;
    String name, address;
    Student(int rno, String name, String addr){
        rollno = rno;
        this.name = name;
        address = addr;
    }
    public String toString(){
        return "Roll No: " + rollno + " Name: " + name + " Address: " + address;
    }
    public int compareTo(Student student){
        return this.rollno - student.rollno;
    }
}

class SortByAddr implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.address.compareTo(b.address);
    }
}

class SortByName implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}

public class SortExample {
    public static void main(String args[]){
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(222, "aaaa", "nyc"));
        ar.add(new Student(333, "cccc", "jaipur"));

        System.out.println("Sort by Roll Number");
        Collections.sort(ar);
        for(Student s: ar){
            System.out.println(s);
        }

        System.out.println("Sort by Address");
        Collections.sort(ar, new SortByAddr());
        for(Student s: ar){
            System.out.println(s);
        }

        System.out.println("Sort by Name");
        Collections.sort(ar, new SortByName());
        for(Student s: ar){
            System.out.println(s);
        }

    }
}
