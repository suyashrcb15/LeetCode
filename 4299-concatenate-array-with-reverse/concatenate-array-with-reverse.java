class Solution {
    public int[] concatWithReverse(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            res.add(nums[i]);
        }
        int[] arr=res.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}