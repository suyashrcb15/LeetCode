class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:res.entrySet()){
            if(entry.getValue()>1){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}