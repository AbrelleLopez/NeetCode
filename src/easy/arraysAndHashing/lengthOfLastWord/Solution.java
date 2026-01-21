package easy.arraysAndHashing.lengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int nextIndex = Math.min(i + 1, s.length() - 1);

            if (Character.isLetter(s.charAt(i))) {
                count++;
            } else if (Character.isWhitespace(s.charAt(i)) && Character.isLetter(s.charAt(nextIndex))) {
                count = 0;
            }
        }

        return count;
    }
}