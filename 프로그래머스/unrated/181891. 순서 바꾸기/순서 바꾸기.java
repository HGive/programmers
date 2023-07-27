import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int j = 0 ;
        int[] answer = new int[num_list.length];
        int[] back = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] front = Arrays.copyOfRange(num_list, 0, n);
        for(int i = 0; i<back.length;i++){
            answer[i]=back[i];
        }
        for(int i = back.length; i<answer.length;i++){
            answer[i]=front[j];
            j++;
        }
        return answer;
    }
}