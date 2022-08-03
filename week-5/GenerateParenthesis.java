class Solution {
    public List<String> generateParenthesis(int n) {
        
        int open=3,close=3;
        List<String> res = new ArrayList<>();
        solve(n,n,"",res);
        
        return res;        
    }
    
    public static void solve(int open, int close , String op , List<String> res)
    {
        if(open==0 && close==0)
        {
            res.add(op);
            return;
        }
        
        if(open!=0)
        {
            String op1=op;
            op1+="(";
            solve(open-1,close,op1,res);
        }
        if(close>open)
        {
            String op1=op;
            op1+=')';
            solve(open,close-1,op1,res);
        }
    }
}
