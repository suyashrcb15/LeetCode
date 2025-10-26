class Solution {
    public long removeZeros(long n) {
        StringBuilder sb=new StringBuilder();
        String str=Long.toString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                continue;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return Long.parseLong(sb.toString());
    }
}