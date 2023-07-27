import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int index = 0;
        String direct = "";
        List<String> list = new ArrayList<>(Arrays.asList(str_list));
        if(!list.contains("l")&& !list.contains("r")){
            return answer;
        }
        for(int i =0; i<str_list.length ; i++){
            if(str_list[i].equals("l")||str_list[i].equals("r")){
                index = i;
                direct = str_list[i];
                break;
            }
        }
        if(direct.equals("l")){
            answer = Arrays.copyOfRange(str_list,0,index);    
        }else if(direct.equals("r")){
            answer = Arrays.copyOfRange(str_list,index+1,str_list.length);    
        }
        
        return answer;
    }
}