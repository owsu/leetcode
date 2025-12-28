// Leetcode Easy

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.replace(nums[i], hm.get(nums[i]) + 1);
            }
            hm.putIfAbsent(nums[i], 1);
        }

        int maxVal = 0;
        for (Integer num : hm.values()) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        for (Integer num : hm.keySet()) {
            if (hm.get(num) == maxVal) {
                return num;
            }
        }
       
        return 0;
    }
}
