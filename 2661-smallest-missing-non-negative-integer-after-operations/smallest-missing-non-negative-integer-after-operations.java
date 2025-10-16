class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int [] arr=new int[value];
        for(int i=0;i<nums.length;i++){
            int a=((nums[i]%value)+value)%value;
            arr[a]++;
        }
        int min=0;
        while(arr[min%value]>0){
            arr[min%value]--;
            min++;
        }
        return min;
    }
}