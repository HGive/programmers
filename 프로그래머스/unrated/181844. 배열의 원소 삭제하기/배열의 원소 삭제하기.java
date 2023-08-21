import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        
        for(int delete : delete_list){
            int index = Arrays.binarySearch(arr, delete);
            if(index>=0){
                list.remove(Integer.valueOf(delete));
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}