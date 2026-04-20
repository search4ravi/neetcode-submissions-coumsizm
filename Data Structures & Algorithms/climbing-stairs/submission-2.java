class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n];
        for (int step = 0; step < n; step++) {
            cache[step] = -1;
        }
        return dfs(n, 0);
    }

    public int dfs(int n, int step) {
        if (step >= n)
            return step == n ? 1 : 0;
        if (cache[step] != -1)
            return cache[step];
        return cache[step] = dfs(n, step + 1) + dfs(n, step + 2);
    }
}
