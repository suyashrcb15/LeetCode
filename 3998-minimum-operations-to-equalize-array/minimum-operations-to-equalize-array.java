class Solution {
    public int minOperations(int[] nums) {
        boolean allEqual = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) return 0;
        int andAll = nums[0];
        for (int i = 1; i < nums.length; i++) {
            andAll &= nums[i];
        }
        if (andAll == 0) return 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int andVal = nums[i];
                for (int k = i + 1; k <= j; k++) {
                    andVal &= nums[k];
                }
                if (andVal == nums[i] || andVal == nums[j]) {
                    return 1;
                }
            }
        }
        return 2;
    }
}
