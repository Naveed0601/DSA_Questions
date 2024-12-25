package Priority_Queues;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if(k > n) System.out.println("-1");
        for(int i = 0; i < n; i++){
            pq.offer(scanner.nextInt());
        }
        while(k != 0){
            pq.poll();
            k--;
        }
        System.out.println(pq.peek());
    }
}
