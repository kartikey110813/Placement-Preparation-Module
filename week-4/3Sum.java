class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {

                int sum = -nums[i];
                int start = i + 1;
                int end = nums.length - 1;

                while (start < end) {
                    if (nums[start] + nums[end] == sum) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);

                        ans.add(temp);

                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        start++;
                        end--;
                    } else if (nums[start] + nums[end] < sum) {
                        start++;
                    } else {
                        end--;
                    }
                }

            }
        }
        return ans;
    }
}
