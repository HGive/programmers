class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] a = my_string.toCharArray();
        int j =0;
        for(int i =s;i<overwrite_string.length()+s;i++){
            
            a[i]=overwrite_string.charAt(j);
            j++;
        }
        String answer = new String(a);
        return answer;
    }
}