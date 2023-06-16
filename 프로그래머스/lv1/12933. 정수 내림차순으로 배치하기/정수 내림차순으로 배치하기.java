import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = "";
        String s = ""+n;
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String a : str){
            temp+=a;
        }
        
        return Long.parseLong(temp);
    }
}