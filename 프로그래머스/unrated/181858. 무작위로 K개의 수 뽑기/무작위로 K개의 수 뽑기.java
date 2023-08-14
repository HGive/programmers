import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        HashSet<Integer> hs = new HashSet<>();
        int idx = 0;
        for(int i = 0 ;i < arr.length ;i++ ){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
                answer[idx++]=arr[i];
                if(idx==k){break;}
            }
        }
        for(int i = idx ; i<k;i++){
            answer[i]= -1;
        }
        return answer;
    }
}