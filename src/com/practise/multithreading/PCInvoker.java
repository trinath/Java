// Source: geeksforgeeks
package com.practise.multithreading;

public class PCInvoker {
    public static void main(String[] args) throws InterruptedException{
        final ProducerConsumer pc = new ProducerConsumer();
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
