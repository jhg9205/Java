public class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println("thread1이 동작하고 있어요");
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();




    }
}
