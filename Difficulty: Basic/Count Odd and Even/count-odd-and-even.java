class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int len = arr.length;
        int[] result = {0,0};
        for (int i=0; i<len; i++){
            if(arr[i]%2==0){
                result[1]++;}
            else {
            result[0]++;}
        }
       return result;
    }
}