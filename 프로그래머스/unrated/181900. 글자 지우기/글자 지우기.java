class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[my_string.length()];
        for(int i = 0 ; i<my_string.length();i++){
            arr[i]=my_string.substring(i,i+1);
        }
        for(int dice : indices){
            arr[dice]="";
        }
        for(String c : arr){
            sb.append(c);
        }
        return sb.toString();
    }
}