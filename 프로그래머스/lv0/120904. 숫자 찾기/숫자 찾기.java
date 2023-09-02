class Solution {
    public int solution(int num, int k) {
        String str = num + "";
        char c = Integer.toString(k).charAt(0);
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==c){
                return i+1;
            }
        }
        return -1;
    }
}