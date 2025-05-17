package JavaLearning.FileHandling.Writer;

import java.io.*;

public class BufferedWriterExample{
    public static void main(String[] args) throws IOException{
        File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        if (f.createNewFile()){System.out.println("File Created Successfully");}
        else {System.out.println("File Already Exists");}

        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("This is Writtern From Buffered Write");
        bw.newLine();
        bw.close();
        System.out.println("Text Amended");

    }
}
