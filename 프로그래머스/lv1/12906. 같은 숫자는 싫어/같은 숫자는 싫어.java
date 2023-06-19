import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i = 0; i<arr.length-1;i++){
             if(list.get(i)==list.get(i+1)){
               continue;
                 
             }else{
                 list2.add(list.get(i));
             }
         }
        int[] answer = new int[list2.size()+1];
        for(int i= 0 ; i<list2.size();i++){
            answer[i]=list2.get(i);
        }
        answer[list2.size()]=list.get(list.size()-1);
        return answer;
    }
}