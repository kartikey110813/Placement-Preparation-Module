class Solution {
    public int mySqrt(int x) {
        
        int l=1;
        int r =x;
        
        if(x == 0) return 0;
        
        while(l <= r){
            int mid = (l+r)/2;
            if(mid == x/mid){
                return mid;
            }
            
            if(x/mid > mid){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return r;
    }
}
