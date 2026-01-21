package easy.arraysAndHashing.twoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,4,5,6};
        int target = 7;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
