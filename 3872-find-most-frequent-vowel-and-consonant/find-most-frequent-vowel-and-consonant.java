class Solution {
    public int maxFreqSum(String s) {
        int max=0;
        int max1=0;
        HashMap<Character,Integer> res=new HashMap<>();
        HashMap<Character,Integer> res1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                res1.put(s.charAt(i),res1.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for (int val:res.values()){
            max=Math.max(max,val);
        }
        for (int val:res1.values()){
            max1=Math.max(max1,val);
        }
        return max+max1;
    }
}