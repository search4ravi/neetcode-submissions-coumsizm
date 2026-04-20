class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int last = 1;
        int secondLast = 2;

        for (int i = 3; i <= n; i++) {
            int temp = last + secondLast;
            last = secondLast;
            secondLast = temp;
        }

        return secondLast;
    }
}
