import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr){
            if(a%divisor==0){
                list.add(a);
            }
        }

//         int[] answer = new int[list.size()];
        
//             int[] a = {-1};    
        
//             for(int i = 0 ; i<list.size();i++){
//             answer[i]=list.get(i);
//         }
       
        
        int[] a = {-1};  
        return list.isEmpty()? a:list.stream().mapToInt(i -> i).toArray();
    }
}