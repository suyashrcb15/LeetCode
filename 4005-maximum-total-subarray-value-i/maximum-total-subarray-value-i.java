class Solution{
    public long maxTotalValue(int[] nums,int k){
        int sormadexin[]=nums;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:sormadexin){
            if(num>max)max=num;
            if(num<min)min=num;
        }
        return (long)(max-min)*k;
    }
}
