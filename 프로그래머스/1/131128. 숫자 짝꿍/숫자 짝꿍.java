import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pqX = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqY = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<X.length();i++){
            pqX.offer(X.charAt(i)-'0');
        }
        for(int i = 0 ; i<Y.length();i++){
            pqY.offer(Y.charAt(i)-'0');
        }
        while(!pqX.isEmpty() && !pqY.isEmpty()){
            int numX = pqX.peek();
            int numY = pqY.peek();
            if(numX==numY){
                sb.append(pqX.poll());
                pqY.poll();
            }else if(numX>numY){
                pqX.poll();
            }else{
                pqY.poll();
            }
        }
        if(sb.toString().equals("")){
            return "-1";
        }else if(sb.toString().startsWith("0")){
            return "0";
        }
        return sb.toString();
    }
}
