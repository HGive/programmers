class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
            while(n>0){
                sb.append(String.valueOf(n%3));
                n/=3;
            }
            return Integer.parseInt(sb.toString(),3);
        
        
        
        
//         int answer = 0;
//         String temp= "";
//         while(n>0){
//             temp=temp + n%3 ;
//             n/=3;
//         }
//          // temp = "0021"
//         answer = Integer.parseInt(temp, 3);

//         return answer;
    }
}