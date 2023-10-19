import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> sk1 = new Stack<>();
        Stack<String> sk2 = new Stack<>();
        for(int i = cards1.length-1;i>=0;i--){
            sk1.push(cards1[i]);
        }
        for(int i = cards2.length-1;i>=0;i--){
            sk2.push(cards2[i]);
        }
        for(int i = 0 ; i<goal.length;i++){
            if(!sk1.isEmpty()&&goal[i].equals(sk1.peek())){
                sk1.pop();
                continue;
            }else if(!sk2.isEmpty()&&goal[i].equals(sk2.peek())){
                sk2.pop();
                continue;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}