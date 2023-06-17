import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width=Integer.MIN_VALUE;
        int height=Integer.MIN_VALUE;
        for(int i = 0 ; i<sizes.length;i++){
            Arrays.sort(sizes[i]);
            width=sizes[i][0]>width?sizes[i][0]:width;
            height=sizes[i][1]>height?sizes[i][1]:height;
        }
        return width*height;
    }
}