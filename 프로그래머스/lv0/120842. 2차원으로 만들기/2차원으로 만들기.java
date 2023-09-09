class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length/n;
        int idx = 0;
        int[][] answer = new int[length][n];
        for(int i = 0 ; i<length;i++){
            for(int j =0; j<n;j++){
                answer[i][j]=num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}