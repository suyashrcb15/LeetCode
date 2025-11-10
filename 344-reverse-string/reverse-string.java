class Solution {
    public void reverseString(char[] s) {
        char[] ch = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            ch[i] = s[s.length - 1 - i];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = ch[i];
        }
    }
}