import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] temp = new boolean[n+1];
        Arrays.fill(temp,true);
        temp[0]=false;
        temp[1]=false;
        for(int i =2 ; i<=Math.sqrt(n);i++){
            if(!temp[i])continue;
            for(int j = 2*i; j<=n ; j+=i){
                temp[j]=false;
            }
        }
        for(boolean prime : temp){
            if(prime)answer++;
        }
        return answer;
    }
}