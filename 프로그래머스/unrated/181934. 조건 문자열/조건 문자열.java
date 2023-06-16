class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch(ineq){
                case ">": 
                    if(eq.equals("!")){   
                        if(n>m){answer = 1;}else{answer = 0;}
                    } else{
                        if(n>=m){answer = 1;}else{answer = 0;}
                    }
                    break;
                case "<":
                    if(eq.equals("!")){   
                        if(n<m){answer = 1;}else{answer = 0;}
                    } else{
                        if(n<=m){answer = 1;}else{answer = 0;}
                    }
                    break;
           
        }   
         return answer;
    }
}