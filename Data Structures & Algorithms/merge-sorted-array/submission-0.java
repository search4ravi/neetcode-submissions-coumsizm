class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int x = 0; x < m; x++) {
            temp[x] = nums1[x];
        }
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[k] = temp[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            nums1[k] = temp[i];
            i++;
            k++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}