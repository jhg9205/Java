class WorkObject {
    public synchronized void methodA(){
        System.out.println("✔✔✔methodA() 실행");
        notify();
        try{
            wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized void methodB(){
        System.out.println("🎉🎉🎉methodB() 실행");
        notify();
        try{
            wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ThreadTest1 extends Thread{
    private WorkObject workObject;

    public ThreadTest1(WorkObject workObject){
        this.workObject = workObject;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadTest2 extends Thread{
    private WorkObject workObject;

    public ThreadTest2(WorkObject workObject){
        this.workObject = workObject;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadTest1 th1 = new ThreadTest1(sharedObject);
        ThreadTest2 th2 = new ThreadTest2(sharedObject);
        th1.start();
        th2.start();
    }
}
