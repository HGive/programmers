import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        String al = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ;i<skip.length();i++){
            al = al.replace(Character.toString(skip.charAt(i)),"");
        }
        for(int i = 0 ; i<s.length();i++){
            int idx =  al.indexOf(s.charAt(i))+index;
            if(idx>=al.length()){
                sb.append(al.charAt(idx%al.length()));
            }else{
                sb.append(al.charAt(idx));
            }
        }
        return sb.toString();
    }
}