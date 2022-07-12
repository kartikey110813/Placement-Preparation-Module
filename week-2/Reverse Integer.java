class Solution {
    public int reverse(int x) {
        
        long sum=0;
        int n=0;
        
             while(x!=0){
        n = x%10;
        sum = sum*10 + n;
        x=x/10;    
        }
        
         if(sum  >= Integer.MAX_VALUE || sum <= Integer.MIN_VALUE){
        return 0;
    
        }
                
        return (int)sum;
    }
}
