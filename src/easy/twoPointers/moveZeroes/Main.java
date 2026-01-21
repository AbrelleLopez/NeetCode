package easy.twoPointers.moveZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,0,1,2,0,5};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
