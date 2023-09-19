class Solution {
    public int solution(int i, int j, int k) {
        int answer=0;
        StringBuilder sb = new StringBuilder();
        for(int start = i; start<=j;start++){
            sb.append(String.valueOf(start));
        }
        String[] numStr = sb.toString().split("");
        for(String num : numStr){
            if(num.equals(k+"")){
                answer++;
            }
        }
        return answer;
    }
}