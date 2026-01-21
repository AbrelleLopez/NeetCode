package medium.arraysAndHashing.sortColors;

class Solution {
    public void sortColors(int[] nums) {

        int index = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1) {
                temp = nums[j];
                nums[j] = nums[index];
                nums[index++] = temp;
            }
        }
    }
}

