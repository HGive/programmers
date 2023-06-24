import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        int l = my_string.length();
        String[] answer = new String[l];
        for(int i =0; i<l;i++){
            answer[i]=my_string.substring(l-i-1);
        }
        Arrays.sort(answer);
        return answer;
    }
}