package easy.arraysAndHashing.maxConsecutiveOnes;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 1) {
                temp++;
                count = Math.max(count, temp);
            } else {
                temp = 0;
            }
            i++;
        }

        return count;
    }
}
