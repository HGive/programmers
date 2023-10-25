class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling){
            str=str.replace("aya","1").replace("ye","2").replace("woo","3").replace("ma","4");
            if(str.matches("^[0-9]+$")){
                boolean flag = true;
                for(int i = 0 ;i<str.length()-1;i++){
                    char pre = str.charAt(i);
                    char next = str.charAt(i+1);
                    if(pre==next)flag=false;
                }   
                if(flag) answer++; 
            }
        }
        return answer;
    }
}