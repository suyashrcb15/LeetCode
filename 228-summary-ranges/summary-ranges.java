class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> st=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int str=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            if(str!=nums[i]){
                st.add(""+str+"->"+nums[i]);
            }
            else{
                st.add(""+str);
            }
        }
        return st;
    }
}