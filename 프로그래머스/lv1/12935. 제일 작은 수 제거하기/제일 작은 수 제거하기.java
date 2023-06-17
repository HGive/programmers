import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0] ;
        for(int i = 0 ; i < arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <arr.length;i++){
            if(arr[i]!=min){
                list.add(arr[i]);
            }else{
                continue;
            }
        }
        if(list.isEmpty()){list.add(-1);}
        int[] answer = new int[list.size()];
        for(int i = 0 ; i<answer.length;i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}