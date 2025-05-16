package JavaLearning.FileHandling.Reader;

import java.io.*;

public class FileInputSteamExample {
    public static void main(String[] args) throws IOException{
        File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        if (f.createNewFile()) {System.out.println("File Created Successfully");}
        else {System.out.println("File Already Exists");}

        FileInputStream fis = new FileInputStream(f);
        int byteRead;
        while ((byteRead = fis.read()) != -1) {
            System.out.println((char)byteRead);
        }
        fis.close();

    }
}
