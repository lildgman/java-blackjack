package javaex.io.stream;

import java.io.*;

public class DecoratorStream_Practice {

    public void fileSave() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffer_practice.txt"))){
            bw.write("아아아아아아\n");
            bw.write("rrrrr\n");
            bw.write("wwwww\n");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void fileRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("buffer_practice.txt"))){

            String value = null;
            while ((value = br.readLine()) != null) {
                System.out.println(value);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void objectSave() {
        Product p1 = new Product("qq", 2000);
        Product p2 = new Product("aa", 3000);
        Product p3 = new Product("ss", 4000);
        Product p4 = new Product("ww", 5000);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product_practice.txt"))) {
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.writeObject(p4);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void objectRead() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product_practice.txt"))) {
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("파일을 모두 읽었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
