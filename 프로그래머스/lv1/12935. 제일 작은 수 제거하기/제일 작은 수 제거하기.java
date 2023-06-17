import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1){
            arr[0] = -1;
            return arr;
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            for(int a : arr){
                list.add(a);
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