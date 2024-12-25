package Queues_and_Stacks;

import java.util.*;

public class Queues_and_Stacks {

    // Function to find the first negative integer in every window of size k
    public static void printFirstNegativeInteger(int[] arr, int n, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            // If the current element is negative, add it to the deque
            if (arr[i] < 0) {
                dq.add(i);
            }
        }

        // Now slide the window
        for (int i = k; i < n; i++) {
            // If deque is not empty, the first element is the first negative number in the window
            if (!dq.isEmpty()) {
                System.out.print(arr[dq.peek()] + " ");
            } else {
                System.out.print("0 ");
            }

            // Remove the elements which are out of the window
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                System.out.println("check" + dq.peek());
                dq.poll();
            }

            // Add the current element index if it's negative
            if (arr[i] < 0) {
                dq.add(i);
            }
        }

        // Print the first negative integer for the last window
        if (!dq.isEmpty()) {
            System.out.print(arr[dq.peek()] + " ");
        } else {
            System.out.print("0 ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;

        printFirstNegativeInteger(arr, n, k);
    }
}

