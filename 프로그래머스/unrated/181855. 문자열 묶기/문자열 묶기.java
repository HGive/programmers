import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] intArr = new int[strArr.length];
        HashMap<Integer,Integer> countMap = new HashMap<>();
        
        for(int i = 0; i<strArr.length;i++){
            intArr[i]=strArr[i].length();
        }
        for (int num : intArr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int mostFrequentInt= intArr[0];
        int mostFrequentCount = countMap.get(mostFrequentInt);
        
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count > mostFrequentCount) {
                mostFrequentInt = num;
                mostFrequentCount = count;
            }
        }
        
        return mostFrequentCount;
    }
}