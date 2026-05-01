class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        int x = 0;
        int y = 0;
        int z = 0;

        while (x < m && y < n) {
            if (temp[x] <= nums2[y]) {
                nums1[z++] = temp[x++];
            } else {
                nums1[z++] = nums2[y++];
            }
        }

        while (x < m) {
            nums1[z++] = temp[x++];
        }
        while (y < n) {
            nums1[z++] = nums2[y++];
        }
    }
}