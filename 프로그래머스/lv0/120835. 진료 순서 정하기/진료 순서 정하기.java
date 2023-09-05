import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<emergency.length;i++){
            map.put(emergency[i],i);
        }
        Arrays.sort(emergency);
        int[] answer = new int[emergency.length];
        for(int i = 0 ;i < answer.length ; i++){
            answer[map.get(emergency[i])]=emergency.length-i;
        }
        return answer;
    }
}