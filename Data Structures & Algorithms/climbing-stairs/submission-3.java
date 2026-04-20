class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int[] result = new int[n + 1];
        result[1] = 1;
        result[2] = 2;

        for (int step = 3; step <= n; step++) {
            result[step] = result[step - 1] + result[step - 2];
        }
        return result[n];
    }
}
