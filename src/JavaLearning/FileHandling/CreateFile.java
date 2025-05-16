package JavaLearning.FileHandling;

import java.io.*;

public class CreateFile {
    public static void main (String[] args) {
        File f=new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        try {
            if (f.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Aready Exists");
            }
        } catch (IOException e) {
            System.out.println("Exception thrown");
        }
    }
}
