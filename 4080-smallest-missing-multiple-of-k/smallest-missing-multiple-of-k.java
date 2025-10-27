class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int m = k;
        while (true) {
            if (!set.contains(m)) return m;
            m += k;
        }
    }
}
