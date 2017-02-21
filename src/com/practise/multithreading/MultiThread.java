package com.practise.multithreading;

import java.lang.Thread;

class ThreadInvoke1 extends Thread{
    public void run(){
        try{
            System.out.println("Thread: "+ Thread.currentThread().getId());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class ThreadInvoke2 implements Runnable{
    public void run(){
        try{
            System.out.println("Thread: "+ Thread.currentThread().getId());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class MultiThread {
    public static void main(String[] args){
        int nThreads = 5;
        for(int i = 0; i < 5 ; i++){
            ThreadInvoke1 invoke1 = new ThreadInvoke1();
            invoke1.start();
            Thread invoke2 = new Thread(new ThreadInvoke2());
            invoke2.start();
        }
    }
}
