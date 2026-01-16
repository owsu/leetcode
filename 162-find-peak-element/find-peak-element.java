class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int left = (mid == 0) ? Integer.MIN_VALUE : nums[mid - 1];
            int right = (mid == nums.length - 1) ? Integer.MIN_VALUE : nums[mid + 1];

            if (nums[mid] > left && nums[mid] > right) {
                return mid;
            } else if (nums[mid] < left) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}