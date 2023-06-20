import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0 ;
        for(int a : d){
            budget-=a;
            if(budget<0)break;
            cnt++;
        }
        return cnt;
    }
}