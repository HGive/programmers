class Solution {
    public int solution(long num) {
        int cnt = 1;
        if(num==1) return 0;
        while(cnt<=500){
        num=num%2==0?num/2:num*3+1;
            if(num==1){
                return cnt;
            }
            cnt++;
        }
        return -1;
    }
}