package javaex.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByte { // 바이트 기반 스트림

    public void fileSave() {
        try(FileOutputStream fos = new FileOutputStream("fileByte.txt")) {
            fos.write(97);
            fos.write('b');
//            fos.write('오'); // 깨짐

            byte[] byArr = {101, 102, 103};

            fos.write(byArr);

            fos.write(byArr, 0, 2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileRead() {
        try(FileInputStream fis = new FileInputStream("fileByte.txt")) {

            while (true) {
                int value = fis.read();
                if (value != -1) {
                    System.out.println((char) value);
                } else {
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
