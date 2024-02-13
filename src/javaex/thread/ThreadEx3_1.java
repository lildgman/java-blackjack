package javaex.thread;

public class ThreadEx3_1 extends Thread {
    public ThreadEx3_1(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
