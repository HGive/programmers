class Solution {
    public String solution(String phone_number) {
        char[] ch = new char[phone_number.length()-4];
        for(int i = 0; i<phone_number.length()-4;i++){
            ch[i]='*';
        }
        String answer = new String(ch);
        
        
        
        return answer+phone_number.substring(phone_number.length()-4,phone_number.length());
    }
}