class Solution {
    public int searchInsert(int[] nums, int target) {
         int n = nums.length-1;
        int ans = BS(nums,0,n,target);
          return ans;
        
    }
    
    int BS(int[] arr, int f, int l,int target){
        
        if(f<l){
        int mid = (f+l)/2;
        if(target < arr[0]){
            return 0;
        }
        else if(target > arr[arr.length-1])
            return arr.length;
        
        else if(target == arr[mid]){
            return mid;
        }
      
       else if(target > arr[mid])
            return BS(arr,mid+1,l,target);
        else
            return BS(arr,f,mid-1,target);    
        }
        else
            return arr[f] < target ? f+1 : f;
        
    }
}
