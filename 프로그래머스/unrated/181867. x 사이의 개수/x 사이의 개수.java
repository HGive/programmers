import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list= new ArrayList<>();
        String[] parts = myString.split("x");
        for(String str : parts){
            list.add(str.length());
        }
        if(myString.endsWith("x")){
            list.add(0);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}