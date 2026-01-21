package easy.twoPointers.removeDuplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        int i = 0;
        for (int num : hs) {
            nums[i++] = num;
        }
        return hs.size();
    }
}