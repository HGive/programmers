class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for(int start = i; start<=j;start++){
            sb.append(String.valueOf(start));
        }
        String temp = sb.toString();
        return temp.length()- temp.replace(k+"","").length();
    }
}