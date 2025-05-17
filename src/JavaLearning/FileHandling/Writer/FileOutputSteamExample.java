package JavaLearning.FileHandling.Writer;

import java.io.*;

public class FileOutputSteamExample {
    public static void main(String[] args) throws IOException{
        File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        if (f.createNewFile()){System.out.println("File Created Successfully");}
        else {System.out.println("File Already Exists");}


        FileOutputStream fos = new FileOutputStream(f, true);
        String newLine = System.lineSeparator();
        fos.write("This Text is written Through FOS".getBytes());
        fos.write(newLine.getBytes());
        fos.close();




    }
}
