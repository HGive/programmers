class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling){
            str = str.replace("aya"," ").replace("ye"," ").replace("woo"," ").replace("ma"," ");
            if(str.trim().isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}