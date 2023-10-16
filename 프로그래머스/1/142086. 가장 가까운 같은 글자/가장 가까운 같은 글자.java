class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] strArr = s.split("");
        for(int i = 0 ; i<s.length();i++){
            if(s.indexOf(strArr[i])==i){
                answer[i]=-1;
            }else{
                answer[i]=i-s.substring(0,i).lastIndexOf(strArr[i]);
            }
        }
        return answer;
    }
}