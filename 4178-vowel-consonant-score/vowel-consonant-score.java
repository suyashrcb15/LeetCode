class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        int num=0;
        double score=0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(s.charAt(i)=='a' ||  s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i'){
                v++;
            }
            else if (Character.isDigit(ch)) {
                num++;
            } else if (Character.isLetter(ch)) {
                c++;
            }
        }
        if(c==0){
            return 0;
        }
        score=Math.floor(v/c);
        return (int) score;
    }
}