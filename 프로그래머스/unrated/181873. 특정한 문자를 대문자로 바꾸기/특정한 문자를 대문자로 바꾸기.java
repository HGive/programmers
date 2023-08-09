class Solution {
    public String solution(String my_string, String alp) {
        String[] strArr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(String str : strArr){
            if(str.equals(alp)){
                sb.append(alp.toUpperCase());
            }else{
                sb.append(str);
            }
        }
        return sb.toString();
    }
}