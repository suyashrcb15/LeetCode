class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String currentSubstring = s.substring(i, j + 1);
                if (isPalindrome(currentSubstring) && currentSubstring.length() > longest.length()) {
                    longest = currentSubstring;
                }
            }
        }
        return longest;
    }
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
