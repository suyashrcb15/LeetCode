class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int slow = i, fast = i;
            boolean isForward = nums[i] > 0;
            while (true) {
                slow = nextIndex(nums, isForward, slow);
                fast = nextIndex(nums, isForward, fast);
                if (fast != -1) {
                    fast = nextIndex(nums, isForward, fast);
                }
                if (slow == -1 || fast == -1 || slow == fast) break;
            }
            if (slow != -1 && slow == fast) return true;
        }
        return false;
    }
    private int nextIndex(int[] nums, boolean isForward, int current) {
        boolean direction = nums[current] > 0;
        if (isForward != direction) return -1;
        int next = (current + nums[current]) % nums.length;
        if (next < 0) next += nums.length;

        if (next == current) return -1; 
        return next;
    }
}