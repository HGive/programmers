import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] temp = new boolean[n+1];
        // Arrays.fill(temp,true);
        temp[0]=true;
        temp[1]=true;
        for(int i =2 ; i<=Math.sqrt(n);i++){
            if(temp[i])continue;
            for(int j = 2*i; j<=n ; j+=i){
                temp[j]=true;
            }
        }
        for(boolean prime : temp){
            if(!prime)answer++;
        }
        return answer;
    }
}