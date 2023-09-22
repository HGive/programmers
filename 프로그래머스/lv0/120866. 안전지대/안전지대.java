class Solution {
    public int solution(int[][] board) {
        int safeZone = 0;
        int len = board.length;
        int[][] dangerZone = new int[len][len];
        //배열 순회하면서 지뢰가 있는 곳 발견하면 markDanger()실행.
        for(int i = 0; i < len ; i++){
            for(int j =0; j<len ; j++){
                if(board[i][j]==1){
                    markDanger(dangerZone,i,j);
                }
            }
        }
        //dangerZone 순회하면서 안전지역 카운트
        for(int i = 0; i < len ; i++){
            for(int j =0; j<len ; j++){
                if(dangerZone[i][j]==0){
                    safeZone++;
                }
            }
        }
        return safeZone;
    }
    
    public void markDanger(int[][] dangerZone, int i , int j){
         int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
         int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
         int n = dangerZone.length;
         dangerZone[i][j]=1;
         for(int k = 0 ; k<8;k++){
             int x = j + dx[k];
             int y = i + dy[k];
             if(x>=0&&x<n&&y>=0&&y<n){
                 dangerZone[y][x]=1;
             }
         }
    }
}