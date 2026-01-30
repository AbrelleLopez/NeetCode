package medium.simulations.champagneTower;

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {

        double[][] tower = new double[query_row + 2][query_row + 2];
        tower[0][0] = poured;

        for (int row = 0; row <= query_row; row++) {
            for (int glass = 0; glass <= row; glass++) {
                if (tower[row][glass] > 1) {
                    double extra = tower[row][glass] - 1;
                    tower[row][glass] = 1;
                    tower[row + 1][glass] += extra / 2.0;
                    tower[row + 1][glass + 1] += extra / 2.0;
                }
            }
        }

        if (tower[query_row][query_glass] > 1) {
            return 1;
        } else {
            return tower[query_row][query_glass];
        }
    }
}
