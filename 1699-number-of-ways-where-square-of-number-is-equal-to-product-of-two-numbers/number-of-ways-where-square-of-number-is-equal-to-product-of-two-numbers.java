class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return countTriplets(nums1, nums2) + countTriplets(nums2, nums1);
    }
    private int countTriplets(int[] a, int[] b) {
        int count = 0;
        Map<Long, Integer> productMap = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                long product = (long) b[i] * b[j];
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }
        for (int num : a) {
            long square = (long) num * num;
            count += productMap.getOrDefault(square, 0);
        }

        return count;
    }
}