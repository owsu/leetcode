class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> myStack = new ArrayDeque<>();
        Map<Integer, Integer> hm = new HashMap<>();
        int[] output = new int[nums1.length];

        for (int num : nums2) {
            while (!myStack.isEmpty() && myStack.peek() < num) {
                hm.put(myStack.pop(), num);
            }

            myStack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            output[i] = hm.getOrDefault(nums1[i], -1);
        }

        return output;
    }
}