package gfg.threading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is the overridden run()");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("This is from the main function");
    }
}
