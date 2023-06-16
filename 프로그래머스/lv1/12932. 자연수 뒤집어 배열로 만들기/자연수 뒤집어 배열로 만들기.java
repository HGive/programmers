import java.util.*;
class Solution {
    public int[] solution(long n) {
             int cnt=0;
        long num =n;
        while(num!=0){
            num/=10;
            cnt++;
        }
        int[] answer = new int[cnt];
        num=n;
        for(int i =0;i<cnt;i++){
            answer[i]=(int)(num%10);
            num/=10;
        
    }
        return answer;
        
    }
}

