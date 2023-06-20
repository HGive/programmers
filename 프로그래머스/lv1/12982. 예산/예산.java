import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0 ;
        int cnt = 0 ;
        for(int a : d){
            if(budget-sum>=a){
                sum+=a;    
                cnt++;
            }
        }
        return cnt;
    }
}