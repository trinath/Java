// Source: geeksforgeeks
package com.practise.multithreading;

import java.util.LinkedList;

public class ProducerConsumer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;
    public void produce() throws InterruptedException{
        int value = 0;
        while(true){
            synchronized (this){
                while(list.size() == capacity) wait();
                list.add(value++);
                System.out.println("Producer produced Value " + value);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0) wait();
                int val = list.removeFirst();
                System.out.println("Consumer consumed Value " + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
