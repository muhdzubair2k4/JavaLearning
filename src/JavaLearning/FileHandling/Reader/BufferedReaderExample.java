package JavaLearning.FileHandling.Reader;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException{
        File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        if (f.createNewFile()){System.out.println("File Created Successfully");}
        else {System.out.println("File Already Exists");}

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line=br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }
}
