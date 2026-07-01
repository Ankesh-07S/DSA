class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1, ans = Integer.MAX_VALUE, mid = -1;
        if (n == 1)
            return nums[0];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;

            }
        }
        return ans;

    }
}