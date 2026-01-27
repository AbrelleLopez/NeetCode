package easy.arraysAndHashing.longestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");

        if (strs == null || strs.length == 0) return "";
        int count = 0;

        while (true) {
            char currentChar;

            if (count >= strs[0].length()) break;
            currentChar = strs[0].charAt(count);

            for (int i = 0; i < strs.length; i++) {
                if (count >= strs[i].length() || strs[i].charAt(count) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
            count++;
        }

        return prefix.toString();
    }
}
