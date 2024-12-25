package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Program2 {
    public static void main (String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            nums.add(scanner.nextInt());
        }

        System.out.println("Original Array");
        for(int i =0; i < n; i++){
            System.out.println(nums.get(i));
        }

        System.out.println("Reverse Array");
        for(int i = n - 1; i >= 0; i--) {
            System.out.println(nums.get(i));
        }

        System.out.println("Another Approach");
        Collections.reverse(nums);

        for(int x : nums){
            System.out.println(x);
        }
    }
}
