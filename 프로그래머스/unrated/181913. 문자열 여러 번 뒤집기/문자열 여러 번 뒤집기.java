class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer ="";
        char[] ch = my_string.toCharArray();
        for(int i = 0 ; i < queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j = start ; j<=(start+end)/2 ;j++){
                char temp = ch[j];
                ch[j]=ch[start+end-j];
                ch[start+end-j]=temp;
            }
        }
        return new String(ch) ;
    }
}