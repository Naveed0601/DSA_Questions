package Arrays;

class BestSightseeing {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;

        int[] ans = new int[n];

        ans[0] = values[0] + 0;

        for(int i = 1; i < n; i++){
            ans[i] = Math.max(ans[i - 1] , values[i] + i);
        }

        int result = 0;

        for(int i = 1; i < n; i++){
            int x = ans[i - 1];
            int y = values[i] - i;

            result = Math.max(result , x + y);
        }
        return result;
    }
}
