class Solution {
    public int minimumDistance(int[] nums) {
        java.util.HashMap<Integer, java.util.ArrayList<Integer>> map = new java.util.HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], x -> new java.util.ArrayList<>()).add(i);
        }
        for (var list : map.values()) {
            int m = list.size();
            if (m >= 3) {
                for (int i = 0; i + 2 < m; i++) {
                    int left = list.get(i);
                    int right = list.get(i + 2);
                    ans = Math.min(ans, 2 * (right - left));
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
