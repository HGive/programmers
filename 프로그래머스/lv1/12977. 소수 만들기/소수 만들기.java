import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0 ;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length;j++){
                for(int k = j+1; k<nums.length;k++){
                    temp = nums[i]+nums[j]+nums[k];
                    if(isPrime(temp)){
                        answer++;
                    }
            }
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(int num){
        boolean flag = true;
        if(num==2){
            return true;
        }
        for(int i = 3; i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return flag;
    }
}