class Solution {
    public boolean isValid(String s) {
        Stack<Character>res=new Stack<>();
        boolean found=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                res.push(s.charAt(i));
            }
            else{
                if(res.isEmpty()){
                return false;
                }
                char top=res.pop();
                if((s.charAt(i)==')'&&top!='(') || 
                    (s.charAt(i)=='}'&&top!='{') || 
                    (s.charAt(i)==']'&&top!='[')) {
                    return false;
                }
            }
        }
        return res.isEmpty();
    }
}