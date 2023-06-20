class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]= gcd(n,m);
        answer[1]= n*m/answer[0];
        // while(true){
        //     if(lcm%n==0&&lcm%m==0){
        //         answer[1]=lcm;
        //         break;
        //     }else{
        //         lcm++;
        //     }
        // }
        return answer;
    }
    public int gcd(int p, int q){
        if(q==0){return p;}
           return gcd(q,p%q);
    }
}