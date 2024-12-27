package Recursion;

class TargetSum {
    public int TotalExpression(int[] nums, int target , int size , int index, int sum){
        if(size == index){
            if(sum == target) return 1;
            else return 0;
        }

        int plus = TotalExpression(nums, target, size, index + 1, sum + nums[index]);
        int minus = TotalExpression(nums, target, size, index + 1, sum - nums[index]);

        return plus + minus;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int size = nums.length;
        return TotalExpression(nums , target , size , 0 , 0);
    }
}
