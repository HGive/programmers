
class Solution {
    public int solution(int[] array, int n) {
        int differ = 100;
        int answer = array[0];
        for(int num : array){
            if(Math.abs(n-num)<differ){
                differ = Math.abs(n-num);
                answer = num;
            }else if(Math.abs(n-num)==differ){
               answer = Math.min(answer,num);
            }       
        }
        return answer;
    }
}