import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1){
            answer = new int[]{-1};
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < arr.length; i++){
                list.add(arr[i]);
            }
            list.remove(Collections.min(list));
            answer =new int[list.size()];
            for(int i = 0 ; i<list.size();i++){
                answer[i]=list.get(i);
            }
        }

        return answer;
    }
}