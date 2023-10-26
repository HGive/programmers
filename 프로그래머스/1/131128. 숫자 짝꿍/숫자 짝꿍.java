import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] xFrequency = {0,0,0,0,0,0,0,0,0,0};
        int[] yFrequency = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i<X.length();i++){
            xFrequency[X.charAt(i)-'0']++;
        }
        for(int i = 0; i<Y.length();i++){
            yFrequency[Y.charAt(i)-'0']++;
        }
        for(int i = 9 ; i>=0; i--){
            for(int j = 0 ; j<Math.min(xFrequency[i],yFrequency[i]);j++){
                sb.append(i);
            }
        }
        if(sb.toString().equals("")){
            return "-1";
        }else if(sb.toString().startsWith("0")){
            return "0";
        }
        return sb.toString();
    }
}