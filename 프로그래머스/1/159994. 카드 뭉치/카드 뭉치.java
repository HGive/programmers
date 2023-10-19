import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        for(String str : cards1){
            q1.offer(str);
        }
        for(String str : cards2){
            q2.offer(str);
        }
        for(int i = 0 ; i<goal.length;i++){
            if(goal[i].equals(q1.peek())){
                q1.poll();
                continue;
            }else if(goal[i].equals(q2.peek())){
                q2.poll();
                continue;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}