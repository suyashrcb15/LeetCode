class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int even=1;
        int odd=0;
        int sum=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            sum=(sum+arr[i])%2;
            if(sum==0){
                cnt=(cnt+odd)%mod;
                even++;
            }
            else{
                cnt=(cnt+even)%mod;
                odd++;
            }
        }
        return cnt;
    }
}