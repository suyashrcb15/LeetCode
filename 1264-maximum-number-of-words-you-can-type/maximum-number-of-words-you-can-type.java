class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int cnt=0;
        HashSet<Character> res=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            res.add(brokenLetters.charAt(i));
        }
        String[] wrd=text.split(" ");
        for(int i=0;i<wrd.length;i++){
            boolean valid=true;
            for(int j=0;j<wrd[i].length();j++){
                if(res.contains(wrd[i].charAt(j))){
                    valid=false;
                    break;
                }
            }
            if(valid){
                cnt++;
            }
        }
        return cnt;
    }
}