import java.util.*;
class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] str = number.split("");
        int[] num = new int[str.length];
        for(int i = 0 ; i<str.length;i++){
            num[i] = Integer.parseInt(str[i]);
            sum+=num[i];
        }
        
        return sum%9;
    }
}