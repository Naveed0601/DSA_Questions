package Priority_Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem2 {

    public List<Integer> MergeArrays(List<List<Integer>> nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (List<Integer> list : nums) {
            pq.addAll(list);
        }

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }

    public void printlist(List<Integer> result) {
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lists:");
        int k = scanner.nextInt();

        List<List<Integer>> nums = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            System.out.println("Enter the size of list " + (i + 1) + ": ");
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            System.out.println("Enter the elements of list " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                arr.add(scanner.nextInt());
            }
            nums.add(arr);
        }

        Problem2 solution = new Problem2();
        List<Integer> result = solution.MergeArrays(nums);

        System.out.print("Merged List: ");
        solution.printlist(result);

        scanner.close();
    }
}
