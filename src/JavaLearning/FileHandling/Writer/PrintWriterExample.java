package JavaLearning.FileHandling.Writer;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException{
        File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        if (f.createNewFile()){System.out.println("File Created Successfully");}
        else {System.out.println("File Already Exists");}

        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("This is Written from PrintWriter");
        pw.close();
    }
}
