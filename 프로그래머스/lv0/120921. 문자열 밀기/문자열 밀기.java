class Solution {
    public int solution(String A, String B) {
        String temp = B+B;
        return temp.contains(A)?temp.indexOf(A):-1;
    }
}