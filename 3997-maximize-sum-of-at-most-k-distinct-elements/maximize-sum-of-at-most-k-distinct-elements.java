class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        HashSet<Integer> have = new HashSet<>();

        for (int num : nums) {
            if (have.contains(num)) continue;

            minHeap.offer(num);
            have.add(num);

            if (minHeap.size() > k) {
                have.remove(minHeap.peek());
                minHeap.poll();
            }
        }

        int[] res = new int[minHeap.size()];
        int i = res.length - 1;
        while (!minHeap.isEmpty()) {
            res[i--] = minHeap.poll();
        }

        return res; 
    }
}