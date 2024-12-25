package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Maximum_Subarray {

    public static int MaximumSubarray(ArrayList<Integer> nums) {

        int maxi = nums.get(0); // Current maximum subarray sum
        int sum = nums.get(0);  // Global maximum subarray sum

        for (int i = 1; i < nums.size(); i++) {
            // Update the current maximum sum
            maxi = Math.max(nums.get(i), maxi + nums.get(i));
            // Update the global maximum sum
            sum = Math.max(sum, maxi);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        int result = MaximumSubarray(nums);
        System.out.println("Maximum Subarray Sum: " + result);

        scanner.close();
    }
}
