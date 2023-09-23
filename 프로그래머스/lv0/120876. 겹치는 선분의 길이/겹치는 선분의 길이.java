import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer=0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int[] line :lines){
            for(int i = line[0];i<line[1];i++){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()>1){
                answer++;
            }
        }
        return answer;
        // int answer = 0;
        // int[] arr = new int[200];
        // for(int[] line:lines){
        //     for(int i = line[0]+100;i<line[1]+100;i++){
        //         arr[i]++;
        //     }
        // }
        // for(int dot : arr){
        //     if(dot>1){
        //         answer++;
        //     }
        // }
        // return answer;
    }
}