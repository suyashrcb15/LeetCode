class Solution {
    public int minFlips(String target) {
        int cnt=0;
        char prev='0';
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!=prev){
                cnt++;
                prev=target.charAt(i);
            }
        }
        return cnt;
    }
}
