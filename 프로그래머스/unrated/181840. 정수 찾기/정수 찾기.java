import java.util.*;
class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int num : num_list){
            list.add(num);
        }
        
        return list.contains(n)?1:0;
    }
}