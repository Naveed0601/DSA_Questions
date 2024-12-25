package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in both lists:");
        int n = scanner.nextInt();

        System.out.println("Enter elements for the first list:");
        for (int i = 0; i < n; i++) {
            nums1.add(scanner.nextInt());
        }

        System.out.println("Enter elements for the second list:");
        for (int i = 0; i < n; i++) {
            nums2.add(scanner.nextInt());
        }

        // Sort the lists
        Collections.sort(nums1);
        Collections.sort(nums2);

        // Find common elements using two pointers
        int i = 0, j = 0;

        System.out.println("Common elements:");
        while (i < nums1.size() && j < nums2.size()) {
            if (nums1.get(i).equals(nums2.get(j))) {
                System.out.println(nums1.get(i));
                i++;
                j++;
            } else if (nums1.get(i) < nums2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
    }
}
