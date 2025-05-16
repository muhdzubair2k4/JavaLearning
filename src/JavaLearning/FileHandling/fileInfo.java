package JavaLearning.FileHandling;

import java.io.File;

public class fileInfo {
    public static void main (String[] args) {
        File f=new File("/Users/Zubair/Documents/CODING/JAVA/newporoject/JavaCoding/src/JavaLearning/FileHandling/LC.txt");

        if (f.exists()) {
            System.out.println("File Name : " + f.getName());
            System.out.println("File Path : " + f.getAbsolutePath());
            System.out.println("File Writable : " + f.canWrite() );
            System.out.println("File Readable : " + f.canRead());
            System.out.println("File Size : " +  f.length());
            System.out.println("File Hidden : " + f.isHidden());
            System.out.println("File Delete : " + f.delete());
        }
        else {
            System.out.println("File Doesn't Exist");
        }
    }
}
