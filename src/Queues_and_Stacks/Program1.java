package Queues_and_Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program1 {
    public static void main (String [] args){
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            q.offer(scanner.nextInt());
        }

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }
    }
}
