package Priority_Queues;

import java.util.*;

public class Problem3 {

    public static String rearrangeString(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(frequencyMap.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll();
            result.append(current.getKey());

            if (prev != null && prev.getValue() > 0) {
                maxHeap.offer(prev);
            }

            current.setValue(current.getValue() - 1);
            prev = current;
        }

        return result.length() == s.length() ? result.toString() : "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        String rearranged = rearrangeString(s);
        if (rearranged.isEmpty()) {
            System.out.println("Not possible to rearrange the string.");
        } else {
            System.out.println("Rearranged string: " + rearranged);
        }

        sc.close();
    }
}
