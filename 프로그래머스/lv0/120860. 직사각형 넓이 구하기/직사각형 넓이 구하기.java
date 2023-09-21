class Solution {
    public int solution(int[][] dots) {
        int width = Math.max(Math.abs(dots[1][0]-dots[2][0]),Math.abs(dots[1][0]-dots[3][0]));
        int height = Math.max(Math.abs(dots[1][1]-dots[2][1]),Math.abs(dots[1][1]-dots[3][1]));

        return width * height;
    }
}