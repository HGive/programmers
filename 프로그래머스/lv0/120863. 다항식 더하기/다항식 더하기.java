class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int c = 0;
        polynomial=polynomial.replace("+ ","");
        String[] arr = polynomial.split(" ");
        for(String str : arr){
            if(str.equals("x")){
                x+=1;
            }else if(str.contains("x")){
                x+=Integer.parseInt(str.replace("x",""));
            }else{
                c+=Integer.parseInt(str);
            }
        }
        if(x==1){
            sb.append("x");
        }else if(x!=0){
            sb.append(x+"x");
        }
        if(sb.length()!=0&&c!=0){
            sb.append(" + "+c);
        }else if(c!=0){
            sb.append(c+"");
        }
        return sb.toString();
    }
}