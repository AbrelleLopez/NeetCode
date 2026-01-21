package easy.twoPointers.reverseString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'n','e','e','t'};
        solution.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
