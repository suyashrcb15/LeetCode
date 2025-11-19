class Solution {
    public int minLengthAfterRemovals(String s) {
        int cnt_a=0;
        int cnt_b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                cnt_a++;
            }
            else{
                cnt_b++;
            }
        }
        if(cnt_a==cnt_b){
            return 0;
        }
        if(cnt_b==0){
            return s.length();
        }
        if(cnt_a==0){
            return s.length();
        }
        if(cnt_a>cnt_b){
            return cnt_a-cnt_b;
        }
        return cnt_b-cnt_a;
    }
}