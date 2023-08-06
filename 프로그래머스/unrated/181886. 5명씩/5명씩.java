import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        int idx=0;
        int length =(int) Math.ceil(names.length/5.0);
        String[] answer = new String[length];
        for(int i = 0 ;i<names.length;i+=5){
            answer[idx++]=names[i];
        }
        return answer;
    }
}