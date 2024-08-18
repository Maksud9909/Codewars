package infinBank;

public class Test1 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Test1 test1 = new Test1();
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test1);
        thread1.start();
        thread2.start();

        thread2.join();
        thread2.join();
        System.out.println(test1.getNum());
    }


    volatile int num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            num++;
        }
    }

    public int getNum() {
        return num;
    }
}