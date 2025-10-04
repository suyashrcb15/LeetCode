class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        Stack<Integer> res=new Stack<>();
        for( char c:s.toCharArray()){
            int val=0;
            if(c=='('){
                res.push(0);
            }
            else{
                while(res.peek()!=0){
                    val=val+res.pop();
                }
                res.pop();
                val=Math.max(2*val,1);
                res.push(val);
            }
        }
        while(!res.isEmpty()){
            count=count+res.pop();
        }
        return count;
    }
}