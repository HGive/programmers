class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;

        // 가로 길이 찾기
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (dots[i][1] == dots[j][1]) {
                    width = Math.abs(dots[i][0] - dots[j][0]);
                    break;
                }
            }
            if (width != 0) {
                break;
            }
        }

        // 세로 길이 찾기
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (dots[i][0] == dots[j][0]) {
                    height = Math.abs(dots[i][1] - dots[j][1]);
                    break;
                }
            }
            if (height != 0) {
                break;
            }
        }

        return width * height;
    }
}