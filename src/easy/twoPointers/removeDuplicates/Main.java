package easy.twoPointers.removeDuplicates;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,10,10,30,30,30};
        int k = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
