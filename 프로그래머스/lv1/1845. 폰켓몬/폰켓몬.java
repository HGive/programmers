import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt =0;
        ArrayList<Integer> container =new ArrayList<>();
        
            for(int i = 0 ; i<nums.length;i++){
                if(!container.contains(nums[i])&&cnt<nums.length/2){
                    container.add(nums[i]);
                    cnt++;
                }
            }
            
        
        return cnt;
    }
}