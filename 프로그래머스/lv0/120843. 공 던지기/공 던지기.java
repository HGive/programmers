class Solution {
    public int solution(int[] numbers, int k) {
// 1,1  2,3  3,5  4,7   2*k-1
        int leng = numbers.length;
        int answer = numbers[ (k*2-2)%leng];
        return answer;
    }
}