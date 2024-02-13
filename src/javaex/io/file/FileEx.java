package javaex.io.file;

import java.io.File;
import java.io.IOException;

public class FileEx { // 파일 만들기
    public static void main(String[] args) throws IOException {

        // 경로지정 안할 때
        File f1 = new File("test.txt");

        // 경로지정 시
        File f2 = new File("C:\\ODG\\workspace\\odgplayground\\src\\test.txt");

        f1.createNewFile();
        f2.createNewFile();

        // 폴더 생성
        File tmpFolder = new File("C:\\ODG\\workspace\\odgplayground\\src\\tmp");
        tmpFolder.mkdir();

        File f3 = new File("C:\\ODG\\workspace\\odgplayground\\src\\tmp\\test.txt");
        f3.createNewFile();

        System.out.println("f1.exists() = "+f1.exists());
        System.out.println(new File("ggg.txt").exists());

        System.out.println("f1 file ? "+f1.isFile());
        System.out.println("tmpFolder ? " + tmpFolder.isFile());

        System.out.println("=================================================");

        File folder = new File("parent");
        folder.mkdir();

        File file = new File("parent\\child.txt");
        file.createNewFile();

        System.out.println("folder = " + folder.getName());
        System.out.println("file = " + file.getName());

        System.out.println("절대경로 = " + file.getAbsolutePath());
        System.out.println("파일용량 = " + file.length());
        System.out.println("상위폴더 = " + file.getParent());

    }
}
