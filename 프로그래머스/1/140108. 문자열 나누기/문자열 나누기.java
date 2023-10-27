class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int answer = 1;
        int first = 0;
        int diff = 0;
        for(int i = 0 ; i < s.length()-1 ; i++){
            if(x!=s.charAt(i)){
                diff++;
            }else{
                first++;
            }
            if(first == diff){
                answer++;
                x=s.charAt(i+1);
            }
        }
        return answer;
    }
}