package HashMap_And_HashSet;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: sum = 0, count = 1
        int count = 0, sum = 0;

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                System.out.println(map.get(sum - k));
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays: " + count);
    }
}
