class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int gte=0;
        int max=0;
        int pos=0;
        int i=0;
        while( i<length-1) {
            for(int j=i+1; j<length-1; j++){
                if(arr[j] < arr[j+1]){
                    gte=arr[j+1];
                    if(gte>max){
                        max=gte;
                        pos=j+1;
                    }
                    
                }else {
                    gte=arr[j];
                    if(gte>max){
                        max=gte;
                        pos=j;
                    }
                }
                
            }
            if(max==0 && pos==0){
                max=arr[i+1];
                pos=i+1;
            }
            while(i<pos){
                arr[i]=max;
                i++;
            }
            max=0;
            pos=0;
        }
        arr[length-1] = -1;

        return arr;
        
    }
}