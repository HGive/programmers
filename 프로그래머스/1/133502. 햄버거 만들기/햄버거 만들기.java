import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stk = new Stack<>();
        int burger = 0;
        for(int num : ingredient){
            stk.push(num);
            if(stk.size()>=4){
                if(stk.get(stk.size()-4)==1&&
                   stk.get(stk.size()-3)==2&&
                   stk.get(stk.size()-2)==3&&
                   stk.get(stk.size()-1)==1){
                    for(int i = 0;i<4;i++){
                        stk.pop();
                    }
                    burger++;
                }
            }
        }
        
        return burger;
    }
}