import java.util.*;
class Solution {
    public int[] solution(int n) {
     int[] temp = new int[n];
        int index = 0;
        for(int i = 1 ; i<=n ; i++){
            if(n%i==0){
                temp[index]=i;
                index++;
            }
        }
         
        return Arrays.copyOf(temp,index);
    }
}