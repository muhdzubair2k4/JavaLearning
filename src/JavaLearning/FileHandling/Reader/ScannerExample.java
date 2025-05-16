package JavaLearning.FileHandling.Reader;

import java.io.*;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        if (f.createNewFile()) {System.out.println("File Created Successfully");}
        else {System.out.println("File Already Exists"); }

        Scanner scanner = new Scanner(f);

        while (scanner.hasNextLine()) {
            String line = scanner.next();
            System.out.println(line);
        }
        scanner.close();
    }
}
