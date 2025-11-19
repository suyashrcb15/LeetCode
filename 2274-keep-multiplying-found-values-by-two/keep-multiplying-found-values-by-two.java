class Solution {
    public int findFinalValue(int[] nums, int original) {
        int number=original;
        boolean found=true;
        while (found) {
            found=false;
            for (int i=0;i<nums.length;i++) {
                if (nums[i]==number) {
                    number=number*2;
                    found=true;
                    break;
                }
            }
        }
        return number;
    }
}
