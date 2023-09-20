class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int num : array){
            sb.append(num);
        }
        String[] temp = sb.toString().split("");
        for(String str : temp){
            if(str.equals("7")){
                answer++;
            }
        }
        return answer;
    }
}