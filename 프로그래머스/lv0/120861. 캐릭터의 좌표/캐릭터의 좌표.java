class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0,0};
        int boarderX = board[0]/2;
        int boarderY = board[1]/2;
        for(String direct : keyinput){
            if(direct.equals("up")){
                answer[1]=answer[1]<boarderY?answer[1]+1:answer[1];
            }else if(direct.equals("down")){
                answer[1]=answer[1]>-boarderY?answer[1]-1:answer[1];
            }else if(direct.equals("right")){
                answer[0]=answer[0]<boarderX?answer[0]+1:answer[0];
            }else if(direct.equals("left")){
                answer[0]=answer[0]>-boarderX?answer[0]-1:answer[0];
            }
        }
        return answer;
    }
}