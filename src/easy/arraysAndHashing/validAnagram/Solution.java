package easy.arraysAndHashing.validAnagram;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        StringBuilder temp = new StringBuilder(s);

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int index = temp.indexOf(String.valueOf(c));

            if (index == -1) {
                return false;
            }

            temp.deleteCharAt(index);
        }

        return temp.length() == 0;
    }
}
