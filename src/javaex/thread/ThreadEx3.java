package javaex.thread;

public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1("Thread1");
        ThreadEx3_2 t2 = new ThreadEx3_2("Thread1");

        t1.start();
        t2.start();

    }
}
