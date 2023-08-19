class Solution {
    public int solution(String num_str) {
        String[] strList = num_str.split("");
        int sum =0;
        for(String str : strList){
            sum+= Integer.parseInt(str);
        }
        return sum;
    }
}