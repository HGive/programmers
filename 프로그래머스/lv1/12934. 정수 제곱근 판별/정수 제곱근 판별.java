
class Solution {
    public long solution(long n) {
        double i = Math.sqrt(n);
        
        return i%1==0?(long)Math.pow(i+1,2):-1;
    }
}