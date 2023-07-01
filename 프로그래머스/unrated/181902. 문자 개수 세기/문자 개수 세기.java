class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i =0 ; i<26;i++){
            int cnt = 0;
            for(int j = 0; j<my_string.length();j++){
                if(my_string.charAt(j)-0=='A'-0+i){
                    cnt++;
                }
            }
            answer[i]=cnt;
        }
        for(int i =26 ; i<52;i++){
            int cnt = 0;
            for(int j = 0; j<my_string.length();j++){
                if(my_string.charAt(j)-0=='a'-0+i-26){
                    cnt++;
                }
            }
            answer[i]=cnt;
        }  
        return answer;
    }
}