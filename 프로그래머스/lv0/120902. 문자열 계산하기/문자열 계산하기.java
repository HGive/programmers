class Solution {
    public int solution(String my_string) {
        my_string = my_string.replace("+ ","+");
        my_string = my_string.replace("- ","-");
        int sum = 0;
        String[] numArr = my_string.split(" ");
        for(String num : numArr){
            sum+= Integer.parseInt(num);
        }
        return sum;
    }
}