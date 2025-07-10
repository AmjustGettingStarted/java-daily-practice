package gfg.threading;

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is Runnable class!");
    }
}

public class RunnableClass {
    public static void main(String[] args) {
        MyThread2 thread2 = new MyThread2();
        Thread thread = new Thread(thread2);
        thread.start();
        System.out.println("Dis is the Main function");
    }
}
