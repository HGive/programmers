class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;
        for(int i = 0 ; i<seoul.length;i++){
            if(seoul[i].equals("Kim")) {
            cnt=i;
            break;    
            }
            
        }
//         for(String s : seoul){
            
//             if(s.equals("Kim")){
//                 break;
//             };
//             cnt++;
//         }
        answer = "김서방은 "+ cnt +"에 있다";
        return answer;
    }
}