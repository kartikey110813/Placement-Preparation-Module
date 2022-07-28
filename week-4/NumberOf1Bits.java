public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
// Solution Type-1
        // return Integer.bitCount(n);
        
// Solution Type-2
        int count=0;
        if(n<0){
            count++;
            int mask =  Integer.MIN_VALUE;
            n=n^mask;
        }
        while(n>0){
            if((n&1) == 1) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
