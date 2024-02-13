package javaex.io.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileChar { // 문자 기반 스트림

    public void fileSave() {
        try(FileWriter fw = new FileWriter("char.txt")) {
            fw.write("ㅎㅇ여\n");
            fw.write("낼 시험이넹\n");
            fw.write("가볍게 넘어가잇\n");

            char[] chArr = {'하', '나', '둘', '셋'};
//            fw.write(chArr);
            for (char c : chArr) {
                fw.write(c+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void fileRead() {
        try(FileReader fr = new FileReader("char.txt")) {
            int value = 0;
            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
