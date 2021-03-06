package arun.patterns.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSingleton {
	static DemoSingleton instanceOne = DemoSingleton.getInstance();
	 
    public static void main(String[] args) {
        try {
            // Serialize to a file
        	ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "D:/Arun/singleton.txt"));
        	out.writeObject(instanceOne);
            out.close();
 
            instanceOne.setI(20);
 
            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
            		"D:/Arun/singleton.txt"));
            DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
            in.close();
 
            System.out.println(instanceOne.getI());
            System.out.println(instanceTwo.getI());
 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
