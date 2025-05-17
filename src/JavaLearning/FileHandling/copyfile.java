package JavaLearning.FileHandling;

import java.io.*;
import java.io.IOException;

public class copyfile {
    public static void main(String[] args) throws IOException {
        File oldFile = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/PC.txt");
        if (oldFile.createNewFile()) {System.out.println("File Created Successfully");}
        else {System.out.println("File Already Exists");}

        File newFile = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        FileReader fr = new FileReader(oldFile);
        FileWriter fw = new FileWriter(newFile);


        int i;
        while ((i=fr.read()) != -1) {
            fw.write(i);
        }
        System.out.println("Content Copied Succesfully");

        fr.close();
        fw.close();

    }
}
