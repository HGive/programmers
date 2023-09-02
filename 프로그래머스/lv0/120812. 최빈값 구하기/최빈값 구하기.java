import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int arr : array){
            hm.put(arr,hm.getOrDefault(arr,0)+1);
        }
        int max= 0;
        int answer = 0;
        int maxCount = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>max){
                max = value;
                answer = key;
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == max) {
                maxCount++;
            }
        }
        return maxCount>1?-1:answer;
    }
}