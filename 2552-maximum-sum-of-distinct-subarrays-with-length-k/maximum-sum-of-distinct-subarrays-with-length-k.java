
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> res=new HashSet<>();
        long sum=0;
        long maxsum=0;
        int left=0;

        for(int i=0;i<nums.length;i++){

            while(res.contains(nums[i])){
                res.remove(nums[left]);
                sum-=nums[left];
                left++;
            }

            res.add(nums[i]);
            sum+=nums[i];

            if(i-left+1>k){
                res.remove(nums[left]);
                sum-=nums[left];
                left++;
            }

            if(i-left+1==k){
                maxsum=Math.max(maxsum,sum);
            }
        }

        return maxsum;
    }
}
