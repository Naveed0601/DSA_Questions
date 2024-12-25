package Arrays;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {

    public static ArrayList<Integer> RotateArray(ArrayList<Integer> nums , int k){
        ArrayList<Integer> temp = new ArrayList<>(nums);
        for(int i = 0; i < nums.size(); i++){
            nums.set((i + k) % nums.size(), temp.get(i));
        }
        return nums;
    }

    public static void main (String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        System.out.println("Enter , How many time array should rotate");
        int k = scanner.nextInt();
        System.out.println("Enter Elements");

        for(int i = 0; i < n; i++){
            nums.add(scanner.nextInt());
        }

        ArrayList<Integer> result = RotateArray(nums , k);

        for(int i = 0;  i < result.size();i++){
            System.out.println(result.get(i));
        }
        // your code goes here
    }
}
