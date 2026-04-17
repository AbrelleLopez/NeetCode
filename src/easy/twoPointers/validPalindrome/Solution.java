package easy.twoPointers.validPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        int last = s.length()-1;
        int count = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(last)) {
                count++;
            }
            last--;
        }
        if (count != 0) {
            return false;
        } else {
            return true;
        }
    }
}

