package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            nums.add(scanner.nextInt());
        }
        for(int i = 0; i < n; i++){
            System.out.println(nums.get(i));
        }
    }
}
