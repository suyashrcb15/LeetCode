class Solution {
    public int minimumCost(int[] cost) {
        int buy=0;
        Arrays.sort(cost);
        for (int i=cost.length-1;i>=0;i=i-3) {
            buy=buy+cost[i];
            if (i-1>=0){
                buy=buy+cost[i-1];
            }
        }
        return buy;
    }
}
