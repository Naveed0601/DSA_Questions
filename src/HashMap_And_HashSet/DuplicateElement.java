package HashMap_And_HashSet;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DuplicateElement {
    public static ArrayList<Integer> FindDuplicateElement(ArrayList<Integer> nums){
    HashMap<Integer , Integer> mp = new HashMap<>();
    int n = nums.size();

    for(int i = 0; i < n; i++){
        mp.put(nums.get(i), mp.getOrDefault(nums.get(i), 0) + 1);
    }
    ArrayList<Integer> result = new ArrayList<>();
    for(Map.Entry<Integer , Integer> entry : mp.entrySet()){
        if(entry.getValue() >  1){
            result.add(entry.getKey());
        }
    }
    return result;
}

    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the number of element in an element");
        for(int i = 0; i < n; i++){
            nums.add(sc.nextInt());
        }
        ArrayList<Integer> result = FindDuplicateElement(nums);
        System.out.println(result);

    }
}
