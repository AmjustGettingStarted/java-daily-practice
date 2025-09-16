public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread("jeff");
        System.out.println("Name: " + t1.getName() + "Id: " + t1.getId());

        Thread t2 = new Thread(new Car(), "Car1");
        t2.start();

        String ans = new Thread(new Car(), "Car2 is the name").getName();
        System.out.println(ans);
    }

}

class Car extends Thread {
    @Override
    public void run() {
        System.out.println("Car is vroom vroom");

    }
}
