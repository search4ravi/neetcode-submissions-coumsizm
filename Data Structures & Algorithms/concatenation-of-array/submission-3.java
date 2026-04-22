class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + length] = nums[i];
        }
        return ans;
    }
}