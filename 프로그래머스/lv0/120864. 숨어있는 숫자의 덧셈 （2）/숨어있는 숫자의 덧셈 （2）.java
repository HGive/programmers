class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.replaceAll("[a-zA-Z]"," ").trim().split(" ");
        int sum =0;
        for(String str : arr){
            if(!str.isEmpty()){sum+=Integer.parseInt(str);}
        }
        return sum;
    }
}