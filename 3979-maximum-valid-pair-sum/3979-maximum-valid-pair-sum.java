class Solution {
    public int maxValidPairSum(int[] nums, int k) {

        int n = nums.length;

        int best = nums[0];
        int ans = 0;

        for (int j = k; j < n; j++) {

            best = Math.max(best, nums[j - k]);

            ans = Math.max(ans, best + nums[j]);
        }

        return ans;
    }
}