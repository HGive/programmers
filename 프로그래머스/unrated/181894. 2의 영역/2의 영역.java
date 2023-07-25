class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==2){
                start=i;
                break;
            }
        }
        if(start==-1){
            int[] ans = new int[1];
            ans[0]=-1;
            return ans;
        }
        for(int i = arr.length-1 ; i>=0;i--){
            if(arr[i]==2){
                end=i;
                break;
            }
        }
        int[] answer = new int[end-start+1];
        for(int i =0  ; i<answer.length ;i++){
            answer[i]=arr[start];
            start++;
        }
        
        return answer;
    }
}