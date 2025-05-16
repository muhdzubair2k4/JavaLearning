package JavaLearning.FileHandling.Reader;

import java.io.*;
public class fileReader {
    public static void main(String[] args) throws IOException {
            File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

            if (f.createNewFile()){System.out.println("File Created Successfully");}
            else {System.out.println("File Already Exists");}

            FileReader fr = new FileReader(f);

            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
    }
}
