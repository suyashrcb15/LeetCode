class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
            maxFreq = Math.max(maxFreq, res.get(nums[i]));
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() == maxFreq) {
                sum = sum + entry.getValue();
            }
        }
        return sum;
    }
}