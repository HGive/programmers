class Solution {
    public int solution(int n) {
        if(n==2){
            return 2;
        }
        int answer=1;
        for(int i =1;i<=n;i++){
            answer*=i;
            if(answer>n){
                return i-1;
            }
        }
        return answer;
    }
}