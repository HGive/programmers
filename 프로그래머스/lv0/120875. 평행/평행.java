class Solution {
    public int solution(int[][] dots) {
        double[][] pairs = new double[3][2];

        pairs[0][0] = (double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        pairs[0][1] = (double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);

        pairs[1][0] = (double) (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]);
        pairs[1][1] = (double) (dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);

        pairs[2][0] = (double) (dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);
        pairs[2][1] = (double) (dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);

        for (int i = 0; i < 3; i++) {
            if (pairs[i][0] == pairs[i][1]) {
                return 1;
            }
        }

        return 0;
    }
}