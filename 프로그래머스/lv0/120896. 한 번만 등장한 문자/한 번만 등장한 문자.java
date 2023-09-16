import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Character,Integer> frequencyMap = new HashMap<>();
        for(char c : s.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        List<Character> uniqueChars = new ArrayList<>();
        for(char c : frequencyMap.keySet()){
            if(frequencyMap.get(c)==1){
                uniqueChars.add(c);
            }
        }
        Collections.sort(uniqueChars);
        StringBuilder sb = new StringBuilder();
        for(char c : uniqueChars){
            sb.append(c);
        }
        return sb.toString();
    }
}