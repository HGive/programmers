import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ;i<arr.length;i++){
            if(stk.isEmpty()){
                stk.push(arr[i]);
                continue;
            }
            if(stk.peek()==arr[i]){
                stk.pop();
            }else{
                stk.push(arr[i]);
            }    
        }
        if (stk.isEmpty()) {
            return new int[]{-1};
        }

        // stk을 int 배열로 변환해서 return
        int[] result = new int[stk.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stk.get(i);
        }
        return result;
    }
}