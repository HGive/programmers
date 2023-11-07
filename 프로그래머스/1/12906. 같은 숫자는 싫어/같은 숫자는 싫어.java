import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[arr.length-1]);
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(!stk.isEmpty() && stk.peek()!=arr[i]) {
                stk.push(arr[i]);
            }
        }
        int[] answer = new int[stk.size()];
        int idx = 0 ;
        while(!stk.isEmpty()){
            answer[idx]=stk.pop();
            idx++;
        }
        return answer;
    }
}