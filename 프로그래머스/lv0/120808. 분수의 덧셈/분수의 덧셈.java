class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2+numer2*denom1;
        int denom = denom1*denom2;
        int gcdNum = gcd(numer,denom);
        int[] answer = new int[2];
        answer[0] = numer / gcdNum;
        answer[1] = denom / gcdNum;
        return answer;
    }
    
    public int gcd(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}