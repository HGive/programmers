import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx=0;
        int[] answer = new int[num_list.length];
        for(int i = n ; i<num_list.length;i++){
            answer[idx]= num_list[i];
            idx++;
        }
        for(int i = 0 ; i<n;i++){
            answer[idx]= num_list[i];
            idx++;
        }
        return answer;
    }
}