class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;
        int y = 0;
        int dir = 0; //처음 시작은 우 
        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}}; //우, 하, 좌, 상
        for(int i = 1 ; i<=n*n;i++){
            answer[y][x] = i;
            int nextX = x + direction[dir][0];
            int nextY = y + direction[dir][1];
            if(0>nextX||nextX>=n||0>nextY||nextY>=n||answer[nextY][nextX]!=0){
                dir = (dir+1)%4;
                nextX = x + direction[dir][0];
                nextY = y + direction[dir][1];
            }
            x = nextX;
            y = nextY;
        }
        return answer;
    }
}