class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        boolean allZero = true;
        for (int num : nums) {
            totalXor ^= num;
            if (num != 0) allZero = false;
        }
        if (totalXor != 0) {
            return nums.length; 
        } else if (allZero) {
            return 0; 
        } else {
            return nums.length - 1;
        }
    }
}

