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
        
        answer[0]=7-zeroCnt-matchCnt;
        answer[1]=7-matchCnt;
        
        if(answer[0]>6){
            answer[0]=6;
        }
        if(answer[1]>6){
            answer[1]=6;
        }
        return answer;
    }
}