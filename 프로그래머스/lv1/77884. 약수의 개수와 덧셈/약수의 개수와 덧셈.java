import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        Map<Integer,Boolean> hm = new HashMap<>();
        for(int i = left ; i<=right;i++){
            int cnt = 0;
            boolean flag = true;
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }   
            if(cnt%2==0){
                    flag = true;
                }else{
                    flag = false;
            }
            hm.put(i,flag);
        }
        for(Map.Entry<Integer,Boolean> entry : hm.entrySet()){
            if(entry.getValue()){
                answer+=entry.getKey();
            }else{
                answer-=entry.getKey();
            }
        }
        return answer;
    }
}