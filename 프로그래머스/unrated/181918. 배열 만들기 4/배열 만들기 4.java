import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        int idx = 0;
        while(idx<arr.length){
            if(stk.isEmpty()){
                stk.push(arr[idx]);
                idx++;
             }else if(stk.peek()<arr[idx]){
                 stk.push(arr[idx]);
                idx++;
             }else if(stk.peek()>=arr[idx]){
                 stk.pop();
             }
        }
        
        
        int[] answer = new int[stk.size()];
        for(int i =0;i<answer.length;i++){
            answer[answer.length-1-i]=stk.pop();
        }
        return answer;
    }
}
        // for(int a : arr){
        //     if(stk.isEmpty()){
        //         stk.push(a);
        //     }else if(!stk.isEmpty()&&stk.peek()<a){
        //         stk.push(a);
        //     }else if(!stk.isEmpty()&&stk.peek()>=a){
        //         stk.pop();
        //     }
        // }