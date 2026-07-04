class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqr=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            sqr=sqr+rem*rem;
            if((sqr-sum)>=50){
                return true;
            }
            n=n/10;
        }
        return false;
    }
}