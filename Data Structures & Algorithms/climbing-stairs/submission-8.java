class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n];
        for (int i = 0; i < n; i++) {
            cache[i] = -1;
        }
        return dps(n, 0);
    }

    public int dps(int n, int step) {
        if (step >= n)
            return step == n ? 1 : 0;
        if (cache[step] != -1)
            return cache[step];
        return cache[step] = dps(n, step + 1) + dps(n, step + 2);
    }
}
