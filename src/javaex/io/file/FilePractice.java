package javaex.io.file;

import java.io.File;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) throws IOException {

        File f1 = new File("good.txt");
        f1.createNewFile();

        File f2 = new File("C:\\ODG\\workspace\\odgplayground\\src\\good.txt");

        f2.createNewFile();

        File goodFolder = new File("good");
        goodFolder.mkdir();

        System.out.println("f1 = "+ f1.isFile());
        System.out.println(new File("ggg").exists());

        System.out.println("f1.getAbsolutePath() = " + f1.getAbsolutePath());
        System.out.println("f2.getAbsolutePath() = " + f2.getAbsolutePath());

        System.out.println(f2.getParent());
    }
}
