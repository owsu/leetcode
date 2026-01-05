// LeetCode Medium Problem

class Solution {
    public int maxArea(int[] height) {
        int output = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int lowestheight = (height[left] < height[right]) ? height[left] : height[right];
            int product = (right - left) * lowestheight;
            output = (product < output) ? output : product;

            if (height[left] < height[right]) {left++;}
            else {right--;}
        }

        return output;
    }
}
