class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:arr.entrySet()){
            if(entry.getValue()>nums.length/3){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}