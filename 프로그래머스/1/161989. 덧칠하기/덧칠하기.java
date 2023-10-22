import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        Queue<Integer> q = new LinkedList<>();
        for(int num : section){
            q.offer(num);
        }
        while(!q.isEmpty()){
            int temp = q.poll();
            if(temp>=start+m){
                start = temp;
                answer++;
            }
        }
        return answer;
    }
}