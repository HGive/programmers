import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> undoneList = new ArrayList<>();
        int leng =0;
        for(int i = 0; i<finished.length;i++){
            if(finished[i]==false){
                undoneList.add(todo_list[i]);
            }
        }
        return undoneList.toArray(new String[0]);
    }
}