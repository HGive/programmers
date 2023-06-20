class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int lcm = Math.max(m,n);
        for(int gcd=Math.max(n,m) ;gcd>=1;gcd--){
            if(n%gcd==0&&m%gcd==0){
                answer[0]=gcd;
                break;
            }
        }
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
}