class Solution {
    public String solution(String s, int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i <s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){sb.append(' ');continue;}
            if(ch>='A'&&ch<='Z'){
                sb.append((char) ('A'+(ch-'A'+n)%26));
            }else if(ch>'Z'&&ch<='z'){
                sb.append((char) ('a'+(ch-'a'+n)%26));
            }
        }

        return sb.toString();
        // String answer = "";
        // char[] ch = s.toCharArray();
        // for(char c : ch){
        //     if(c==' '){
        //       answer+=c;
        //       continue;
        //     }
        //     if(c>='a'&&c<='z'){
        //         c=(char)('a'+(c+n-'a')%26);
        //     }else if(c>='A'&&c<='Z'){
        //         c=(char)('A'+(c+n-'A')%26);
        //     }
        //     answer+=c;
        // }
        // return answer;
    }

}