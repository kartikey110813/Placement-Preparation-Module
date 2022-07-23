class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int ans =0 ;
            
            while(start<end) {
                if(height[start] < height[end]) {
                    ans = Math.max(ans, height[start] * (end-start));
                    start++;
                }
                else{
                    ans = Math.max(ans,height[end] * (end-start));
                    end--;
                }
            }
        
        return ans;
    }
}
