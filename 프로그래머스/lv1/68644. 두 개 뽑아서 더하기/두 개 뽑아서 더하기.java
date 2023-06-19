import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       int idx=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i<numbers.length;i++){
            for(int j = i+1; j<numbers.length;j++){
                hs.add(numbers[i]+numbers[j]);
            }
        }
         Iterator iter = hs.iterator();	
         int[] answer = new int[hs.size()];
        for(Integer i : hs){
            answer[idx]=(int)i;
            idx++;
        }
        // while(iter.hasNext()){
        //     answer[idx]=(int)iter.next();
        //     idx++;
        // }
        Arrays.sort(answer);
        return answer;
    }
}