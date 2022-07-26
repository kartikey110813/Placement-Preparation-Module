class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count=1;
        int major = nums[0];
        
        for(int i=1; i<n; i++) {
            if(nums[i] == major){
                count++;
            }
            else{
                if(count == 0){
                    major  =  nums[i];
                }
                else{
                    count--;
                }
            }
        }
              
        return major;
    }
}
