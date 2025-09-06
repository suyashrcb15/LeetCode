class Solution {
    public int[] transformArray(int[] nums) {
        int idx=0;
        int []arr=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[idx]=0;
                idx++;
            }
            else{
                arr[idx]=1;
                idx++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}