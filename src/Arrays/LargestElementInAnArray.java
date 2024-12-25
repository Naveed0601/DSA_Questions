package Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

class LargestElementInAnArray
{
    public static int LargestElement(ArrayList<Integer> nums){
        int n = nums.toArray().length;
        int maxi = Integer.MIN_VALUE;
        Collections.sort(nums);

        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi , nums.get(i));
        }
        return maxi;
    }

    public static void main (String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in an array");
        for(int i = 0; i < n; i++){
            nums.add(sc.nextInt());
        }
        int Result = LargestElement(nums);
        System.out.println(Result);
    }
}
