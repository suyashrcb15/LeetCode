class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res.add(i + 1);
                    res.add(j + 1);
                    break;
                }
            }
            if (!res.isEmpty()) break;
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
