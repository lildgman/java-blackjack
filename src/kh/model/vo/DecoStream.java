package kh.model.vo;

import java.io.*;

public class DecoStream {

    public void fileSave(String fileName) {
        Food food = new Food("사과", 20);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(food);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//
//public void fileRead(String fileName) {
//    try {
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
//        while (true) {
//            System.out.println(ois.readObject());
//        }
//
//    } catch (EOFException e) {
//        System.out.println("qd");
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    } catch (ClassNotFoundException e) {
//        throw new RuntimeException(e);
//    }
//}
