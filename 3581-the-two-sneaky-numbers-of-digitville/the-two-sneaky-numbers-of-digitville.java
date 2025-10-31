class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
        HashSet<Integer> num=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:res.entrySet()){
            if(entry.getValue()>1){
                num.add(entry.getKey());
            }
        }
        int[] myArray=new int[num.size()];
        int idx=0;
        for (int val:num) {
            myArray[idx++]=val;
        }
        return myArray;
    }
}