package medium.simulations.champagneTower;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int poured = 1;
        int query_row = 1;
        int query_glass = 1;

        System.out.println(solution.champagneTower(poured, query_row, query_glass));

// MY BRUTE FORCE ATTEMPT (failed due to overflow concept. Brute could not handle)
//        int poured = 3;
//        int query_row = 2;
//        int query_glass = 1;
//
//        double how_full = 1;
//        int glassPerRow = 0;
//
//        for (int i = 0; i <= query_row; i++) {
//            System.out.println("row: " + i);
//            poured--;
//
//            for (int j = 0; j <= glassPerRow; j++) {
//                System.out.println(how_full);
//            }
//            glassPerRow++;
//
//            if (poured != 0) {
//                how_full = how_full / 2;
//            } else {
//                how_full = 0;
//            }
//
//            System.out.println();
//        }
    }
}
