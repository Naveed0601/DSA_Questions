package Queues_and_Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program2 {

    public static void enqueue(Queue<Integer> q , int val){
        q.add(val);
        System.out.println("Enqueued " + val);
    }

    public static void dequeue(Queue<Integer> q){
        if(q.isEmpty()){
            System.out.println("The Queue is empty , cannot deque");
        }
        else{
            System.out.println("The Dequeue Element is " + q.peek());
            q.poll();
        }
    }

    public static void front(Queue<Integer> q){
        if(q.isEmpty()){
            System.out.println("The queue is empty , no front element");
        }
        else{
            System.out.println("The Front Element is " + q.peek());
        }
    }

    public static void empty(Queue<Integer> q){
        System.out.println("Queue is Empty " + q.isEmpty());
    }

    public static void main (String [] args){
        Queue<Integer> q = new LinkedList<>();
        enqueue(q , 20);
        enqueue(q , 1);
        enqueue(q, 30);

        dequeue(q);
        dequeue(q);

        front(q);
        empty(q);

    }

}
