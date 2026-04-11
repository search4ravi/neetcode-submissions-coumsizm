class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] result = new int[length *2];

        int pos=0;

        for(int i=0; i<result.length; i++){
            result[i] = nums[pos];
            if(pos == length-1){
                pos=0;
            }else{
                pos++;
            }

        }

        return result;
        
    }
}