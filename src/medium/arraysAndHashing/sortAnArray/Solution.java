package medium.arraysAndHashing.sortAnArray;

class Solution {
    public int[] sortArray(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}