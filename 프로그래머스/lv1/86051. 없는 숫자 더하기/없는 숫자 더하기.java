import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i = 0 ; i<10;i++){
            sum+=i;
        }
        for(int i : numbers){
            sum-=i;
        }
        return sum;
    }
}