package javaex.io.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileChar_Practice {

    public void fileSave() {
        try (FileWriter fw = new FileWriter("charPractice.txt")){
            fw.write("굿\n");
            fw.write("하이\n");
            fw.write("호잇\n");
            fw.write("ㅁㄴㅇㅁㄴㅇ\n");

            char[] arr = {'d', 'e', 'v', 'w', 'e' };

            fw.write(arr);
            fw.write(arr, 1, 4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileRead() {

        try (FileReader fr = new FileReader("charPractice.txt")){

            int value = 0;
            while ((value = fr.read()) != -1) {
                System.out.print((char)value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
