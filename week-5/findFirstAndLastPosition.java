class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1,-1};
       
            
        for(int i=0,j=nums.length-1; i<nums.length&&j>=0; i++,j--) {
            if(nums[i] == target && arr[0] == -1){
                arr[0] = i;
            }
             if(nums[j] ==target && arr[1] == -1){
                arr[1] = j;
            }
             if(arr[0]!=-1 && arr[1]!=-1){
                break;
            }
        }
        
       return arr;
    }
}
