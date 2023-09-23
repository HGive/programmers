class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];
        for(int[] line:lines){
            for(int i = line[0]+100;i<line[1]+100;i++){
                arr[i]++;
            }
        }
        for(int dot : arr){
            if(dot>1){
                answer++;
            }
        }
        return answer;
    }
}