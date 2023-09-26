class Solution {
    public int solution(int a, int b) {
        int common = gcd(a,b);
        b= b/common;
        if(b==1||b==2||b==5)return 1;
        while(b%2==0){
        b/=2;
        }
        while(b%5==0){
        b/=5;
        }
        return b==1?1:2;
    }
    
    public int gcd(int a , int b){
        if(b==0)return a ;
        return gcd(b, a%b);
    }
}