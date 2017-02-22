// Source: geeks
package com.practise.generics;
import javax.swing.plaf.synth.SynthTextAreaUI;
import  java.io.*;

class Demo implements java.io.Serializable{
    public int a;
    public String b;
    public Demo(int a, String b){
        this.a = a;
        this.b = b;
    }
}

public class SerializeDeserialize {
    public static void main(String[] args) {
        // serialize
        Demo obj = new Demo(10, "Hello");
        try {
            FileOutputStream fo = new FileOutputStream("serialize.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(obj);
            oos.close();
            fo.close();
            System.out.println("Serializing Object");
        } catch (IOException e){
            System.out.println(e);
        }
        // deserialize
        Demo obj1 = null;
        try{
            FileInputStream fi = new FileInputStream("serialize.dat");
            ObjectInputStream ois = new ObjectInputStream(fi);
            obj1 = (Demo) ois.readObject();

            ois.close();
            fi.close();
            System.out.println("De-Serializing Object");
            System.out.println(obj1.a + " " + obj1.b);
        } catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
