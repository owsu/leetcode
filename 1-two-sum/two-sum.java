class Solution {
    public int[] twoSum(int[] nums, int target) {
     for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                int[] shit = new int[2];
                shit[0] = i;
                shit[1] = j;
                return shit;
            } 
        }
     }
     return null;

    }
}