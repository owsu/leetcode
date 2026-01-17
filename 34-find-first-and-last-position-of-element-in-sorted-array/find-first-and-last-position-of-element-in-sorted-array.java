class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] output = new int[2];
        Arrays.fill(output, -1);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                int left = mid;
                int right = mid;

                while (left > 0 && nums[left - 1] == target){
                    left--;
                }

                while (right < nums.length - 1 && nums[right + 1] == target){
                    right++;
                }

                output[0] = left;
                output[1] = right;
                return output;
            }
        }

        return output;
    }
}