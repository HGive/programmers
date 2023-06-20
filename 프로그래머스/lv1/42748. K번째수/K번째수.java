import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length;i++){
            int[] temp = {};
            for(int j = 0; j<commands[i].length;j++){
                temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
                Arrays.sort(temp);
                answer[i]=temp[commands[i][2]-1];
            }
        }
        
        return answer;
    }
}