class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length%2==0){
            
        }
        for(int i = arr.length%2==0?1:0 ; i<arr.length; i+=2){
            arr[i]+=n;
        }
        return arr;
    }
}