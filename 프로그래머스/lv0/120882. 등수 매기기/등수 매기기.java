import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int i = 0 ; i<score.length;i++){
            scoreList.add(score[i][0]+score[i][1]);
        }
        Collections.sort(scoreList,Collections.reverseOrder());
        int[] answer = new int[score.length];
        for(int i = 0 ; i<score.length;i++){
            answer[i] = scoreList.indexOf(score[i][0]+score[i][1])+1;
        }
        return answer;
    }
}