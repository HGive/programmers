class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int c = 0;
        polynomial=polynomial.replace("+ ","");
        String[] arr = polynomial.split(" ");
        for(String str : arr){
            if(str.contains("x")&&str.length()>1){
                x+=Integer.parseInt(str.replace("x",""));
            }else if(str.contains("x")){
                x+=1;   
            }else{
                c+=Integer.parseInt(str);
            }
        }
        String answer ="";
        if(x==1){
            answer+="x";
        }else if(x!=0){
            answer+=x+"x";
        }
        if(!answer.isEmpty()&&c!=0){
            answer+=" + "+c;
        }else if(c!=0){
            answer+=c+"";
        }
        return answer;
    }
}