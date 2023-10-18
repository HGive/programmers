import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> nameScore = new HashMap<>();
        for(int i = 0 ; i<name.length;i++){
            nameScore.put(name[i],yearning[i]);
        }
        for(int j = 0 ;j<photo.length;j++){
            int sum = 0;
            for(String n : photo[j]){
                if(nameScore.get(n)!=null){
                sum+=nameScore.get(n);    
                }
            }
            answer[j]=sum;
        }
        return answer;
    }
}