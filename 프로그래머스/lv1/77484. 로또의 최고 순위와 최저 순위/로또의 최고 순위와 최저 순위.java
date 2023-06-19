import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i<win_nums.length;i++){
            list.add(win_nums[i]);
        }
        int zeroCnt = 0 ;
        int matchCnt = 0 ;
        for(int a : lottos){
            if(a==0){
                zeroCnt++;
            }else if(list.contains(a)){
                matchCnt++;
            }
        }
        
        answer[0]=Math.min(7-zeroCnt-matchCnt,6);
        answer[1]=Math.min(7-matchCnt,6);

        return answer;
    }
}