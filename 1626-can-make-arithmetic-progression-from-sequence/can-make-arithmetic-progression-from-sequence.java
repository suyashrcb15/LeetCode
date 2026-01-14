class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> ans=new HashSet<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            res.add(arr[i]-arr[i-1]);
        }
        for(int i=0;i<res.size();i++){
            ans.add(res.get(i));
        }
        if(ans.size()==1){
            return true;
        }
        return false;
    }
}