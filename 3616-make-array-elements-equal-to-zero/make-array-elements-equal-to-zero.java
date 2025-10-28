class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int validCount = 0;
        for (int start = 0; start < n; start++) {
            if (nums[start] != 0) continue;
            for (boolean moveRight : new boolean[]{true, false}) {
                int[] copy = nums.clone();
                int curr = start;
                boolean direction = moveRight;

                while (curr >= 0 && curr < n) {
                    if (copy[curr] == 0) {
                        curr += direction ? 1 : -1;
                    } else {
                        copy[curr]--;
                        direction = !direction;
                        curr += direction ? 1 : -1;
                    }
                }
                boolean allZero = true;
                for (int num : copy) {
                    if (num != 0) {
                        allZero = false;
                        break;
                    }
                }

                if (allZero) validCount++;
            }
        }

        return validCount;
    }
}