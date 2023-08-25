import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        int newLeng = picture.length;
        StringBuilder sb = new StringBuilder();   
        String[] answer = new String[newLeng*k];
        int index = 0;
        for(String line : picture){
            for(char c : line.toCharArray()){
                for(int i = 0; i<k;i++){
                    sb.append(c);
                }
            }
            for(int i = 0 ;i<k; i++){
                answer[index++]=sb.toString();
            }
            sb.setLength(0);
        }
        
        
        return answer;
    }
}