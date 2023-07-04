import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        
        List<Integer> list = new ArrayList<>();
        int s =1;
        while(k*s<=n){
            list.add(k*s);
            s++;
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}