import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stk = new Stack<>();
        int cnt=0;
        for(int i = 0 ; i<moves.length;i++){
            for(int j = 0; j<board.length;j++){
                if(board[j][moves[i]-1]==0)continue;
                if(stk.isEmpty()){
                    stk.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1]=0;
                    break;
                }
                else if(stk.peek()!=board[j][moves[i]-1]){
                    stk.push(board[j][moves[i]-1]);    
                    board[j][moves[i]-1]=0;
                    break;
                }else if(stk.peek()==board[j][moves[i]-1]){
                    board[j][moves[i]-1]=0;
                    stk.pop();
                        cnt++;
                    break;
                }
            }
        }
        return cnt*2;
    }
}