import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hall = new ArrayList<>();
        int idx = 0;
        for(int num : score){
            hall.add(num);
            Collections.sort(hall,Collections.reverseOrder());
            if(hall.size()>=k){
                answer[idx++]=hall.get(k-1);
            }else{
                answer[idx++]=hall.get(hall.size()-1);
            }
        }
        return answer;
    }
}