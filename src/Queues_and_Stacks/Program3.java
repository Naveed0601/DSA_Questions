package Queues_and_Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program3 {

    public static void generateBinaryNumbers(int n){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i = 0; i < n; i++){
            String CurrentBinary = q.peek();
            q.poll();

            System.out.println(CurrentBinary + " ");

            q.offer(CurrentBinary + "0");
            q.offer(CurrentBinary + "1");

        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The First " + n + "Binary Numbers are");
        generateBinaryNumbers(n);
    }
}
