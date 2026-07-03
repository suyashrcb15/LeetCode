import java.util.*;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        // Sort in descending order
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        long totalSum = 0;

        for (int i = 0; i < k; i++) {
            long ele = arr[i];

            if (mul <= 0)
                totalSum += ele;
            else
                totalSum += ele * mul;

            mul--;
        }

        return totalSum;
    }
}