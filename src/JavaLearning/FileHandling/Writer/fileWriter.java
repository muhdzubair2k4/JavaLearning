package JavaLearning.FileHandling.Writer;

import java.io.*;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try {
            File f=new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

            if (f.createNewFile()){System.out.println("File Created Successfully");}
            else {System.out.println("File Already Exists");}

            FileWriter fw=new FileWriter(f, true); //f, true added to ammend text to exist file

            fw.write("\nThis Line is Added");
            fw.close(); //always close FileWriter to save changes
            System.out.println("Successfully Wrote in File");



        }
        catch (IOException e){
            System.out.println("Exception Thrown");
        }
    }
}
