class Solution {
    public String solution(String myString) {
        String[] strArr = myString.split("");
        StringBuilder sb = new StringBuilder();
        for(String str : strArr){
            if(str.equals("a")){
                sb.append("A");
            }else if(!str.equals("A")){
                sb.append(str.toLowerCase());
            }else{
                sb.append(str);
            }
        }
        return sb.toString();
    }
}