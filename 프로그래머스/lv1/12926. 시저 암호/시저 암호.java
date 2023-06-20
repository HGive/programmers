class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(c==' '){
              answer+=c;
              continue;
            }
            if(c>='a'&&c<='z'){
                c=(char)('a'+(c+n-'a')%26);
            }else if(c>='A'&&c<='Z'){
                c=(char)('A'+(c+n-'A')%26);
            }
            answer+=c;
        }
        return answer;
    }

}