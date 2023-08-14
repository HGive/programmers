import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("");
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(String str : parts){
            if(!str.matches("[abc]")){
                sb.append(str);
            }else{
                if(sb.length()!=0){
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        list.add(sb.toString());
        if(list.get(0).equals("")){
            list.set(0,"EMPTY");
        }
        return list.toArray(new String[0]);
    }
}