class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        String[] parts = myString.split("");
        for(String str : parts){
            if(str.equals("A")){
                sb.append("B");
            }else{
                sb.append("A");
            }
        }
        String temp = sb.toString();
        return temp.contains(pat)?1:0;
    }
}