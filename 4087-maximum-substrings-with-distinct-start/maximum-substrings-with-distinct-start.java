class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> res=new HashSet<>();
        for(int i=0;i<s.length();i++){
            res.add(s.charAt(i));
        }
        return res.size();
    }
}