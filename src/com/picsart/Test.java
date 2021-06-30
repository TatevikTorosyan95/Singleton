package com.picsart;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConnectionConfig instance2 = ConnectionConfig.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.txt"));
        out.writeObject(instance2);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.txt"));
        ConnectionConfig instance3 = (ConnectionConfig) in.readObject();
        in.close();

        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());
    }
}
