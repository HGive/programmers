import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        List<String> list = new ArrayList<>();
        Arrays.sort(parts);
        for(String str: parts){
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        
        return list.toArray(new String[0]);
    }
}