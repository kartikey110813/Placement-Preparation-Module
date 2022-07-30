class Solution {
  public int search(int[] nums, int target) {
	int l=0;
	int r=nums.length-1;
	int m=0;
	while(l<=r) {
		m=l+(r-l)/2;
		if(m>0 && nums[m-1]>nums[m]) {
			break;
		} else if(nums[0]<=nums[m]) {
			l=m+1;
		} else {
			r=m-1;
		}
	}
	if(nums[m]<=target && target<=nums[nums.length-1]) {
		return search(nums, m, nums.length-1, target);
	} else {
		return search(nums, 0, m-1, target);
	}
}

private int search(int[] nums, int l, int r, int t) {
	int m=0;
	while(l<=r) {
		m=l+(r-l)/2;
		if(nums[m]==t) return m;
		else if(nums[m]<t) {
			l=m+1;
		} else {
			r=m-1;
		}
	}
	return -1;
}
}
