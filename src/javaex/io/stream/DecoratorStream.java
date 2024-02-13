package javaex.io.stream;

import java.io.*;

public class DecoratorStream {

    public void fileSave() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"))){
            bw.write("ㅎㅇ요\n");
            bw.write("감사합니다");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileRead() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("buffer.txt"));

            String value = null;
            while ((value = br.readLine()) != null) {
                System.out.println(value);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void objectSave() {
        Product product1 = new Product("아이폰", 200000);
        Product product2 = new Product("갤럭시", 150000);
        Product product3 = new Product("모토로라", 100000);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));

            oos.writeObject(product1);
            oos.writeObject(product2);
            oos.writeObject(product3);

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

    public void objectRead() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.txt"))) {
            while (true) {
                System.out.println(ois.readObject());
            }
        }catch (EOFException e){
            System.out.println("파일을 모두 읽었습니다");
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
