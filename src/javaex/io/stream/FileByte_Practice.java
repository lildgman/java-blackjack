package javaex.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByte_Practice {

    public void fileSave() {

        try {
            FileOutputStream fos = new FileOutputStream("gogo.txt");

            fos.write(97);
            fos.write('p');

            byte[] arr = {'p', 100, 111, 105};

            fos.write(arr);
            fos.write(arr, 0, 2);

            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileRead() {
        try (FileInputStream fis = new FileInputStream("gogo.txt")) {

            while (true) {
                int value = fis.read();
                if (value != -1) {
                    System.out.println((char) value);
                } else {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
