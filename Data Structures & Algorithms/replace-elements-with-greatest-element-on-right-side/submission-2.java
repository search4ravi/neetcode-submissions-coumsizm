class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];

        for(int i=0; i<length; i++) {
            int rightMax=-1;
            for(int j=i+1; j<length; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            result[i] = rightMax;
        }

        return result;
        
    }
}