class Solution {
    public int solution(String myString, String pat) {
        String lowMyString = myString.toLowerCase();
        String lowPat = pat.toLowerCase();
        return lowMyString.contains(lowPat)?1:0;
    }
}