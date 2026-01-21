package easy.arraysAndHashing.scoreOfString;

class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 1; i < s.length(); i++) {
            int currentChar = s.charAt(i);
            int previousChar = s.charAt(i - 1);

            score += Math.abs(currentChar - previousChar);
        }

        return score;
    }
}