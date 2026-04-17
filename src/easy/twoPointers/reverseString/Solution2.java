package easy.twoPointers.reverseString;

class Solution2 {
    public void reverseString(char[] s) {
        char first;
        char last;
        int count = s.length -1;
        for (int i = 0; i < s.length/2; i++) {
            first = s[i];
            last = s[count];
            s[i] = last;
            s[count] = first;
            count--;
        }
    }
}
