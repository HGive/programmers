import java.util.*;
class Solution {
    public long solution(long n) {
        String temp = "";
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String a : str){
            temp+=a;
        }
        
        return Long.parseLong(temp);
    }
}