class Solution {
    public int solution(int a, int b) {
        b/=gcd(a,b);
        while(b!=1){
            if(b%2==0){
                b/=2;
                continue;
            }
            if(b%5==0){
                b/=5;
                continue;
            }
            return 2;
        }
        return 1;
    }
    
    public int gcd(int a , int b){
        if(b==0)return a ;
        return gcd(b, a%b);
    }
}