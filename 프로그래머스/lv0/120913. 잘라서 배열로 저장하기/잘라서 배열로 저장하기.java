class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length()%n==0? my_str.length()/n:my_str.length()/n+1;
        String[] answer = new String[length];
        int idx = 0;
        while(my_str.length()>0){
            if(my_str.length()<n){
                answer[idx]=my_str;
                break;
            }else{
                answer[idx]=my_str.substring(0,n);    
                my_str=my_str.substring(n);
            }
            idx++;
        }
        return answer;
    }
}