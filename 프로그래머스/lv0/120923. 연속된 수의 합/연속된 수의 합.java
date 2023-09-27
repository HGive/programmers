class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int check = num*(num+1)/2;
        int start = (total-check)/num+1;
        for(int i = 0 ; i<num;i++){
            answer[i]= start++;
        }
        return answer;
    }
}