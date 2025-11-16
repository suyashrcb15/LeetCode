class Solution {
    public int numSub(String s) {
        int mod=1_000_000_007;
        long res=0;
        int[] arr= new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        long cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
            }
            else {
                res=(res+(cnt*(cnt+1)/2))%mod;
                cnt=0;
            }
        }
        res=(res+(cnt*(cnt+1)/2))%mod;
        return (int)res;
    }
}