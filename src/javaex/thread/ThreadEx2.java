package javaex.thread;

public class ThreadEx2 implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {

        Thread t = new Thread(new ThreadEx2());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
            if (i == 5) {
                autoSave = true;
            }
        }

        System.out.println("프로그램 종료");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            if (autoSave) {
                autoSave();
            }
        }
    }

    private void autoSave() {
        System.out.println("작업파일이 자동저장 되었습니다.");
    }
}
