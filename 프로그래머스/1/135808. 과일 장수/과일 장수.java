import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        if(score.length<m)return 0;
        int answer = 0;
        List<Integer> scoreList = new ArrayList<>();
        for(int num : score){
            scoreList.add(num);
        }
        Collections.sort(scoreList,Collections.reverseOrder());
        for(int i = m-1 ; i<score.length;i+=m){
            answer+=scoreList.get(i)*m;
        }
        return answer;
    }
}