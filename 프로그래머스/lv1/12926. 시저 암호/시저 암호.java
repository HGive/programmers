class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        for(int i = 0 ; i < ch.length; i++){
            if(ch[i]==' '){
                answer+=" ";
                continue;
            }
                
            if(ch[i]-0>96&&ch[i]-0<123){
                if(ch[i]-0+n>122){
                    ch[i]=(char)(ch[i]-0+n-26);
                }else{
                    ch[i]=(char)(ch[i]-0+n);
                }
            }else if(ch[i]-0>64&&ch[i]-0<91){
                if(ch[i]-0+n>90){
                    ch[i]=(char)(ch[i]-0+n-26);
                }else{
                    ch[i]=(char)(ch[i]-0+n);
                }
            }
            answer+=ch[i];
        }
        return answer;
    }

}