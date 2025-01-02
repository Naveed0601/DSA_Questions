package Thread;

/* What is a Thread?
   - A thread is the smallest unit of a program that can execute independently.
   Java provides built-in support for multithreading,
   allowing concurrent execution of multiple threads to improve the performance of a program.

   - Single Thread: Executes one task at a time.
   - Multithreading: Allows multiple tasks (threads) to run concurrently.
*/

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}


public class ThreadExamples {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
