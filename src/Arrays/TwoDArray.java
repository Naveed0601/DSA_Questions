package Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] nums = {
                {1 , 2 , 3},
                {4 , 5 , 6},
                {7 , 8 , 9}
        };
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
