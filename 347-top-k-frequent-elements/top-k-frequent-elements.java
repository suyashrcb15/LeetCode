class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];
        for(Map.Entry<Integer, Integer> entry: res.entrySet()){
            int freq = entry.getValue();
            if(arr[freq] == null){
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(entry.getKey());
        }
        int[] result = new int[k];
        int i=0;
        for(int j=nums.length;j>=1;j--){
            if(arr[j] != null){
                for(int num : arr[j]){
                    result[i] = num;
                    i++;

                    if(i==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
