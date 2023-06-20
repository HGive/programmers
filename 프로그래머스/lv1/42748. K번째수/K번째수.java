import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int l = commands.length;
        int[] answer = new int[l];
        for(int i = 0; i<l;i++){
            int[] temp = {};
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            for(int j = 0; j<commands[i].length;j++){
                temp = Arrays.copyOfRange(array,start-1,end);
                Arrays.sort(temp);
                answer[i]=temp[k-1];
            }
        }
        
        return answer;
    }
}