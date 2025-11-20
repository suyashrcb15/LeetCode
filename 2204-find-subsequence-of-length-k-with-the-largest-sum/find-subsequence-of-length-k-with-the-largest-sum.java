class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] pair = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> b[0] - a[0]);
        int[][] topK = new int[k][2];
        for (int i = 0; i < k; i++) {
            topK[i][0] = pair[i][0];
            topK[i][1] = pair[i][1];
        }
        Arrays.sort(topK, (a, b) -> a[1] - b[1]);
        int[] arr = new int[k];
        int idx = 0;
        for (int i = 0; i < k; i++) arr[idx++] = topK[i][0];
        return arr;
    }
}
