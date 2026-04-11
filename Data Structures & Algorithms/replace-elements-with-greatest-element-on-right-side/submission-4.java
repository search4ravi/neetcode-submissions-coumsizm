class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        int rightMax=-1;
        for(int i=length-1; i>=0; i--) {
            result[i] = rightMax;
       
            rightMax = Math.max(rightMax, arr[i]);
        }
        return result;
    }
}