package Thread;

class MyRunnable implements Runnable {
    public void run(){
        System.out.println("THread is running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        Runnable runner = new MyRunnable();
        Thread t1 = new Thread(runner);
        t1.start();
//        Thread t1 = new Thread(new MyRunnable());
//        t1.start();
    }
}
