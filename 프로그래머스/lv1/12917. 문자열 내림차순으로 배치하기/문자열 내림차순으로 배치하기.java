import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
            char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char c : ch){
            sb.append(c);
        }
        return sb.reverse().toString();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            // String answer = "";
            // String[] temp = s.split("");
            // Arrays.sort(temp,Collections.reverseOrder());
            // for(String str :temp){
            //     answer+=str;
            // }
            // return answer;
        }
}