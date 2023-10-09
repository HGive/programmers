import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i = 0 ;i<score.length;i++){
            hm.computeIfAbsent(score[i][0]+score[i][1], k -> new ArrayList<>()).add(i+1);
        }
        List<Integer> sortedScores = new ArrayList<>(hm.keySet());
        Collections.sort(sortedScores, Collections.reverseOrder());
        
        int rank = 1;
        for(int totalScore : sortedScores){
            List<Integer> students = hm.get(totalScore);
            for(int student : students){
                answer[student-1]=rank;
            }
            rank+= students.size();
        }
        return answer;
    }
}