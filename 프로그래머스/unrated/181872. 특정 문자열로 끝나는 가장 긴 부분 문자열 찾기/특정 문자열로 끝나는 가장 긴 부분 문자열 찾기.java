class Solution {
    public String solution(String myString, String pat) {
        for(int i = myString.length() ; i>0;i--){
            myString = myString.substring(0,i);
            if(myString.endsWith(pat)){
                break;
            }
        }
        return myString;
    }
}