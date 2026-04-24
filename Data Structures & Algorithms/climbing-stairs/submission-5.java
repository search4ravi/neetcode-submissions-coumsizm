class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n];
        for (int i = 0; i < n; i++) {
            cache[i] = -1;
        }
        return calc(n, 0);
    }

    public int calc(int n, int steps) {
        if (steps >= n)
            return steps == n ? 1 : 0;
        if (cache[steps] != -1)
            return cache[steps];
        return cache[steps] = calc(n, steps + 1) + calc(n, steps + 2);
    }
}
