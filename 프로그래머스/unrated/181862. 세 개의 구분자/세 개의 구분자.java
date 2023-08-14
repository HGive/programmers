import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(char ch : myStr.toCharArray()){
            if(ch != 'a' && ch != 'b' && ch != 'c'){
                sb.append(ch);
            }else{
                if(sb.length()!=0){
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
        }
        if (list.isEmpty() || list.get(0).equals("")) {
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}