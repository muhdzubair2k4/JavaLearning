package JavaLearning.FileHandling;

import java.io.File;

public class renameFile {
    public static void main(String[] args) {
        File f = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");
        File r = new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/PC.txt");

        if (f.exists()){
            System.out.println(f.renameTo(r));
        }
        else {
            System.out.println("File Doesnt Exist");
        }
    }
}
