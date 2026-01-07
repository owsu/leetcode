// Leetcode Medium Problem

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
        int[][] cars = new int[position.length][2];

        for (int i = 0; i < cars.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        
        Arrays.sort(cars, (a,b) -> b[0] - a[0]);

        for (int i = 0; i < position.length; i++) {
            double timeRemaining = (double) (target - cars[i][0]) / cars[i][1];

            if (stack.isEmpty() || stack.peek() < timeRemaining) {
                stack.push(timeRemaining);
            } 
        }

        return stack.size();
    }
}
