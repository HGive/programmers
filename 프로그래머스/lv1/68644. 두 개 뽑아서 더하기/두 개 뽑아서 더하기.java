import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       int idx=0;
        HashSet<Integer> list = new HashSet<Integer>();
        for(int i = 0; i<numbers.length;i++){
            for(int j = i+1; j<numbers.length;j++){
                list.add(numbers[i]+numbers[j]);
            }
        }
         Iterator iter = list.iterator();	
         int[] answer = new int[list.size()];
        while(iter.hasNext()){
            answer[idx]=(int)iter.next();
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }
}