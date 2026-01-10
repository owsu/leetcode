class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> myStack = new ArrayDeque<>();
        Map<Integer, Integer> hm = new HashMap<>();
        int[] output = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            while (!myStack.isEmpty() && myStack.peek() < nums2[i]) {
                hm.put(myStack.pop(), nums2[i]);
            }

            myStack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            output[i] = hm.getOrDefault(nums1[i], -1);
        }

        return output;
    }
}