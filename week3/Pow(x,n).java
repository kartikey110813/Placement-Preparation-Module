class Solution {
    public double myPow(double x, int n) {
        
        double out = 1;
        long temp =n;
 if(temp <0)  {
     temp = -1*temp;
 }
        
        while(temp>0){
            if(temp%2 == 0){
                x = x*x;
                temp = temp/2;
            }
            else{
                out = out*x;
                temp-=1;
            }
        }     
        
        if(n<0)
            return 1/out;
        
        return out;
    }
}
