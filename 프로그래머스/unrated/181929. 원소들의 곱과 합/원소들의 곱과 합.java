class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int sum = 0;
        for(int a : num_list){
            multi*=a;
            sum+=a;
        }
        return (multi< Math.pow(sum,2)) ? 1 : 0;
        }
    }
