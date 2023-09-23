class Solution {
    public int solution(int n) {
        int cnt=0;
        int num=1;
        while(n>cnt){
            if(num%3==0||String.valueOf(num).contains("3")){
                num++;
                continue;
            }
            cnt++;
            num++;
        }
        return num-1;
    }
}