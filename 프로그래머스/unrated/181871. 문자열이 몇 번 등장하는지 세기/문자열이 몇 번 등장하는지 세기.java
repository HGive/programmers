class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str ="";
        for(int i =0; i<myString.length();i++){
            str=myString.substring(i,myString.length());
            if(str.startsWith(pat)){answer++;}
        }
        return answer;
    }
}